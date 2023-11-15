package Tipagem;

public class Usa_Tipagem {

    public static void main (String[] args){

        //contrução do objeto q representa interface d tipagem
        Interface_Tipagem IT = new Interface_Tipagem();


        //objeto super class cidade
        Cidade CD;

        //uso do método locais_cidade da interface atraves do objt da superclass

        CD= IT.locais_cidade();

        //no metodo da interface locais_cidade é definido de que class é o objto

        IT.tipo_local(CD);

        /* o indentificador de objeto pode receber endereço de instancias de sua class
         ou de qualquer classe descendete
         o objeto ou identificador CD recebe o endereço de instancia das classes Cidades, Bairro e Distrito
         Este identificador passa a identificar (conter o endereço, refrencia) de uma istancia de subclasse cidade.
         A compatibilidade de endereços de identificadores de uma classe com instancias de subclasse é
         denominada de subtipagem (Boratti, 2007).*/

    }
}
