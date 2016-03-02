package org.m1miage.listapp;

/**
 * Classe implantant une liste chaînée
 */
public class LinkedList {

    /**
     * l'élément à stocker à cet emplacement de la liste
     */
    private Object element;

    /**
     * emplacement suivant
     */
    private LinkedList suivant;

    /**
     * Constructeur
     *
     * @param element l'élément à stocker dans la liste
     * @param next la suite de la liste
     */
    public LinkedList(Object element, LinkedList suivant) {
        this.element = element;
        this.suivant = suivant;
    }

    /**
     * Récupère l'élement dans l'emplacement
     *
     * @return l'élément à cet emplacement
     */
    public Object getElement() {
        return element;
    }

    /**
     * Récupère l'emplacement suivant
     *
     * @return la référence de l'emplacement suivant
     */
    public LinkedList getNext() {
        return suivant;
    }

    /**
     * Place un emplacement après l'emplacement courant
     *
     * @param next L'emplacement à placer après l'emplacement courant
     */
    public void setNext(LinkedList suivant) {
        this.suivant = suivant;
    }

 /*=====================================================*/
 /* METHODES DONT VOUS DEVEZ ECRIRE ET FOURNIR LE CODE  */
 /*=====================================================*/
    /**
     * Insère un nouvel élément après l'élément courant
     *
     * @param o L'objet à insérer dans l'élement
     */
    public void insert(Object o) {
        // Création d'un nouvel élément
        LinkedList nouveau = new LinkedList(o, this.suivant);
        // Liaison de l'élément courant
        this.suivant = nouveau;
    }

    /**
     * Supprime l'élément immédiatement après l'élément courant
     */
    public void deleteNext() {
        // Si quelque chose à supprimer
        if (this.suivant != null) {
            this.suivant = this.suivant.getNext();
        }
    }

    /**
     * Affiche la liste, chaque élément étant séparé par un espace
     *
     * @return repréentation textuelle de la liste
     */
    public String toString() {
        if (this.suivant == null) {
            return this.getElement().toString();
        } else {
            return this.getElement().toString() + " " + this.getNext().toString();
        }
    }

    /**
     * Renvoie le dernier élément de la liste
     *
     * @return le dernier élément de la liste
     */
    public Object last() {
        if (this.suivant == null) {
            return this.getElement();
        } else {
            return this.suivant.last();
        }
    }

    /**
     * Ajoute à la fin de la liste une nouvelle liste
     *
     * @param list La liste à ajouter
     * @return la nouvelle liste
     */
    public LinkedList append(LinkedList list) {
        if (list != null) {
            LinkedList courant = this;
            while (courant.suivant != null) {
                courant = courant.suivant;
            }
            courant.insert(list);
        }
        return this;
    }

    /**
     * Renvoie vrai si le paramètre possède la même structure et les mêmes
     * éléments que la liste
     *
     * @param o un objet à comparer à la liste
     * @return true si le paramètre est une liste qui possède la même structure
     * et les mêmes éléments
     */
    public boolean equals(Object o) {
        // Si non LinkedList
        if (!(o instanceof LinkedList)) {
            return false;
        }
        // Conversion en LinkedList
        LinkedList listtest = (LinkedList) o;
        // Test de l'élément
        if (!this.getElement().equals(listtest.getElement())) {
            return false;
        }
        // Test des suivants
        if (this.suivant != null && listtest.suivant != null) {
            return this.suivant.equals(listtest.suivant);
        }
        return this.suivant == null && listtest.suivant == null;
    }

    /**
     * Réordonne la liste avec les éléments dans l'ordre inverse
     *
     * @return la liste dans l'ordre inverse
     */
    public LinkedList reverse() {
        LinkedList inverse = new LinkedList(this.element, null);
        LinkedList suivant = this.suivant;
        while(suivant != null) {
            inverse = new LinkedList(suivant.getElement(), inverse);
            suivant = suivant.suivant;
        }
        return inverse;
    }
}
