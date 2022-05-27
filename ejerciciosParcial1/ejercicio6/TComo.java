package ejerciciosParcial1.ejercicio6;

public class TComo extends Traductor{
    public TComo(int largo){
        this.largo =largo;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Como")){
            context.output = context.output + "Given ";
            context.input = context.input.substring(largo);
        }
    }
}
