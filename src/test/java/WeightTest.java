import com.quantity_measurement.LengthCalculate;
import com.quantity_measurement.UnitConverter;
import org.junit.Assert;
import org.junit.Test;

public class WeightTest {

    @Test
    public void given1KgAnd1000GramsShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.WEIGHTS.KILOGRAM,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.WEIGHTS.GRAMS,1000.0);
        Assert.assertEquals(calculate,calculate1);
    }

    @Test
    public void given1TonneAnd1000KgShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.WEIGHTS.TONNES,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.WEIGHTS.KILOGRAM,1000.0);
        Assert.assertEquals(calculate,calculate1);
    }

    @Test
    public void given1TonneAnd1000GramShouldReturn1001Kg(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.WEIGHTS.TONNES,1.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.WEIGHTS.GRAMS,1000.0);
        double add = calculate.addMethod(calculate,calculate1, UnitConverter.WEIGHTS.KILOGRAM.unitConversion);
        Assert.assertEquals(1001,add,0.0);
    }
}
