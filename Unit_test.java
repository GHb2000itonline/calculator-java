import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class calculatorTest{

    @Test
    public void testCalulate() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.calculate("2+2"),"2+2 should be equal 4");
    }