//definiçao do pacote
package br.com.senaitagua.sa1.app8;
import java.awt.FlowLayout;

//importação do pacote swing
import javax.swing.*;

//Como que é a herança em Java?
//herdando a classe JFrame
public class TelaAposentadoria extends JFrame{ //herança
	//Definindo um componente swing - título
	JLabel titulo;
	//Definindo componentes swing - botões
	JButton btnGravar, btnLer, btnLimpar;
	//Definindo uma caixa de texto para strings longas
	JTextArea txtArea;
	
	//construtor 
	public TelaAposentadoria() {
		//referenciando o pai (superclasse)
		super("Aplicativo 8");
		getContentPane().setLayout(new FlowLayout());
		//instanciação do objeto l1
		titulo = new JLabel ("Aplicativo 8 - Aposentadoria do Piloto");
		//instanciação dos botões
		btnGravar = new JButton("Gravar");
		btnLer = new JButton("Ler");
		btnLimpar = new JButton("Limpar");
		//instanciação da Área de texto
		txtArea = new JTextArea(5,10);
		getContentPane().add(titulo);
		getContentPane().add(txtArea);
		getContentPane().add(btnGravar);
		getContentPane().add(btnLer);
		getContentPane().add(btnLimpar);
		setSize (800,600);
	}

}
