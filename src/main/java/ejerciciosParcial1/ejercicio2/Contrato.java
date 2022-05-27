package ejerciciosParcial1.ejercicio2;

public class Contrato implements IContrato{
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean mercadoBiometrico;
    private String marcadoHoraDeEntrada;
    private String marcadoHoraDeSalida;
    private Docente docente = new Docente();

    public Contrato(){}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMercadoBiometrico() {
        return mercadoBiometrico;
    }

    public void setMercadoBiometrico(boolean mercadoBiometrico) {
        this.mercadoBiometrico = mercadoBiometrico;
    }

    public String getMarcadoHoraDeEntrada() {
        return marcadoHoraDeEntrada;
    }

    public void setMarcadoHoraDeEntrada(String marcadoHoraDeEntrada) {
        this.marcadoHoraDeEntrada = marcadoHoraDeEntrada;
    }

    public String getMarcadoHoraDeSalida() {
        return marcadoHoraDeSalida;
    }

    public void setMarcadoHoraDeSalida(String marcadoHoraDeSalida) {
        this.marcadoHoraDeSalida = marcadoHoraDeSalida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public Object clone() {
        Docente cloneD = new Docente();
        cloneD.setNombre(this.getDocente().getNombre());
        cloneD.setApellido(this.getDocente().getApellido());

        Contrato clone = new Contrato();
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMercadoBiometrico(this.isMercadoBiometrico());
        clone.setMarcadoHoraDeEntrada(this.getMarcadoHoraDeEntrada());
        clone.setMarcadoHoraDeSalida(this.getMarcadoHoraDeSalida());
        clone.setDocente(cloneD);
        return clone;
    }

    public void showInfo(){
        System.out.println("Contratando a:");
        System.out.println("sueldo: "+sueldo);
        System.out.println("carga de horario: "+cargaHoraria);
        System.out.println("curso educacion superior: "+cursoEducacionSuperior);
        System.out.println("acceso a la plataforma: "+accesoPlataforma);
        System.out.println("marcado biometrico: "+mercadoBiometrico);
        System.out.println("marcado hora de entrada: "+marcadoHoraDeEntrada);
        System.out.println("marcado hora de salida: "+marcadoHoraDeSalida);
        System.out.println("nombre: "+docente.getNombre());
        System.out.println("apellido: "+docente.getApellido());
        System.out.println();
    }
}
