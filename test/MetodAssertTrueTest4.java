import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class MetodAssertTrueTest4 {
    @Test
    void test0(){
        assertTrue(3>0);
        assertTrue("hola".contains("h"));
    }
    @Test
    void test1(){
        int x=3;
        assertTrue(esPositivo(x));
        //Que es este tipo en java
        BooleanSupplier esPar=()->x%2==0;
        assertFalse(esPar);
    }

    private boolean esPositivo(int x) {
        return x>=0;
    }


}