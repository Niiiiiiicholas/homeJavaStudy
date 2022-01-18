package ru.newStudy.homeJava.ClassStudy.Lesson6;

public class Cat
{
    private double originWeight;
    private double weight;
    private double sumFeed;
    private static int count;

    private Color color;

    private final double MIN_WEIGHT=1000.0;
    private final double MAX_WEIGHT=9000.0;
    private final int COUNT_EYES=2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Cat(double weight) {
        this.weight = weight;
    }


    public static int getCount() {
        return count;
    }

    public void decrementCount(){
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }
    }

    public void meow()
    {
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight = weight - 1;
        System.out.println("Meow");
        decrementCount();
    }

    public void feed(Double amount)
    {
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight = weight + amount;
        sumFeed+=amount;
        decrementCount();
    }
    public double getSumFeed(){
        return sumFeed;
    }

    public void drink(Double amount)
    {
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight = weight + amount;
        decrementCount();
    }

    public Double getWeight(){
        return weight;
    }
    public void pee(){
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight-=2;
        System.out.println("Котейка сходил в туалет :) ");
        decrementCount();
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}