package com.quantity_measurement;

public class LengthCalculate {

    private final Unit unit;

    public enum Unit{
        FEET,INCH
    }

    private final double value;

    public LengthCalculate(Unit unit,Double value){
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthCalculate quantity = (LengthCalculate) o;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }
}
