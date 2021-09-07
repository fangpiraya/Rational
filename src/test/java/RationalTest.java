import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void TestMultiply() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void TestDivide() {
        Rational x = new Rational();
        x.numerator = 6;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 7;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(8, x.numerator);
        Assert.assertEquals(7, x.denominator);
    }

    @Test
    public void TestEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 8;
        x.equals(y);
        Assert.assertEquals(true, x.equals(y));
    }

    @Test
    public void TestCompareTo() {
        Rational x = new Rational();
        x.numerator = 9;
        x.denominator = 8;
        Rational y = new Rational();
        y.numerator = 7;
        y.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void TestToString() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 7;
        Assert.assertEquals(x.numerator+"/"+x.denominator, x.toString());
    }
}

