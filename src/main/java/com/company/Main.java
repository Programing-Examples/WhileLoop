package main.java.com.company;

public class Main {

    public static void main(String[] args) {
	    int currentValue = 2;
	    int cont = 1;

        System.out.println("Valor inicial de la variable: " + currentValue);
        System.out.println("--------------------------------");

        while (currentValue < 100) {
            currentValue = currentValue + (currentValue -1);
            System.out.println("Iteracion: " + cont + " - Valor de la variable: " + currentValue);
            cont++; // cont = cont + 1
        }

        System.out.println("Fin del programa");
    }
}
