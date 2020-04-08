package com.quantity_measurement;

public class QuantityMeasurement {

    public UnitConverter.LENGTH length;
    public double value;

    public QuantityMeasurement(UnitConverter.LENGTH length, double value){
        this.length = length;
        this.value = value;
    }
}
