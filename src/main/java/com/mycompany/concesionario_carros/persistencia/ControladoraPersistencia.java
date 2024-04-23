
package com.mycompany.concesionario_carros.persistencia;

import com.mycompany.concesionario_carros.logica.Auto;
import com.mycompany.concesionario_carros.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutoJpaController autoJPA = new AutoJpaController();

    public void guardarDatos(Auto auto) {
        autoJPA.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJPA.findAutoEntities();
    }

    public void eliminarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int idAuto) {
        return autoJPA.findAuto(idAuto);
    }

    public void editarAuto(Auto auto) {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
