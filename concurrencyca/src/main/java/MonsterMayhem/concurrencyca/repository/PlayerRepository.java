package MonsterMayhem.concurrencyca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MonsterMayhem.model.Player;


public interface PlayerRepository extends JpaRepository<Player, Long> {

}
