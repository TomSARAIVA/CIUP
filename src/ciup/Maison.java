package ciup;

import java.util.ArrayList;

class Maison {
    private String nom;
    private String nationalite;
    private String directeur;
    private String localisation;
    private int nombreLogements;
    private ArrayList<AjouterEtudiant> listeEtudiants = new ArrayList<>();
    private ArrayList<Soiree> soirees = new ArrayList<>();

    public Maison(String nom, String nationalite, String directeur, String localisation, int nombreLogements) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.directeur = directeur;
        this.localisation = localisation;
        this.nombreLogements = nombreLogements;
    }

    public void ajouterEtudiant(Etudiant e, int dureeEnMois) {
        listeEtudiants.add(new AjouterEtudiant(e, dureeEnMois));
    }
    
    public int compterEtudiantsDeNationalite(String nationalite) {
        int count = 0;
        for (AjouterEtudiant ae : listeEtudiants) {
        	if (ae.getEtudiant().getNationalite().equals(nationalite)) {
        	    count++;
        	}
        }
        return count;
    }

    public void ajouterSoiree(Soiree s) {
        for (Soiree existante : soirees) {
            if (existante.getDate().equals(s.getDate())) {
                System.out.println("Impossible d'ajouter la soirée \"" + s.getNom() + "\" : une soirée est déjà prévue le " + s.getDate());
                return;
            }
        }

        soirees.add(s);
        System.out.println("Soirée ajoutée avec succès: \"" + s.getNom() + "\" prévue le " + s.getDate());
    }
    
    public String getNom() {
        return nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getLocalisation() { 
    	return localisation; 
    }

    public int getNombreEtudiants() {
        return listeEtudiants.size();
    }
    
    public ArrayList<Soiree> getSoirees() { 
    	return soirees; 
    }
    
    public String getDirecteur() { 
    	return directeur; 
    }
    
    public int getNombreLogements() {
    	return nombreLogements;
    }

    public void afficher() {
        System.out.println("╔═════════════════════════ " + nom +" ═════════════════════════╗\n");
        System.out.println("  Adresse         : " + localisation);
        System.out.println("  Directeur       : " + directeur);
        System.out.println("  Nationalité     : " + nationalite);
        System.out.println("  Nb de logements : " + nombreLogements);
        System.out.println("\n\nListe des étudiants :\n");
        for (AjouterEtudiant ae : listeEtudiants) {
            ae.afficher();
        }
        System.out.println("\nSoirées organisées :\n");
        for (Soiree s : soirees) {
            s.afficher();
        }
        System.out.println("╚═════════════════════════ " + nom + " ═════════════════════════╝\n\n");
    }
}