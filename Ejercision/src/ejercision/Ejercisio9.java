package ejercision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercisio9 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "What's your name?");
		
		String Prefijo = " ";
		
		List<String> laLista = wordsFromStr(nombre);
		if(laLista.size() > 1){
			String penultimo = laLista.get(laLista.size()-2);
			
			if (  Arrays.asList("miss","mr","mrs","Miss","Mr","Mrs","don","Don","Dr","dr","Dc","dc","sr","Sr","Proffesor","proffesor","Profesor","profesor","Ms","ms","Doña","doña").contains(penultimo)  ){
				Prefijo = penultimo + " ";
			}
		}
		
		String ultimo = laLista.get(laLista.size()-1);
		
		System.out.println(laLista);
		
		
		
		JOptionPane.showMessageDialog(null, "Hola " + Prefijo + ultimo, "Greeting", JOptionPane.INFORMATION_MESSAGE);
		
		
		String EstadoDeHumor = JOptionPane.showInputDialog(null, "How are you doing?" + ultimo);
		
		nombre = ultimo;
		
		laLista = wordsFromStr(EstadoDeHumor);
		
		List<String> statesOfHumor3 = new ArrayList<String>();
		List<String> statesOfHumor2 = new ArrayList<String>();
		List<String> statesOfHumor1 = new ArrayList<String>();
		
		statesOfHumor3.add("good");
		statesOfHumor3.add("Good");
		
		statesOfHumor1.add("bad");
		statesOfHumor1.add("Bad");
		
		statesOfHumor2.add("normal");
		statesOfHumor2.add("Normal");
		
		boolean Done = false;
		
		
		for(String s : statesOfHumor3){
			if (  Arrays.asList(laLista).contains(s)){
				JOptionPane.showMessageDialog(null, "I am having a happy day to!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
				Done = true;
				break;
			}
		}
		
		if (Done == false){
			for(String s : statesOfHumor2){
				if (  Arrays.asList(laLista).contains(s)){
					JOptionPane.showMessageDialog(null, "Oh, well that's cool", "Greeting", JOptionPane.INFORMATION_MESSAGE);
					Done = true;
					break;
				}
			}
		}
		
		if (Done == false){
			for(String s : statesOfHumor1){
				if (  Arrays.asList(laLista).contains(s)){
					JOptionPane.showMessageDialog(null, "Oh you poor thing!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
					Done = true;
					break;
				}
			}
		}
		
		

		
		
		
	}

	private static List<String> wordsFromStr(String str) {
		
		String NewStr = "";
		List<String> Words = new ArrayList<String>();
		
		int N = 0;
		while (N < str.length()){
			if(str.charAt(N) == ' '){
				Words.add(NewStr);
				NewStr = "";
			}else{
				NewStr = "" + NewStr + str.charAt(N);
			}
			N += 1;
		}
		
		Words.add(NewStr);

		return Words;
	}

}


