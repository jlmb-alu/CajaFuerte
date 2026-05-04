import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña.");
        String cont = sc.nextLine();

        if (!cont.matches("[0-9]+")) {
            System.err.println("La entrada debe contener solo números del 0 al 9");
            return;
        }

        int puntos = 0;
        for (int i = 0; i < cont.length(); i++) {
            int num = Character.getNumericValue(cont.charAt(i));
            if (i > 0 && cont.charAt(i) == cont.charAt(i - 1)) {
                System.err.println("Programa bloqueado: no se permiten dos números iguales seguidos.");
                return;
            }

            if (num % 2 == 0) {
                puntos += 2;
            } else {
                puntos -= 1;
            }
        }
        System.out.println("La cantidad de puntos obtenidos es: " + puntos);
    }
}



