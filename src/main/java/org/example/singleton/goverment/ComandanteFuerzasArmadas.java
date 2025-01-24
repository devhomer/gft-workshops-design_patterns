package org.example.singleton.goverment;

public class ComandanteFuerzasArmadas {

    /*public ComandanteFuerzasArmadas(Presidente presidente){
        this.representante = presidente;
    }*/

    private Presidente representante;

    public Presidente getRepresentante() {
        return representante;
    }

    public void setRepresentante(Presidente representante) {
        this.representante = representante;
    }
}
