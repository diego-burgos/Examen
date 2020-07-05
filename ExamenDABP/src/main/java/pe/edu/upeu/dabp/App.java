package pe.edu.upeu.dabp;

import pe.edu.upeu.dabp.examen.ResolucionExamen;
import pe.edu.upeu.dabp.utils.LeerTeclado;

public class App {
    public static void main( String[] args )
    {
        LeerTeclado tecladoInicial = new LeerTeclado();
        ResolucionExamen resolucionFinal = new ResolucionExamen();
        String opcion = "SI";
        int numeroDeEjercicio;
        String menu = 
        "1.- Impuesto de Automoviles\n"+
        "2.- Tabla de Multiplicar del 1 al 20\n"+
        "3.- Numero Perfecto\n"+
        "4.- Metodo Recursivo";

        do{
            System.out.println(menu);
            numeroDeEjercicio = tecladoInicial.leer(0, "Ingrese el Ejercicio que desea probar: ");

            switch(numeroDeEjercicio){
                case 1:
                resolucionFinal.ImpuestosDeAutomoviles();
                break;
                case 2:
                resolucionFinal.TablaDeMultiplicar();
                break;
                case 3:
                int n = tecladoInicial.leer(0, "El numero perfecto a probar es: ");
                resolucionFinal.NumeroPerfecto(n);
                break;
                case 4:
                int base = tecladoInicial.leer(0, "Ingrese la Base: ");
                int exponente = tecladoInicial.leer(0, "Ingrese el Exponente");
                System.out.println("El Resultado es: " + resolucionFinal.potencRecur(base, exponente));
                break;
                default: 
                System.out.println("¡Numero de jercicio no existe!");
                break;
            }
        opcion = tecladoInicial.leer("", "¿Desea probar mas ejercicios? SI/NO");
        }while(opcion.equals("SI") || opcion.equals("si"));
    }
}
