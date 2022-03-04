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

    @Test
    public void Fizz_Buzz_del_20_al_40() {
        Problema1 problema1 = new Problema1();

        String FizzBuzz = problema1.cadena(20, 40);

        String expected = "BuzzFizz212223Fizz24Buzz26Fizz272829FizzBuzz3132Fizz3334BuzzFizz363738Fizz39Buzz";

        Assertions.assertEquals(expected, FizzBuzz);
    }

    @Test
    public void Fizz_Buzz_del_102_al_120() {
        Problema1 problema1 = new Problema1();

        String FizzBuzz = problema1.cadena(102, 120);

        String expected = "Fizz102103104FizzBuzz106107Fizz108109BuzzFizz111112113Fizz114Buzz116Fizz117118119FizzBuzz";

        Assertions.assertEquals(expected, FizzBuzz);
    }
}
