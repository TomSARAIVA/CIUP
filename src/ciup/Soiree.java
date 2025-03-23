package ciup;

import java.time.LocalDate;

class Soiree {
    private String nom;
    private LocalDate date;
    private String description;

    public Soiree(String nom, LocalDate date, String description) {
        this.nom = nom;
        this.date = date;
        this.description = description;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public String getNom() {
    	return nom;
    }

    public void afficher() {
        System.out.println("  Soirée : " + nom);
        System.out.println("    - Date        : " + date);
        System.out.println("    - Description : " + description + "\n");
    }
}