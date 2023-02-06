package apllication;
import java.util.Scanner;
import java.util.Locale;
import entities.aluno;
	/*Sistema que verifica 03 notas, se a nota for menor que 60 pontos, o aluno é reprovado*/
public class principal {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		aluno Aluno = new aluno();
		System.out.println("Qual seu nome?");
		Aluno.nomeAluno = leitor.next();
		System.out.println("Olá, aluno: " + Aluno.nomeAluno);
		System.out.println("Insira a nota do primeiro semestre");
		Aluno.primeiroSemestre = leitor.nextDouble();
		System.out.println("Insira a nota do segundo semestre");
		Aluno.segundoSemestre = leitor.nextDouble();
		System.out.println("Insira a nota do terceiro semestre");
		Aluno.terceiroSemestre = leitor.nextDouble();
		System.out.println("O total adquirido e de :" + Aluno.notaTotal());
		
		leitor.close();
		if (Aluno.passou == 1) {
			System.out.println("Voce passou de ano");
		}else {
			System.out.println("Voce foi reprovado");
		}
	}
}
