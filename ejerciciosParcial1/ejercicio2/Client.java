package ejerciciosParcial1.ejercicio2;

public class Client {
    public static void main(String[] args) {
        Contrato cT= new Contrato();
        cT.setSueldo(5000);
        cT.setCargaHoraria(80);
        cT.setCursoEducacionSuperior(true);
        cT.setAccesoPlataforma(true);
        cT.setMercadoBiometrico(false);
        cT.setMarcadoHoraDeEntrada("08:00");
        cT.setMarcadoHoraDeSalida("18:00");

        Docente d1 = new Docente();
        d1.setNombre("Alexis");
        d1.setApellido("Marechal");
        Contrato c1 = (Contrato) cT.clone();
        c1.setDocente(d1);

        Docente d2 = new Docente();
        d2.setNombre("Rene");
        d2.setApellido("Sosa");
        Contrato c2 = (Contrato) cT.clone();
        c2.setDocente(d2);

        Docente d3 = new Docente();
        d3.setNombre("Luis");
        d3.setApellido("Romero");
        Contrato c3 = (Contrato) cT.clone();
        c3.setDocente(d3);

        Docente d4 = new Docente();
        d4.setNombre("Poul");
        d4.setApellido("Landaeta");
        Contrato c4 = (Contrato) cT.clone();
        c4.setDocente(d4);

        Docente d5 = new Docente();
        d5.setNombre("Adrian");
        d5.setApellido("Rodriguez");
        Contrato c5 = (Contrato) cT.clone();
        c5.setDocente(d5);

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();
    }
}
