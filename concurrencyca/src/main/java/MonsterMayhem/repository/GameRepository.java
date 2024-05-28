package MonsterMayhem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MonsterMayhem.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
