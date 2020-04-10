package com.quantity_measurement;

import java.text.DecimalFormat;

public enum UnitConverter {
    ;
    public enum LENGTH {
        FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETERS(1.0/2.5);

        public final double unitConversion;

        LENGTH(double unitConversion) {
            this.unitConversion = unitConversion;
        }
    }
}
