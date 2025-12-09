# Exercice 1 : Triplet homogène

### Objectif pédagogique :

L’objectif de cet exercice est d’apprendre à définir une classe générique simple capable de stocker trois objets du même type.
L'utilisation d’un paramètre générique <T> permet de garantir la sécurité de type : le compilateur empêche tout mélange de types au sein du même triplet.

---

### 1. Définition de la classe

La classe Triplet homogène représente une structure composée de trois éléments identiques du point de vue du type.
Elle contient :

- *Trois attributs représentant les éléments du triplet*

- *Un constructeur permettant d’initialiser ces éléments*

- *Des méthodes d’accès pour récupérer le premier, le second et le troisième élément*

- *Une méthode d’affichage affichant les trois valeurs*

- *Le paramètre générique <T> indique que tous les éléments appartiennent au même type, déterminé au moment de l’instanciation.*

---

### 2. Programme de test

Le programme de test montre comment utiliser cette classe générique.
Il crée plusieurs triplets :

*Un triplet contenant trois entiers*

*Un triplet contenant trois chaînes de caractères*

*Le programme affiche ensuite leur contenu et utilise les méthodes d’accès pour récupérer un élément particulier.*

---

### 3. Résultats (Screenshots) :

<img width="893" height="137" alt="1" src="https://github.com/user-attachments/assets/6b570a5b-6d41-46f1-a6e6-ebaab5c485d8" />

---

# Exercice 2 : Triplet hétérogène

### Objectif pédagogique :

L’objectif de cet exercice est d’étendre la notion de génériques en Java en utilisant plusieurs paramètres de type.
Contrairement au triplet homogène où les trois éléments sont du même type, le Triplet hétérogène permet de regrouper dans une même structure des objets de types différents.

Cela illustre la puissance des génériques lorsqu’ils sont utilisés avec plusieurs paramètres, permettant de créer des structures flexibles, sûres et adaptées à divers besoins.

---

### 1. Définition de la classe

Le Triplet hétérogène repose sur trois paramètres de type :

- *A : le type du premier élément*

- *B : le type du second élément*

- *C : le type du troisième élément*

La structure représente un conteneur composé de trois objets qui ne partagent pas nécessairement le même type.
Chaque élément conserve son type d’origine, ce qui permet au compilateur de garantir la sécurité de type dans toutes les opérations.

La classe associée :

- *stocke trois objets de types potentiellement différents*

- *fournit des méthodes d’accès (getters) qui retournent directement le type attendu*

- *propose une méthode d’affichage qui montre le contenu du triplet.*
  
---

### 2. Programme de test

Le programme de test montre comment utiliser cette classe générique.
Il crée plusieurs triplets :

*Un triplet contenant trois entiers*

*Un triplet contenant trois chaînes de caractères*

*Le programme affiche ensuite leur contenu et utilise les méthodes d’accès pour récupérer un élément particulier.*

---

### 3. Résultats (Screenshots) :


<img width="903" height="131" alt="2" src="https://github.com/user-attachments/assets/5bf16916-1417-40e8-8abc-e6eae294481b" />
