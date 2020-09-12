package RocioAguirre;
import java.util.Scanner;
class Operaciones{
    double d1 = 0;
    double d2 = 0;
    double S = 0;
    double R = 0;
    double M = 0;
    double D = 0;
    public double Suma(){
        S = d1 + d2;
        return S;
    }
    public double Resta(){
        R = d1 - d2;
        return R;
    }
    public double Multiplicacion(){
        M = d1 * d2;
        return M;
    }
    public double Division () {
        D = d1 / d2;
        return D;
    }

}
public class Main {

    public static void main(String[] args) {
        Operaciones o1 = new Operaciones();

        Scanner Entrada = new
                Scanner(System.in);

        System.out.print("Ingresa el primer dato númerico = ");
        o1.d1 = Entrada.nextDouble();
        System.out.print("Ingresa el segundo dato númerico = ");
        o1.d2 = Entrada.nextDouble();

            System.out.println("El resultado de las operaciones es el siguiente = ");
            System.out.println("Suma = " + o1.Suma());
            System.out.println("Resta = " + o1.Resta());
            System.out.println("Multiplicacion = " + o1.Multiplicacion());
            System.out.println("Division = " + o1.Division());

    }

}
