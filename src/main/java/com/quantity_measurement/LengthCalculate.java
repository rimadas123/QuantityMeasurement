package com.quantity_measurement;

public class LengthCalculate {

    public UnitConverter.LENGTH length;
    public UnitConverter.VOlUME vol;
    public UnitConverter.WEIGHTS weights;
    public UnitConverter.TEMPERATURE temperature;
    public double unit;
    public final double value;


    MeasureUnits measureUnits = new MeasureUnits();

    public LengthCalculate(UnitConverter.LENGTH length,Double value){
        this.length = length;
        this.value = value;
        this.unit = length.unitConversion;
    }

    public LengthCalculate(UnitConverter.VOlUME vol, Double value){
        this.vol = vol;
        this.value = value;
        this.unit = vol.unitConversion;
    }

    public LengthCalculate(UnitConverter.WEIGHTS weights, Double value){
        this.weights = weights;
        this.value = value;
        this.unit = weights.unitConversion;
    }

    public LengthCalculate(UnitConverter.TEMPERATURE temperature, Double value){
        this.temperature = temperature;
        this.value = value;
        this.unit = temperature.unitConversion;
    }

    public boolean compare(LengthCalculate l1, LengthCalculate l2) {
        return l1.equals(l2);
    }

    public double addMethod(LengthCalculate l1, LengthCalculate l2, double baseValue) {
        return measureUnits.add(l1,l2,baseValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthCalculate quantity = (LengthCalculate) o;
        return Double.compare(quantity.value, value) == 0 &&
                Double.compare(quantity.unit, unit) == 0 &&
                temperature == quantity.temperature &&
                vol == quantity.vol &&
                weights == quantity.weights &&
                length == quantity.length ||
                measureUnits.compare(this,quantity);
    }
}
