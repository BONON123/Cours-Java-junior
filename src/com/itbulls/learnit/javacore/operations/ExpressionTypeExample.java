package com.itbulls.learnit.javacore.operations;

public class ExpressionTypeExample {

    public static void main(String[] args) {
        byte b = 1; // Déclaration d'une variable de type byte avec la valeur 1
        short s = 1; // Déclaration d'une variable de type short avec la valeur 1
        int i = 1; // Déclaration d'une variable de type int avec la valeur 1
        long l = 1; // Déclaration d'une variable de type long avec la valeur 1

        float f = 1.0F; // Déclaration d'une variable de type float avec la valeur 1.0
        double d = 1.0; // Déclaration d'une variable de type double avec la valeur 1.0

        char c = 1; // Déclaration d'une variable de type char avec la valeur 1 (caractère numérique)

        int intExpressionType = b + b; // Addition de deux bytes, résultat de type int
        int intExpressionType2 = s + s; // Addition de deux shorts, résultat de type int
        int intExpressionType3 = b + i + c; // Addition de byte, int et char, résultat de type int

        long longExpressionType = i + l; // Addition d'un int et d'un long, résultat de type long

        float floatExpressionType = l + f; // Addition d'un long et d'un float, résultat de type float

        double doubleExpressionType = f + d; // Addition d'un float et d'un double, résultat de type double

        System.out.println(10 / 3); // Division entière, résultat 3
        System.out.println(10.0 / 3); // Division avec au moins un opérande double, résultat avec décimales

        System.out.println("Hello " + 1); // Concaténation de chaîne et d'entier, résultat "Hello 1"
        System.out.println("Hello " + null); // Concaténation de chaîne et de null, résultat "Hello null"
    }
}
