package Tipagem;

public class Distrito extends Cidade{

    Distrito(String nome_local, int habitantes){

        //chamando construtor da superclass
        super(nome_local, habitantes);
    }

    public void setNomeDistrito(String nome_local){
        this.nome_local = nome_local + "_district";
    }
    public String getNomeDistrito(){
        return nome_local;
    }

    public void setHabitantesDistrito(int habitantes){
        this.habitantes = habitantes*300;;
    }

    public int getHabitantesDistrito() {
        return habitantes;
    }
}
