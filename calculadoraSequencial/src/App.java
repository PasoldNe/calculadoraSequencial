import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        float[] num = new float[15]; // 15 numeros mesmo pq eu quero
        String[] operador = new String[15]; //tenho que considerar o = no final, entao eh 15 tb
        float parcial = 0;
        float coeficiente = 0;
        float resultado = 0; 
        boolean continuar = true; // se ele iniciar sem valor inicia, como false
        int contador = 0;

        System.out.println("Agora calcularemos varios numeros um atras do outro :0");

        while (continuar) { // se for pra continuar continue
            System.out.println("\nDigite o " + contador + "º numero desejado");
            num[contador] = scan.nextFloat();

            System.out.println("Digite o operador (+, -, *, /)");
            operador[contador] = scan.next();


            if(operador[contador].equals("=")){ // sinaliza fim da entrada de numeros
                continuar = false;
            } else {
                contador += 1; // se for pra continuar que continue adicionando
            }
        }
        

        for(int i = 0 ; i <= contador; i++){ //enquanto tiver numeros ele vai fazer os calculos

            if (i == 0){ //se for o primeiro numero, nao tem conta pra fazer
                parcial = num[i];
            } else {
                coeficiente = num[i]; //o numero que vai ser feito o calculo

                switch (operador[i-1]) { //o numero usado vai ser [i] ja o operador vem antes do numero, ent [i-1]
                    case "+": // caso seja multiplicacao ele entrega os valores e ja retorna o parcial que sera usado pra calcular mais vezes
                        Adicao adicao = new Adicao(); //inicia uma classe de adicao
                        adicao.setNumero(parcial, coeficiente); //setta os valores
                        parcial = adicao.getAdicao(); //puxa o resultado da adicao e ja retorna como parcial
                        break;
                    case "-": // caso seja multiplicacao ele entrega os valores e ja retorna o parcial que sera usado pra calcular mais vezes
                        Subtracao subtracao = new Subtracao();//inicia uma classe de adicao
                        subtracao.setNumero(parcial, coeficiente);//setta os valores
                        parcial = subtracao.getSubtracao();//puxa o resultado da adicao e ja retorna como parcial
                        break;
                    case "/": // caso seja multiplicacao ele entrega os valores e ja retorna o parcial que sera usado pra calcular mais vezes
                        Divisao divisao = new Divisao();//inicia uma classe de adicao
                        divisao.setNumero(parcial, coeficiente);//setta os valores
                        parcial = divisao.getDivisao();//puxa o resultado da adicao e ja retorna como parcial
                        break;
                    case "*": // caso seja multiplicacao ele entrega os valores e ja retorna o parcial que sera usado pra calcular mais vezes
                        Multiplicacao multiplicao = new Multiplicacao();//inicia uma classe de adicao
                        multiplicao.setNumero(parcial, coeficiente);//setta os valores
                        parcial = multiplicao.getMultiplicacao();//puxa o resultado da adicao e ja retorna como parcial
                        break;
                
                    default:
                        System.out.println("\nAlgum operador foi inserido errado X/\nInsira tudo novamente"); // se ele nn encontrar os operadores certos ele nao calcula e interrompe
                        break;
                }
            } 
        }
        resultado = parcial; //setta o resultado
        System.out.println("\n\nO resulta ficou em: " + resultado + "!");
    }
}
