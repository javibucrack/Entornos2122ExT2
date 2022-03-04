public class Problema4 {

    public String cadena(int numEmpezar, int numAcabar) {
        String cadena = new String();
        for (int i = numEmpezar; i <= numAcabar; i++) {
            cadena = esFizz(cadena, i, 3, "Fizz");
            cadena = esBuzz(cadena, i, 5, "Buzz");
            cadena = esFoo(cadena, i, 7, "Foo");
            cadena = esBoo(cadena, i, 11, "Boo");
            cadena = cadena + i;

        }
        return cadena;
    }

    private String esFoo(String cadena, int i, int i2, String foo) {
        if (i % i2 == 0) {
            cadena = cadena + foo;
        }
        return cadena;
    }

    private String esBuzz(String cadena, int i, int i2, String buzz) {
        if (i % i2 == 0) {
            cadena = cadena + buzz;
        }
        return cadena;
    }

    private String esFizz(String cadena, int i, int i2, String fizz) {
        if (i % i2 == 0) {
            cadena = cadena + fizz;
        }
        return cadena;
    }

    private String esBoo(String cadena, int i, int i2, String boo) {
        if (i % i2 == 0) {
            cadena = cadena + boo;
        }
        return cadena;
    }
}
