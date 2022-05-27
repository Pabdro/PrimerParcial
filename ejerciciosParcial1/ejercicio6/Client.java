package ejerciciosParcial1.ejercicio6;

public class Client {
    public static void main(String[] args) {
        String e= "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Interpreter parser=new Interpreter(e);
        System.out.println("i.e");
        System.out.println(e);
        System.out.println("-"+parser.evaluateMsg());
    }
}
