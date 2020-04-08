import com.quantity_measurement.Feet;
import com.quantity_measurement.Inch;
import com.quantity_measurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0FeetAnd0FeetShouldReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void givenNullFeetShouldNotReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void givenSameReferenceShouldReturnEqual(){
        Feet feet1 = new Feet(1.0);
        Assert.assertEquals(feet1,feet1);
    }
    @Test
    public void givenDifferentTypeShouldNotReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Inch feet2 = new Inch(0.0);
        Assert.assertNotEquals(feet1,feet2);
    }
    @Test
    public void given0FeetAnd1FeetShouldNotReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1,feet2);
    }
}
