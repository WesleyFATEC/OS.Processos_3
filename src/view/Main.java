package view;
import javax.swing.JOptionPane;

import controller.DistroController;
public class Main {

	public static void main(String[] args) {
		String opc [] = {"Mostrar distro", "Sair"};
		DistroController dc = new DistroController();
		int choice = JOptionPane.showOptionDialog(null, "Mostrar Distro Linux", "Menu", 0, 0, null, opc, opc[0]);
		switch (choice){
		case 0:
			dc.exibdistro();
			break;
		case 1:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Escolha entre uma opção");
			break;
		}

	}

}
