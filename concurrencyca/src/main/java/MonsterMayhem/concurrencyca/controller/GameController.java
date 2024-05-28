package MonsterMayhem.concurrencyca.controller;

import MonsterMayhem.concurrencyca.repository.GameRepository;
import MonsterMayhem.model.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {
	
	 @Autowired
	    private GameRepository gameRepository;

	    @PostMapping("/placeMonster")
	    public Game placeMonster(@RequestBody MonsterRequest request) {
	        // Logic to place a monster on the board
	        return gameRepository.save(request.getGame());
	    }

	    @PostMapping("/moveMonster")
	    public Game moveMonster(@RequestBody MoveRequest request) {
	        // Logic to move a monster on the board
	        return gameRepository.save(request.getGame());
	    }

	    @PostMapping("/endTurn")
	    public Game endTurn(@RequestBody Game game) {
	        // Logic to end the player's turn
	        return gameRepository.save(game);
	    }

	    @GetMapping("/gameState/{gameId}")
	    public Game gameState(@PathVariable Long gameId) {
	        // Logic to return the current state of the game
	        return gameRepository.findById(gameId).orElse(null);
	    }

}
