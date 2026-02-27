package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

public static void main(String[] args) {
int opción;
Scanner teclado = new Scanner (System.in);
do { 
   opción = mostrarMenú();
   if (opción != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      double y = teclado.nextDouble();

   switch (opción) {
    case 1 -> {
        System.out.print("Lado 1: "); double l1 = teclado.nextDouble();
        System.out.print("Lado 2: "); double l2 = teclado.nextDouble();
        System.out.print("Lado 3: "); double l3 = teclado.nextDouble();
        Triángulo t = new Triángulo(x, y, Color.red, l1, l2, l3);
        mostrarDatos(t.perímetro(), t.área());
    }
    case 2 -> {
        System.out.print("Base: "); double b = teclado.nextDouble();
        System.out.print("Altura: "); double h = teclado.nextDouble();
        Rectángulo r = new Rectángulo(x, y, Color.red, b, h);
        mostrarDatos(r.perímetro(), r.área());
    }
    case 3 -> {
        System.out.print("Lado: "); double l = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, l);
        mostrarDatos(c.perímetro(), c.área());
    }
}
}

}while (opción != 4);
teclado.close();
}

public static int mostrarMenú(){
int opción;
System.out.println ("1) Triángulo");
System.out.println ("2) Rectángulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
do {
    System.out.print ("Introduzca una opción, por favor (1-4): ");
    opción = teclado.nextInt();
    if (opción < 1 || opción > 4)
	   System.out.println ("Debe introducir un número entre 1 y 4");
   } while (opción < 1 || opción > 4);
return opción;
}

private static void mostrarDatos(double p, double a) {
    System.out.println("El perímetro es " + p);
    System.out.println("El área es " + a);
}
}


