import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComprobandoColeccionesList {
    @Test
    void testIguales() throws IllegalAccessException {
        List<String> l1= Arrays.asList("a","e","i","o","u");
        List<String> l2= Arrays.asList("a","e","i","o","u");
        List<String> l3= Arrays.asList("a","e","i","o","z");

        assertEquals(l1,l2);//ok
        assertNotSame(l1,l2);//ok
        assertNotEquals(l1,l3);//ok

        assertIterableEquals(l1,l2);//ok
        assertIterableEquals(l1,l3);//ko
    }

    @Test
    void testParecidas() throws IllegalAccessException {
        List<String> l1= Arrays.asList("a","e","i","o","u");
        List<String> l2= Arrays.asList("u","o","i","e","a ");
        List<String> l3= Arrays.asList("a","e","i","o","o","o","z");

        //mismo tamanao
        assertEquals(l1.size(),l2.size());//ok
        //mismo elementos
        assertTrue(l1.containsAll(l2) && l2.containsAll(l1));//ok
        assertTrue(l1.containsAll(l3) && l3.containsAll(l1));//ok

        assertNotEquals(l1.size(),l2.size());//ok
        assertIterableEquals(l1,l2);//ko
        //iterable content diferente elementos
    }

    @Test
    void testArraysMal(){
        char[] letras1="Buenos dias".toCharArray();
        char[] letras2="Buenos dias".toCharArray();
        assertEquals(letras1, letras2);//ko
    }
    @Test
    void testArrayBien(){
        char[] letras1="Buenos dìas".toCharArray();
        char[] letras2="Buenos dìas".toCharArray();
        char[] letras3="Buenos dias".toCharArray();
        assertArrayEquals(letras1, letras2);//ok
        assertArrayEquals(letras1, letras3);//ko
        // el ultimo no lleva tilde
    }


}