package com.company.counter;

public class Counter {
    int number;
    int initialNumber;
    public Counter (){
    initialNumber = number;
    }
    public Counter(int number) {
        this.number = number;
        initialNumber = number;
    }
    public int add(){
        number++;
    return number;
    }
    public int add(int addition){
        number += addition;
        return number;
    }
    public int get(){
        System.out.println(number);

        return number;
    }
    public void reset(){
        number = initialNumber;
    }


}
