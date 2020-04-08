package com.quantity_measurement;

public class QuantityMeasurement {

    public double value;

    public QuantityMeasurement(Double value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantity = (QuantityMeasurement) o;
        return Double.compare(quantity.value, value) == 0;
    }
}
