package MonsterMayhem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Game game;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@ManyToOne
    private Player player;

    private String type;
    private String position;

}
