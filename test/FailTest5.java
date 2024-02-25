import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class FailTest5 {
    @Test
    void test0() throws IllegalAccessException {
        double res1= Fail.raiz(25.0);
        assertEquals(5.0,res1);
    }
    @Test
    void test1() throws IllegalAccessException {
        try{
        double res1= Fail.raiz(-25.0);
        fail("Deberia ser un numero positivo");
        }catch (IllegalAccessException iae){
            assertTrue(true);
        }
    }

    @Test
    void test1c() throws IllegalAccessException {
        try{
            double res1= Fail.raiz(25.0);
            fail("Deberia ser un numero positivo");
        }catch (IllegalAccessException iae){
            assertTrue(true);
        }
    }

}