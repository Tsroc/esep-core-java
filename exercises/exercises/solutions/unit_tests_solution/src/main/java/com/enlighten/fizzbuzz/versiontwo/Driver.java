package com.enlighten.fizzbuzz.versiontwo;

public class Driver {
    public static void main(String[] args) {
        Renderer renderer = new ConsoleRenderer();
        FizzBuzzEngine engine = new FizzBuzzEngine();

        new FizzBuzzGame(renderer,engine).play();
    }
}
