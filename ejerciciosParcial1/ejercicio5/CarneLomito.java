package ejerciciosParcial1.ejercicio5;

public class CarneLomito extends BuilderCarne{
    @Override
    public void buildNombre() {
        this.carne.setNombre("Lomito");
    }

    @Override
    public void buildTipoDeCarne() {
        this.carne.setTipoDeCarne("lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.carne.setSaborRefresco("pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.carne.setGuarniciones("arroz");
    }
}
