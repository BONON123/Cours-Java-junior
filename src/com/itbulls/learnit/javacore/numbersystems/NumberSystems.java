package com.itbulls.learnit.javacore.numbersystems;

public class NumberSystems {
    
    public static void main(String[] args) {
        int dec = 152; // Déclaration d'un entier décimal (sans préfixe)
        int bin = 0b10011000; // Déclaration d'un entier binaire (préfixe '0b')
        int oct = 0230; // Déclaration d'un entier octal (préfixe '0')
        int hex = 0x98; // Déclaration d'un entier hexadécimal (préfixe '0x')
        
        System.out.println(dec); // Affiche la valeur décimale
        System.out.println(bin); // Affiche la valeur binaire
        System.out.println(oct); // Affiche la valeur octale
        System.out.println(hex); // Affiche la valeur hexadécimale
    }
    
}
