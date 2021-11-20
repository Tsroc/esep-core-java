package com.enlighten.fizzbuzz.versiontwo;

public class ConsoleRenderer implements  Renderer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
