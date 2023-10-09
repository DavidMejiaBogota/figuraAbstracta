public class App {
    public static void main(String[] args) throws Exception {
        //polimorfismo(new Triangulo("Triangulo", 7, 4));
        //polimorfismo(new Cuadrado("Cuadrado", 4));
        polimorfismo (new Ovalo("Ovalo", 4, 2));
    }

    public static void polimorfismo(Figura miFigura){
        System.out.println("Tipo: " + miFigura.getTipo());
        System.out.println("Área: " + miFigura.area());
    }
}
