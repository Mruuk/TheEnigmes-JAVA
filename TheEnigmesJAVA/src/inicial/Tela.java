package inicial;

import java.io.IOException;

public class Tela {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		Nivel n1 = new Nivel();
		n1.nivel = "Nível 1";
		n1.certo = "fitoplâncton";
		n1.text = "\nÉ considerado o pulmão da terra\n\n";
		n1.parametro = "zooplancton";
		n1.dica = "\nquase isso, pense melhor\n";
		n1.abertura();
		n1.pergunta();
		n1.pontos();
		
		Nivel n2 = new Nivel();
		n2.nivel = "Nível 2";
		n2.certo = "flor";
		n2.text = "\nQuando uma pessoa cria laços com outra, sejam de amizade ou amor,HEXA ligação se\ntorna uma responsabilidade. Você tem de cuidar e alimentar a relação, para que o\nsentimento não acabe.\n66 6c 6f 72\n\n";
		n2.pergunta();
		n2.pontos();
		
		Nivel n3 = new Nivel();
		n3.nivel = "Nível 3";
		n3.certo = "rei";
		n3.text = "Duas rainha, uma negra e a outra branca, fazem aniversário juntas e decidem dá uma festa em um salão onde seu piso\né xadrez, sendo assim uma festa com temática disco anos 80. Ficou certo que cada uma levariam 14 convidados.\nNo dia da festa, nem todos os convidados compareceram, porém os convidados da rainha branca, justificaram sua ausência.\nJá um convidado muito importante da rainha Negra não justificou sua ausência\nQuem seria esse convidado tão importante que não compareceu\n\n";
		n3.pergunta();
		n3.pontos();
		
		Nivel n4 = new Nivel();
		n4.nivel = "Nível 4";
		n4.certo = "olho";
		n4.text = "\nA janela da alma\n\n";
		n4.parametro = "sim";
		n4.dica = "\n\nUm espelho te ajudará\n\n";
		n4.pergunta();
		n4.pontos();
		
		Nivel n5 = new Nivel();
		n5.nivel = "Nível 5";
		n5.certo = "bacteria";
		n5.text = "\nO que há de semelhante entre cólera e o iogurte\n\n";
		n5.pergunta();
		n5.pontos();
		
		Nivel n6 = new Nivel();
		n6.nivel = "Nível 6";
		n6.certo = "20";
		n6.text = "\nPara cada célula do corpo humano que possuem seu DNA no núcleo, existem quantas bactérias\n\n";
		n6.pergunta();
		n6.pontos();
		
		/*Nivel n7 = new Nivel();
		n7.nivel = "Nível 7";
		n7.certo = n7.nome;
		n7.text = "\nO que há de semelhante entre cólera e o iogurte\n\n";
		n7.pergunta();
		n7.pontos();
		*/
		
		Nivel n8 = new Nivel();
		n8.nivel = "Nível 8";
		n8.certo = "purple";
		n8.text = "\nRED+BLUE\n\n";
		n8.parametro = "sim";
		n8.dica = "\n\nSiga o padrão\n\n";
		n8.pergunta();
		n8.pontos();
		
		Nivel n9 = new Nivel();
		n9.nivel = "Nível 9";
		n9.certo = "rgb";
		n9.text = "\nGREEN+BLUE+RED\n\n";
		n9.parametro = "sim";
		n9.dica = "\n\npense melhor nas cores\n\n";
		n9.pergunta();
		n9.pontos();
		
		Nivel n10 = new Nivel();
		n10.nivel = "Nível 10";
		n10.certo = "pi";
		n10.text = "\nTransendental mas usado de maneira ampla\non "
				+ "March 14th it gets amused\nIf did you put the letter E, you can eat it\n\n";
		n10.parametro = "sim";
		n10.dica = "\n\ndica: inglês vai facilitar tudo\n\n";
		n10.pergunta();
		n10.pontos();
		
		Nivel n11 = new Nivel();
		n11.nivel = "Nível 11";
		n11.certo = "66 6d 6a";
		n11.text = "\nPara cada suspensionis punctorum, HEXA descubrirá a senha\n\n";
		n11.parametro = "sim";
		n11.dica = " \n\nAs reticencias mostram três coisas onde nelas haverá algo em comum"
				+ " use-o no hexa e tenha achave";
		n11.pergunta();
		n11.pontos();
		
		Nivel n12 = new Nivel();
		n12.nivel = "Nível 12";
		n12.certo = "humano";
		n12.text = "\n\t\t\tDECIFRA-ME OU DEVORO-TE!\n"
				+ "\nQue criatura pela manhã tem quatro pés, a tarde tem dois, e à noite tem três? \n\n";
		n12.pergunta();
		n12.pontos();
		
		Nivel n13 = new Nivel();
		n13.nivel = "Nível 13";
		n13.certo = "archimedes";
		n13.text = "\n\t\tEUREKA!! EUREKA!!\n\n";
		n13.pergunta();
		n13.pontos();
		
		Nivel n14 = new Nivel();
		n14.nivel = "Nível 14";
		n14.certo = "sabado";
		n14.text = "\n\t\t\tmodo gin\n\t\t\tadeus farine\n\t\t\tfaça rei ter\n\t\t\trifar ataque\n\t\t\tetnia faquir\n\t\t\tafixar tese\n\t\t\t   ???\n\n";
		n14.parametro  = "sim";
		n14.dica = "\n\nama grama\n\n";
		n14.pergunta();
		n14.pontos();
		
		Nivel n15 = new Nivel();
		n15.nivel = "Nível 15";
		n15.certo = "relogio";
		n15.text = "\nNuma pista circular\ndois caminham sem tumulto.\nA criança dá uma volta,\numa dúzia anda o adulto.\n\n";
		n15.parametro = "hora";
		n15.dica = "\n\nquase lá...\n\n";
		n15.pergunta();
		n15.pontos();
		
		Nivel n16 = new Nivel();
		n16.nivel = "Nível 16";
		n16.certo = "ades";
		n16.text = "\nirom xybmoB\n   odicet\n\n";
		n16.parametro = "seda";
		n16.dica = "\n\nsiga o padrão\n\n";
		n16.pergunta();
		n16.pontos();
		
		Nivel n17 = new Nivel();
		n17.nivel = "Nível 17";
		n17.certo = "dezembro";
		n17.text = "\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\t\tembro\n\n";
		n17.pergunta();
		n17.pontos();
		
		Nivel n18 = new Nivel();
		n18.nivel = "Nível 18";
		n18.certo = "balonismo";
		n18.text = "\n\t5 13 8 28 16 42\nnão o shostakovich, nem o pozharky\n\n";
		n18.parametro = "dmitri";
		n18.dica = "\n\nQual Dmitri?\n\n";
		n18.pergunta();
		n18.pontos();
		
		Nivel n19 = new Nivel();
		n19.nivel = "Nível 19";
		n19.certo = "melancia";
		n19.text = "\n\t\t4566 m\n\t\t8848 m\n\t\t8516 m\n\t\t6962 m\n\t\t4609 m\n\t\t5897 m\n\t\t6438 m\n\t\t5947 m\n\n";
		n19.pergunta();
		n19.pontos();
		
		Nivel n20 = new Nivel();
		n20.nivel = "Nível 20";
		n20.certo = "zq";
		n20.text = "\n\t\tcomunismo\n\t\tcérebro criativo\n\t\tteclas agudas\n\t\tfacas, colheres e copos\n\t\tpróxima página\n\t\tmão inglesa\n\t\tbarra de rolagem\n\t\ttouro em guernica\n\t\tmetais alcalinos\n\t\tteclado numérico\n\t\tmenu iniciar\n\t\tleste\n\t\tcoração\n\t\ttorneira de água quente\n\t\tnove horas\n\t\trei branco\n\t\t   0 1\n\n";
		n20.pergunta();
		n20.pontos();
		
		Nivel n21 = new Nivel();
		n21.nivel = "Nível 21";
		n21.certo = "liberdade";
		n21.text = "\nEm uma retrospectiva você achará dicas para prosseguir com o enigma\n\n";
		n21.parametro = "chave";
		n21.dica = "\n\nseu símbolo\n\n";
		n21.pergunta();
		n21.pontos();
		
		Nivel n22 = new Nivel();
		n22.nivel = "Nível 22";
		n22.certo = "esta indo bem";
		n22.text = "\n. ... - .- -··-· .. -. -.. --- -··-· -... . --\n\n";
		n22.pergunta();
		n22.pontos();
		
		Nivel n23 = new Nivel();
		n23.nivel = "Nível 23";
		n23.certo = "budapeste hungria";
		n23.text = "\n\t\t\tcolónia alemanha\n\t\t\tmilão itália\n\t\t\tB=3,14155926535\n\t\t\tpoznan polônia\n\n";
		n23.pergunta();
		n23.pontos();
		
		Nivel n24 = new Nivel();
		n24.nivel = "Nível 24";
		n24.certo = "oculto";
		n24.parametro = "sair";
		n24.dica = "\npense melhor você consegue\n";
		n24.pergunta();
		n24.web();
		n24.pontos();
	}

}
