
package com.planning.model;


public class ObesePerson extends Person{
    public ObesePerson(String name, int age, double weight, double height, double physicalFrequency){
        super(name, age, weight, height, physicalFrequency);
    }
    
    @Override
    public String getClassification(){
        return "Obese";
    }

    @Override
    public void planning(){
        System.out.println("Hi, based on your BMI, your condition physical is obese!");
        System.out.println("The plan is to have a clean diet with low calorie intake and Attend the gym at least 4 times a week.");
    }

    @Override
    public String getPlanning() {
    return "Seu plano personalizado...";
    }

}