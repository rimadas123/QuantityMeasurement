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

    public enum VOlUME {
        GALLON(3.78),LITERS(1.0), MILLILITERS(1.0/1000.0);

        public final double unitConversion;

        VOlUME(double unitConversion) {
            this.unitConversion = unitConversion;
        }
    }
}
