package Financeiro;

import java.util.Objects;

public abstract class Moeda {
    protected double valor;
    protected String tipo;

    protected Moeda(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    abstract double converter();

    public void info() {
        System.out.println("------------------------------");
        System.out.println("| Moeda: " + tipo);
        System.out.println("| Valor: " + getValor());
        System.out.println("------------------------------");
    }

    public static void manuMoeda() {
        System.out.println("------------------------------");
        System.out.println("| Digite a moeda:             |");
        System.out.println("| 1 - Dólar (USD)             |");
        System.out.println("| 2 - Euro (EUR)              |");
        System.out.println("| 3 - Real (BRL)              |");
        System.out.println("------------------------------");
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        return Objects.equals(tipo, other.tipo)
                && Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
    }
}
