/****************************************************************************
 * Programa que usa los operadores matemáticos usando un arreglo
**************************************************************************** */
public class Operators {
    public static void OperadoresMatematicas(int[] arreglo) {
        System.out.println("\nOperadores matemáticos\n");
        for (int i = 0; i < arreglo.length; i++) {
            switch (i) {
                case 0:
                    System.out.printf("%d + %d = %d \n", arreglo[i], arreglo[i+1], arreglo[i] + arreglo[i+1]);
                    break;
                case 2:
                    System.out.printf("%d - %d = %d \n", arreglo[i], arreglo[i + 1], arreglo[i] - arreglo[i+1]);
                    break;
                case 4:
                    System.out.printf("%d * %d = %d \n", arreglo[i], arreglo[i + 1], arreglo[i] * arreglo[i+1]);
                    break;
                case 6:
                    System.out.printf("%d / %d = %d \n", arreglo[i], arreglo[i + 1], arreglo[i] / arreglo[i+1]);
                    break;
                case 8:
                    System.out.printf("%d %% %d = %d \n", arreglo[i], arreglo[i + 1], arreglo[i] % arreglo[i+1]);
                    break;
            }
        }

    }

    public static void OperadoresLogicos(int[] arreglo) {
        String resultadoComparacion;
        System.out.println("\nOperadores logicos\n");
        for (int i = 0; i < arreglo.length-1; i++) {


            resultadoComparacion = arreglo[i]==arreglo[i+1] ? "son iguales" : "son diferentes";
            resultadoComparacion=arreglo[i]>arreglo[i+1] ? " es mayor a " : "no es mayor a ";
            resultadoComparacion=arreglo[i]<arreglo[i+1] ? " es menor a " : "no es menor a ";

            System.out.printf("%d %s %d \n", arreglo[i],resultadoComparacion,arreglo[i+1] );
        }
    }
    public static void main(String[] args) {
        int[] arreglo = {50,40,80,20,10,60,70,30,90,100};

        OperadoresMatematicas(arreglo);
        OperadoresLogicos(arreglo);
    }
}
