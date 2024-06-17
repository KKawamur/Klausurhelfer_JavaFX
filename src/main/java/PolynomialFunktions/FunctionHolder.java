package PolynomialFunktions;

public class FunctionHolder {
    int numberOfHoldableFunctions = 2;
    PolynomFunction[] funktionArray = new PolynomFunction[2];

    public void addFunktion(PolynomFunction polynomFunction){
        for (int i = 0; i < funktionArray.length; i++){
            if(funktionArray[i] != null)
                continue;
            else if(funktionArray[i] != null && i == funktionArray.length-1)
                throw new RuntimeException("No more functions can be added!");
            else
                funktionArray[i] = polynomFunction;
        }
    }
}
