public class Problema1 {

    public String cadena(int numEmpezar,int numAcabar) {
        String cadena = new String();
        for (int i = numEmpezar; i <= numAcabar; i++) {
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
