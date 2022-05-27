package ejerciciosParcial1.ejercicio1;

public class Estudiante {
    private String nombre;
    public Estudiante(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void pagoMatricula(int monto){
        System.out.println("Paga la matricula: " +nombre);
        Ventanilla.getInstance().pagar(monto);
    }
}
