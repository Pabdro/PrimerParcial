package ejerciciosParcial1.ejercicio4;

public class FactoryClase {
    public static IClase make(TipoClase type){
        IClase clase;
        switch (type){
            case MATEMATICAS:
                clase = new Matematicas();
                ((Matematicas) clase).setNombre("Matematicas");
                break;
            case LENGUAJE:
                clase = new Lenguaje();
                ((Lenguaje) clase).setNombre("Lenguaje");
                break;
            case HISTORIA:
                clase = new Historia();
                ((Historia) clase).setNombre("Historia");
                break;
            case INGLES:
                clase = new Ingles();
                ((Ingles) clase).setNombre("Ingles");
                break;
            default:
                clase = null;
                break;
        }
        return clase;
    }
}
