public class TestMain {
    public static void main(String[] args) {
        Punto puntoRojo = new Punto();
        puntoRojo.setSistema(Sistema.PLANO);
        puntoRojo.setEtiqueta(etiqueta:"ROJO");
        puntoRojo.setX(4);
        puntoRojo.setY(1.3);

        Punto puntoVerde = new Punto();
        puntoVerde.setSistema(Sistema.PLANO);
        puntoVerde.setEtiqueta(etiqueta:"VERDE");
        puntoVerde.setX(6);
        puntoVerde.setY(2.7);

        // codigo que debe de utilizar para probar la implementacion de sus metodos
        double distanciaEntrePuntoVerde = puntoRojo.dameDistanciaEntreOtroPunto(puntoVerde);
        System.out.println("distancia = " + distanciaEntrePuntoVerde);

        Punto puntoMedioEntrePuntoVerde = puntoRojo.damePuntoMedioEntreOtroPunto(puntoVerde);
        System.out.println(puntoMedioEntrePuntoVerde.toString());

    }
}
