package datos;

/**
 *
 * @author Ovejo
 */
public class InformeCarrera {
    
    private Corredor corredor;
    private String tiempo;
    private String dorsal;



    public InformeCarrera(String tiempo, String dorsal) {
       
        this.tiempo = tiempo;
        this.dorsal = dorsal;
        
    }

    public InformeCarrera(Corredor corredor, String tiempo) {
        this.corredor = corredor;
        this.tiempo = tiempo;
    }

    public InformeCarrera() {
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
        public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }
   
}


