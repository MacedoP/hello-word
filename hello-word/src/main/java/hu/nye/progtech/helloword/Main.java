package hu.nye.progtech.helloword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GreetingsGenerator generator = new GreetingsGenerator();
        String name;
        System.out.println("White your name: ");
        name = s.next();
        System.out.println( generator.generatorGreetings(name));

    }
}