package ciup;

public class Etudiant {
    private String nom;
    private String prenom;
    private String nationalite;
    private String niveauScolaire;
    private String etablissement;

    public Etudiant(String nom, String prenom, String nationalite, String niveauScolaire, String etablissement) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.niveauScolaire = niveauScolaire;
        this.etablissement = etablissement;
    }
    
    public String getNom() { 
    	return nom; 
    }
    
    public String getPrenom() { 
    	return prenom; 
    }
    
    public String getNationalite() { 
    	return nationalite; 
    }

    public void afficher() {
        System.out.println("  Étudiant : " + prenom + " " + nom);
        System.out.println("    - Nationalité     : " + nationalite);
        System.out.println("    - Niveau scolaire : " + niveauScolaire);
        System.out.println("    - Établissement   : " + etablissement);
    }
}
