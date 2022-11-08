import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


    @RunWith(Parameterized.class)
    public class CalculatorTest {

        private final int firstNumber;
        private final int secondNumber;
        private final int expected;

        public CalculatorTest(int firstNumber, int secondNumber, int expected) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
            this.expected = expected;
        }

        // напиши метод для получения тестовых данных
        @Parameterized.Parameters
        public static Object[][] getMultiplicationData()
        {
            return new Object[][]
                    {
                            { 2, 3, 6},
                            { 4, 2, 8},
                            { 1, 0, 0},
                            { 3, 4, 12},
                            { -1, 5, -5},
                            { -1, -5, 5},
                    };
        }

        // напиши тест
        @Test
        public void shouldBeMultiplication(){
            Calculator Calculator = new Calculator();
            int actual = Calculator.mult(firstNumber, secondNumber);
            assertEquals(expected, actual);
        }
    }