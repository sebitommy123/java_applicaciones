package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio7 {

	public static void main(String[] args) {
		int C =0;
		if (C < 0){
			ME("Negative","");
		}else{
				ME("Positive","");
		}
		
		
		
		if(C % 2 == 0){
			ME("EVEN","");
		}else{
			ME("ODD","");
		}
		
		if(C == 0){
			ME("C es 0, no tiene multiples aparte de si mismo","");
		}else{
			if(C % 5 == 0){
				ME("ES MULTIPLE DE 5","");
			}else{
				ME("NO ES MULTIPLE DE 5","");
			}
			
			
			if(C % 10 == 0){
				ME("ES MULTIPLE DE 10","");
			}else{
				ME("NO ES MULTIPLE DE 10","");
			}
		}
		
		
		if(C > 100){
			ME("Es mas de 100","");
		}else{
			if(C < 100){
				ME("Es menos de 100","");
			}else{
				ME("C es 100","");
			}
		}
		

	}
	
	private static void ME(String Message,String Title) {
		JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.INFORMATION_MESSAGE);
		System.out.println(Message);
	}

}
