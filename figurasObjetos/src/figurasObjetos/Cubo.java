package figurasHerencia;

public class Cubo extends Cuadrado{
	public double l;

    public Cubo(double lado) {
        super(lado);

        this.l = lado;
    }


    public  double calcularVolumen(){
        return Math.pow(this.l,3);
    }


    public   double calcularPerimetro(boolean is_super)
    {

        if (is_super){
           return super.calcularPerimetro();
        }
        else{
            return this.l*12;
        }


    }
}
