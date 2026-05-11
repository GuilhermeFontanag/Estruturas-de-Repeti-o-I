
import java.util.Arrays;

public class notaescolar {
    static void main() {
        //declaração
        int [] media = new int[4];
        int soma = 0;
        int aluno = 0;
        String [] informe = new String[3];
        //loop de pedido de nota
        for (int contador = 1; contador<=4 ;contador++) {

            for (int i = 0; i < media.length; i++) {
                media[i] = Integer.parseInt(IO.readln( "aluno "+ contador + ", nota do + " + (i + 1) + " bimestre"));

                soma += media[i] /4;
            }
            if (soma >7){
                informe [0] = "aprovado";
            } else if (soma > 5 ) {
                informe [1] = "recuperação";
            }else{
                informe [2] = "reprovado";
            }
        }
        IO.println(Arrays.toString(informe));

        }
        
    }

