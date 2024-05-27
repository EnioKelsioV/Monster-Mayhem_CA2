package MonsterMayhem.concurrencyca.model;

import javax.persistence.*;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int gamesWon = 0;
    private int gamesLost = 0;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	public int getGamesLost() {
		return gamesLost;
	}
	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}

}
