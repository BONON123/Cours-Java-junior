package com.itbulls.learnit.javacore.controlstatements.loops;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
        // Affiche un titre pour la démonstration de la boucle do-while
        System.out.println("=========== do-while loop");

        // Initialise un compteur à zéro
        int counter = 0;

        // Boucle do-while : exécute le bloc de code au moins une fois, puis vérifie la condition
        do {
            // Affiche la valeur du compteur avant l'incrémentation
            System.out.println("counter: " + counter++); // Incrémente le compteur après l'affichage
        } while (counter < 5); // Continue la boucle tant que le compteur est inférieur à 5

        // Démonstration : la boucle do-while s'exécute au moins une fois, même si la condition est fausse
        do {
            // Affiche un message indiquant que le compteur vaut déjà 5
            System.out.println("counter is five already: " + counter);
        } while (counter < 5); // La condition est fausse dès le début, donc la boucle s'exécute une seule fois
    }
}
