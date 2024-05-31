package MonsterMayhem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import MonsterMayhem.model.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Long> {

}
