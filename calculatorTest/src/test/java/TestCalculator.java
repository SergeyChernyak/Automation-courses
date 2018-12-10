import junit.framework.Assert;

import org.junit.Test;

import java.math.BigDecimal;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void testCheckCountValueFromStr() {
        int countValues = calculator.checkCountValuesFromStr("s   df 1");
        assertEquals(1, countValues);
    }

    @Test
    public void testCheckCountOperationFromStr () {
        int countOperation = calculator.checkCountOperation("asd#/");
        assertEquals(1, countOperation);
    }

    @Test
    public void testCheckValueFromStr() {

        BigDecimal[] exArr = new BigDecimal[calculator.getValuesFromStr("sdf1sdf2").length];
        exArr[0] = BigDecimal.valueOf(1.0);
        exArr[1] = BigDecimal.valueOf(2.0);
        assertThat(exArr, is(calculator.getValuesFromStr("sdf1sdf2")));
    }

    @Test
    public void testCheckOperationFromStr () {
        String operation = calculator.getOperationFromStr("sdf/sdf sdf");
        Assert.assertEquals("/", operation);
    }

    @Test
    public void testCalculate () {
        BigDecimal[] inputArr = new BigDecimal[calculator.getValuesFromStr("sdfsdf/").length];
        inputArr[0] = BigDecimal.valueOf(6.0);
        inputArr[1] = BigDecimal.valueOf(2.0);
        String operationForCalc = calculator.getOperationFromStr("sdfsdf/");
        BigDecimal expectValue = BigDecimal.valueOf(3);
        assertEquals(expectValue, calculator.calculateResult(inputArr, operationForCalc));
    }
}
