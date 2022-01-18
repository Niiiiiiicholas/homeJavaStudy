package ru.newStudy.homeJava.ClassStudy.Lesson3;

public class Cat
{
    private double originWeight;
    private double weight;
    private double sumFeed;
    private static int count;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public void meow()
    {
        if(weight<minWeight||weight>maxWeight){return;}
        weight = weight - 1;
        System.out.println("Meow");
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }
    }

    public void feed(Double amount)
    {
        if(weight<minWeight||weight>maxWeight){return;}
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
        if(weight<minWeight||weight>maxWeight){return;}
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
        if(weight<minWeight||weight>maxWeight){return;}
        weight-=2;
        System.out.println("Котейка сходил в туалет :) ");
        if(getStatus().equals("Dead")||getStatus().equals("Exploded")){
            count--;
        }
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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