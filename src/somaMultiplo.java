public class somaMultiplo {
    public static void main(String[] args) {
        //variaveis
        int numero = 3;
        int resultado = 0;
        for(int i = 1; i <100; i++){
            resultado = 3 * i;
            if (resultado<100) {
                IO.println("resultado do multiplo de 3 é " + resultado);
            }
        }

    }
}
