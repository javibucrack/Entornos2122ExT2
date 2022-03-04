import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {
    

    @Test
    public void Fizz_Buzz_cadena() {
        Problema1 problema1 = new Problema1();

        String Fizz = problema1.cadena();

        String expected = "12Fizz34BuzzFizz678Fizz9Buzz11Fizz121314FizzBuzz1617Fizz1819Buzz";

        Assertions.assertEquals(expected, Fizz);
    }

}
