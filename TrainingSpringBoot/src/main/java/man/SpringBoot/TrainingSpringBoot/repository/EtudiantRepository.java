package man.SpringBoot.TrainingSpringBoot.repository;

import man.SpringBoot.TrainingSpringBoot.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    Etudiant findByid(int id); // equivaut a select * from etudiant where id = id
}
