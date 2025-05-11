package org.Niccolo.oop.polynomials;


import java.util.ArrayList;

public class ListPoly extends AbstractPoly{
    private ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients){
        this.coefficients = new ArrayList<>();
        for(double c : coefficients){
            this.coefficients.add(c);
        }
    }

    @Override
    public double coefficient(int degree){
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients(){
        double[] tmp = new double[coefficients.size()];
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = coefficients.get(i);
        }
        return tmp;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
