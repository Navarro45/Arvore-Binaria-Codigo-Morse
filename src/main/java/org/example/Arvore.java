package org.example;

public class Arvore {
    private No raiz;

    private Arvore(){
        No raiz = new No();
    }

    public void inserir(String codigo,String caracter){
        No atual = raiz;
        String[] simbolos = separar(codigo);
    }

    public String[] separar(String codigo){

        return codigo.split(" ");
    }


}
