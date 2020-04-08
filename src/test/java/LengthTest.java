import com.quantity_measurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void givenZeroFeet_whenCheckEquals_ShouldReturnTrue(){
        QuantityMeasurement zero = new QuantityMeasurement(0.0);
        QuantityMeasurement zero1 = new QuantityMeasurement(0.0);
        Assert.assertEquals(zero,zero1);
    }
}
