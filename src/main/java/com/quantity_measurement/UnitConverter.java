package com.quantity_measurement;

public enum UnitConverter {
    ;
    enum LENGTH{
        FEET(1);

        public final double unitConversion;

        LENGTH(double unitConversion) {
            this.unitConversion = unitConversion;
        }
    }

}