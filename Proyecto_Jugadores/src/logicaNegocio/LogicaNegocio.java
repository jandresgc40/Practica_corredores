
package logicaNegocio;

import datos.Carrera;
import datos.Corredor;
import java.util.ArrayList;
import java.util.List;


public class LogicaNegocio {
    
    private static List<Corredor> listaCorredores = new ArrayList<>();
    private static List<Carrera> listaCarreras = new ArrayList<>();
    
    
    public static void aniadirCorredor(Corredor corredor) {
    
        listaCorredores.add(corredor);
    
    }
    
     public static void aniadirCarrera(Carrera carrera) {
    
        listaCarreras.add(carrera);
    
    }

    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public static List<Carrera> getListaCarreras() {
        return listaCarreras;
    }
     
     
    
    
    
}
