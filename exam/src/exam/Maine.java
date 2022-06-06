package src.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Addvalues{

	public void sortvaluees(ArrayList<String> values) {
		
		
			System.out.println(values.contains("5"));
	}
}

class Pass extends Addvalue {

	public void passvalue(ArrayList<String> values) {
		// TODO Auto-generated method stub
		Addvalue b = new Addvalue();
		b.sortvalues(values);
	}
}
class Maine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> values = new ArrayList<String>();
		for(int i =0; i<5; i++) {
			values.add(sc.nextLine());
		}
		
		Pass a = new Pass();
		a.passvalue(values);

	}
	
	

}
