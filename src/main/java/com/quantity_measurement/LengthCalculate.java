package com.quantity_measurement;

public class LengthCalculate {

    public final UnitConverter unit;
    public final double value;


    public LengthCalculate(UnitConverter unit,Double value){
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(LengthCalculate l1, LengthCalculate l2) {
        return this.unit.compare(l1,l2);
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
