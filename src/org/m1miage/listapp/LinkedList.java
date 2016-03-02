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

    }

    /**
     * Supprime l'élément immédiatement après l'élément courant
     */
    public void deleteNext() {

    }

    /**
     * Affiche la liste, chaque élément étant séparé par un espace
     *
     * @return repréentation textuelle de la liste
     */
    public String toString() {
        return null;
    }

    /**
     * Renvoie le dernier élément de la liste
     *
     * @return le dernier élément de la liste
     */
    public Object last() {
        return null;
    }

    /**
     * Ajoute à la fin de la liste une nouvelle liste
     *
     * @param list La liste à ajouter
     * @return la nouvelle liste
     */
    public LinkedList append(LinkedList list) {
        return null;
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
        return false;
    }

    /**
     * Réordonne la liste avec les éléments dans l'ordre inverse
     *
     * @return la liste dans l'ordre inverse
     */
    public LinkedList reverse() {
        return null;
    }
}