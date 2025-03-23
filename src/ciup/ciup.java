package ciup;

import java.util.ArrayList;

class CIUP {
    private ArrayList<Maison> maisons = new ArrayList<>();

    public void ajouterMaison(Maison m) {
        maisons.add(m);
        System.out.println("Maison ajoutée avec succès : " + m.getNom());
    }
    
    public void supprimerMaison(String nom) {
        for (Maison m : maisons) {
            if (m.getNom().equals(nom)) {
                maisons.remove(m);
                System.out.println("Maison supprimée avec succès : " + nom);
                return;
            }
        }
        System.out.println("Maison introuvable : " + nom);
    }
    
    public void inscrireEtudiant(Etudiant e, String maisonSouhaitee, int duree) {
        Maison cible = null;

        if (maisonSouhaitee != null && !maisonSouhaitee.equals("")) {
            for (Maison m : maisons) {
                if (m.getNom().equals(maisonSouhaitee) && m.getNombreEtudiants() < m.getNombreLogements()) {
                    cible = m;
                    break;
                }
            }
        }

        if (cible == null) {
            for (Maison m : maisons) {
                if (m.getNationalite().equals(e.getNationalite()) && m.getNombreEtudiants() < m.getNombreLogements()) {
                    cible = m;
                    break;
                }
            }
        }

        if (cible == null) {
            int min = Integer.MAX_VALUE;
            for (Maison m : maisons) {
                if (m.getNombreEtudiants() < m.getNombreLogements()) {
                    int count = m.compterEtudiantsDeNationalite(e.getNationalite());
                    if (count < min) {
                        min = count;
                        cible = m;
                    }
                }
            }
        }

        if (cible != null) {
            cible.ajouterEtudiant(e, duree);
            System.out.println(e.getPrenom() + " " + e.getNom() + " a été inscrit dans la maison : " + cible.getNom());
        } else {
            System.out.println("Impossible d'inscrire " + e.getPrenom() + " " + e.getNom());
        }
    }


    public void afficher() {
        System.out.println("\n\n╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("               Cité Internationale Universitaire de Paris               ");
        System.out.println("╚══════════════════════════════════════════════════════════════════════╝\n\n");
        
        for (Maison m : maisons) {
            m.afficher();
        }
        
        System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("                      Fin de l'affichage de la CIUP                     ");
        System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
    }
}
