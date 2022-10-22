package task;

public class Triangle {
    private double a, b, c;
    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public boolean isValid(){
        if ((a > 0) && (b > 0) && (c > 0)){
            if (((a + b) > c) || ((a + c) > b) || ((b + c) > a))  {
                return true;}
            else {
                return false;}}
        else{
            return false;}
    }

    public double square(){
        if(isValid()){
            double pp = ((a+b+c)/2);// pp-полупериметр
            return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
        } else
            return -1;
    }
    public double perimeter(){
        if(isValid()){
            return (a+b+c);}
        else{
            return -1;}
    }
}