package Principal;

import Salud.Empleado;
//import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //Retos 1
        //double resultado, peso=0, estatura=0;
        //crear un objeto->instancia de una clase
        //Retos 1 y 2
        /*Persona datos=new Persona(null, 0, null, null, estatura, estatura, 0, null);
        //invocando un metodo
        datos.pedirDatos();
        datos.mostrarPersona();
        resultado=n.calcularImc(peso, estatura);
        if (resultado<20){
            System.out.println("PesoBajo");
        }
        else if (resultado >= 20 && resultado <= 25){
            System.out.println("PesoIdeal");
        }
        else{
            System.out.println("Sobrepeso");
        }
        datos.mayorEdad();*/

        //Reto 3
        Empleado Datos=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);
        Datos.pedirDatos();
        Datos.pedirEmpleado();
        Datos.mostrarEmpleado();
        Datos.calcularHonorarios();
   }
}
