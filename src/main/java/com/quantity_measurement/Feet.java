package com.quantity_measurement;

public class Feet {
    private final double value;
    public Feet(double value){
        this.value = value;
    }
    @Override
    public boolean equals(Object that){
        if(this == that)
            return true;
        if(that == null || getClass() != that.getClass())
            return false;
        Feet feet = (Feet) that;
        return Double.compare(feet.value,value) == 0;
    }
}
