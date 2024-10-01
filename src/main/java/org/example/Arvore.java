package org.example;

import java.util.Objects;

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
        String[] codigos = morse.split("/");
        StringBuilder resultado = new StringBuilder();
        for (String codigo:codigos) {
            No atual = this.raiz;
            String[] simbolos = codigo.split(" ");
            for (String simbolo : simbolos) {
                if (Objects.equals(simbolo, ".")) {
                    atual = atual.getEsquerda();
                } else if (Objects.equals(simbolo, "-")) {
                    atual = atual.getDireita();
                }
                if (atual == null) {
                    return resultado.toString();
                }
            }
            resultado.append(atual.getInformacao());
        }
        return resultado.toString();
    }


}
