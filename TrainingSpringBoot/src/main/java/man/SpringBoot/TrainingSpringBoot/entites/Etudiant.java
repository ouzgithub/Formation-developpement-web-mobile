package man.SpringBoot.TrainingSpringBoot.entites;

import jakarta.persistence.*;

@Entity
@Table(name ="etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String niveau;
    private int note;

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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
