import com.quantity_measurement.LengthCalculate;
import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0FeetAnd0FeetShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.FEET,0.0);
        LengthCalculate calculate1 = new LengthCalculate(LengthCalculate.Unit.FEET,0.0);
        Assert.assertEquals(calculate,calculate1);
    }
    @Test
    public void givenNullFeetShouldNotReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.FEET,0.0);
        LengthCalculate calculate1 = null;
        Assert.assertNotEquals(calculate, null);
    }
    @Test
    public void givenSameReferenceShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.FEET,1.0);
        Assert.assertEquals(calculate,calculate);
    }
    @Test
    public void givenDifferentTypeShouldNotReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.FEET,1.0);
        LengthCalculate calculate1 = new LengthCalculate(LengthCalculate.Unit.INCH,1.0);
        Assert.assertNotEquals(calculate,calculate1);
    }
    @Test
    public void given0FeetAnd1FeetShouldNotReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.FEET,0.0);
        LengthCalculate calculate1 = new LengthCalculate(LengthCalculate.Unit.FEET,1.0);
        Assert.assertNotEquals(calculate,calculate1);
    }

    @Test
    public void given0InchAndInchShouldReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.INCH,0.0);
        LengthCalculate calculate1 = new LengthCalculate(LengthCalculate.Unit.INCH,0.0);
        Assert.assertEquals(calculate,calculate1);
    }

    @Test
    public void givenNullInchShouldNotReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.INCH,0.0);
        LengthCalculate calculate1 = null;
        Assert.assertNotEquals(calculate,null);
    }
    @Test
    public void givenSameReferenceShouldReturnsEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.INCH,0.0);
        Assert.assertEquals(calculate,calculate);
    }
    @Test
    public void givenDifferentTypesShouldNotReturnsEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.INCH,0.0);
        LengthCalculate calculate1 = new LengthCalculate(LengthCalculate.Unit.FEET,0.0);
        Assert.assertNotEquals(calculate,calculate1);
    }
    @Test
    public void given0InchAnd1InchShouldNotReturnEqual(){
        LengthCalculate calculate = new LengthCalculate(LengthCalculate.Unit.INCH,0.0);
        LengthCalculate calculate1 = new LengthCalculate(LengthCalculate.Unit.INCH,1.0);
        Assert.assertNotEquals(calculate,calculate1);
    }
}
