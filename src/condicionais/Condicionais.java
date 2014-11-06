package condicionais;

public class Condicionais {

    public static void main(String[] args) {
        double numero1, numero2;
        Metodos obxecto = new Metodos();
        numero1 = obxecto.pedirdato();
        numero2 = obxecto.pedirdato();
        obxecto.condicionSimple(numero1, numero2);
    }

}
