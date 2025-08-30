package ex01;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int menu = 0;
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
              acessarNovaPagina(LinkedList<Pagina> stack)
                break;
            case 2:
              voltarPaginaAnterior(LinkedList<Pagina> stack)
                break;
            case 3:
              verPaginaAtual(LinkedList<Pagina> stack)
                break;
            case 4:
              exibirHistorico(LinkedList<Pagina> stack)
                break;  
            case 5:
              System.out.println("Fim do programa! ");
                break;      
            default:
              System.out.println("Erro. ");
        }
        
    } while (menu != 5);


    }

    // o vs code ja foi dando tudo meu deus
    static void acessarNovaPagina(LinkedList<Pagina> stack) {
        System.out.println("Digite o título da página: ");
        String titulo = sc.next();
        System.out.println("Digite a URL da página: ");
        String url = sc.next();

        Pagina novaPagina = new Pagina(url, titulo);
        stack.push(novaPagina);

        System.out.println("página acessada: " + titulo + " - " + url);
    }

    static void voltarPaginaAnterior(LinkedList<Pagina> stack) {
        if (!stack.isEmpty()) {
            Pagina paginaAnterior = stack.pop();
            System.out.println("voltando para a página: " + paginaAnterior.getTitulo() + " - " + paginaAnterior.getUrl());
        } else {
            System.out.println("não há páginas anteriores no histórico.");
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

    static void exibirHistorico(LinkedList<Pagina> stack) {
        if (!stack.isEmpty()) {
            System.out.println("Histórico de navegação:");
            for (Pagina p : stack) {
                System.out.println(p);
            }
        } else {
            System.out.println("nenhuma página acessada.");
        }
    }

}
