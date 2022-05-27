package ejerciciosParcial1.ejercicio3;

public class Client {
    public static void main(String[] args) {
        KitEscolar ke= new CreatorKitEscolar().createProduct();
        ke.showInfo();

        KitColegial kc=new CreatorKitColegial().createProduct();
        kc.showInfo();
    }
}
