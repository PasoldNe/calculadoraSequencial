import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        float[] num = new float[15];
        String[] operador = new String[15]; 
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


            if(operador[contador].equals("=")){
                continuar = false;
            }
            contador += 1;
        }
        
        for(int i = 0 ; i < contador; i++){
            if (i == 0){
                parcial = num[i];
            } else {
                coeficiente = num[i];

                switch (operador[i-1]) {
                    case "+":
                        Adicao adicao = new Adicao();
                        adicao.setNumero(parcial, coeficiente);
                        parcial = adicao.getAdicao();
                        break;
                    case "-":
                        Subtracao subtracao = new Subtracao();
                        subtracao.setNumero(parcial, coeficiente);
                        parcial = subtracao.getSubtracao();
                        break;
                    case "/":
                        Divisao divisao = new Divisao();
                        divisao.setNumero(parcial, coeficiente);
                        parcial = divisao.getDivisao();
                        break;
                    case "*":
                        Multiplicacao multiplicao = new Multiplicacao();
                        multiplicao.setNumero(parcial, coeficiente);
                        parcial = multiplicao.getMultiplicacao();
                        break;
                
                    default:
                        System.out.println("Algum operador foi inserido errado X/\nInsira tudo novamente");
                        break;
                }
            } 
        }
        resultado = parcial;
        System.out.println("O resulta ficou em: " + resultado + "!");
    }
}
