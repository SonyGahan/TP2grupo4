/*
 Para entrega 2 Grupo 4
 */
package tp2grupo4;


public class TP2Grupo4 {
 
    public static PronosticoDeportivo PRODE;
    
   
    public static void main(String[] args) {
        System.out.println ("Sistema de simulaciÃ³n de pronÃ³sticos deportivos.");
        
        PRODE = new PronosticoDeportivo();

        PRODE.play();
    }
    
}
