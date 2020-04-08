package com.quantity_measurement;

public class Inch {
    private final double value;
    public Inch(double value){
        this.value = value;
    }
    @Override
    public boolean equals(Object that){
        if(this == that) return true;
        if(that == null || getClass() != that.getClass()) return false;
        Inch inch = (Inch) that;
        return Double.compare(inch.value,value) == 0;
    }
}
