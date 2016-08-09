package com.example.luciana.ifpbgroupchat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luciana on 21/07/2016.
 */
public class Pessoas {

    private String name;


    private List<Pessoas> usuarios;


    private List<String> pessoas;


    public Pessoas() {
    this.pessoas = new ArrayList<String>();

}
    private List<String> listaPessoas(){
        pessoas.add("Ana Carla");
        pessoas.add("João Paulo");
        pessoas.add("Vinicius");
        pessoas.add("Maria");
        return  pessoas;
    }


    public void setPessoas(List<Pessoas> pessoas){
        this.usuarios = pessoas;

    }


    public List<Pessoas> getPessoas()
    {
        return usuarios;
    }


    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }



}
