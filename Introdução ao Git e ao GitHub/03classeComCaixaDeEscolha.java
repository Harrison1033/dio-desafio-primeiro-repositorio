import javax.swing.JOptionPane;
public class Less2 {
//Programa de escolha de opções
	public static void main(String[] args) {
		Object [] op = {"Caneta", "Lápis", "Borracha", "Apontador"};
		String resp = (String)JOptionPane.showInputDialog(null, "Selecione o Ítem:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Caneta");
		if (resp == null) {
			JOptionPane.showMessageDialog(null, "Opção Cancelada");
		}
		if (resp.equals("Caneta")) {
			JOptionPane.showMessageDialog(null, "Caneta esferográfica");
		}
		if (resp.equals("Lápis")) {
			JOptionPane.showMessageDialog(null, "Lápis escolar HB");
		}
		if (resp.equals("Borracha")) {
			JOptionPane.showMessageDialog(null, "Borracha escolar");
		}
		if (resp.equals("Apontador")) {
			JOptionPane.showMessageDialog(null, "Apontador de acrílico");
		}
		System.exit(0);
		
	}

}