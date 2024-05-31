import React from 'react';

const GameInfo = ({ game }) => {
    return (
        <div className="game-info">
            <h2>Game ID: {game.id}</h2>
            <p>Player 1: {game.player1.username}</p>
            <p>Player 2: {game.player2.username}</p>
            <p>Game State: {game.completed ? 'Completed' : 'In Progress'}</p>
        </div>
    );
};

export default GameInfo;
