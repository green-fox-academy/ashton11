package com.company.counter;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        counter.add();
        counter.get();
        counter.reset();
        counter.add(6);
        counter.get();
    }
}
