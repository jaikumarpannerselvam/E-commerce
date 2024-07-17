package ProjectCoreJava;
import java.util.*;

public class Cart {
	int productCode;
	int number;
	List<Cart> CartList= new ArrayList();
	Scanner s1=new Scanner(System.in);
	public Cart() {}
	public Cart(int productCode, int number) {
		
		this.productCode = productCode;
		this.number = number;
		
	}
	
public void toCart(int productCode, int number) {
		
		CartList.add(new Cart(productCode,number));
		
		
		System.out.println(productCode+" * "+number+" Added to your cart!");
		
	}

public void viewCart() {
	
	
	System.out.println("................Cart.......................");
	Iterator it=CartList.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
}
@Override
public String toString() {///WHY?????????????????????????
	return "Cart [productCode: " + productCode + ", number: " + number + "]";
}
public int billing() {
	int total= 0;
	ProductList n1= new ProductList();
	//n1.iterateProduct(0);
	Iterator it= CartList.iterator();
	while(it.hasNext()) {
	Cart e1=(Cart)it.next();
	n1.iterateProduct(0);//Dummy .Why????????????????????
	int price=n1.toBilling(e1.productCode);
	
	total=total+(price*e1.number);
	
	
	}
	return total;
}
int pdtModify=0;
int pdtNumber=0;

public void modifyCart() {
	
	System.out.println("Enter the Product code you need to make changes");
	pdtModify= s1.nextInt();
	System.out.println("Enter the Number of "+pdtModify+" you need to add to the cart");
	pdtNumber= s1.nextInt();
	Iterator it= CartList.iterator();
	while(it.hasNext()) {
	Cart e1=(Cart)it.next();
	if(e1.productCode==pdtModify)e1.number=pdtNumber;
	
	
	
	}
	System.out.println("Cart Modified!");
	viewCart();
}
public static void main(String[] args) {
	 Cart obj = new Cart();
	System.out.println( obj.billing());
}
}