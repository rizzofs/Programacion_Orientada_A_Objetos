package src.TP2.Ej_9;

public class Cuadrado extends DosDimensiones{
    private double base;

    public Cuadrado(double base){
        this.base = base;
    }

    @Override
    public double getArea(){
        return Math.pow(base, 2);
    }
}
