package ProjectCoreJava;
import java.util.*;
public class CategoryList {
	int Categorycode;
	String name;
	List catogories=new ArrayList();//Collection Object can be created as instance
	public CategoryList() {
		
	}
	public CategoryList(int Categorycode, String name) {
	
		this.Categorycode = Categorycode;
		this.name = name;
		
	}
	public void initializingCategory() {
		catogories.add(new CategoryList (10,"Gadgets"));
		catogories.add(new CategoryList (11,"Groceries"));
		catogories.add(new CategoryList (12,"Electrical Appliance"));
		catogories.add(new CategoryList (13,"Kitchen Accessories"));	
	}
	public void iterateCategory() {
		
		
	
		
		Iterator it =catogories.iterator();
		while(it.hasNext()) {
			CategoryList e1= (CategoryList)it.next();
			System.out.println(e1.Categorycode+"  "+e1.name);
		}
		
	}
	
	
	public boolean codeCheckCategory(int code) {
		boolean bol=true;
		Iterator it =catogories.iterator();
		One:{
		while(it.hasNext()) {
		CategoryList e1= (CategoryList)it.next();
		int a= e1.Categorycode;
		if(code==a) {
			bol=false;
			break One;
		}
		else {
			bol=true;
		}
		
		
	}
	}
		return bol;
	}

	public static void main(String[] args) {
		CategoryList n1=new CategoryList();
		n1.iterateCategory();
	}
}
