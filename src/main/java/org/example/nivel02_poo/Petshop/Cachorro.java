package org.example.nivel02_poo.Petshop;

public class Cachorro {
    private String nome; //mudando os dois para private
    private String raca;

    public void setNome(String nome){
        if (nome.length()>0){
            this.nome = nome;
        }else {
            System.out.println("erro: o nome nao pode estar vazio.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void latir(){
        System.out.println("au au");
    }
}
