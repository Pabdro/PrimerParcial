package ejerciciosParcial1.ejercicio5;

public class Carne {
    private String nombre;
    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;

    public Carne(){}

    public String getNombre() {
        return nombre;
    }

    public Carne setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public Carne setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
        return this;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public Carne setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
        return this;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public Carne setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
        return this;
    }
    public void showInfo() {
        System.out.println("* "+nombre);
        System.out.println("tipo de carne: "+tipoDeCarne);
        System.out.println("sabor del refresco: "+saborRefresco);
        System.out.println("guarniciones: "+guarniciones);
        System.out.println();
    }
}
