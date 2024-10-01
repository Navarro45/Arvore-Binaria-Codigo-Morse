package org.example;

public class Main {
    public static void main(String[] args) {
        Arvore tree = new Arvore();
        tree.iniciaizar();
        tree.inserir(". . .", "s");
        tree.inserir("- - -", "o");

        System.out.println(tree.buscar(" . . ."));
        System.out.println(tree.buscar(" - - -"));
        System.out.println(tree.buscar(". . . - - - . . ."));
    }
}