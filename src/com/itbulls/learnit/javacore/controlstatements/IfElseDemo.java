package com.itbulls.learnit.javacore.controlstatements;

public class IfElseDemo {

    public static void main(String[] args) {
        int amountOfMoneyOnAccount = 100;
        int itemPrice = 200;

        if (amountOfMoneyOnAccount < itemPrice) { // Vérifie si le solde est inférieur au prix de l'article
            System.out.println("Vous n'avez pas assez d'argent sur votre compte pour acheter cet article.");
        } else { // Sinon, si le solde est supérieur ou égal au prix
            // Logique d'achat ici
            System.out.println("Article acheté");
        }

        // ============== Démonstration sans accolades
        amountOfMoneyOnAccount += 200; // Ajoute 200 au solde
        if (amountOfMoneyOnAccount < itemPrice)
            System.out.println("Vous n'avez pas assez d'argent sur votre compte pour acheter cet article.");
        else
            // Logique d'achat ici
            System.out.println("Article acheté");
            System.out.println("Je ne suis pas dans le bloc else ici"); // Cette ligne sera toujours exécutée, indépendamment de la condition

        // ============== Instruction if imbriquée
        int i1 = 3;
        int i2 = 2;
        int i3 = 10;
        if (i1 > i2) { // Si i1 est supérieur à i2
            if (i1 > i3) // Si i1 est également supérieur à i3
                System.out.println("i1 est supérieur à i2 et i3");
            else // Sinon, si i1 est supérieur à i2 mais inférieur à i3
                System.out.println("i1 est supérieur à i2 mais inférieur à i3");
        }

        // ============== Instruction if-else-if
        int orderPrice = 1000;

        if (orderPrice > 0 && orderPrice < 100) { // Si le prix de la commande est entre 0 et 100 (exclusif)
            System.out.println("Vous bénéficiez de 5% de réduction sur cette commande");
        } else if (orderPrice >= 100 && orderPrice < 500) { // Sinon, si le prix de la commande est entre 100 et 500 (exclusif)
            System.out.println("Vous bénéficiez de 10% de réduction sur cette commande");
        } else if (orderPrice >= 500 && orderPrice < 5000) { // Sinon, si le prix de la commande est entre 500 et 5000 (exclusif)
            System.out.println("Vous bénéficiez de 15% de réduction sur cette commande");
        }
    }
}
