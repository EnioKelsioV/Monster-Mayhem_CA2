import React, { useState, useEffect } from 'react';
import GameBoard from './components/GameBoard';
import PlayerStats from './components/PlayerStats';
import GameInfo from './components/GameInfo';
import { getGameState } from './api';

const App = () => {
    const [game, setGame] = useState(null);
    const [player, setPlayer] = useState(null);

    useEffect(() => {
        // Fetch initial game and player data
        const fetchGame = async () => {
            const gameId = 1; // Example game ID
            const response = await getGameState(gameId);
            setGame(response.data);
        };

        fetchGame();
    }, []);

    return (
        <div className="app">
            {game && <GameInfo game={game} />}
            {game && <GameBoard gameId={game.id} />}
            {player && <PlayerStats player={player} />}
        </div>
    );
};

export default App;
