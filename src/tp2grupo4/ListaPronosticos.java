package tp2grupo4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaPronosticos {
    //Atributos
    private List<Pronostico> pronosticos;
    private String pronosticosCSV;
    
    //Metodos
    
    //Constructor
    public ListaPronosticos(List<Pronostico> pronosticos, String pronosticosCSV) {
        this.pronosticos = pronosticos;
        this.pronosticosCSV = pronosticosCSV;
    }
    
    public ListaPronosticos() {
        this.pronosticos = new ArrayList<Pronostico>();
        this.pronosticosCSV = "pronosticos.csv";
    }
    
    //Getters and Setters
    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(List<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }

    public String getPronosticosCSV() {
        return pronosticosCSV;
    }

    public void setPronosticosCSV(String pronosticosCSV) {
        this.pronosticosCSV = pronosticosCSV;
    }
    
    // add y remove elementos
    public void addPronostico(Pronostico e) {
        this.pronosticos.add(e);
    }
    public void removePronostico(Pronostico e) {
        this.pronosticos.remove(e);
    }
    
    
    /***
     * Este metodo devuelve un Pronostico (o null) buscandolo por idPronostico
     * @param idPronostico Identificador del pronostico deseado
     * @return Objeto Pronostico (o null si no se encuentra)
     */
    public Pronostico getPronostico (int idPronostico) {
        // Defini un objeto de tipo Pronostico en donde va a ir mi resultado
        // Inicialmente es null, ya que no he encontrado el pronostico que 
        // buscaba todavi­a.
        Pronostico encontrado = null;
        // Recorro la lista de pronosticos que esta¡ cargada
        for (Pronostico eq : this.getPronosticos()) {
            // Para cada pronostico obtengo el valor del ID y lo comparo con el que
            // estoy buscando
            if (eq.getIdPronostico() == idPronostico) {
                // Si lo encuentro (son iguales) lo asigno como valor de encontrado
                encontrado = eq;
                // Y hago un break para salir del ciclo ya que no hace falta seguir buscando
                break;
            }
        }
        // Una vez fuera del ciclo retorno el equipo, pueden pasar dos cosas:
        // 1- Lo encontro en el ciclo, entonces encontrado tiene el objeto encontrado
        // 2- No lo encontro en el ciclo, entonces conserva el valor null del principio
        return encontrado;
    }
    
    //ToString - revisar

    @Override
    public String toString() {
        return "ListaPronosticos{" + "pronosticos=" + pronosticos + ", pronosticosCSV=" + pronosticosCSV + '}';
    }
    
    
    public String listar() {
        String lista = "";
        for (Pronostico pronostico: pronosticos) {
            lista += "\n" + pronostico;
        }           
        return lista;
    }
    
    
    // cargar desde el archivo
    public void cargarDeArchivo() {
        // para las lineas del archivo csv
        String datosPronostico;
        // para los datos individuales de cada linea
        String vectorPronostico[];
        // para el objeto en memoria
        Pronostico pronostico;
        int fila = 0;
       
        try { 
            Scanner sc = new Scanner(new File(this.getPronosticosCSV()));
            sc.useDelimiter("\n");   //setea el separador de los datos
                
            while (sc.hasNext()) {
                // levanta los datos de cada linea
                datosPronostico = sc.next();
                // Descomentar si se quiere mostrar cada li­nea lei­da desde el archivo
                // System.out.println(datosPronostico);  //muestra los datos levantados 
                fila ++;
                // si es la cabecera la descarto y no se considera para armar el listado
                if (fila == 1)
                    continue;              
                 
                //Proceso auxiliar para convertir los string en vector
                // guarda en un vector los elementos individuales
                vectorPronostico = datosPronostico.split(",");   
                
                // graba el pronostico en memoria - HAY PROBLEMAS PARA ALMACENAR LOS DATOS EN EL VECTOR!
                //convertir un string a un entero;
                int idPronostico = Integer.parseInt(vectorPronostico[0]);
                //Equipo equipo = vectorPronostico[1];
                //Partido partido = vectorPronostico[2];
                //char resultado = Char.parseChar(vectorPronostico[3]);
                // crea el objeto en memoria
                //pronostico = new Pronostico(idPronostico, equipo, partido, resultado);
                
                // llama al metodo add para grabar el pronostico en la lista en memoria
                //this.addPronostico(pronostico);
            }
            //closes the scanner
        } catch (IOException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        }       
    }
    
}
