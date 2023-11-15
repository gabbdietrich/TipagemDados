package Tipagem;

public class Bairro extends Cidade {

    //metodo contrustor de bairro
    Bairro(String nome_local, int habitantes){

        //chamando construtor da superclass
        super(nome_local, habitantes);
    }

    //metodo para retornar o nome do bairro
    public String setNomeBairro(String nome_local){
        return nome_local = nome_local + "_area";
    }

    public String getNomeBairro()
    {
        return nome_local;
    }
    public void setHabitantesBairro(int habitantes)
    {
        this.habitantes = habitantes*200;
    }

    public int getHabitantesBairro(){
        return habitantes;
    }
}

