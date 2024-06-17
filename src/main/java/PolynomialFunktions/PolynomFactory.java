package PolynomialFunktions;

public class PolynomFactory {
    public PolynomFunction makePolynomFunktion(int funktionsTyp){
        PolynomFunction newPolynomFunction = switch (funktionsTyp) {
            //scope ist provisorische default zahl, grad 3 ebenfalls
            case 0 -> new PolynomFunction(1, 10);
            case 1 -> new PolynomFunction(2, 10);
            case 3 -> new PolynomFunction(3, 10);
            default -> throw new RuntimeException("Funktion type not specified");
        };
        return newPolynomFunction;
    }
}
