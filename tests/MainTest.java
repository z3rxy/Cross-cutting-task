import org.junit.Assert;
import org.junit.Test;


public class MainTest {

        @Test
        public void isOperator() {
            Assert.assertTrue(Main.isOperator('+'));
            Assert.assertTrue(Main.isOperator('-'));
            Assert.assertTrue(Main.isOperator('*'));
            Assert.assertTrue(Main.isOperator('/'));
            Assert.assertFalse(Main.isOperator('a'));
            Assert.assertFalse(Main.isOperator('1'));
        }

        @Test
        public void isValidExpression() {
            Assert.assertTrue(Main.isValidExpression("(1 + 2)"));
            Assert.assertTrue(Main.isValidExpression("( (1 + 2) * 3 )"));
            Assert.assertFalse(Main.isValidExpression("(1 + 2"));
            Assert.assertFalse(Main.isValidExpression("1 + 2)"));
            Assert.assertFalse(Main.isValidExpression("((1 + 2))"));
        }

        @Test
        public void performOperation() {
            Assert.assertEquals(3.0, Main.performOperation('+', 1, 2), 0.1);
            Assert.assertEquals(-1.0, Main.performOperation('-', 1, 2), 0.1);
            Assert.assertEquals(2.0, Main.performOperation('*', 1, 2), 0.1);
            Assert.assertEquals(0.5, Main.performOperation('/', 1, 2), 0.1);
        }

        @Test
        public void evaluateExpression() {
            Assert.assertEquals(2.0, Main.evaluateExpression("1 + 1"), 0.1);
            Assert.assertEquals(4.0, Main.evaluateExpression("2 * 2"), 0.1);
            Assert.assertEquals(3.0, Main.evaluateExpression("6 / 2"), 0.1);
            Assert.assertEquals(1.0, Main.evaluateExpression("5 - 4"), 0.1);
            Assert.assertEquals(9.0, Main.evaluateExpression("( 1 + 2 ) * 3"), 0.1);
        }

    }

