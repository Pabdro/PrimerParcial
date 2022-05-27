package ejerciciosParcial1.ejercicio3;

public class KitEscolar implements IKit{
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuadernos;
    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuadernos cuadernos){
        this.mochila=mochila;
        this.deportivo=deportivo;
        this.cuadernos=cuadernos;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override
    public void showInfo() {
        System.out.println("Kit Escolar");
        System.out.println("numero de bolsillos en mochila: "+mochila.getNumeroBolsillos());
        System.out.println("tamanio de la mochila: "+mochila.getTamanio());
        System.out.println("talla del deportivo: "+deportivo.getTalla());
        System.out.println("color del deportivo: "+deportivo.getColor());
        System.out.println("numero de prendas: "+deportivo.getNumeroDePrenda());
        System.out.println("tipo de cuaderno: "+cuadernos.getTipo());
        System.out.println("numero de hojas del cuaderno: "+cuadernos.getNroHojas());
        System.out.println();
    }
}
