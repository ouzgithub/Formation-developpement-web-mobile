package man.SpringBoot.TrainingSpringBoot.service;

import man.SpringBoot.TrainingSpringBoot.entites.Etudiant;
import man.SpringBoot.TrainingSpringBoot.repository.EtudiantRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EtudiantService {
    private EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {

        this.etudiantRepository = etudiantRepository;
    }

    public  void creerEtudiant(Etudiant etudiant){
        this.etudiantRepository.save(etudiant);
    }

}
