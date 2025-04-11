package Financeiro;

public class Real extends Moeda {

    public Real(double valor, String tipo) {
        super(valor, tipo);
    }

    @Override
    double converter() {
        return getValor();
    }

    @Override
    public String toString() {
        return "Real [valor=" + getValor() + ", convertido=R$ " + converter() + "]";
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
