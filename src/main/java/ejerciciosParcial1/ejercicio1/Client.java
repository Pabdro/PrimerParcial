package ejerciciosParcial1.ejercicio1;

public class Client {
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        cajero.setCodigoCajero(2134123);
        cajero.registrarseVentanilla();
        Estudiante e1 = new Estudiante();
        e1.setNombre("Gabriel");
        e1.pagoMatricula(123);
        cajero.saldoCajer();

        Estudiante e2 = new Estudiante();
        e2.setNombre("Miguel");
        e2.pagoMatricula(234);
        cajero.saldoCajer();

        Estudiante e3 = new Estudiante();
        e3.setNombre("Richard");
        e3.pagoMatricula(345);
        cajero.saldoCajer();

        Estudiante e4 = new Estudiante();
        e4.setNombre("Joseph");
        e4.pagoMatricula(456);
        cajero.saldoCajer();

        Estudiante e5 = new Estudiante();
        e5.setNombre("Marcos");
        e5.pagoMatricula(567);
        cajero.saldoCajer();
    }
}
