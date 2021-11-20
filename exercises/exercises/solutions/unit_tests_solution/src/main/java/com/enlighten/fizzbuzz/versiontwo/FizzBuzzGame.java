package com.enlighten.fizzbuzz.versiontwo;

public class FizzBuzzGame {
    private Renderer renderer;
    private FizzBuzzEngine engine;

    public FizzBuzzGame(Renderer renderer, FizzBuzzEngine engine) {
        this.renderer = renderer;
        this.engine = engine;
    }


    public void play() {
        for(int i=0; i < 100; i++){
            renderer.print(engine.getResult(i));
        }
    }
}


