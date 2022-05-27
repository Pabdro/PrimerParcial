package ejerciciosParcial1.ejercicio1;

public class Cajero {
    private int codigoCajero;
    public Cajero(){}

    public int getCodigoCajero() {
        return codigoCajero;
    }

    public void setCodigoCajero(int codigoCajero) {
        this.codigoCajero = codigoCajero;
    }
    public void registrarseVentanilla(){
        Ventanilla.getInstance().recibirCodigoCajero(this, codigoCajero);
    }
    public void saldoCajer(){
        Ventanilla.getInstance().montoVentanilla();
    }
}
