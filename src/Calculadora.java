import java.util.Scanner;


public class Calculadora {

    Scanner scanner = new Scanner(System.in);

    public void startCalculator(){
        System.out.println("Primeiro Código convertido de C# para Java");
        System.out.println("\nCalculadora\n");
    }

    public void exibirMenu(){
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");

        int opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada){
            case 1:
                System.out.println("O resultado da Soma é: " + soma() + "\n");
                exibirMenu();
            case 2: 
                System.out.println("O resultado da Subtração é: " + subtracao() + "\n");
                exibirMenu();
            case 3: 
                System.out.println("O resultado da Multiplicação é: " + multiplicacao() + "\n");
                exibirMenu();
            case 4: 
                System.out.println("O resultado da Divisão é: " + divisao() + "\n");
                exibirMenu();
            case 0:
                break;
            default: 
                System.out.println("Menu Inválido");
                exibirMenu();
        }
    }

    public double soma(){
        System.out.println("Digite a quantidade de números da soma \n");

        double resultado = 0; 
        int quantidadeNumeros = scanner.nextInt();
        int i = 1;

        while (quantidadeNumeros > 0) {
            System.out.println("Digite o número " + i + " da soma");
            double numero = scanner.nextInt();
            
            resultado = resultado + numero;

            quantidadeNumeros = quantidadeNumeros - 1;
            i = i + 1;
        }

        return resultado;
    }

    public double subtracao(){
        System.out.println("Digite a quantidade de números da subtração");

        double resultado = 0; 
        int quantidadeNumeros = scanner.nextInt();
        int i = 1;

        while (quantidadeNumeros > 0) {
            System.out.println("Digite o número " + i + " da subtração");
            double numero = scanner.nextInt();
            
            if(i == 1){
                resultado = numero;
            }
            else{
                resultado = resultado - numero;
            }
            

            quantidadeNumeros = quantidadeNumeros - 1;
            i = i + 1;
        }

        return resultado;
    }

    public double multiplicacao(){
        System.out.println("Digite a quantidade de números da multiplicação");

        double resultado = 0; 
        int quantidadeNumeros = scanner.nextInt();
        int i = 1;

        while (quantidadeNumeros > 0) {
            System.out.println("Digite o número " + i + " da multiplicação");
            double numero = scanner.nextInt();
            
            if(i == 1){
                resultado = numero;
            }
            else{
                resultado = resultado * numero;
            }

            quantidadeNumeros = quantidadeNumeros - 1;
            i = i + 1;
        }

        return resultado;
    }

    public double divisao(){
        System.out.println("Digite a quantidade de números da divisão");

        double resultado = 0; 
        int quantidadeNumeros = scanner.nextInt();
        int i = 1;

        while (quantidadeNumeros > 0) {
            System.out.println("Digite o número " + i + " da divisão");
            double numero = scanner.nextInt();
            
            if(i == 1){
                resultado = numero;
            }
            else{
                resultado = resultado / numero;
            }
            quantidadeNumeros = quantidadeNumeros - 1;
            i = i + 1;
        }

        return resultado;
    }
}
