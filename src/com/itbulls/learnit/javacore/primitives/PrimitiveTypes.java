package com.itbulls.learnit.javacore.primitives;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        byte b = 1;  
 // Déclaration d'une variable de type byte (8 bits) avec la valeur 1
        short s; // Déclaration d'une variable de type short (16 bits) sans initialisation
        s = 2; // Initialisation de la variable s avec la valeur 2
        int i = 3; // Déclaration d'une variable de type int (32 bits) avec la valeur 3
        long l = 4; // Déclaration d'une variable de type long (64 bits) avec la valeur 4
        
        char c = 'a'; // Déclaration d'une variable de type char (caractère Unicode) avec la valeur 'a'
        
        boolean bool = true; // Déclaration d'une variable de type boolean (valeur booléenne) avec la valeur true
        
        float f = 1.2F; // Déclaration d'une variable de type float (32 bits flottant) avec la valeur 1.2
        
        long l2 = 2_000_000_000_000L; // Déclaration d'une variable de type long avec une valeur littérale utilisant des underscores pour améliorer la lisibilité
        
        double d = 1.3; // Déclaration d'une variable de type double (64 bits flottant) avec la valeur 1.3
        
        var v = 1; // Déclaration d'une variable avec inférence de type, initialisée avec la valeur 1 (équivalent à int v = 1)
//      v = true; // Erreur de compilation : type incompatible
//      v = 1.3; // Erreur de compilation : type incompatible
        
        int i3 = s; // Conversion implicite de short en int
        
        char c2 = 100; // Conversion implicite d'int en char (correspond au caractère 'd')
        System.out.println(c2); // Affiche le caractère 'd'
        
        double d2 = i3; // Conversion implicite de int en double
        d2 = l; // Conversion implicite de long en double
        
        b = (byte)i3; // Conversion explicite (cast) de int en byte, perte de précision possible
        
        byte b2 = (byte)128; // Conversion explicite (cast) de int en byte, débordement, résultat imprévisible
        System.out.println(b2); // Affiche la valeur de b2 après le débordement
        
        long number = 499_999_999_000_000_001L; // Déclaration d'une variable de type long avec une grande valeur
        double converted = (double) number; // Conversion explicite de long en double
        System.out.println(number - (long) converted); // Affiche la différence entre le nombre original et sa conversion en long après conversion en double
        
        Integer i4 = 1; // Création d'un objet Integer (wrapper) avec la valeur 1
        
        int i5 = i4; // Autoboxing : conversion automatique de Integer en int
    }
}
