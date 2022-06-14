import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Button extends JFrame{
	private JButton randomVector = new JButton("criar vetor randomico.");
	private JButton randomOrdenatedVector = new JButton("criar vetor randomico ordenado");
	private JButton insertValue = new JButton("Inserir valor em determinada posição");
	private JButton printVector = new JButton("Mostrar o vetor");
	private ButtonHandler handler;
	public IGORFARIAScVetor vet;
	
	public Button(int vetSize) {
		super("Criando botões");
		vet = new IGORFARIAScVetor(vetSize);
		
		setLayout(new FlowLayout());
		handler = new ButtonHandler(vet, randomVector, randomOrdenatedVector, insertValue, printVector);
		
		
		randomVector.addActionListener(handler);
		add(randomVector);
		randomOrdenatedVector.addActionListener(handler);
		add(randomOrdenatedVector);
		insertValue.addActionListener(handler);
		add(insertValue);
		printVector.addActionListener(handler);
		add(printVector);
/*		
		"-- 4)  Ordenar o vetor - bubble Short. \n" +
		"-- 5)  Ordenar o vetor - Selection Short. \n" +
		"-- 6)  Ordenar o vetor - insert Short. \n" +
		"-- 7) apagar um valor do vetor - escolhendo qual o elemento que devera ser \"zerado\"\n" +
		"-- 8) consultar se existe determinado valor no vetor - por forca bruta\n" +
		"-- 9) consultar se existe determinado valor no vetor - por binario interativa\n" +
		"-- 10) consultar se existe determinado valor no vetor - por binario recursiva\n" +
		"-- 11) consultar quantos valores j� ocupam o vetor\n" +
		"-- 12) consultar qual o maior valor armazenado no vetor e indicar qual o elemento que cont�m esse valor\n" +
		"-- 13) consultar qual o menor valor armazenado no vetor e indicar qual o elemento que cont�m esse valor\n" +
		"-- 14) apresentar uma listagem dos valores armazenados no vetor\n" +
		"-- 0) sair do programa \n");
implementar o restante do menu
*/	
	}
}
