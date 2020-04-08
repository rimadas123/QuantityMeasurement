package com.quantity_measurement;

public class LengthCalculate {

    private static final double FEET_TO_INCH =12.0 ;
    private final Unit unit;

    public enum Unit{
        FEET,INCH
    }

    private final double value;

    public LengthCalculate(Unit unit,Double value){
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(LengthCalculate thatLength) {
        if (this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.FEET))
            return Double.compare(this.value,thatLength.value)==0;
        if (this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH,thatLength.value)==0;
        return false;
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
