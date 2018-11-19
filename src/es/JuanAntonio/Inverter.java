package es.JuanAntonio;


import java.util.Arrays;

//Immplementamos java.lang.CharSequience con implements
public class Inverter implements  CharSequence{


//Creamos un array de caracteres llamado palabra sin datos.
    char [] palabra;


//Creamos un contructor por defecto y modificamos para que sea un string y no char y le agregamos .toCharArray.
    public Inverter(String palabra) {
        this.palabra = palabra.toCharArray();
    }

    @Override
    public int length() {
        return palabra.length;
    }

    //Modificamos el return para que devuelva lo que hay en la palabra y posicion index
    @Override
    public char charAt(int index) {
        return palabra[index];
    }

    //Modificamos esto metiendo un for para que recorra desde start hasta end y meta los caractteres en String creado.
    @Override
    public CharSequence subSequence(int start, int end) {

        String inicioFin = "";

        for (int i = start ; i <=end ; i++) {

            inicioFin += palabra[i];
        }

        return inicioFin;
    }

    //Creamos un metodo nuevo llamado inversor que lo que hace es  mostrar la palabra invertida.
    public String  inversor () {

        String palabraInvertida = "";
        for (int i = palabra.length - 1 ; i >= 0 ; i--) {
            palabraInvertida += palabra[i];
        }
        return palabraInvertida;
    }


//Creamos geters y setters y toString.
    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Inverter{" +
                "palabra=" + Arrays.toString(palabra) +
                '}';
    }

}
