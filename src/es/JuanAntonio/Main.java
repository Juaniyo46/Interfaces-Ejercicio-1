package es.JuanAntonio;

public class Main {

    public static void main(String[] args) {
	Inverter inverter = new Inverter("Aleluya");

        System.out.println(inverter.length());
        System.out.println(inverter.charAt(5));
        System.out.println(inverter.subSequence(2 , 5));
        System.out.println(inverter.inversor());
    }
}
