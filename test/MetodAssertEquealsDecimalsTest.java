import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MetodAssertEquealsDecimalsTest {
    @Test
    void testSintaxis(){
        assertEquals(3.3333,10.0/3);
    }
    @Test
    void test(){
        assertEquals(3.33,10.0/3,0.01);
    }//Uso de grado de tolerancia

    @Test
    void test1(){
        assertEquals(3.33,10.0/3,"los decimales no cuadran");
    }//Uso de grado de tolerancia


}