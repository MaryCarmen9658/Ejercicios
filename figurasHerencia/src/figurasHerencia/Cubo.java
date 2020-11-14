package figurasHerencia;

public class Cubo extends Cuadrado{
	public double x;

    public Cubo(double lado) {
        super(lado);

        this.x = lado;
    }


    public  double calcularVolumen(){
        return Math.pow(this.x,3);
    }


    public   double calcularPerimetro(boolean is_super)
    {

        if (is_super){
           return super.calcularPerimetro();
        }
        else{
            return this.x*12;
        }


    }
}
