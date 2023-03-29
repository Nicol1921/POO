package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego { 
        private int mano;
        private String jugador;
        private int decision;
        Scanner Lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador ");
        jugador=Lectura.next();
    }
    public void jugar(){
    System.out.println(jugador+ "Realice su decision 1.Piedra 2.Papel  3.Tijera");
    decision=Lectura.nextInt(); 
      Random aleatorio=new Random();
      mano=aleatorio.nextInt(3)+1;
      System.out.println("Piedra, Papel o Tijera!!!!!!");
    }
    public void finalizar(){
        if(mano==3 && decision==1 || mano==1 && decision==2 || mano==2 && decision==3 ){
            System.out.println("Ganaste "+jugador);
        }
        else if(mano==2 && decision==1 || mano==3 && decision==2 || mano==1 && decision==3 ){
            System.out.println("Perdiste  "+jugador);
        }
       
        else if(mano==2 && decision==2 || mano==3 && decision==3 || mano==1 && decision==1 ){
            System.out.println("Has empatado "+jugador);
        }
      
        
    }
    }
