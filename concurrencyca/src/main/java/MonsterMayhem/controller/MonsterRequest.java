package MonsterMayhem.controller;

import MonsterMayhem.model.Game;

public class MonsterRequest {
	
	private Game game;
    private String position;
    private String type;
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
