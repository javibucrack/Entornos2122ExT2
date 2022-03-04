import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema3 {

    @Test
    public void Fizz_Buzz_cadena_1_al_20() {
        Problema1 problema1 = new Problema1();

        String FizzBuzz = problema1.cadena(1, 20);

        String expected = "12Fizz34BuzzFizz678Fizz9Buzz11Fizz121314FizzBuzz1617Fizz1819Buzz";

        Assertions.assertEquals(expected, FizzBuzz);
    }

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

    @Test
    public void Foo_Boo_del_1_al_23(){
        Problema3 problema3=new Problema3();

        String FooBoo=problema3.cadena(1,23);

        String expected="12Fizz34Buzz5Fizz6Foo78Fizz9Buzz10BooFizz1213Foo14FizzBuzz151617Fizz1819Buzz20FizzFoo21Boo23";

        Assertions.assertEquals(expected,FooBoo);
    }
}
