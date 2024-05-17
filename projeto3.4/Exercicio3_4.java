import java.util.*;
public class Exercicio3_4 {

	public static void main(String[] args) {
		// 1 - variaveis
		String nomeAluno;
		int nota1 = 0, nota2, nota3;
		int notaFinal;
		int contAlunos = 0;
		int somaNotasFinais = 0;
		String nomeAlunoMaiorNota = "";
		int maiorNotaFinal = 0;
		Scanner leia = new Scanner(System.in);
		
		while (nota1 != -1 ) {
			// 2 - entrada de dados
			System.out.print("Digite o nome do aluno: ");
			nomeAluno = leia.nextLine();			
			System.out.print("Digite a primeira nota do Aluno (digite -1 p/ finalizar): ");
			nota1 = leia.nextInt();
			if (nota1 == -1) {
				break;
			}			
			System.out.print("Digite a segunda nota do Aluno: ");
			nota2 = leia.nextInt();
			System.out.print("Digite a terceira nota do Aluno: ");
			nota3 = leia.nextInt();
			
			// 3 - calculos
			notaFinal = nota1 + nota2 + nota3;
			if (notaFinal >= 60) {
				System.out.println("Aluno Aprovado!");
			} else {
				System.out.println("Aluno Reprovado!");
			}
			contAlunos = contAlunos + 1;  // contAlunos ++
			somaNotasFinais = somaNotasFinais + notaFinal;
			if (notaFinal > maiorNotaFinal) {
				maiorNotaFinal = notaFinal;
				nomeAlunoMaiorNota = nomeAluno;
			}
			
			// 4 - saidas de dados
			System.out.println("Nota final do aluno: " + notaFinal);	
			
			leia.nextLine();
		}  // fim do while
		
		System.out.println("Quantidade total de alunos: " + contAlunos);
		System.out.println("Media de notas da turma: " + somaNotasFinais / contAlunos);
		System.out.print("Maior nota final da turma: " + nomeAlunoMaiorNota + 
				" nota: " + maiorNotaFinal);
	}

}
