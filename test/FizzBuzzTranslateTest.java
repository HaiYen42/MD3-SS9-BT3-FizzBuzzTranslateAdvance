import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzBuzz3() {
        int a= 3;

        String result= FizzBuzzTranslate.FizzBuzz(a);
        String expected= "Fizz";
        assertEquals(result, expected);
    }
    @Test
    void fizzBuzz5(){
        int a= 5;
        String result= FizzBuzzTranslate.FizzBuzz(a);
        String expected= "Buzz";
        assertEquals(result, expected);
    }
    @Test
    void fizzBuzz15(){
        int a= 15;
        String result= FizzBuzzTranslate.FizzBuzz(a);
        String expected= "FizzBuzz";
        assertEquals(result, expected);
    }
}