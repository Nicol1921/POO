package FigurasGeometricas;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        float lado, base, altura, radio;
        int Juego, i=1;
        Scanner Lectura = new Scanner(System.in);


        while(i==1){
            
        System.out.println("Ingrese el numero segun la figura que desea calcular");
        System.out.println("1 Si es Cuadrado");
        System.out.println("2 Si Rectangulo");
        System.out.println("3 Si es Triangulo");
        System.out.println("4 Si es Circulo");
        Juego=Lectura.nextInt();

        
        if(Juego==1){
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado=Lectura.nextFloat();
        Cuadrado Juego2=new Cuadrado(lado);
        Juego2.calcularArea();
        }
        
        else if(Juego==2){
        System.out.println("Ingrese el valor de la base del rectangulo");
        base=Lectura.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo");
        altura=Lectura.nextInt();
        Rectangulo Juego3=new Rectangulo(base, altura);
        Juego3.calcularArea();
        }

        else if(Juego==3){
        System.out.println("Ingrese el valor de la base del triangulo");
        base=Lectura.nextInt();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura=Lectura.nextInt();
        Triangulo Juego4=new Triangulo(base, altura);
        Juego4.calcularArea();
        }
    
        else if(Juego==4){
        System.out.println("Ingrese el valor del radio del circulo");
        radio=Lectura.nextFloat();
        Circulo Juego5=new Circulo(radio);
        Juego5.calcularArea();
        }
        i++;
    } 

    System.out.println("Digite 1 si desea calcular otra figura");
    i=Lectura.nextInt();

    if(i!=2){
        System.out.println("Fin del programa");
    }
}
}
