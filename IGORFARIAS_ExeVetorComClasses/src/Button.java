import javax.swing.JFrame;
import javax.swing.JButton;

public class Button extends JFrame{
	private JButton randomVector, randomOrdenatedVector, insertValue;
	
	public Button() {
		super("Criando botões");
		randomVector = new JButton("criar vetor randomico.");
		add(randomVector);
	}
}
