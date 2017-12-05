package jp.ac.uryukyu.ie.e175720;

public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

    public ExDice(int minValue, int maxValue){
        super();
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    
    public void play(){
        int val = (int)(Math.random()* (maxValue-minValue))+ minValue;
        setValue(val);
    }

}
