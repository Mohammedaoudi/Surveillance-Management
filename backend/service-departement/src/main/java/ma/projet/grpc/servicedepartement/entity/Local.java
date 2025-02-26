package ma.projet.grpc.servicedepartement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

 @NotBlank(message = "Le nom est obligatoire")
    private String nom;

    @Min(value = 1, message = "La capacité doit être supérieure à 0")
    private int capacite;

    @NotBlank(message = "Le type est obligatoire")
    private String type;

    private int nbSurveillants;
    private boolean estDisponible;
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
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getNbSurveillants() {
        return nbSurveillants;
    }
    public boolean getEstDisponible() {
        return estDisponible;
    }
    public void setNbSurveillants(int nbSurveillants) {
        this.nbSurveillants = nbSurveillants;
    }
    public boolean isEstDisponible() {
        return estDisponible;
    }
    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }
}

