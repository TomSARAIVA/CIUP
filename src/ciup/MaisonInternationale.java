package ciup;


import java.util.ArrayList;

class MaisonInternationale extends Maison {
	private ArrayList<String> services = new ArrayList<>();
	public MaisonInternationale(String nom, String directeur, String localisation) {
    	super(nom, "Internationale", directeur, localisation, 0);
    }
    
    public void ajouterService(String service) {
        services.add(service);
    }
    
    public void afficher() {
        System.out.println("╔═════════════════════════ " + getNom() +" ═════════════════════════╗\n");
        System.out.println("  Adresse         : " + getLocalisation());
        System.out.println("  Directeur       : " + getDirecteur());
        System.out.println("\n\nServices proposés :\n");
        for (String s : services) {
        	System.out.println("    - " + s);
        }

        System.out.println("\n\nSoirées organisées :\n");
        for (Soiree s : getSoirees()) {
            s.afficher();
        }
        System.out.println("╚═════════════════════════ " + getNom() + " ═════════════════════════╝\n\n");
    }
    
}