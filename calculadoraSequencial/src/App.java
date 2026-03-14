import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner();

        float num[];
        char operador[]; 
        float resultado = 0;

        System.out.println("Agora calcularemos varios numeros um atras do outro :0");
        
        for ( int i = 0 ; operador != 'f'; i++){
            System.out.println("\n\nDigite o " + i + "º numero desejado");
            num[i] = scan.nextFloat();
            System.ou.println("Digite o operador (+, -, *, /)");
            operador[i] = scan.next();
        }
        
    }
}
