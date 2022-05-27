package ejerciciosParcial1.ejercicio6;

public class TPara extends Traductor{
    public TPara(int largo){
        this.largo =largo;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Para")){
            context.output = context.output + "Then ";
            context.input = context.input.substring(largo);
        }
    }
}
