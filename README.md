# CIUP - Application Java de gestion des maisons

Projet réalisé dans le cadre du **BUT Informatique – Semestre 2**.  
Objectif : concevoir et développer le **modèle applicatif** d’une application de gestion de la **Cité Internationale Universitaire de Paris (CIUP)** en utilisant **UML** et la programmation **Java orientée objet**.

---

## Objectif du projet
- Modéliser les structures de données (maisons, maison internationale, étudiants, services, etc.) avec **UML**.  
- Générer les **squelettes de classes Java** depuis **Visual Paradigm**.  
- Compléter et organiser les classes modèles dans un projet **Eclipse**.  
- Implémenter une classe **FactoryCIUP** pour créer et lier les objets.  
- Implémenter une classe **CIUP** avec un `main()` affichant les informations sur les maisons et étudiants.  

---

## Structure du projet

```
CIUP/
├─ src/                         # Code source (fichiers .java)
│  └─ ciup/                     # Package principal
│     ├─ AjouterEtudiant.java       # Gestion de l’ajout d’un étudiant
│     ├─ CIUP.java                  # Classe principale avec main()
│     ├─ Etudiant.java              # Classe modèle représentant un étudiant
│     ├─ FactoryCIUP.java           # Création et liaison des objets de la CIUP
│     ├─ Maison.java                # Classe modèle pour une maison
│     ├─ MaisonInternationale.java  # Classe spécifique pour la maison internationale
│     ├─ Soiree.java                # Gestion des soirées dans les maisons
│     └─ main.java                  # (fichier utilitaire contenant un main)
│
└─ bin/                         # Fichiers compilés (fichiers .class générés par Eclipse)
   └─ ciup/
      ├─ AjouterEtudiant.class
      ├─ CIUP.class
      ├─ Etudiant.class
      ├─ FactoryCIUP.class
      ├─ Maison.class
      ├─ MaisonInternationale.class
      ├─ Soiree.class
      └─ main.class
```
---

## Fonctionnalités principales
- **Classes Java modèles** générées puis complétées.  
- **Gestion des maisons et des étudiants** : création, suppression, affectation par nationalité.  
- **Gestion de la maison internationale** et de ses services (bibliothèque, cafétéria, théâtre, etc.).  
- **Répartition équitable des étudiants** avec listes d’attente.  
- **Affichage clair en console** via la classe `CIUP`.  

---

## Technologies utilisées
- **Java (Eclipse)** – programmation objet des classes modèles.  
- **Git/GitHub** – gestion de versions et suivi des contributions.  

---

## 👥 Auteurs
Projet réalisé par :  
- Tom SARAIVA 
- Yassine TAHIRI

Encadrant : **Jean-Claude Martin**

---