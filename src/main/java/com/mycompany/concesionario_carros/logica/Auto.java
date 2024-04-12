
package com.mycompany.concesionario_carros.logica;

public class Auto {
    //atributos: id, modelo, marca, motor, color, placa, puertas
    protected int id;
    protected String modelo;
    protected String marca;
    protected String motor;
    protected String color;
    protected String placa;
    protected int puertas;
    
    
    //crear constructor vacio y con atributos 
    public Auto() {
    }

    public Auto(int id, String modelo, String marca, String motor, String color, String placa, int puertas) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.placa = placa;
        this.puertas = puertas;
    }
    
    
    //crear getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
}
