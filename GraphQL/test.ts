import { ApolloClient, InMemoryCache, gql, HttpLink } from '@apollo/client';
import fetch from 'cross-fetch';
import { performance } from 'perf_hooks';

const client = new ApolloClient({
  link: new HttpLink({ uri: 'http://localhost:4000/graphql', fetch }),
  cache: new InMemoryCache(),
});

const CREATE_RESERVATION = gql`
  mutation CreateReservation($input: CreateReservationInput!) {
    createReservation(input: $input) {
      id
      check_in_date
      check_out_date
      total_cost
      guest_id
      room_id
    }
  }
`;

const GET_RESERVATION = gql`
  query GetReservation($id: ID!) {
    getReservation(id: $id) {
      id
      check_in_date
      check_out_date
      total_cost
      guest_id
      room_id
    }
  }
`;

const UPDATE_RESERVATION = gql`
  mutation UpdateReservation($id: ID!, $input: UpdateReservationInput!) {
    updateReservation(id: $id, input: $input) {
      id
      check_in_date
      check_out_date
      total_cost
      guest_id
      room_id
    }
  }
`;

const DELETE_RESERVATION = gql`
  mutation DeleteReservation($id: ID!) {
    deleteReservation(id: $id) {
      id
    }
  }
`;

async function createReservation(input: any) {
  const start = performance.now();
  const response = await client.mutate({
    mutation: CREATE_RESERVATION,
    variables: { input },
  });
  const end = performance.now();
  console.log(`Create Reservation Latency: ${end - start} ms`);
  return response.data.createReservation;
}

async function getReservation(id: string) {
  const start = performance.now();
  const response = await client.query({
    query: GET_RESERVATION,
    variables: { id },
  });
  const end = performance.now();
  console.log(`Get Reservation Latency: ${end - start} ms`);
  return response.data.getReservation;
}

async function updateReservation(id: string, input: any) {
  const start = performance.now();
  const response = await client.mutate({
    mutation: UPDATE_RESERVATION,
    variables: { id, input },
  });
  const end = performance.now();
  console.log(`Update Reservation Latency: ${end - start} ms`);
  return response.data.updateReservation;
}

async function deleteReservation(id: string) {
  const start = performance.now();
  const response = await client.mutate({
    mutation: DELETE_RESERVATION,
    variables: { id },
  });
  const end = performance.now();
  console.log(`Delete Reservation Latency: ${end - start} ms`);
  return response.data.deleteReservation;
}

async function runTests() {
  const reservationInput = {
    check_in_date: '2023-12-01',
    check_out_date: '2023-12-10',
    total_cost: 1000,
    guest_id: 1,
    room_id: 1,
  };

  // Create Reservation
  const reservation = await createReservation(reservationInput);
  console.log('Created Reservation:', reservation);

  // Get Reservation
  const fetchedReservation = await getReservation(reservation.id);
  console.log('Fetched Reservation:', fetchedReservation);

  // Update Reservation
  const updatedReservation = await updateReservation(reservation.id, {
    check_in_date: '2023-12-02',
    check_out_date: '2023-12-11',
    total_cost: 1100,
  });
  console.log('Updated Reservation:', updatedReservation);

  // Delete Reservation
  const deletedReservation = await deleteReservation(reservation.id);
  console.log('Deleted Reservation:', deletedReservation);
}

runTests().catch((error) => {
  console.error('Error running tests:', error);
});