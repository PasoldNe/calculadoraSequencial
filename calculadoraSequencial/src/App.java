import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        float[] num = new float[15];
        String[] operador = new String[14]; 
        float resultado = 0;
        boolean continuar = true;

        System.out.println("Agora calcularemos varios numeros um atras do outro :0");
        
        for ( int i = 0 ; continuar; i++){
            int contador = i;
            contador += 1;
            System.out.println("\n\nDigite o " + contador + "º numero desejado");
            num[i] = scan.nextFloat();
            System.out.println("Digite o operador (+, -, *, /)");
            operador[i] = scan.next();

            if(operador[i].equals("f") || operador[i].equals("F")){
                continuar = false;
            }
        }
        
    }
}
