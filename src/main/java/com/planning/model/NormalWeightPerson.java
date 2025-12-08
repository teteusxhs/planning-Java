package com.planning.model;



public class NormalWeightPerson extends Person {
    public NormalWeightPerson(String name, int age, double weight,double height, double physicalFrequency){
        super(name, age, weight ,height, physicalFrequency);
    }
    
    @Override
    public String getClassification() {
        return "Normal Weight";
    }
    
    @Override
    public void planning(){
        System.out.println("Hi, based on your BMI, your condition physical is normal weight.");
        System.out.println("The plan is to maintain a balanced diet and keep your current activity level.");
        System.out.println("Focus on progressive strength training to improve muscle mass.");
    }
    
    @Override
    public String getPlanning() {
        return String.format("""
        Hi! Based on your BMI, your physical condition is Normal Weight.

        Recommended plan:
        - Maintain a balanced diet.
        - Keep your current activity level.
        - Include strength training to increase muscle mass.
        """);
    }

}