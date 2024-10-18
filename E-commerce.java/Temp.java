package ProjectCoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temp {
	int Categorycode;
	String name;
	public Temp() {
		
	}
	public Temp(int Categorycode, String name) {
	
		this.Categorycode = Categorycode;
		this.name = name;
		
	}
	//Collection Object can be created as instance
	//int a=1;
	public void iterateCategory() {
		
	//	a++;
		List catogories=new ArrayList();
		catogories.add(new CategoryList (10,"Gadgets"));
		catogories.add(new CategoryList (11,"Groceries"));
		catogories.add(new CategoryList (12,"Electrical Appliance"));
		catogories.add(new CategoryList (13,"Kitchen Accessories"));
		
		Iterator it =catogories.iterator();
		while(it.hasNext()) {
			CategoryList e1= (CategoryList)it.next();
			System.out.println(e1.Categorycode+"  "+e1.name);
		}
		//System.out.println("Repeated  "+a);
	}
	public static void main(String[] args) {
		Temp n1= new Temp();
		n1.iterateCategory();
		System.out.println("................................................ ");
		n1.iterateCategory();
	}
}
