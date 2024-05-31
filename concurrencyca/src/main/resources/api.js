/**
 * 
 */

import axios from 'axios';
// Base URL of the backend API
const API_BASE_URL = 'http://localhost:8080';

// Function to place a monster on the board
export const placeMonster = (gameId, position, type) => {
    return axios.post(`${API_BASE_URL}/games/placeMonster`, { gameId, position, type });
};

// Function to move a monster on the board
export const moveMonster = (gameId, start, end) => {
    return axios.post(`${API_BASE_URL}/games/moveMonster`, { gameId, start, end });
};

// Function to end the current turn
export const endTurn = (gameId) => {
    return axios.post(`${API_BASE_URL}/games/endTurn`, { gameId });
};
