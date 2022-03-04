public class Problema1 {

    public String cadena() {
        String cadena = new String();
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                cadena = cadena + "Fizz";
            }
            if (i % 5 == 0) {
                cadena = cadena + "Buzz";
            } else {
                cadena = cadena + i;

            }
        }
        return cadena;
    }
}
