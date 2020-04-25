package classes;

public class AlunoMain {

	public static void main(String[] args) {
		//criar um objeto do tipo Aluno
		Aluno cadastro = new Aluno(123,"joao",'m',"9999-9999");  
		System.out.println(cadastro.toString());
		cadastro.setTel("8888-8888");
		System.out.println(cadastro.toString());
		cadastro.setNome("Jose");
		System.out.println(cadastro.toString());
		System.out.println("nome="+cadastro.getNome());
		
		Aluno cadastro2 = new Aluno(456,"maria",'f',"5555-5555");
		System.out.println("\n"+cadastro2.toString());
		
		
	}
}
