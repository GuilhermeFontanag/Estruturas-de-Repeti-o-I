

public class MediaFinal {
   static void main(String[] args) {
        String[] alunos = new String[4];
        double[] notas = new double[4];

        double soma = 0;

        for (int i = 1; i <=4; i++) {

            alunos[i] =  IO.readln("Digite o nome do aluno: ");

            notas[i] = Double.parseDouble(IO.readln("Digite a nota do aluno: "));

            soma += notas[i];

        }
        double media = soma / alunos.length;

        for (int i = 1; i < 4; i++) {
            IO.println(
                    "Aluno: " + alunos[i] +
                            " | Nota: " + notas[i]);
        }
    }
}