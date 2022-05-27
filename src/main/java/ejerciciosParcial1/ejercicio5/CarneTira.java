package ejerciciosParcial1.ejercicio5;

public class CarneTira extends BuilderCarne{
    @Override
    public void buildNombre() {
        this.carne.setNombre("Tira");
    }

    @Override
    public void buildTipoDeCarne() {
        this.carne.setTipoDeCarne("tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        this.carne.setSaborRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.carne.setGuarniciones("fideo");
    }
}