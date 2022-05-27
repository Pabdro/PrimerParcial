package ejerciciosParcial1.ejercicio5;

public class CarneBife extends BuilderCarne{
    @Override
    public void buildNombre() {
        this.carne.setNombre("Bife");
    }

    @Override
    public void buildTipoDeCarne() {
        this.carne.setTipoDeCarne("bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.carne.setSaborRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.carne.setGuarniciones("papas fritas");
    }
}
