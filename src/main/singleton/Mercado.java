package main.singleton;

import java.util.ArrayList;

public class Mercado {
    public Mercado(String nomeGerente, String nomeFuncionarios[]){
        Gerente.getGerente().setNome(nomeGerente);
        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();

        for(int i = 0; i < nomeFuncionarios.length; i++){
            Funcionarios funcionario = new Funcionarios(nomeFuncionarios[i]);
            funcionarios.add(funcionario);
        }

        Gerente.getGerente().setFuncionarios(funcionarios);
    }
}
