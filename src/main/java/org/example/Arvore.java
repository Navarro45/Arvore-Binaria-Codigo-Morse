package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Arvore {
    private No raiz;

    public Arvore(){

    }
    public void iniciaizar(){
        this.raiz = new No();
    }

    public void inserir(String codigo,String caracter){
        No atual = this.raiz;
        String[] simbolos = codigo.split(" ");
        for (String simbolo : simbolos) {
            if (Objects.equals(simbolo, ".")) {
                if (atual.getEsquerda()==null){
                    atual.setEsquerda(new No());
                }
                atual=atual.getEsquerda();
            }
            else if (Objects.equals(simbolo, "-")){
                if (atual.getDireita()==null){
                    atual.setDireita(new No());
                }
                atual=atual.getDireita();
            }
        }
        atual.setInformacao(caracter);
    }

    public String buscar(String morse){
        No atual = this.raiz;
        String[] simbolos = morse.split(" ");
        for (String simbolo:simbolos){
            if (Objects.equals(simbolo, ".")) {
                atual=atual.getEsquerda();
            }
            else if (Objects.equals(simbolo, "-")){
                atual=atual.getDireita();
            }
            if (atual==null){
                return null;
            }
        }
        System.out.println(atual.getInformacao());
        return atual.getInformacao();
    }

    public void menu() {
        boolean loop = true;
        Scanner entrada = new Scanner(System.in);

        while (loop) {
            try {
                System.out.println("---Bem-vindo à árvore do morse---");
                System.out.println("Para inserir uma letra, digite 1 ");
                // System.out.println("Para remover uma letra digite 2");
                System.out.println("Para buscar uma letra, digite 3");
                System.out.println("Para encerrar o programa, digite 9");
                System.out.print("Sua Escolha: ");
                int escolha = entrada.nextInt();
                entrada.nextLine();  // Limpar o buffer após a leitura de números

                switch (escolha) {
                    case 1:
                        System.out.println("Utilize espaço entre os símbolos do código.");
                        System.out.print("->Digite a letra desejada em código morse: ");
                        String codigo = entrada.nextLine();
                        System.out.print("->Insira a letra que o código inserido representa: ");
                        String caracter = entrada.nextLine();
                        this.inserir(codigo, caracter);
                        break;

                    case 3:
                        System.out.println("Utilize espaço entre os símbolos do código.");
                        System.out.println("->Digite a letra desejada em código morse:");
                        String morse = entrada.nextLine();
                        System.out.println("->Tradução : "+this.buscar(morse));
                        break;

                    case 9:
                        System.out.println("Encerrando...");
                        loop = false;
                        break;

                    default:
                        // Caso a escolha seja fora das opções válidas
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                break;
            }
        }
        entrada.close(); // Fechar o scanner ao sair do loop
    }
}
