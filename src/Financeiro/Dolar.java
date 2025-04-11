package Financeiro;

public class Dolar extends Moeda {

    public Dolar(double valor, String tipo) {
        super(valor, tipo);
    }

    @Override
    double converter() {
        return getValor() * 5.89; // cotação 11/04/25
    }

    @Override
    public String toString() {
        return "Dólar [valor=" + getValor() + ", convertido=R$ " + converter() + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
