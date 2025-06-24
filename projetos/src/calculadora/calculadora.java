package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        double p_v = 0;
        double s_v = 0;
        int resposta;

        Scanner sc = new Scanner(System.in);


        do{

            System.out.println("===MENU===");
            System.out.println("[1]Somar");
            System.out.println("[2]Subtrair");
            System.out.println("[3]Dividr");
            System.out.println("[4]Multiplicar");
            System.out.println("[5]Sair");
            System.out.println("==========");
            resposta = sc.nextInt();

            if (resposta <1 || resposta > 5){
                System.out.println("Opcao incorreta, tente novamente!!");
                continue;
            } else if (resposta == 5){
                break;
            }

            System.out.println("Digite o primeiro valor");
            p_v = sc.nextDouble();
            System.out.println("Digite o segundo valor");
            s_v = sc.nextDouble();


            switch(resposta){
                case 1:
                    double soma;
                    soma = p_v + s_v;
                    System.out.println("A soma dos numeros eh: "+soma);
                    break;
                case 2:
                    double sub;
                    sub = p_v - s_v;
                    System.out.println("A subtracao dos valores eh: "+sub);
                    break;
                case 3:
                    double div;
                    if (s_v == 0){
                        System.out.println("Erro, nao eh possivel dividir por 0");
                    } else {
                        div = p_v / s_v;
                        System.out.println("A divisao dos valores eh: "+div);
                    }
                    break;
                case 4:
                    double multi;
                    multi = (double)p_v * s_v;
                    System.out.println("A multiplicacao dos valores eh: "+multi);
                    break;
            }


            System.out.println("");
        }while(true);

        System.out.println("Sessao finalizada!!");
        sc.close();
    }
}
