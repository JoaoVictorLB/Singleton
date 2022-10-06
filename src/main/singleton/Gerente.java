package main.singleton;

import java.util.ArrayList;

public class Gerente {
    private Gerente(){};
    private static Gerente gerente = new Gerente();
    public static Gerente getGerente(){return gerente;}

    private String nome;
    private ArrayList<Funcionarios> subordinados = new ArrayList<Funcionarios>();

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public ArrayList<Funcionarios> getFuncionarios(){return subordinados;}
    public void setFuncionarios(ArrayList<Funcionarios> subordinados){this.subordinados = subordinados;}
}
