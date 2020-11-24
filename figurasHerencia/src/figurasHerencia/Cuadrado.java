package figurasHerencia;

public class Cuadrado {
	public double l;

    public  Cuadrado(double lado) {
        this.l =  lado;
    }




    public  double calcularArea(){
        return this.l * this.l;
    }

    public  double calcularPerimetro()
    {
        return this.l *4;
    }
}
