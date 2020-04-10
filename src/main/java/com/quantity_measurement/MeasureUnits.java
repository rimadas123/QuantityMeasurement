package com.quantity_measurement;

import java.text.DecimalFormat;

public class MeasureUnits {

    DecimalFormat ds = new DecimalFormat("##.00");

    public boolean compare(LengthCalculate l1, LengthCalculate l2){
        return Double.compare(Double.parseDouble(ds.format(l1.value * l1.unit)),
                Double.parseDouble(ds.format(l2.value * l2.unit))) == 0;
    }

    public double add(LengthCalculate l1, LengthCalculate l2, double baseValue){
        double value = ((l1.value * l1.unit) + (l2.value * l2.unit)) / baseValue;
        return Double.parseDouble(ds.format(value));
    }
}
