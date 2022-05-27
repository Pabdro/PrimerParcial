package ejerciciosParcial1.ejercicio1;

public class Ventanilla {
    private static Ventanilla instance;
    private int monto;
    private boolean registroCajero;
    private Ventanilla(){}
    public static Ventanilla getInstance() {
        if(instance==null) {
            instance = new Ventanilla();
        }
        return instance;
    }

    public void pagar(int monto) {
        if(registroCajero) {
            this.monto += monto;
        } else {
            System.out.println("No se pudo realizar el pago");
        }
    }

    public void recibirCodigoCajero(Cajero cajero, int codigoCajero) {
        if(codigoCajero != 0) {
            registroCajero = true;
        }
    }

    public void montoVentanilla(){
        System.out.println();
        System.out.println("el monto es: "+monto);
    }

}
