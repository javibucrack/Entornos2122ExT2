import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema2 {

    @Test
    public void Fizz_Buzz_del_20_al_40() {
        Problema2 problema2 = new Problema2();

        String FizzBuzz = problema2.cadena(20, 40);

        String expected = "BuzzFizz212223Fizz24Buzz26Fizz272829FizzBuzz3132Fizz3334BuzzFizz363738Fizz39Buzz";

        Assertions.assertEquals(expected, FizzBuzz);
    }

    @Test
    public void Fizz_Buzz_del_102_al_120() {
        Problema2 problema2 = new Problema2();

        String FizzBuzz = problema2.cadena(102, 120);

        String expected = "Fizz102103104FizzBuzz106107Fizz108109BuzzFizz111112113Fizz114Buzz116Fizz117118119FizzBuzz";

        Assertions.assertEquals(expected, FizzBuzz);
    }


}
