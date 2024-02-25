import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IntroTest {
    @Test
    void test(){
        int res =Intro.suma(4,5);
        assertEquals(res,9);
    }

}