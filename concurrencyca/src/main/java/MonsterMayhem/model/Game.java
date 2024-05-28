package MonsterMayhem.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Player player1;

    @ManyToOne
    private Player player2;

    @ElementCollection
    private List<String> state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public List<String> getState() {
		return state;
	}

	public void setState(List<String> state) {
		this.state = state;
	}
    

}
