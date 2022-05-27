package ejerciciosParcial1.ejercicio5;

public class Client {
    public static void main(String[] args) {
        System.out.println("Miguel quiere: ");
        System.out.println();

        Director jefe = new Director();
        BuilderCarne carneBife = new CarneBife();
        BuilderCarne carneLomo = new CarneLomito();
        BuilderCarne carneTira = new CarneTira();

        jefe.setBuilder(carneBife);
        jefe.hacerCarne();
        Carne carne1 = jefe.getCarneHecha();
        carne1.showInfo();

        jefe.setBuilder(carneLomo);
        jefe.hacerCarne();
        Carne carne2 = jefe.getCarneHecha();
        carne2.showInfo();

        jefe.setBuilder(carneTira);
        jefe.hacerCarne();
        Carne carne3 = jefe.getCarneHecha();
        carne3.showInfo();
    }
}
