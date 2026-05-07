public class totalCompra {
    static void main() {
        double soma = 0;
        while (true) {
            IO.println("informe o valor dos produtos de sua compra");
            Double valor = Double.parseDouble(IO.readln());

            if (valor == 0){
                IO.println("valor total é " + soma);
                break;
            }
            soma += valor;
        }
    }
}