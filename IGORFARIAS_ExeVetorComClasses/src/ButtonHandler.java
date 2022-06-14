import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;



public class ButtonHandler implements ActionListener{
	private JButton randomVector, randomOrdenatedVector, insertValue, printVector;
	public IGORFARIAScVetor vetor;
	
	
	public ButtonHandler(IGORFARIAScVetor vet, JButton randomVector, JButton randomOrdenatedVector, JButton insertValue, JButton printVector) {
		this.randomVector = randomVector;
		this.randomOrdenatedVector = randomOrdenatedVector;
		this.insertValue = insertValue;
		this.printVector = printVector;
		this.vetor = vet;

	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == randomVector) {
			JOptionPane.showMessageDialog(null, "Vetor povoado com números aleatorios");
			vetor.randomVector();
		}  else if(evento.getSource() == randomOrdenatedVector) {
			JOptionPane.showMessageDialog(null, "Vetor povoado com números ordenados");
			vetor.randomOrdenatedVector();
		}	else if(evento.getSource() == insertValue) {
			int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite um a posição do vetor em que você deseja alterar?"));
			int value = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que você deseja colocar: "));
			vetor.insertValue(pos, value);
		}  else if(evento.getSource() == printVector) {
			vetor.printVector();
			System.out.println(vetor.vectorLength());
		}	
		
	}
}
