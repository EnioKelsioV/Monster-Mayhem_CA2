package MonsterMayhem.controller;

import MonsterMayhem.model.Game;

public class MoveRequest {
	
	private Game game;
    private String start;
    private String end;
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

}
