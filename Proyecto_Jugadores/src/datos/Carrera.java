package datos;

import java.util.List;

public class Carrera {
    
    private String nombreCarrera;
    private String fechaCarrera;
    private String lugarCarrera;
    private String numMaxParticipantes;
    private List<Corredor> listaCorredores; // el dorsal puede ser la posición de ese corredor en el array.
   
    public Carrera(String nombreCarrera, String fechaCarrera, String lugarCarrera, String numMaxParticipantes, List<Corredor> listaCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.numMaxParticipantes = numMaxParticipantes;
        this.listaCorredores = listaCorredores;

    }
    
    public Carrera(String nombreCarrera, String fechaCarrera, String lugarCarrera, String numMaxParticipantes) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugarCarrera = lugarCarrera;
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public Carrera() {
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(String fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugarCarrera() {
        return lugarCarrera;
    }

    public void setLugarCarrera(String lugarCarrera) {
        this.lugarCarrera = lugarCarrera;
    }

    public String getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public void setNumMaxParticipantes(String numMaxParticipantes) {
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }
    
     public String[] toArrayString() {
        
        String[] s = new String [5];
        s[0] = nombreCarrera;
        s[1] = fechaCarrera;
        s[2] = lugarCarrera;
        s[3] = numMaxParticipantes;
        s[4] =  String.valueOf(listaCorredores.size());
    
        return s;
    
    }
    
}
