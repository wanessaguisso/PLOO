package ex01;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 0;
        LinkedList<Pagina> historico = new LinkedList<>(); // Pilha para navegação
        LinkedList<Pagina> historicoCompleto = new LinkedList<>(); // Lista para histórico completo

        do {
            System.out.println("=============== Menu ===============");
            System.out.println("1 – Acessar nova página: solicitar título e URL e empilhar.");
            System.out.println("2 – Voltar para página anterior");
            System.out.println("3 – Ver página atual (título e URL)");
            System.out.println("4 – Exibir histórico de navegação.");
            System.out.println("5 – Sair.");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    acessarNovaPagina(historico, historicoCompleto);
                    break;
                case 2:
                    voltarPaginaAnterior(historico);
                    break;
                case 3:
                    verPaginaAtual(historico);
                    break;
                case 4:
                    exibirHistorico(historicoCompleto);
                    break;
                case 5:
                    System.out.println("Fim do programa! ");
                    break;
                default:
                    System.out.println("Erro. ");
            }

        } while (menu != 5);

    }

    static void acessarNovaPagina(LinkedList<Pagina> stack, LinkedList<Pagina> historicoCompleto) {
        System.out.println("Digite o título da página: ");
        String titulo = sc.next();
        System.out.println("Digite a URL da página: ");
        String url = sc.next();

        Pagina novaPagina = new Pagina(url, titulo);
        stack.push(novaPagina);
        historicoCompleto.add(novaPagina); // Adiciona ao histórico completo

        System.out.println("página acessada: " + titulo + " - " + url);
    }

    static void voltarPaginaAnterior(LinkedList<Pagina> stack) {
        if (!stack.isEmpty()) {
            Pagina paginaAtual = stack.pop(); // Remove a página atual
            if (!stack.isEmpty()) {
                Pagina paginaAnterior = stack.peek(); // Pega a página anterior (sem remover)
                System.out.println(
                        "Voltando para a página: " + paginaAnterior.getTitulo() + " - " + paginaAnterior.getUrl());

            } else {
                System.out.println("Não há páginas anteriores no histórico.");
                stack.push(paginaAtual); // Coloca a página de volta, já que não há para onde voltar
            }
        } else {
            System.out.println("Não há páginas no histórico.");
        }
    }

    static void verPaginaAtual(LinkedList<Pagina> stack) {
        if (!stack.isEmpty()) {
            Pagina paginaAtual = stack.peek();
            System.out.println("página atual: " + paginaAtual.getTitulo() + " - " + paginaAtual.getUrl());
        } else {
            System.out.println("nenhuma página acessada.");
        }
    }

    static void exibirHistorico(LinkedList<Pagina> historicoCompleto) {
        if (!historicoCompleto.isEmpty()) {
            System.out.println("Histórico de navegação:");
            for (Pagina p : historicoCompleto) {
                System.out.println(p);
            }
        } else {
            System.out.println("nenhuma página acessada.");
        }
    }

}
