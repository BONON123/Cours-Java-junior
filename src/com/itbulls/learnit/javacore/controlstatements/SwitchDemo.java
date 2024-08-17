package com.itbulls.learnit.javacore.controlstatements;

public class SwitchDemo {

    public static void main(String[] args) {

        // expression types available: byte, short, char, int, String, Enum
        String customerStatus = "premium_customer"; // Déclaration d'une variable de type String représentant le statut du client

        switch (customerStatus) { // Début de l'instruction switch avec la variable customerStatus comme expression
            case "guest": // Si le statut est "guest"
                System.out.println("Merci pour votre commande !");
                break; // Sortie du switch
            case "regular_customer": // Si le statut est "regular_customer"
                System.out.println(
                        "Merci pour votre achat ! Bénéficiez de 10% de réduction sur votre commande "
                                + "en remerciement de votre fidélité.");
                break; // Sortie du switch
            case "premium_customer": // Si le statut est "premium_customer"
                System.out.println("Wow ! Vous êtes notre client PREMIUM ! Toute votre commande à 1 USD !");
                break; // Sortie du switch
            default: // Si aucun cas ne correspond
                System.out.println("Le statut du client n'est pas défini.");
        }

        System.out.println("============ Démonstration sans break");
        int i = 1; // Déclaration d'une variable de type int avec la valeur 1

        switch (i) { // Début de l'instruction switch avec la variable i comme expression
            case 1:
                System.out.println("un");
            case 2:
                System.out.println("deux");
                break; // Sortie du switch
            default:
                System.out.println("Ceci est le bloc par défaut");
        }

        System.out.println("============ Démonstration du bloc par défaut");

        i = 10; // Modification de la valeur de i à 10

        switch (i) { // Début de l'instruction switch avec la variable i comme expression
            case 1:
                System.out.println("un");
            case 2:
                System.out.println("deux");
                break; // Sortie du switch
            default:
                System.out.println("Ceci est le bloc par défaut");
        }

    }

}
