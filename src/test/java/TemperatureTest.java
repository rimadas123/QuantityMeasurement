import com.quantity_measurement.LengthCalculate;
import com.quantity_measurement.UnitConverter;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {

    @Test
    public void given212FahrenheitAnd100CelsiusShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(UnitConverter.TEMPERATURE.FAHRENHEIT,212.0);
        LengthCalculate calculate1 = new LengthCalculate(UnitConverter.TEMPERATURE.CELSIUS,100.0);
        Assert.assertEquals(calculate,calculate1);
    }
}
