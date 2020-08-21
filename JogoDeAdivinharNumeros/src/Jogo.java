import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {
		int numero = (int) (Math.random() * 100 + 1); //Escolhe o número
		int respUser = 0;
		int tentativas = 5;
		
		for(int i =0; i < tentativas; i++) {
			//Tamanho da janela = null -> default
			//Mensagem =  "Advinhe um número entre 1 e 100"
			//Título = "Jogo de adivinhação"
			//Ícone = 1 -> bolinha com i
			
			System.out.println(i);
			String response = JOptionPane.showInputDialog(null,
	                "Advinhe um número entre 1 e 100" , "Jogo de adivinhação", 1);
	            respUser = Integer.parseInt(response); //Transforma a resposta do usuário em int
	            
	            //showMessageDialog() mostra um diálogo
	            JOptionPane.showMessageDialog(null, ""+ determineGuess(respUser, numero, tentativas));
	            tentativas++; //Mais uma tentativa
		}

	}
	
	//Determina se a resposta está correta
	public static String determineGuess(int respUser, int numero, int tentativas) {
		if(respUser < numero) {
			return "você errou!! O número é maior";
		} else if(respUser > numero){
			return "você errou!! O numero é menor";
		} else {
			return "você acertou em " + tentativas + " tentativas!!";
		}
	}

}
