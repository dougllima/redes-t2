import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.Scanner;

public class Maquina {

	private ServerSocket server;
	

	private PrintWriter out;
	private Scanner in;

	public Maquina() {
		try {
			this.server = new ServerSocket(12345);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//UDP
	//IPV6
	//Quarta feira ela falou que queria testar em 3 maquinas diferentes
	
	//o ip eh digitado na mao
	//o endereco das maquinas da rede deve ser um par <ipv6,porta>
	public void geraHost(){
		//*uma maquina pode ter varios processos de transferencia de arquivos = host*
		//gera um host na maquina atual
		//nao tem numero fixo
		
	}
	
	//da pra fazer com arquivos txt, vou enviar uns junto
	//OS PACOTES QUE CIRCULAM NA REDE
	//DEVEM POSSUIR --> um cabecalho com as info necessaria pra transferencia
	//sendo elas endereco IP origem, IP destino, Porta origem, Porta destino e Nome do arquivo
	
	
	public void enviarArquivos(String ipv6, String porta, String dados){
		//(botei string ali so pra n dar erro)
		//envia arquivos a outra maquina
		//enviar arquivos para outro host na msm maquina passa direto
		//enviar para outra maquina tem que passar pelo roteador
		//tem que ser possivel a edicao de um pacote a ser enviado
		// um ifsao maroto ou outro metodo?
	}
	
	public void receberArquivos(){
	//tem que mapear para mostrar o caminho percorrido
	//tem que avisar com msg na tela quando receber algo
		//o conteudo do pacote deve ser mostrado;
	}
	
	public void revelarCaminho(){
		//revela o roteamento realizado
		//manda ele executar esse logo quando terminar de enviar(tentar enviar) algum arquivo
		//tambem deve usar quando receber arquivos
	
	}
	
}