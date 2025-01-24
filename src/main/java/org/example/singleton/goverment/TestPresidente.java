package org.example.singleton.goverment;

public class TestPresidente {
    public static void main(String[] args) {
        Presidente presidente = Presidente.getInstance();
        presidente.setNombre("Claudia Sheinbaum");

        JefeEstado je = new JefeEstado();
        je.setRepresentante(Presidente.getInstance());
        JefeGobierno jg = new JefeGobierno();
        jg.setRepresentante(Presidente.getInstance());
        ComandanteFuerzasArmadas cfa = new ComandanteFuerzasArmadas();
        cfa.setRepresentante(Presidente.getInstance());

        System.out.println("Jefe de Estado : " + je.getRepresentante().hashCode());
        System.out.println("Jefe de Gobierno : " + jg.getRepresentante().hashCode());
        System.out.println("Comandante de las fuerzas armadas : " + cfa.getRepresentante().hashCode());

        /**
         * Rompiendo la estructura del patron, se cambia de public a private el modificador de acceso del constructor
         * de la clase Presidente para probar que al instanciar el objeto de manera tradicional con new
         * se tiene como resultado otro hashcode, comprobando asi que ya no es la misma instancia
         */
        //Presidente p4 = new Presidente();
        //System.out.println("Presidente 4 : " + p4.hashCode());
    }
}
