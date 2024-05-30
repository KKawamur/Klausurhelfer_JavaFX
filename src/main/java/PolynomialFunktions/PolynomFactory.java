package PolynomialFunktions;

public class PolynomFactory {
    public PolynomFunktion makePolynomFunktion(int funktionsTyp){
        PolynomFunktion newPolynomFunktion = switch (funktionsTyp) {
            //scope ist provisorische default zahl, grad 3 ebenfalls
            case 0 -> new PolynomFunktion(1, 10);
            case 1 -> new PolynomFunktion(2, 10);
            case 3 -> new PolynomFunktion(3, 10);
            default -> throw new RuntimeException("Funktion type not specified");
        };
        return newPolynomFunktion;
    }
}
