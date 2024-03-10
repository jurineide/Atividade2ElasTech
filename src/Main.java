import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
          1. Solicite o nome e a idade do usuário. Em seguida, exiba uma mensagem com essas informações.
          2. Peça dois números ao usuário e realize operações de adição, subtração, multiplicação e divisão. Exiba os resultados.
          3. Crie um programa que verifica se um número digitado pelo usuário é positivo, negativo ou zero.
          4. Solicite ao usuário um dia da semana (em formato numérico de 1 a 7) e exiba o nome correspondente usando um bloco switch.
        */
        Scanner scanner = new Scanner(System.in);


        System.out.println("Olá!! Um prazer receber você!! Por gentileza informe o seu nome.");
        String nome = scanner.next();

        System.out.println("Quantos anos você tem? ");
        int idade = scanner.nextInt();

        System.out.println("Seja bem vindx " + nome + ", você tem " + idade + " anos de idade!!!");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println(nome + ", me informe um número inteiro.");
        int num1 = scanner.nextInt();
        System.out.println("agora me informe mais um número inteiro.");
        int num2 = scanner.nextInt();
        double divisão = (double) num1 / num2;

        System.out.println("A soma dos seus numeros é " + (num1 + num2));
        System.out.println("A subtração dos seus numeros é " + (num1 - num2));
        System.out.println("A multiplicação dos seus numeros é " + (num1 * num2));
        System.out.printf("A divisão dos seus numeros é % 2f ", divisão);

        System.out.println("\n********************************************");

        System.out.println(" Digite um numero negativo ou positivo .");
        int num3 = scanner.nextInt();
        if (num3 < 0) {
            System.out.println("Você digitou um numero negativo ");
        } else if (num3 == 0) {
            System.out.println("Você digitou o numero 0");
        } else
            System.out.println("Você digitou um numero positivo");

        System.out.println("\n********************************************");

        System.out.println("Digite o dia da semana ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println(diaSemana + " corresponde á Domingo");
                break;
            case 2:
                System.out.println(diaSemana + " corresponde á segunda-feira");
                break;
            case 3:
                System.out.println(diaSemana + " corresponde á terça-feira");
                break;
            case 4:
                System.out.println(diaSemana + " corresponde á Quarta-feira");
                break;
            case 5:
                System.out.println(diaSemana + " corresponde á Quinta-feira");
                break;
            case 6:
                System.out.println(diaSemana + " corresponde á Sexta-feira");
                break;
            case 7:
                System.out.println(diaSemana + " corresponde á Sabado");
                break;
            default:
                System.out.println("Numero inválido!!! digite um numero de 1 á 7");
        }
        System.out.println("\n********************************************");

        /*
        5."Escreva um programa em Java que solicita ao usuário um número inteiro.
           Com base nesse número, o programa deve realizar as seguintes ações:
             Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
             Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
             Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.
         */

        System.out.println(" Digite um numero ");
        int num4 = scanner.nextInt();

        switch (num4 % 2) {
            case 0:
                System.out.println(" Esse numero é par");
                break;
            case 1:
                System.out.println(" Esse numero é impar");
                break;
            default:
                System.out.println("Numero inválido!!");
        }
        System.out.println("\n********************************************");

        /*
           6 - Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:
               Solicitar ao usuário que insira o valor total de sua compra.
               Com base nesse valor, aplicar descontos conforme as seguintes regras:
               Se 0 valor for maior que R$ 200, aplique um desconto de 10%.
               Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
               Caso contrário, não aplique desconto.
               Exiba o valor final a ser pago pelo usuário após o desconto.
               Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:
               Opção 1: Cartão de crédito
               Opção 2: Boleto bancário
               Opção 3: Transferência bancária
         */
        System.out.println(" Bem vindo!! Primeiro escolhe a forma de pagamento da sua fatura");
        System.out.println("Opção 1 : Cartão de crédito");
        System.out.println("Opção 2 : Boleto bancário");
        System.out.println("Opção 3 : Transferência bancária");

        int opção = scanner.nextInt();

        switch (opção){
            case 1:
                System.out.println("Você irá pagar com Cartão de crédito");
                break;
            case 2:
                System.out.println("Você irá pagar com Boleto bancário");
                break;
            case 3:
                System.out.println("Você irá pagar com Transferência bancária");
                break;
            default:
                System.out.println("Opção inválida ");
        }


        System.out.println(" Agora informe o valor total de sua compra ");
        double valorTotalCompra = scanner.nextDouble();
        double desconto;


        if (valorTotalCompra > 200) {
             desconto = valorTotalCompra * 0.1;
        } else if (valorTotalCompra < 100) {
             desconto = 0;
        } else {
             desconto = valorTotalCompra * 0.05;
        }
        double valorComDesconto = valorTotalCompra - desconto;

        System.out.printf(" Você ganhou um desconto, e sua fatura ficou em %.2f%n", valorComDesconto);
    }
}
