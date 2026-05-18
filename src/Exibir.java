import java.util.Arrays;

public class Exibir {
    static void main(String[] args) {
        double soma = 0;
        double maior = 0;
        double menor = 0;
        double par = 0;
        double impar = 0;
        int contador = 0;
        int contador1 = 0;
        double [] valor = new double[10];
            for (int i = 0 ; i <10; i++){
                 valor[i] = Double.parseDouble(IO.readln("informe 10 numeros por gentileza"));
                soma += valor[i];

                if (soma %2 == 0){
                   par += valor[i];
                   contador++;
                }
                 if (valor[i] %2 != 0){
                     impar += valor[i];
                    contador1++;
                 }

            }

            //soma destes numeros
            IO.println("a soma dos numeros é: " +soma);

            //a media destes numeros
            IO.println("a media é: " + soma/valor.length);

            //o maior numero lido
             maior = Arrays.stream(valor).max().getAsDouble();
             IO.println("o maior numero lido: " + maior);

             // o menor numero lido
            menor = Arrays.stream(valor).min().getAsDouble();
            IO.println("o menor numero lido: " + menor);

            // a soma de todos os pares lidos
            IO.println(" a soma de todos os pares lidos: " + par);

            //soma de todos os impares lidos
            IO.println("A soma de todos os impares lidos: " + impar);

            // o numero de impares
            IO.println("o numero de impares: " +contador1);

            // o numero de pares
            IO.println("o numero de pares lidos: " +contador);
        }
    }

