package inicial;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Nivel {
	 //atributos:
   public int cont = -1, record = 0, lvl = 0;
    String nome = "", senha = "", certo = "", text = "", nivel = "", dica = "",parametro = "";
    
    Scanner scanner = new Scanner(System.in);
    
//getters & setters 
    public String getNome() {
  		return nome;
  	}

  	public void setNome(String nome) {
  		this.nome = nome;
  	}

//metodos:
    
    void abertura() throws InterruptedException{
    	System.out.println("Digite seu nome:\n");
    	this.nome = scanner.nextLine();
    	
    	System.out.println("\n\t\tTHE ENIGMES\n"
    			+ "\n\tSeja bem vindo a SEGUNDA EDIÇÃO do THE ENIGMES\n"
    			+ "\tSeu objetivo é desvendar cada nível, até que chegue ao Final...\n"
    			+ "\tUse qualquer recurso desejado ao seu favor, o Google é seu amigo\n"
    			+ "\t\t\t...Para sair do jogo e salvar sua pontuação digite 'sair'\n"
    			+ "\t\t\tPorém seu progresso será zerado\n"
    			+ "\tBOA SORTE!!\n"
    			+ "\t\n     e que comece os Jogos...\n");
    		new Thread();
    		Thread.sleep(10000);

    }
    


void pergunta(){
	   this.lvl++;
	   while(!certo.equalsIgnoreCase(senha)){
		   System.out.println("\n-------------------------------\n");
		   System.out.println(this.nivel);
		   System.out.println(this.text);
    		senha = scanner.nextLine();
    		this.cont++;
    	   System.out.println("\n-------------------------------\n");
    	   if(this.parametro.equalsIgnoreCase(senha)){
    		   System.out.println(this.dica);
    	   }
    	   if(this.parametro.equalsIgnoreCase("sim")&& this.cont>=7){
    		   System.out.println(this.dica);
    	   }
    	   if(this.senha.equalsIgnoreCase("sair")){
    		   System.out.println("\n\nAo fazer isso você o seus dados foram salvos, porém seu andamento não.\nTerá que começar tudo de novo\n"
    		   		+ "\nCerteza que deseja sair?\n");
    		   senha = scanner.nextLine();
    		   if(this.senha.equalsIgnoreCase("sim")){
    			   System.exit(0);
    		   }
    	   }
	   }
   }
   


void pontos(){
	   this.record += (100 - this.cont);
	   this.cont = -1;
   }

public void web() throws IOException{
	java.awt.Desktop.getDesktop().open(new File("theenigmesweb.exe"+"/Secondary"));
}
   
}
