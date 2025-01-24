package org.example.singleton.goverment;

public class Presidente {

    private static Presidente instance;

    private String nombre;

    public Presidente(){}

    public static Presidente getInstance(){
        if (instance == null){
            instance = new Presidente();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
