package org.nla.foodtrack;

class FoodItem {

    public enum  Measure  {
        Count,
        Weight
    }

    private String name;
    private Measure measure;
    private double calories;

    public FoodItem(String name, Measure measure, double calories) {
        this.name = name;
        this.measure = measure;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public Measure getMeasure() {
        return measure;
    }

    public double getCalories() {
        return calories;
    }
}
