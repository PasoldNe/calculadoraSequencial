import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        float[] num = new float[15];
        String[] operador = new String[14]; 
        float parcial = 0;
        float coeficiente = 0;
        float resultado = -5; //pra saber se puxa certo
        boolean continuar = true;
        int contador = 0;

        System.out.println("Agora calcularemos varios numeros um atras do outro :0");
        
        /*for ( int i = 0 ; continuar; i++){
            int contador = i;
            contador += 1;
            System.out.println("\n\nDigite o " + contador + "º numero desejado");
            num[i] = scan.nextFloat();
            System.out.println("Digite o operador (+, -, *, /)");
            operador[i] = scan.next();

            if(operador[i].equals("f") || operador[i].equals("F")){
                continuar = false;
                quantidade = i;
                return;
            }
        }*/
        while (continuar) {
            System.out.println("\n\nDigite o " + contador + "º numero desejado");num[contador] = scan.nextFloat();

            System.out.println("Digite o operador (+, -, *, /)");
            operador[contador] = scan.next();


            if(operador[contador].equals("f") || operador[contador].equals("F")){
                continuar = false;
            }
            contador += 1;
        }
        
        for(int i = 0 ; contador >= i ; i++){
            
        }
    }
}
