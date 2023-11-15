package Tipagem;

import javax.swing.*;
public class Interface_Tipagem {
    String a;
    int b;
    Cidade c = null;

    public Cidade locais_cidade() {

        a = JOptionPane.showInputDialog("Digite o do local ");
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de habitantes"));
        String local =  JOptionPane.showInputDialog("Cidade = C n/ bairro = b n/ distrito = d /n");
        char tipo = local.charAt(0);

        if (tipo == 'c')
            return new Cidade(a, b);

        if ( tipo == 'b')
            return new Bairro(a, b);

        else if (tipo == 'd')
            return new Distrito(a, b);
        else
            return null;
    }

    public void tipo_local(Cidade e) {

        //o operador instanceof permite definir se uma instancia é ou não de determinada class

        if (e instanceof Bairro) {
            ((Bairro) e).setNomeBairro(a);
            ((Bairro) e).setHabitantesBairro(b);
            System.out.println("Local é bairro  " + " \n nome do bairro = " +
                    ((Bairro) e).getNomeBairro() + "\n número de habitantes = " +
                    ((Bairro) e).getHabitantesBairro());
        } else if (e instanceof Distrito) {
            ((Distrito) e).setNomeDistrito(a);
            ((Distrito) e).setHabitantesDistrito(b);
            System.out.println("Local é distrito " + " \n nome do distrito = " + ((Distrito) e).getNomeDistrito() +
                    "\n número de habitantes = " + ((Distrito) e).getHabitantes());
        } else {

            e.setNome(a);
            e.setHabitantes(b);
            System.out.println("local é cidade " + "\n nome da cidade = " + ((Cidade) e).getNome() +
                    "\n número de habitantes = " + ((Cidade) e).getHabitantes());
        }
    }
}
