package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class CaraYSello implements Juego{

    private int moneda;
    private String jugador;
    private int eleccion;
    Scanner Lectura=new Scanner(System.in);
    
public void iniciar(){
    System.out.println("Ingrese el nombre del jugador ");
    jugador=Lectura.next();
}
public void jugar(){
System.out.println(jugador+"Realice su eleccion 1.Cara 2.Sello");
  eleccion=Lectura.nextInt(); 
  Random aleatorio=new Random();
  moneda=aleatorio.nextInt(2)+1;
}
public void finalizar(){
    if(moneda==1 && eleccion==1|| moneda==2 && eleccion==2 ){
        System.out.println("Ganaste "+jugador);
    }
    else if(moneda==1 && eleccion==2 || moneda==2 && eleccion==1 ){
        System.out.println("Perdiste "+jugador);
    }
}
}
