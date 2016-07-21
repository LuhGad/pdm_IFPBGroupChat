package com.example.luciana.ifpbgroupchat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luciana on 21/07/2016.
 */
public class Pessoas {

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


    public List<String> getPessoas(){
        return listaPessoas();
    }

}
