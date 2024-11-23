/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ana Julia Andrade
 */

import java.util.Scanner; // Importando a classe Scanner

public class PesoNoPlaneta {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso na Terra
        System.out.print("Informe seu peso na Terra (em kg): ");
        double pesoTerra = scanner.nextDouble();

        // Apresenta o menu de planetas
        System.out.println("\nEscolha o planeta para saber seu peso:");
        System.out.println("1 - Mercurio");
        System.out.println("2 - Venus");
        System.out.println("3 - Marte");
        System.out.println("4 - Jupiter");
        System.out.println("5 - Saturno");
        System.out.println("6 - Urano");
        System.out.println("7 - Netuno");

        // Lê a escolha do usuário
        System.out.print("\nDigite o número do planeta: ");
        int escolha = scanner.nextInt();

        // Calcula o peso no planeta escolhido e exibe o resultado
        double pesoPlaneta = 0;
        String nomePlaneta = "";

        switch (escolha) {
            case 1: // Mercúrio
                pesoPlaneta = pesoTerra * 0.38;
                nomePlaneta = "Mercurio";
                break;
            case 2: // Vênus
                pesoPlaneta = pesoTerra * 0.91;
                nomePlaneta = "Venus";
                break;
            case 3: // Marte
                pesoPlaneta = pesoTerra * 0.38;
                nomePlaneta = "Marte";
                break;
            case 4: // Júpiter
                pesoPlaneta = pesoTerra * 2.36;
                nomePlaneta = "Jupiter";
                break;
            case 5: // Saturno
                pesoPlaneta = pesoTerra * 0.92;
                nomePlaneta = "Saturno";
                break;
            case 6: // Urano
                pesoPlaneta = pesoTerra * 0.89;
                nomePlaneta = "Urano";
                break;
            case 7: // Netuno
                pesoPlaneta = pesoTerra * 1.13;
                nomePlaneta = "Netuno";
                break;
            default:
                System.out.println("Escolha inválida.");
                scanner.close();
                return;
        }

        // Exibe o resultado
        System.out.printf("\nSeu peso em %s é %.2f kg.\n", nomePlaneta, pesoPlaneta);

        // Fechar o scanner ao final
        scanner.close();
    }
}