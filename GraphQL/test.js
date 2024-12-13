"use strict";
var __makeTemplateObject = (this && this.__makeTemplateObject) || function (cooked, raw) {
    if (Object.defineProperty) { Object.defineProperty(cooked, "raw", { value: raw }); } else { cooked.raw = raw; }
    return cooked;
};
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g = Object.create((typeof Iterator === "function" ? Iterator : Object).prototype);
    return g.next = verb(0), g["throw"] = verb(1), g["return"] = verb(2), typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (g && (g = 0, op[0] && (_ = 0)), _) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
var client_1 = require("@apollo/client");
var cross_fetch_1 = require("cross-fetch");
var perf_hooks_1 = require("perf_hooks");
var client = new client_1.ApolloClient({
    link: new client_1.HttpLink({ uri: 'http://localhost:4000/graphql', fetch: cross_fetch_1.default }),
    cache: new client_1.InMemoryCache(),
});
var CREATE_RESERVATION = (0, client_1.gql)(templateObject_1 || (templateObject_1 = __makeTemplateObject(["\n  mutation CreateReservation($input: CreateReservationInput!) {\n    createReservation(input: $input) {\n      id\n      check_in_date\n      check_out_date\n      total_cost\n      guest_id\n      room_id\n    }\n  }\n"], ["\n  mutation CreateReservation($input: CreateReservationInput!) {\n    createReservation(input: $input) {\n      id\n      check_in_date\n      check_out_date\n      total_cost\n      guest_id\n      room_id\n    }\n  }\n"])));
var GET_RESERVATION = (0, client_1.gql)(templateObject_2 || (templateObject_2 = __makeTemplateObject(["\n  query GetReservation($id: ID!) {\n    getReservation(id: $id) {\n      id\n      check_in_date\n      check_out_date\n      total_cost\n      guest_id\n      room_id\n    }\n  }\n"], ["\n  query GetReservation($id: ID!) {\n    getReservation(id: $id) {\n      id\n      check_in_date\n      check_out_date\n      total_cost\n      guest_id\n      room_id\n    }\n  }\n"])));
var UPDATE_RESERVATION = (0, client_1.gql)(templateObject_3 || (templateObject_3 = __makeTemplateObject(["\n  mutation UpdateReservation($id: ID!, $input: UpdateReservationInput!) {\n    updateReservation(id: $id, input: $input) {\n      id\n      check_in_date\n      check_out_date\n      total_cost\n      guest_id\n      room_id\n    }\n  }\n"], ["\n  mutation UpdateReservation($id: ID!, $input: UpdateReservationInput!) {\n    updateReservation(id: $id, input: $input) {\n      id\n      check_in_date\n      check_out_date\n      total_cost\n      guest_id\n      room_id\n    }\n  }\n"])));
var DELETE_RESERVATION = (0, client_1.gql)(templateObject_4 || (templateObject_4 = __makeTemplateObject(["\n  mutation DeleteReservation($id: ID!) {\n    deleteReservation(id: $id) {\n      id\n    }\n  }\n"], ["\n  mutation DeleteReservation($id: ID!) {\n    deleteReservation(id: $id) {\n      id\n    }\n  }\n"])));
function createReservation(input) {
    return __awaiter(this, void 0, void 0, function () {
        var start, response, end;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    start = perf_hooks_1.performance.now();
                    return [4 /*yield*/, client.mutate({
                            mutation: CREATE_RESERVATION,
                            variables: { input: input },
                        })];
                case 1:
                    response = _a.sent();
                    end = perf_hooks_1.performance.now();
                    console.log("Create Reservation Latency: ".concat(end - start, " ms"));
                    return [2 /*return*/, response.data.createReservation];
            }
        });
    });
}
function getReservation(id) {
    return __awaiter(this, void 0, void 0, function () {
        var start, response, end;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    start = perf_hooks_1.performance.now();
                    return [4 /*yield*/, client.query({
                            query: GET_RESERVATION,
                            variables: { id: id },
                        })];
                case 1:
                    response = _a.sent();
                    end = perf_hooks_1.performance.now();
                    console.log("Get Reservation Latency: ".concat(end - start, " ms"));
                    return [2 /*return*/, response.data.getReservation];
            }
        });
    });
}
function updateReservation(id, input) {
    return __awaiter(this, void 0, void 0, function () {
        var start, response, end;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    start = perf_hooks_1.performance.now();
                    return [4 /*yield*/, client.mutate({
                            mutation: UPDATE_RESERVATION,
                            variables: { id: id, input: input },
                        })];
                case 1:
                    response = _a.sent();
                    end = perf_hooks_1.performance.now();
                    console.log("Update Reservation Latency: ".concat(end - start, " ms"));
                    return [2 /*return*/, response.data.updateReservation];
            }
        });
    });
}
function deleteReservation(id) {
    return __awaiter(this, void 0, void 0, function () {
        var start, response, end;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    start = perf_hooks_1.performance.now();
                    return [4 /*yield*/, client.mutate({
                            mutation: DELETE_RESERVATION,
                            variables: { id: id },
                        })];
                case 1:
                    response = _a.sent();
                    end = perf_hooks_1.performance.now();
                    console.log("Delete Reservation Latency: ".concat(end - start, " ms"));
                    return [2 /*return*/, response.data.deleteReservation];
            }
        });
    });
}
function runTests() {
    return __awaiter(this, void 0, void 0, function () {
        var reservationInput, reservation, fetchedReservation, updatedReservation, deletedReservation;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    reservationInput = {
                        check_in_date: '2023-12-01',
                        check_out_date: '2023-12-10',
                        total_cost: 1000,
                        guest_id: 1,
                        room_id: 1,
                    };
                    return [4 /*yield*/, createReservation(reservationInput)];
                case 1:
                    reservation = _a.sent();
                    console.log('Created Reservation:', reservation);
                    return [4 /*yield*/, getReservation(reservation.id)];
                case 2:
                    fetchedReservation = _a.sent();
                    console.log('Fetched Reservation:', fetchedReservation);
                    return [4 /*yield*/, updateReservation(reservation.id, {
                            check_in_date: '2023-12-02',
                            check_out_date: '2023-12-11',
                            total_cost: 1100,
                        })];
                case 3:
                    updatedReservation = _a.sent();
                    console.log('Updated Reservation:', updatedReservation);
                    return [4 /*yield*/, deleteReservation(reservation.id)];
                case 4:
                    deletedReservation = _a.sent();
                    console.log('Deleted Reservation:', deletedReservation);
                    return [2 /*return*/];
            }
        });
    });
}
runTests().catch(function (error) {
    console.error('Error running tests:', error);
});
var templateObject_1, templateObject_2, templateObject_3, templateObject_4;
