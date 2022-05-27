package ejerciciosParcial1.ejercicio4;

public class Historia implements IClase{
    private String nombre;
    private Estudiante estudiante = new Estudiante();

    public Historia(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void inscribirse() {
        System.out.println("Informacion de la materia");
        System.out.println("Tipo: "+nombre);
        System.out.println("Inscribiendo a "+estudiante.getNombre() +" "+ estudiante.getCi());
        System.out.println();
    }

    @Override
    public void registrar(Estudiante estudiante) {
        this.estudiante=estudiante;
    }
}
