package condicionais;
// * @author dpazolopez/

import javax.swing.JOptionPane;


public class Metodos {

    private double numero1;
    private double numero2;


public Metodos (double n1, double n2){
     numero1=n1;
     this.numero2=n2;
    }
public Metodos(){
}
public double pedirdato(){
    String resposta= JOptionPane.showInputDialog("introduce dato");
    double valor= Double.parseDouble(resposta);
    return valor;
}
public void condicionSimple(){
    if(numero1>numero2)
    System.out.println(numero1+ "e maior");
}
public void condicionSimple(double n1, double n2){
    if(n1>n2)
        JOptionPane.showMessageDialog(null,"o maior e" +n1);
}
}