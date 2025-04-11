package Financeiro;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<Moeda>();
    }

    public void adicionar(Moeda m) {
        listaMoedas.add(m);
    }

    public void remover(Moeda m) {
        if (listaMoedas.isEmpty()) {
            System.out.println("Cofre vazio");
            return;
        } else {
            listaMoedas.remove(m);
        }
    }

    public void listar() {
        for (Moeda m : listaMoedas) {
            m.info();
        }
    }

    public void totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        System.out.println("Total em real: R$ " + total);
    }

    public void menuCofrinho() {
        System.out.println("------------------------------");
        System.out.println("|       Menu Cofrinho        |");
        System.out.println("------------------------------");
        System.out.println("|   Digite a opção desejada: |");
        System.out.println("|1 - Adicionar Moedas        |");
        System.out.println("|2 - Remover Moedas          |");
        System.out.println("|3 - Listar Moedas           |");
        System.out.println("|4 - Mostrar total em Real   |");
        System.out.println("|0 - Sair                    |");
        System.out.println("------------------------------");
    }
}
