public class Ovalo extends Figura{
    private int radio1, radio2;
    
    public Ovalo(String tipo, int radio1, int radio2) {
        super(tipo);
        this.radio1 = radio1;
        this.radio2 = radio2;
    }

    public int getRadio1() {
        return radio1;
    }

    public int getRadio2() {
        return radio2;
    }

    @Override
    public double area() {
        return this.radio1 * this.radio2 * Math.PI;
    }
}
