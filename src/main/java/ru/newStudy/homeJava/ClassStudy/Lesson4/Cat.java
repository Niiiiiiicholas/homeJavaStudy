package ru.newStudy.homeJava.ClassStudy.Lesson4;

public class Cat
{
    private double originWeight;
    private double weight;
    private double sumFeed;
    private static int count;

    private final double MIN_WEIGHT;
    private final double MAX_WEIGHT;
    private final int COUNT_EYES=2;



    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        MIN_WEIGHT = 1000.0;
        MAX_WEIGHT = 9000.0;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public void meow()
    {
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight = weight - 1;
        System.out.println("Meow");
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }
    }

    public void feed(Double amount)
    {
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight = weight + amount;
        sumFeed+=amount;
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }

    }
    public double getSumFeed(){
        return sumFeed;
    }

    public void drink(Double amount)
    {
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight = weight + amount;
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }
    }

    public Double getWeight()
    {
        return weight;
    }
    public void pee(){
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){return;}
        weight-=2;
        System.out.println("Котейка сходил в туалет :) ");
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }
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