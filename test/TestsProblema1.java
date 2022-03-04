import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {

    @Test
    public void cadena_del_1_al_20() {
        Problema1 problema1 = new Problema1();

        String cadena = problema1.cadena();

        String expected = "1234567891011121314151617181920";

        Assertions.assertEquals(expected, cadena);
    }

}
