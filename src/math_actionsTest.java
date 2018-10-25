
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class math_actionsTest {

    public math_actions math_object;

    @BeforeEach
    public void intialize(){

        math_object = new math_actions();

    }

    @Test
    public void testForAdditionOperation(){

        // Assertion for Addition Operation in math_actions Class
        assertEquals(5, math_object.addition_operation(4, 1), "4 + 1 must return 5");
        assertEquals(5, math_object.addition_operation(3, 2), "3 + 2 must return 5");
        assertEquals(5, math_object.addition_operation(4, 2), "4 + 2 must return 6");
        assertEquals(5, math_object.addition_operation(4, 3), "4 + 3 must return 7");
        assertEquals(5, math_object.addition_operation(4, -4), "4 + -4 must return 0");
        assertEquals(5, math_object.addition_operation(4, 4), "4 + 4 must return 8");


    }

}
