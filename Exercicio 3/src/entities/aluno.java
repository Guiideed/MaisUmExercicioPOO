package entities;

public class aluno {
	public String nomeAluno;
	public double primeiroSemestre;
	public double segundoSemestre;
	public double terceiroSemestre;
	public int passou;

	
	public double notaTotal() {
		return primeiroSemestre + segundoSemestre + terceiroSemestre;
	}
	public int aprovadoOuNao() {
		if (notaTotal()>60.0) {
			passou = 1 ;
		}else {
			passou = 2;}
		return passou;
	}

}
	
	

