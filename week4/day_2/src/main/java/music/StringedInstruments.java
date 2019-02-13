package main.java.music;

public abstract class StringedInstruments extends Instruments {


    String numberOfStrings;


    public abstract void sound();



    public void play(){
        sound();
    }

}
