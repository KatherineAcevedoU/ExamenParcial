import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        double alpha [] = new double[50];

        double valorDelIndice;

        for(int i = 0; i < 25; i++){                         

            System.out.print("Ingrese el valor del indice: ");
            valorDelIndice = entrada.nextDouble();
            

            alpha[i] = Math.pow(valorDelIndice, 2);

        }
 
        System.out.println("");

        for(int i = 25; i < 50; i++){

            System.out.print("Ingrese el valor del indice: ");
            valorDelIndice = entrada.nextDouble();

            alpha[i] = (i + 1) * 3;

        }

        for(int i = 0; i < alpha.length; i++){

            System.out.println(alpha[i]);

        }

        entrada.close();
        
    }
}
