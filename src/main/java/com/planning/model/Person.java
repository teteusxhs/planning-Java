package com.planning.model;

public abstract class Person{

    private String name;
    private int age;
    private double weight;
    private double height;
    private double physicalFrequency;
    private final double bmi;
    
    public Person(String name, int age, double weight, double height, double physicalFrequency){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBmiStatic(weight,height);
        this.physicalFrequency = physicalFrequency;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getBmi() { return bmi; }
    public double getPhysicalFrequency() { return physicalFrequency; }
    
    
     public static double calculateBmiStatic(double weight, double height){
        if (height <= 0) return 0.0;
        return weight / (height * height); 
    }
    
    abstract public String getClassification(); 
    
    abstract public void planning();

    public abstract String getPlanning();


}