import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {


    @Test
    public void Fizz_Buzz_cadena_1_al_20() {
        Problema1 problema1 = new Problema1();

        String FizzBuzz = problema1.cadena(1, 20);

        String expected = "12Fizz34BuzzFizz678Fizz9Buzz11Fizz121314FizzBuzz1617Fizz1819Buzz";

        Assertions.assertEquals(expected, FizzBuzz);
    }
}
