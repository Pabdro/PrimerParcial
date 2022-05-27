package ejerciciosParcial1.ejercicio4;

public class Client {
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Ariane");
        estudiante.setCi("1243123431");
        IClase clase = FactoryClase.make(TipoClase.MATEMATICAS);
        clase.registrar(estudiante);
        clase.inscribirse();

        Estudiante e2 = new Estudiante();
        e2.setNombre("Miguel");
        e2.setCi("344323254");
        IClase clase2 = FactoryClase.make(TipoClase.LENGUAJE);
        clase2.registrar(e2);
        clase2.inscribirse();

        Estudiante E3 = new Estudiante();
        E3.setNombre("Marcos");
        E3.setCi("5463535");
        IClase clase3 = FactoryClase.make(TipoClase.INGLES);
        clase3.registrar(E3);
        clase3.inscribirse();

        Estudiante e4 = new Estudiante();
        e4.setNombre("Gabriel");
        e4.setCi("4356256");
        IClase clase4 = FactoryClase.make(TipoClase.HISTORIA);
        clase4.registrar(e4);
        clase4.inscribirse();

        Estudiante e5 = new Estudiante();
        e5.setNombre("Richard");
        e5.setCi("543653634");
        IClase clase5 = FactoryClase.make(TipoClase.INGLES);
        clase5.registrar(e5);
        clase5.inscribirse();
    }
}
