package man.SpringBoot.TrainingSpringBoot.entites;

import jakarta.persistence.*;

@Entity
@Table(name ="professuer")
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String nom;
    private  String matiere;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
