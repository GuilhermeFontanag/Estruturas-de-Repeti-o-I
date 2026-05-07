public class CaixaEletronico {
    static void main(String[] args) {
        //tipos
        int i = 1;
        do {

            IO.println(String.format("informe a senha %n tentativa numero " + i));
            String teclado = IO.readln();
            i++;
            if (teclado.equals("123")) {
                IO.println("acesso liberado");
                return;
            }
        }while ( i<=3 );
            IO.println("conta bloqueada");

        }
    }

