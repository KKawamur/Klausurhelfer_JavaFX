package PolynomialFunktions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Polynom {
    private double a;
    private double exp;

    public Polynom(double a, double exp){
        this.a = round(a, 1);
        if (exp < 0)
            this.exp = 0;
        else
            this.exp = exp;
    }

    public double getValue(double x){
        return a*Math.pow(x,exp);
    }

    public String getString() {
        if (a == 0) {
            return "";
        } else if (exp == 1) {
            return a+"x";
        } else if (exp == 0) {
            return a+"";
        }
        return a+"x^"+exp;
    }
    public double getA(){
        return a;
    }
    public double getExp(){return exp;}

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
