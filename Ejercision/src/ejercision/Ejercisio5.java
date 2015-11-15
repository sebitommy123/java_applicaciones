package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio5 {

	public static void main(String[] args) {
		int A = 1273567;
		double TotalA = A;
		
		if(A % 2 == 0){
			ME("ODD","");
		}else{
			ME("EVEN","");
		}
		
		
		
		
		
	}
	
	private static void ME(String Message,String Title) {
		JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.INFORMATION_MESSAGE);
		System.out.println(Message);
	}
	
}
