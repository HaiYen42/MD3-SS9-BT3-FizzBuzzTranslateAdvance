import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateAdvancedTest {

    @Test
    @DisplayName("Test Advance Fizz 03")
    void fizzBuzz3() {
        int number =3;
        String result= FizzBuzzTranslateAdvanced.FizzBuzz(number);
        String expected= "Fizz";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test Advance Fizz 09")
    void fizzBuzz9(){
        int number=9;
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        String expected= "Fizz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Test Advance Buzz 05")
    void fizzBuzz5(){
        int number=5;
        String result= FizzBuzzTranslateAdvanced.FizzBuzz(number);
        String expected= "Buzz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Test Advance FizzBuzz 30")
    void fizzBuzz30(){
        int number =30;
        String result= FizzBuzzTranslateAdvanced.FizzBuzz(number);
        String expected= "FizzBuzz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Test Advanced Number 19")
    void fizzBuzz19(){
        int number = 19;
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        String expected = "" + number; // Số dạng chuỗi "19"
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Test Advanced Number 17 ")
    void fizzBuzz17(){
        int number =17;
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        String expected= ""+ number;
        assertEquals(result, expected);
    }
}