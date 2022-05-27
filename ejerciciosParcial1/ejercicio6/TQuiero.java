package ejerciciosParcial1.ejercicio6;

public class TQuiero extends Traductor{
    public TQuiero(int largo){
        this.largo =largo;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Quiero")){
            context.output = context.output + "When ";
            context.input = context.input.substring(largo);
        }
    }
}
