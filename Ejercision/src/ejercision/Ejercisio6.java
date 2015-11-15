package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio6 {

	public static void main(String[] args) {
		int B = -1;
		if (B < 0){
			ME("NEGATIVE","");
		}else{
			ME("POSITIVE","");
		}

	}

	private static void ME(String Message,String Title) {
		JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.INFORMATION_MESSAGE);
		System.out.println(Message);
	}
	
	
}
