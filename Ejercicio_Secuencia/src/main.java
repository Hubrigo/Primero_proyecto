import java.util.Scanner;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		
		int num = 1;
        String cadena;
        int fila;
        int valorsolo;
        int contador;
        int lugar;
        String Variabletemp;
        do {
            System.out.println("Cuantos numeros desea ver");
            Scanner a = new Scanner(System.in);
            fila = a.nextInt();

        } while (fila <= 0);
        System.out.println("La fila " + fila + " de los numeros conway: \n1 ");
        fila--;
        for (; fila > 0; fila--) {
            Variabletemp = "";
            cadena = Integer.toString(num);
            for (lugar = 0; lugar < cadena.length();) {
                valorsolo = (cadena.charAt(lugar)) - 48;
                contador = 0;
                while (valorsolo == (cadena.charAt(lugar)) - 48) {
                    lugar++;
                    contador++;
                    if (lugar >= cadena.length())
                        break;
                }
                Variabletemp = Variabletemp.concat(Integer.toString(contador) + Integer.toString(valorsolo));
            }
            System.out.println(Variabletemp);
            num = Integer.parseInt(Variabletemp);
	}



	}
}

