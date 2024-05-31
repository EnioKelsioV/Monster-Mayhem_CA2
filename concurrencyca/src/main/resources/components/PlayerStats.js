import React from 'react';

const PlayerStats = ({ player }) => {
    return (
        <div className="player-stats">
            <h2>{player.username}</h2>
            <p>Games Won: {player.gamesWon}</p>
            <p>Games Lost: {player.gamesLost}</p>
        </div>
    );
};

export default PlayerStats;
