package PolynomialFunktions;

import java.util.concurrent.ThreadLocalRandom;

public class PolynomFunktion {
    private int grad;
    private double scope;
    private Polynom[] polynome;

    public PolynomFunktion(int grad, double scope){
        this.grad = grad;
        this.scope = scope;
        polynome = new Polynom[grad+1];
        for (int i = 0; i <= grad;i++){
            polynome[grad-i] = new Polynom(ThreadLocalRandom.current().nextDouble(-scope,scope),(double) grad-i );
        }
    }

    public double getValue(double x){
        double y = 0;
        for (Polynom polynom:polynome){
            y += polynom.getValue(x);
        }
        return y;
    }
    
    public String getString(){
        StringBuilder printstring = new StringBuilder();
        for (int i = grad; i >= 0; i--){
            if(i > 0){
                if(polynome[i-1].getA() > 0){
                    printstring.append(polynome[i].getString()).append("+");
                } else if (polynome[i-1].getA() < 0) {
                    printstring.append(polynome[i].getString());
                } else if (polynome[i-1].getA() == 0) {
                    continue;
                }
            } else {
                printstring.append(polynome[i].getString());
            }
        }
        return printstring.toString();
    }

    public int getGrad() {
        return grad;
    }

    public Polynom getPolynome(int polinomPosition){
        if(polinomPosition > grad && polinomPosition < 0)
            return null;
        return polynome[polinomPosition];
    }
    public Polynom[] getAllPolynomes(){
        return polynome;
    }



    public static void main(String[]args){
        PolynomFunktion polynomFunktion = new PolynomFunktion(5, 10);
        System.out.println(polynomFunktion.getString());
    }
}
