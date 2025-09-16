package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1. Skriv ut "Hello World" i konsolen.
        System.out.println("Hello World");

        //2. Skriv 4 olika variabler som har datatyperna int, double, String, boolean
        int num = 42;
        double float_num = 4.2;
        String sentence = "This is a sentence";
        boolean a_bool = false;

        //3. Skriv en if-sats som kollar om värdet på din tidigare skapade int är ett värde över 5.
        //Om värdet är större än 5 skriv ut i konsolen: "Siffran är mer än 5"
        if (num > 5) {
            System.out.println("Siffran är mer än 5");
        }

        //4. Skriv en for loop som repeteras 5 gånger och skriver i varje iteration ut i (antalet iterationer).
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //5. Skapa en Array som har 5 ints.
        int[] int_arr = {1, 1, 2, 3, 5};

        //6. Skapa en Array med 5 Strings.
        String[] text_arr = {"This", "is", "chopped", "up", "sentence"};

        //7. Loopa igenom din andra array med strängar för att skriva ut samtliga texter i Arrayen i var sin rad i konsolen.
        for (String text : text_arr) {
            System.out.println(text);
        }

        //8. Skapa en ArrayList av Integers som innehåller 5 integer som du väljer själv.
        ArrayList<Integer> int_arr_list = new ArrayList<Integer>();
        int_arr_list.add(8);
        int_arr_list.add(13);
        int_arr_list.add(21);
        int_arr_list.add(34);
        int_arr_list.add(55);

        //9. Öka den fjärde siffrans värde med 4.
        int_arr_list.set(3, int_arr_list.get(3) + 4);

        //9.1 Skriv ut hela ArrayListen i Konsolen.
        for (int number : int_arr_list) {
            System.out.println(number);
        }

        //10. Skriv en metod som skriver ut "Jag har skapat en metod i Java" metoden ska inte returnera ett värde.
        //Kalla på metoden
        print_first_method();

        //11. Skriv en metod vid namn add som tar emot 2 integers och returnerar deras summa (int).
        //11.1 Använd metoden och skriv ut resultatet i konsolen.
        System.out.println("3 + 5 = " + add(3, 5));

        //12.1 Skriv en klass som heter Animal. Animal ska ha en namnvariabel (String).
        //12.2 Skapa en metod som skriver ut i konsolen när man kallar på metoden. Döp metoden makeSound.
        //12.3 Instansiera klassen och kalla på objektets metod makeSound.
        Animal base_animal = new Animal();
        base_animal.makeSound();

        //13.1 Skapa en subklass som ärver från Animal. Subklassen ska vara en valfri djurart.
        //13.2 Med hjälp av polymorfism skriv över makeSound metoden från superklassen Animal och få ditt nya djur att göra ett nytt ljud.
        //13.3 Instansiera din subklass och kalla på metoden makeSound.
        Cat cat = new Cat();
        cat.makeSound();

    }

    public static void print_first_method() {
        System.out.println("Jag har skapat en metod i Java");
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
