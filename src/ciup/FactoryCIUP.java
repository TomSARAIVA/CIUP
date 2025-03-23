package ciup;

import java.time.LocalDate;

class FactoryCIUP {
    public static CIUP createCIUP() {
        CIUP ciup = new CIUP();

        Maison avicenne = new Maison("Fondation Avicenne", "Multinationale", "Francesco TORRISI", "27 D boulevard Jourdan 75014 Paris", 111);
        Maison coree = new Maison("Maison de la Corée", "Coréen", "Hyunjin KIM", "9 G boulevard Jourdan 75014 Paris", 250);
        Maison bourguiba = new Maison("Pavillon Habib Bourguiba", "Tunisien", "Mahmoud ZOUAOUI", "45 E boulevard Jourdan 75014 Paris", 199);
        Maison daubie = new Maison("Résidence Julie-Victoire Daubié", "Multinationale", "Francesco TORRISI", "27 F boulevard Jourdan 75014 Paris", 106);
        MaisonInternationale maisonIntl = new MaisonInternationale("Maison Internationale", "Myriam GHOUDI", "21 boulevard Jourdan 75014 Paris");

        avicenne.ajouterSoiree(new Soiree("Soirée Interculturelle", LocalDate.of(2025, 4, 10), "Buffet et musique du monde"));
        avicenne.ajouterSoiree(new Soiree("Soirée doublon", LocalDate.of(2025, 4, 10), "Doublon"));
        coree.ajouterSoiree(new Soiree("Soirée K-Culture", LocalDate.of(2025, 5, 3), "K-pop, cuisine coréenne et hanbok"));
        bourguiba.ajouterSoiree(new Soiree("Soirée Maghreb", LocalDate.of(2025, 6, 12), "Musique et traditions tunisiennes"));
        daubie.ajouterSoiree(new Soiree("Soirée Étudiantes", LocalDate.of(2025, 4, 25), "Échanges autour de l’égalité et de l’inclusion"));
        maisonIntl.ajouterSoiree(new Soiree("Ciné-débat international", LocalDate.of(2025, 5, 5), "Projection suivie d’un débat sur le vivre ensemble"));
        maisonIntl.ajouterSoiree(new Soiree("Forum des cultures", LocalDate.of(2025, 6, 1), "Stands, spectacles et gastronomie du monde entier"));

        System.out.println();
        
        maisonIntl.ajouterService("Bibliothèque");
        maisonIntl.ajouterService("Cafétéria");
        maisonIntl.ajouterService("Théâtre");
        maisonIntl.ajouterService("Piscine");
        maisonIntl.ajouterService("Administration");

        ciup.ajouterMaison(avicenne);
        ciup.ajouterMaison(coree);
        ciup.ajouterMaison(bourguiba);
        ciup.ajouterMaison(daubie);
        ciup.ajouterMaison(maisonIntl);

        System.out.println();
       
        ciup.supprimerMaison("Maison de la Corée");
        ciup.supprimerMaison("Maison");

        System.out.println(); 

        ciup.inscrireEtudiant(new Etudiant("Dupont", "Lucas", "Français", "Master", "Université Paris-Saclay"), "Fondation Avicenne", 12);
        ciup.inscrireEtudiant(new Etudiant("Ben Yamina", "Mehdi", "Français", "BUT", "Université Paris Cité"), "", 6);
        ciup.inscrireEtudiant(new Etudiant("Ribeiro", "Sofia", "Portugaise", "Licence", "Université de Lisbonne"), "Maison du Portugal", 9);
        ciup.inscrireEtudiant(new Etudiant("Kowalski", "Anna", "Polonaise", "Master", "Université de Varsovie"), "", 10);
        ciup.inscrireEtudiant(new Etudiant("Nakamura", "Takeshi", "Japonais", "Doctorat", "Université de Tokyo"), "", 10);
        ciup.inscrireEtudiant(new Etudiant("El-Haddad", "Omar", "Marocain", "Master", "Université Hassan II"), "", 8);
        ciup.inscrireEtudiant(new Etudiant("Al-Mansouri", "Fatima", "Français", "BUT", "Université Paris 8"), "", 12);
        ciup.inscrireEtudiant(new Etudiant("Fernández", "Elena", "Espagnole", "Master", "Université de Madrid"), "", 7);
        ciup.inscrireEtudiant(new Etudiant("Morel", "Lucas", "Français", "Licence", "Université Paris Nanterre"), "", 9);
        ciup.inscrireEtudiant(new Etudiant("Leclerc", "Jean-Baptiste", "Français", "BUT", "Université Paris-Saclay"), "", 10);
        ciup.inscrireEtudiant(new Etudiant("Dubois", "Clara", "Français", "BUT", "Université de Versailles"), "", 6);
        ciup.inscrireEtudiant(new Etudiant("Wang", "Yue", "Chinois", "Doctorat", "Université de Pékin"), "", 12);

        return ciup;
    }
}
