public class votos {
    static void main() {
        int joao = 0;
        int maria = 0;
        int anulado = 0;
        String informe;


        for (int i = 1; i <= 10; i++) {
            IO.println(String.format("escolha seu candidato %n 1 = João %n 2 = Maria"));
            int votacao = Integer.parseInt(IO.readln());

            if (votacao == 1) {
                joao++;
            } else if (votacao == 2) {
                maria++;
            } else {
                anulado++;
            }
        }
        if (joao > maria) {
            informe = "joao";
        } else if (joao < maria) {
            informe = "maria";
        }else informe = "nulo";
        IO.println("o vencedor é " + informe);
    }
    }


