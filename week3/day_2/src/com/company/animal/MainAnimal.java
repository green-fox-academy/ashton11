package com.company.animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal snake = new Animal("snake");
        Animal cow = new Animal("cow");
        Animal monkey = new Animal("Wukong");
        monkey.drink();
        monkey.printStats();
        cow.eat();
        cow.printStats();
        snake.play();
        snake.printStats();

    }
}
