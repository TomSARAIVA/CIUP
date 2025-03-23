package ciup;

import java.time.LocalDate;
import java.time.LocalTime;

public class AjouterEtudiant {
    private Etudiant etudiant;
    private LocalDate dateAjout;
    private LocalTime heureAjout;
    private int dureeEnMois;

    public AjouterEtudiant(Etudiant etudiant, int dureeEnMois) {
        this.etudiant = etudiant;
        this.dateAjout = LocalDate.now();
        this.heureAjout = LocalTime.now();
        this.dureeEnMois = dureeEnMois;
    }
    
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void afficher() {
        etudiant.afficher();
        System.out.println("    - Date d'ajout    : " + dateAjout);
        System.out.println("    - Heure d'ajout   : " + heureAjout);
        System.out.println("    - Durée du séjour : " + dureeEnMois + " mois\n");
    }
}
