package folders;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Dione
 *
 */
public class Client {

	public static void main(String[] args) {

		JLabel title= new JLabel(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>( LOJA DE QUADRINHOS  )<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		JButton button1= new JButton("01-Caixa Nivel (Bronze): 01.Quadrinhos:R$ 15,00;"
			                                                        + " 02.Chaveiros: R$5,00;"
			                                                        + " 03.Bustos: R$10,00"); 
		
		JButton button2= new JButton("02-Caixa Nivel. (Prata): 01.Quadrinhos: 15,00;"
				                                                    + " 02.Chaveiros: R$5,00;"
				                                                    + " 03.Bustos: R$10,00;"
				                                                    + " 04.Adesivos: R$1,00;"
				                                                    + " 05.Postes: R$25,00 "); 
				                                                
		JButton button3= new JButton("03-Caixa Nivel (Ouro): 01.Quadrinhos: 15,00;"
                                                                   + " 02.Chaveiros: R$5,00;"
                                                                   + " 03.Bustos R$10,00;"
                                                                   + " 04.Adesivos: R$1,00;"
                                                                   + " 05.Postes R$25,00;"
                                                                   + " 06.Camisetas: R$25,00;"
                                                                   + " 07.Canetas: R$3,00"); 
                                                               
		
		JButton button4= new JButton("04-Caixa Nivel (Platina): 01. Quadrinhos: 15,00;"
                                                                   + "02. Chaveiros: R$5,00;"
                                                                   + "03. Bustos R$10,00;"
                                                                   + "04. Adesivos: R$1,00;"
                                                                   + "05. Postes R$25,00;"
                                                                   + "06. Camisetas: R$25,00;"
                                                                   + "07. Canetas: R$3,00;"
                                                                   + "08. Miniaturas:R$20,00;"
                                                                   + "09. Adesivos: R$1,00;"
                                                                   + "10. Canetas: R$3,00 "); 
	
		JPanel panel = new JPanel(new FlowLayout()); //conteiner
        panel.add(button1);  
 		panel.add(button2);  
 	    panel.add(button3);  
 	    panel.add(button4);
 	   
		JFrame frame =new JFrame();  
		frame.setLayout(new BorderLayout());
		frame.add(title, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(1370,200);  
		frame.setVisible(true);
	
	}
}

