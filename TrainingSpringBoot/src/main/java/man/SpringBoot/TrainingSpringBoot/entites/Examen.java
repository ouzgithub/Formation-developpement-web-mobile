package man.SpringBoot.TrainingSpringBoot.entites;

import jakarta.persistence.*;

@Entity
@Table(name ="examen")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String resultat;

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

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

}
