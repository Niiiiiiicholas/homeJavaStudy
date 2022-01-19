package ru.newStudy.homeJava.ClassStudy.Lesson2;

public class Cat
{
    private double originWeight;
    private double weight;
    private double sumFeed;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        sumFeed+=amount;

    }
    public double getSumFeed(){
        return sumFeed;
    }

    public void drink(Double amount){
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }
    public void pee(){
        weight-=2;
        System.out.println("Котейка сходил в туалет :) ");
    }

    public String getStatus() {
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
