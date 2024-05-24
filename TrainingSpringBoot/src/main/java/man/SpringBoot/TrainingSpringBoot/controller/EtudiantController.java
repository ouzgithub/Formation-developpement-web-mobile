package man.SpringBoot.TrainingSpringBoot.controller;

import man.SpringBoot.TrainingSpringBoot.entites.Etudiant;
import man.SpringBoot.TrainingSpringBoot.service.EtudiantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("home")
public class EtudiantController {
    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "createStudent",consumes = APPLICATION_JSON_VALUE)
    public  void creerEtudiant(@RequestBody Etudiant etudiant){
        this.etudiantService.creerEtudiant(etudiant);
    }
}
