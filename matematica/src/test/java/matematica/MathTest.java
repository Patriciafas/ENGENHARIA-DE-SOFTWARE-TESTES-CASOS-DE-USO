package matematica;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathTest {
    Math calc = new Math();
    
    @Test
    public void sunTest(){
        assertEquals(2, calc.sun(1,1));
    }

    @Test
    public void subTest(){
        assertEquals(0, calc.sub(1,1));
    }

    @Test
    public void multTest(){
        assertEquals(10,calc.mult(2,5));
    }

    @Test
    public void divTest(){
        assertEquals(1, calc.div(5, 5));
    }
}
