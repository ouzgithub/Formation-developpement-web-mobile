package man.SpringBoot.TrainingSpringBoot.repository;

import man.SpringBoot.TrainingSpringBoot.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
