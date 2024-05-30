import React, { useState, useEffect } from 'react';
import { placeMonster, moveMonster, getGameState } from '../api';
import Monster from './Monster';
import io from 'socket.io-client';

const GameBoard = ({ gameId }) => {
    const [board, setBoard] = useState(Array(10).fill(Array(10).fill(null)));
    const socket = io('http://localhost:8080');

    useEffect(() => {
        // Fetch the initial game state
        getGameState(gameId).then(response => {
            setBoard(response.data.state);
        });

        // Listen for real-time updates from the server
        socket.on('update', newBoard => {
            setBoard(newBoard);
        });

        // Clean up the socket connection on component unmount
        return () => socket.disconnect();
    }, [gameId, socket]);

    // Handle placing a monster on the board
    const handlePlaceMonster = (position, type) => {
        placeMonster(gameId, position, type).then(response => {
            setBoard(response.data.state);
        });
    };

    // Handle moving a monster on the board
    const handleMoveMonster = (start, end) => {
        moveMonster(gameId, start, end).then(response => {
            setBoard(response.data.state);
        });
    };

    return (
        <div className="game-board">
            {board.map((row, rowIndex) => (
                <div key={rowIndex} className="row">
                    {row.map((cell, cellIndex) => (
                        <div key={cellIndex} className="cell">
                            {cell && <Monster type={cell.type} />}
                        </div>
                    ))}
                </div>
            ))}
            {/* Add controls for placing and moving monsters */}
        </div>
    );
};

export default GameBoard;
