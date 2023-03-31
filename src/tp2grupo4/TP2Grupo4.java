/*
 Para entrega 2 Grupo 4
 Creado por Sonia Pereira
 */
package tp2grupo4;


public class TP2Grupo4 {
 
    public static PronosticoDeportivo PRODE;
    
   
    public static void main(String[] args) {
        System.out.println ("Sistema de simulacion de pronosticos deportivos.");
        
        PRODE = new PronosticoDeportivo();

        PRODE.play();
    }
    
}
