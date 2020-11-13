package Cuadrado;

public class Cuadrado {
	public double x;

    public  Cuadrado(double lado) {
        this.x =  lado;
    }




    public  double calculateArea(){
        return this.x * this.x;
    }

    public  double calculatePerimeter()
    {
        return this.x *4;
    }
}
