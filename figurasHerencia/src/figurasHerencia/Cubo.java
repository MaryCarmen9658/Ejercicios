package figurasHerencia;

public class Cubo extends Cuadrado{
	public double x;

    public Cubo(double lado) {
        super(lado);

        this.x = lado;
    }


    public  double calculateVolume(){
        return Math.pow(this.x,3);
    }


    public   double calculatePerimeter(boolean is_super)
    {

        if (is_super){
           return super.calculatePerimeter ();
        }
        else{
            return this.x*12;
        }


    }
}
