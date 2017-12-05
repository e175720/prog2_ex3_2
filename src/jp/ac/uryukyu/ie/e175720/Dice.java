package jp.ac.uryukyu.ie.e175720;

public class Dice {
    private int value;

    public Dice(){
        play();
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void play(){
        int val = (int)(Math.random()*6) + 1;
        setValue(val);

    }
}