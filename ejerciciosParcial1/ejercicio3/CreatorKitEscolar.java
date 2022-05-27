package ejerciciosParcial1.ejercicio3;

public class CreatorKitEscolar extends Creator{
    @Override
    public KitEscolar createProduct() {
        Mochila mochila=new Mochila();
        mochila.setNumeroBolsillos(2);
        mochila.setTamanio("muy grande");
        Deportivo deportivo=new Deportivo();
        deportivo.setTalla("M");
        deportivo.setColor("rosado");
        deportivo.setNumeroDePrenda(200);
        Cuadernos cuadernos=new Cuadernos();
        cuadernos.setTipo("ofico");
        cuadernos.setNroHojas(500);
        KitEscolar kitEscolar = new KitEscolar(mochila,deportivo,cuadernos);
        kitEscolar.setMochila(mochila);
        kitEscolar.setDeportivo(deportivo);
        kitEscolar.setCuadernos(cuadernos);
        return kitEscolar;
    }
}
