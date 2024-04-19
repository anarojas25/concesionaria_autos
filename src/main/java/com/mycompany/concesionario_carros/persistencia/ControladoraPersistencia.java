
package com.mycompany.concesionario_carros.persistencia;

import com.mycompany.concesionario_carros.logica.Auto;
import java.util.List;

public class ControladoraPersistencia {
    
    AutoJpaController autoJPA = new AutoJpaController();

    public void guardarDatos(Auto auto) {
        autoJPA.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJPA.findAutoEntities();
    }
    
}
