
package com.mycompany.concesionario_carros.logica;

import com.mycompany.concesionario_carros.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarDatos(String modelo, String marca, String motor, String color, String placa, int puertas) {
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setPuertas(puertas);
        
        controlPersis.guardarDatos(auto);
    }

    public List<Auto> traerAutos() {
        return controlPersis.traerAutos();

    }

    public void eliminarAuto(int idAuto) {
        controlPersis.eliminarAuto(idAuto);
    }

    public Auto traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void editarDatos(Auto auto, String modelo, String marca, String motor, String color, String placa, int puertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setPuertas(puertas);
        
        controlPersis.editarAuto(auto);
    }

    
    
}
