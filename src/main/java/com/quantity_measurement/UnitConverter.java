package com.quantity_measurement;

public enum UnitConverter {

    FEET(12.0),INCH(1.0),YARD(36.0);

    private final double convertedValue;

    UnitConverter(double convertedValue){
        this.convertedValue = convertedValue;
    }

    public boolean compare(LengthCalculate l1, LengthCalculate l2){
        return Double.compare(l1.value*l1.unit.convertedValue , l2.value*l2.unit.convertedValue) == 0;
    }

}
