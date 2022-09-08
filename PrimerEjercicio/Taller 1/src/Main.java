public class Main {
    // punto 1
    public static void main(String[] args) {
        int sumaNumeros = Suma(10, 20, 30);
        System.out.println("La suma es: " + sumaNumeros);

    }

    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }
    //punto 2
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("(2da parte) El número de puertas es: " + miCoche.numPuertas);
        miCoche.IncrementarPuertas();
        System.out.println("(2da parte) El número de puertas es: " + miCoche.numPuertas);
    }

}