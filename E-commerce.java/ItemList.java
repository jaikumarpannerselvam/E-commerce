package ProjectCoreJava;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//Classfor Category;

	


public class ItemList {
	int Itemcode;
	String name;
	List gadget=new ArrayList();
	List groceries=new ArrayList();
	List EAppliance=new ArrayList();
	List KitchenAccessories=new ArrayList();
	
	public ItemList() {}
	public ItemList(int code, String name) {
	
		this.Itemcode = code;
		this.name = name;
		
	}
public void initializingItem() {
		
	gadget.add(new ItemList(101,"Earpods"));
	gadget.add(new ItemList(102,"eWatch"));
	gadget.add(new ItemList(103,"Mobile"));
	gadget.add(new ItemList(104,"Tablets"));
	

	groceries.add(new ItemList(111,"Fruits"));
	groceries.add(new ItemList(112,"Vegetables"));
	groceries.add(new ItemList(113,"Oil"));
	groceries.add(new ItemList(114,"Masalas"));
	
	EAppliance.add(new ItemList(121,"Washing Machine"));
	EAppliance.add(new ItemList(122,"Refridegerator"));
	EAppliance.add(new ItemList(123,"Air Conditioner"));
	EAppliance.add(new ItemList(124,"DishWasher"));
	
	KitchenAccessories.add(new ItemList(131,"Cooker"));
	KitchenAccessories.add(new ItemList(132,"Electric Stove"));
	KitchenAccessories.add(new ItemList(133,"Electric Oven"));
	KitchenAccessories.add(new ItemList(134,"Food Processer"));
		
	}
	public void iterateItem(int categoryCode) {
		
		
		
	Iterator it1 = gadget.iterator();
	Iterator it2 = groceries.iterator();
	Iterator it3 = EAppliance.iterator();
	Iterator it4 = KitchenAccessories.iterator();
	Iterator it= gadget.iterator();////Dummy initialisation
	if(categoryCode==10)it=it1;
	if(categoryCode==11)it=it2;
	if(categoryCode==12)it=it3;
	if(categoryCode==13)it=it4;
	
	while(it.hasNext()) {
		ItemList e1= (ItemList)it.next();
		System.out.println(e1.Itemcode+"  "+e1.name);
	}	
		
	}
	
	
	
	public boolean codeCheckItem(int categoryCode, int code) {
		boolean bol=true;
		Iterator it1 = gadget.iterator();
		Iterator it2 = groceries.iterator();
		Iterator it3 = EAppliance.iterator();
		Iterator it4 = KitchenAccessories.iterator();
		Iterator it= gadget.iterator();////Dummy initialisation
		if(categoryCode==10)it=it1;
		if(categoryCode==11)it=it2;
		if(categoryCode==12)it=it3;
		if(categoryCode==13)it=it4;
		One:{
			//System.out.println(itt.hasNext());
		while(it.hasNext()) {
		ItemList e1= (ItemList)it.next();
		//System.out.println("equalllllllllll");
		int a= e1.Itemcode;
		if(code==a) {
			//System.out.println("equal");
			bol=false;
			break One;
		}
		else {
			bol=true;
			//System.out.println("not ");
		}
		
		
	}
	}
		return bol;
	}
	
	
	
	
	public static void main(String[] args) {
		ItemList n2=new ItemList();
		n2.iterateItem(10);
		boolean bol=n2.codeCheckItem(10,104);
		System.out.println(bol);
	}
	

}







