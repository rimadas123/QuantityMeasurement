import com.quantity_measurement.LengthCalculate;
import com.quantity_measurement.UnitConverter;
import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {
    @Test
    public void given1GallonAnd3LitresShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.VOlUME.GALLON,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.VOlUME.LITERS,3.78);
        Assert.assertEquals(calculate,calculate1);
    }

    @Test
    public void given1LitreAnd1000MLShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.VOlUME.LITERS,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.VOlUME.MILLILITERS,1000.0);
        Assert.assertEquals(calculate,calculate1);
    }

    @Test
    public void given1GallonAnd3LitresShouldReturn7Litres(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.VOlUME.GALLON,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.VOlUME.LITERS,3.78);
        double add = calculate.addMethod(calculate,calculate1, UnitConverter.VOlUME.LITERS.unitConversion);
        Assert.assertEquals(7.56,add,0.0);
    }

    @Test
    public void given1LitreAnd1000MLShouldReturn2Litres(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.VOlUME.LITERS,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.VOlUME.MILLILITERS,1000.0);
        double add = calculate.addMethod(calculate,calculate1, UnitConverter.VOlUME.LITERS.unitConversion);
        Assert.assertEquals(2,add,0.0);
    }
}
