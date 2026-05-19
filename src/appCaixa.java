public class appCaixa{
    static void main(String[] args) {
        //declarando valores
        double saldo = 500;
        int teclado ;
        //loop
            do {
                IO.println(String.format(" 1 saque %n 2 deposito %n 3 saldo %n 0 Sair"));
            teclado = Integer.parseInt(IO.readln());
            switch (teclado) {
                case 1:  // o saque nao pode ser maior que o saldo(500)

                    double sacar = Double.parseDouble(IO.readln(String.format("informe o valor a ser sacado " )));
                    if (sacar<=saldo) {
                          saldo -=sacar;
                        IO.println("valor restante: " + saldo );
                    } else {
                        IO.println("saldo insuficiente");
                    }
                    break;
                case 2:  // deposito
                    double deposito = Double.parseDouble(IO.readln("informe o valor a ser depositado"));
                    String mensagem = (saldo <= deposito)? "valor depositado foi " + deposito : "o senhor nao possui tal valor";
                    IO.println(mensagem);
                    saldo += deposito;
                    break;
                case 3: // saldo
                    IO.println("saldo atual é " + saldo  );
                    break;
                default:
                    IO.println("encerrado");
            }
            }  while(teclado != 0);
    }
        }