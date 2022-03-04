import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema3 {

    @Test
    public void Foo_Boo_del_1_al_23(){
        Problema3 problema3=new Problema3();

        String FooBoo=problema3.cadena(1,23);

        String expected="12Fizz34Buzz5Fizz6Foo78Fizz9Buzz10BooFizz1213Foo14FizzBuzz151617Fizz1819Buzz20FizzFoo21Boo23";

        Assertions.assertEquals(expected,FooBoo);
    }
}
