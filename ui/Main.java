package ui;

import model.*;
import service.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Experiencia> eventos = new ArrayList<>();
        RelatorioService relatorioService = new RelatorioService();

        //Cadastro de eventos
        eventos.add(new Show("Rock in Pampa", "Show ao vivo de rock", 
                    LocalDateTime.now().plusDays(10), 500, 250.0, "Banda Unipampa"));
        
        eventos.add(new PasseioTuristico("City Tour Histórico", "Caminhada guiada pelo centro", 
                    LocalDateTime.now().plusDays(2), 20, 60.0, "Praça Central", "Guia Renata"));
        
        eventos.add(new WorkshopGastronomia("Culinária Italiana", "Aprenda a fazer massas", 
                    LocalDateTime.now().plusDays(5), 15, 120.0, "Avental e Ingredientes"));

        System.out.println("======= SISTEMA URBAN XP =======");
        System.out.println("Selecione o perfil do cliente para simulação:");
        System.out.println("1. Estudante (50% de desconto)");
        System.out.println("2. Membro Premium (Valor fixo R$ 40,00)");
        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        PoliticaDesconto politica;
        if (opcao == 1) {
            politica = new DescontoEstudante(50);
        } else {
            politica = new DescontoPremium(40.0);
        }

        System.out.println("\nComo deseja ordenar o relatório?");
        System.out.println("1. Por Preço (Crescente)");
        System.out.println("2. Por Título (Alfabética)");
        System.out.print("Opção: ");
        int ordenacao = teclado.nextInt();

        if (ordenacao == 1) {
            relatorioService.ordenarPorPreco(eventos);
        } else {
            relatorioService.ordenarPorTitulo(eventos);
        }

        System.out.println("\n--- RELATÓRIO GERAL DE EVENTOS ---");
        for (Experiencia e : eventos) {

            if (ValidarData.DataValida(e.getDataHora())) {
                double precoFinal = politica.calcularPrecoFinal(e.getPrecoBase());

                System.out.println(e.gerarResumo()); 
                System.out.println("Estado do Ingresso: " + StatusIngresso.RESERVADO); 
                System.out.printf("Preço Base: R$ %.2f | Preço com Desconto: R$ %.2f%n", 
                                  e.getPrecoBase(), precoFinal);
                System.out.println("--------------------------------------------------");
            }
        }

        System.out.println("Simulação finalizada com sucesso!");
        teclado.close();
    }
}