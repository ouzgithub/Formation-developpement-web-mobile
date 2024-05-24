package man.SpringBoot.TrainingSpringBoot.service;

import man.SpringBoot.TrainingSpringBoot.entites.Etudiant;
import man.SpringBoot.TrainingSpringBoot.repository.EtudiantRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    private EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {

        this.etudiantRepository = etudiantRepository;
    }

    public  void creerEtudiant(Etudiant etudiant){
        this.etudiantRepository.save(etudiant);
    }

    public List<Etudiant> getEtudiant(){
        return this.etudiantRepository.findAll();
    }
    public Etudiant getEtudiant(int id){
      Optional<Etudiant> optionalEtudiant= Optional.ofNullable(etudiantRepository.findByid(id));
        return optionalEtudiant.orElse(null);
    }
}
