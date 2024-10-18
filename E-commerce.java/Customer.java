package ProjectCoreJava;
import java.util.*;
public class Customer {
	int cc;
	int ic;
	int pc;
	int number;
public static void main(String[] args) {
	int input=0;
	int modifyInput=0;
	boolean shoploop=false;
	Customer c1=new Customer ();
	Scanner s1= new Scanner(System.in);
	CategoryList n1=new CategoryList();
	ItemList n2=new ItemList();
	ProductList n3=new ProductList();
	Cart n4= new Cart();
	n1.initializingCategory();
	n2.initializingItem();
	System.out.println(".................Welcome to Amazon...................");
	
	do {
		 shoploop=false;
	n1.iterateCategory();
	Boolean bol;
	do {
	System.out.println("Enter the Category code");
	
	
	 c1.cc= s1.nextInt();
	bol=n1.codeCheckCategory(c1.cc);
	if(bol==true)System.out.println("Enter Correct code");;
	}while(bol);
	
	
	
	n2.iterateItem(c1.cc);

	do {
	System.out.println("Enter the Itemcode ");
	c1.ic= s1.nextInt();
	bol=n2.codeCheckItem(c1.cc, c1.ic);
	if(bol==true)System.out.println("Enter the Correct code");;
	}while(bol);
	
	
	
	n3.iterateProduct(c1.ic);
	
	System.out.println("Enter the Product code");
	c1.pc= s1.nextInt();
	System.out.println("Enter the Number of units you want: ");
	c1.number= s1.nextInt();
	
	
	
	n4.toCart(c1.pc, c1.number);
	System.out.println("Enter 1 to View Cart:");
	System.out.println("Enter 2 to Shop Again:");
	System.out.println("Enter 3 to Buy :");
	input= s1.nextInt();
	if(input==1) {
		n4.viewCart();
		System.out.println("Enter 2 to Shop Again:");
		System.out.println("Enter 3 to Place the Order :");
		System.out.println("Enter 4 to Modify cart:");
		input= s1.nextInt();
		
		
	}
	
	if (input==4) {
		
		boolean boll=false;
		do {
			boll=false;
			modifyInput=0;
		n4.modifyCart();
		System.out.println("Enter 5 to Modify the cart further:");
		System.out.println("Enter 2 to Shop Again:");
		System.out.println("Enter 3 to Place the Order :");
		modifyInput=s1.nextInt();
		if(modifyInput==5)boll=true;;
		if(modifyInput!=5)input=modifyInput;
		}while(boll);
		
	}//Here or Outside the Loop?//
	if (input==2)shoploop=true;;
	}while(shoploop);
	
	
	if(input==3) {
	int total= n4.billing();
	System.out.println("Your Total is: "+total);
	String a="DISCOUNT20";
	System.out.println("For Extra 20% discount enter the code: "+a);
	String b= s1.next();
	if(a.equals(b)) {
		total=((total*80)/100);
		System.out.println("Coupoun Applied!");
	}
	System.out.println("Your New Total is: "+total+" rupees");
	System.out.println("Your Order has been Placed. Thank you!");
	
	
	}
	
	}

}
