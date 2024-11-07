import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PruebaAleatorios {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //pruebaAleatorios();
        numerosAleatorios();
    }
    //Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria.
    //El ancho y el alto de la tableta se pide por teclado. El bocado se da alrededor del turrón, obviamente
    //no se puede dar un bocado en medio de la tableta.

    //Ejemplo 1:

    //Introduzca la anchura de la tableta:
    //Introduzca la altura de la tableta:
    public static void pruebaAleatorios() {
        //Creo las variables
        Random rand = new Random();
        int contador = 0;
        System.out.println("Introduzca la anchura de la tableta: ");
        int anchura = sc.nextInt();
        System.out.println("Introduzca la altura de la tableta: ");
        int altura = sc.nextInt();
        String[][] tableta = new String[altura][anchura];
        
        for (int i = 0; i < tableta.length; i++) {
            for (int j = 0; j < tableta[i].length; j++) {
                tableta[i][j] = "*";
            }
        }
        printTableta(tableta);
        System.out.println();
        while (contador < 10) {
            contador++;
            //Aqui es donde se dan los bocados en la tableta
            tableta[rand.nextInt(0, altura)][rand.nextInt(0, anchura)] = "";
            tableta[rand.nextInt(0, altura)][rand.nextInt(0, anchura)] = "";
            tableta[rand.nextInt(0, altura)][rand.nextInt(0, anchura)] = "";
            printTableta(tableta);
            System.out.println();
        }
    }

    //Escribe un programa que genere 20 numeros aleatorios entre 0 y 100
    //y que los almacene en un array. El programa debe ser capaz de pasar todos los numeros pares
    //a las primeras posiciones del array(del 0 en adelante) y todos los numeros impares a las celdas
    //restantes. Utiliza arrays auxiliares si es necesario.
    public static void numerosAleatorios() {
        //Creo las variables
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        ArrayList<Integer> aux = new ArrayList<>();
        ArrayList<Integer> aux2 = new ArrayList<>();
        Random rand = new Random();
        int contador = 0;
        //Generador de 20 numeros aleatorios entre 0 y 100
        while (contador < 20) {
            contador++;
            numerosAleatorios.add(rand.nextInt(0, 100));
        }
        //Clasifico los pares e impares
        for (int numero : numerosAleatorios) {
            if (numero % 2 == 0)
                aux.add(numero);
            else
                aux2.add(numero);
        }
        //Ordeno los arrays e imprimo
        aux.sort(null);
        aux2.sort(null);
        aux.addAll(aux2);
        System.out.println("Array ordenada: "+aux);

    }

    //metodo para imprimir la tableta
    public static void printTableta(String[][] tableta) {
        for (int i = 0; i < tableta.length; i++) {
            System.out.println();
            for (int j = 0; j < tableta[i].length; j++) {
                System.out.print(tableta[i][j]);
            }
        }
    }
}
