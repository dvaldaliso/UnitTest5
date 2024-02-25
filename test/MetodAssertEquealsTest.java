import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MetodAssertEquealsTest {
    @Test
    void testSintaxis(){
        Assertions.assertEquals(2,2);
        assertEquals(2,2);
    }
    @Test
    void test(){
        assertEquals(2,3);
    }
    @Test
    void test1(){
        assertEquals(""," ");
    }
    @Test
    void test2(){
        assertEquals("","\n ");
    }
    @Test
    void test3(){
        assertNotEquals("","\n ");
    }
}