//import org.example.BmiCalculator;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import java.util.Arrays;
//import java.util.Collection;
//import static org.junit.Assert.assertEquals;
//
//@RunWith(Parameterized.class)
//public class BmiCalculatorTest {
//
//    private double height;
//    private double weight;
//    private double expectedBmi;
//
//    public BmiCalculatorTest(double height, double weight, double expectedBmi) {
//        this.height = height;
//        this.weight = weight;
//        this.expectedBmi = expectedBmi;
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {
//                { 1.75, 70.0, 22.86 },
//                { 1.60, 55.0, 21.48 },
//                { 1.80, 90.0, 27.78 },
//        });
//    }
//
//    @Test
//    public void testBmiCalculation() {
//        double actualBmi = BmiCalculator.calculateBmi(height, weight);
//        assertEquals(expectedBmi, actualBmi, 0.01); // Use a delta for floating-point comparisons
//    }
//}
