package com.quantity_measurement;

public enum UnitConverter {
    ;
    public static final Object LENGTH = 0;

    enum LENGTH{
        FEET(1);

        public final double unitConversion;

        LENGTH(double unitConversion) {
            this.unitConversion = unitConversion;
        }
    }

}