package tp2grupo4;


public class Participante {
    //Atributos
    private int idParticipante;
    private String nombre;
    private ListaPronosticos pronosticos;
    private int puntaje;
    
    //Metodos
    
    
    //Constructor 
    public Participante(int idParticipante, String nombre, ListaPronosticos pronosticos, int puntaje) {
        this.idParticipante = idParticipante;
        this.nombre = nombre;
        this.pronosticos = pronosticos;
        this.puntaje = puntaje;
    }
    
    public Participante() {
        this.idParticipante = 0;
        this.nombre = null;
        this.pronosticos = null;
        this.puntaje = 0;  
    }
    
    
    //Getters and Setters
    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaPronosticos getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(ListaPronosticos pronosticos) {
        this.pronosticos = pronosticos;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    //toString
    @Override
    public String toString() {
        return "Participante{" + "idParticipante=" + idParticipante + ", nombre=" + nombre + ", pronosticos=" + pronosticos + ", puntaje=" + puntaje + '}';
    }
    
    
    
    //Falta el procedimiento cargarPronostico()
}
