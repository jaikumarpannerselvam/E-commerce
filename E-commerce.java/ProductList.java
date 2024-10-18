package ProjectCoreJava;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProductList {
	int categoryCode;
	int itemCode;
	int productCode;
	String name;
	String Brandname;
	int price;
	int discount;
	
	LinkedHashMap<Integer,ProductList> Products=new LinkedHashMap();
	//LinkedHashMap<Integer,ProductList> Fruits=new LinkedHashMap();
	public ProductList() {}
	
	public ProductList(int categoryCode,int itemCode, int productCode, String name, String brandname, int price, int discount) {
		this.categoryCode=categoryCode;
		this.itemCode = itemCode;
		this.productCode = productCode;
		this.name = name;
		this.Brandname = brandname;
		this.price = price;
		this.discount = discount;
	}
	
	public void  iterateProduct(int itemCodeRecieved) {
		ProductList n1=new ProductList(10,101,1011,"Earbuds X100","Boat",2500,17);
		ProductList n2=new ProductList(10,101,1012,"Earpods s11","Apple",17500,9);
		ProductList n3=new ProductList(10,101,1013,"Earbuds M-414","Moto",1900,13);
		ProductList n4=new ProductList(10,101,1014,"Earpods c-55","Boat",3199,21);
		ProductList n5=new ProductList(10,101,1015,"Earpods Pro","Sony",3999,15);
		Products.put(n1.productCode,n1 );
		Products.put(n2.productCode,n2 );
		Products.put(n3.productCode,n3 );
		Products.put(n4.productCode,n4 );
		Products.put(n5.productCode,n5 );
		ProductList n6=new ProductList(10,102,1021,"eWatch X100","Boat",3500,21);
		ProductList n7=new ProductList(10,102,1022,"eWatch s11","Apple",27500,10);
		ProductList n8=new ProductList(10,102,1023,"eWatch M-414","Moto",3100,33);
		ProductList n9=new ProductList(10,102,1024,"eWatch c-55","Boat",4599,20);
		ProductList n10=new ProductList(10,102,1025,"eWatch Pro","Sony",7999,10);
		Products.put(n6.productCode,n6 );
		Products.put(n7.productCode,n7 );
		Products.put(n8.productCode,n8 );
		Products.put(n9.productCode,n9 );
		Products.put(n10.productCode,n10 );
		ProductList n11=new ProductList(10,103,1031,"Mobile X100","Realmi",21000,11);
		ProductList n12=new ProductList(10,103,1032,"Mobile s11","Apple",91500,3);
		ProductList n13=new ProductList(10,103,1033,"Mobile M-414","Oppo",18000,23);
		ProductList n14=new ProductList(10,103,1034,"Mobile c-55","One Plus",23199,10);
		ProductList n15=new ProductList(10,103,1035,"Mobile Pro","Samsung",43999,13);
		Products.put(n11.productCode,n11 );
		Products.put(n12.productCode,n12 );
		Products.put(n13.productCode,n13 );
		Products.put(n14.productCode,n14 );
		Products.put(n15.productCode,n15 );
		ProductList n16=new ProductList(10,104,1041,"Tab X100","Realmi",21000,11);
		ProductList n17=new ProductList(10,104,1042,"Tab s11","Apple",91500,3);
		ProductList n18=new ProductList(10,104,1043,"Tab M-414","Toshiba",18000,23);
		ProductList n19=new ProductList(10,104,1044,"Tab c-55","Lenovo",23199,10);
		ProductList n20=new ProductList(10,104,1045,"Tab Pro","Samsung",43999,13);
		Products.put(n16.productCode,n16 );
		Products.put(n17.productCode,n17 );
		Products.put(n18.productCode,n18 );
		Products.put(n19.productCode,n19 );
		Products.put(n20.productCode,n20 );
		
		
		
		
		ProductList n21=new ProductList(11,111,1111,"Mango","Farm side",120,7);
		ProductList n22=new ProductList(11,111,1112,"Banana","Organoo",80,19);
		ProductList n23=new ProductList(11,111,1113,"Kiwi","Daily Fresh",200,23);
		ProductList n24=new ProductList(11,111,1114,"Avacado","From Heavens",310,11);
		ProductList n25=new ProductList(11,111,1115,"PineApple","Fruit Plus+",99,14);
		Products.put(n21.productCode,n21 );
		Products.put(n22.productCode,n22 );
		Products.put(n23.productCode,n23 );
		Products.put(n24.productCode,n24 );
		Products.put(n25.productCode,n25 );
		ProductList n26=new ProductList(11,112,1121,"Potato","Farm side",40,7);
		ProductList n27=new ProductList(11,112,1122,"Tomato","Organoo",30,3);
		ProductList n28=new ProductList(11,112,1123,"Brinjal","Daily Fresh",20,2);
		ProductList n29=new ProductList(11,112,1124,"Carrot","From Heavens",10,5);
		ProductList n30=new ProductList(11,112,1125,"Cabbage","Fruit Plus+",45,4);
		Products.put(n26.productCode,n26 );
		Products.put(n27.productCode,n27 );
		Products.put(n28.productCode,n28 );
		Products.put(n29.productCode,n29 );
		Products.put(n30.productCode,n30 );
		ProductList n31=new ProductList(11,113,1131,"Ground Nut Oil","Idhayam",410,7);
		ProductList n32=new ProductList(11,113,1132,"Olive Oil","Mr Gold",390,3);
		ProductList n33=new ProductList(11,113,1133,"Coconut Oil","VVD",420,2);
		ProductList n34=new ProductList(11,113,1134,"Gingly Oil","Manthra",411,5);//Spelling
		ProductList n35=new ProductList(11,113,1135,"SunFlower Oil","Sun Flower",425,4);
		Products.put(n31.productCode,n31 );
		Products.put(n32.productCode,n32 );
		Products.put(n33.productCode,n33 );
		Products.put(n34.productCode,n34 );
		Products.put(n35.productCode,n35 );
		ProductList n36=new ProductList(11,114,1141,"Chicken Masala","Aachi",40,7);
		ProductList n37=new ProductList(11,114,1142,"Sambar Powder","Shathi Masala",30,3);
		ProductList n38=new ProductList(11,114,1143,"Rasam Powder","Maharaja",20,2);
		ProductList n39=new ProductList(11,114,1144,"Mutton Masala","Everest",41,5);//Spelling
		ProductList n40=new ProductList(11,114,1145,"Garam  Masala","MTR",25,4);
		Products.put(n36.productCode,n36 );
		Products.put(n37.productCode,n37 );
		Products.put(n38.productCode,n38 );
		Products.put(n39.productCode,n39 );
		Products.put(n40.productCode,n40 );
		
		
		ProductList n41=new ProductList(12,121,1211,"Washing Machine X141","IFB",41110,31);
		ProductList n42=new ProductList(12,121,1212,"Washing Machine Pro","Samsung",33390,33);
		ProductList n43=new ProductList(12,121,1213,"Washing Machine MAX","WhirlPool",24220,22);
		ProductList n44=new ProductList(12,121,1214,"Washing Machine s11","Hier",31411,15);//Spelling
		ProductList n45=new ProductList(12,121,1215,"Washing Machine 1541","LG",11425,34);
		Products.put(n41.productCode,n41 );
		Products.put(n42.productCode,n42 );
		Products.put(n43.productCode,n43 );
		Products.put(n44.productCode,n44 );
		Products.put(n45.productCode,n45 );
		ProductList n46=new ProductList(12,122,1221,"Refridegerator X141","IFB",21410,17);
		ProductList n47=new ProductList(12,122,1222,"Refridegerator Pro","Samsung",31390,8);
		ProductList n48=new ProductList(12,122,1223,"Refridegerator MAX","WhirlPool",21420,12);
		ProductList n49=new ProductList(12,122,1224,"Refridegerator s11","Hier",33411,15);//Spelling
		ProductList n50=new ProductList(12,122,1225,"Refridegerator 1541","LG",44215,14);
		Products.put(n46.productCode,n46 );
		Products.put(n47.productCode,n47 );
		Products.put(n48.productCode,n48 );
		Products.put(n49.productCode,n49 );
		Products.put(n50.productCode,n50 );
		ProductList n51=new ProductList(12,123,1231,"Air Conditioner X141","IFB",21410,17);
		ProductList n52=new ProductList(12,123,1232,"Air Conditioner Pro","Samsung",41390,8);
		ProductList n53=new ProductList(12,123,1233,"Air Conditioner MAX","Bosch",31420,12);
		ProductList n54=new ProductList(12,123,1234,"Air Conditioner s11","Blue Star",35411,15);//Spelling
		ProductList n55=new ProductList(12,123,1235,"Air Conditioner 1541","LG",41215,14);
		Products.put(n51.productCode,n51 );
		Products.put(n52.productCode,n52 );
		Products.put(n53.productCode,n53 );
		Products.put(n54.productCode,n54 );
		Products.put(n55.productCode,n55 );
		ProductList n56=new ProductList(12,124,1241,"DishWasher X141","IFB",31410,17);
		ProductList n57=new ProductList(12,124,1242,"DishWasher Pro","Samsung",31390,8);
		ProductList n58=new ProductList(12,124,1243,"DishWasher MAX","Bosch",21420,12);
		ProductList n59=new ProductList(12,124,1244,"DishWasher s11","Blue Star",25411,15);//Spelling
		ProductList n60=new ProductList(12,124,1245,"DishWasher 1541","LG",21215,14);
		Products.put(n56.productCode,n56 );
		Products.put(n57.productCode,n57 );
		Products.put(n58.productCode,n58 );
		Products.put(n59.productCode,n59 );
		Products.put(n60.productCode,n60 );
		
		
		ProductList n61=new ProductList(13,131,1311,"Cooker 5 Litre","Preethi",1410,17);
		ProductList n62=new ProductList(13,131,1312,"Cooker 2.5 Litre","Indus Valley",3390,8);
		ProductList n63=new ProductList(13,131,1313,"Cooker 3 Litre","Mayer",2120,12);
		ProductList n64=new ProductList(13,131,1314,"Cooker 4 Litre","Butterfly",5411,15);//Spelling
		ProductList n65=new ProductList(13,131,1315,"Cooker 7 Litre","Premier",1215,14);
		Products.put(n61.productCode,n61 );
		Products.put(n62.productCode,n62 );
		Products.put(n63.productCode,n63 );
		Products.put(n64.productCode,n64 );
		Products.put(n65.productCode,n65 );
		ProductList n66=new ProductList(13,132,1321,"Electric Stove 550W","Preethi",2410,17);
		ProductList n67=new ProductList(13,132,1322,"Electric Stove S11","Indus Valley",3130,8);
		ProductList n68=new ProductList(13,132,1323,"Electric Stove Pro Max","Mayer",2220,12);
		ProductList n69=new ProductList(13,132,1324,"Electric Stove Quic Heat","Butterfly",2511,15);//Spelling
		ProductList n70=new ProductList(13,132,1325,"Electric Stove Energy+","Premier",2125,14);
		Products.put(n66.productCode,n66 );
		Products.put(n67.productCode,n67 );
		Products.put(n68.productCode,n68 );
		Products.put(n69.productCode,n69 );
		Products.put(n70.productCode,n70 );
		ProductList n71=new ProductList(13,133,1331,"Electric Oven 550W","Preethi",2410,17);
		ProductList n72=new ProductList(13,133,1332,"Electric Oven S11","Indus Valley",3130,8);
		ProductList n73=new ProductList(13,133,1333,"Electric Oven Pro Max","Mayer",2220,12);
		ProductList n74=new ProductList(13,133,1334,"Electric Oven Quic Heat","Butterfly",2511,15);//Spelling
		ProductList n75=new ProductList(13,133,1335,"Electric Oven Energy+","Premier",2125,14);
		Products.put(n71.productCode,n71 );
		Products.put(n72.productCode,n72 );
		Products.put(n73.productCode,n73 );
		Products.put(n74.productCode,n74 );
		Products.put(n75.productCode,n75 );
		ProductList n76=new ProductList(13,134,1341,"Food Processer 550W","Preethi",2410,17);
		ProductList n77=new ProductList(13,134,1342,"Food Processer S11","Indus Valley",3130,8);
		ProductList n78=new ProductList(13,134,1343,"Food Processer Pro Max","Mayer",2220,12);
		ProductList n79=new ProductList(13,134,1344,"Food Processer Power","Butterfly",2511,15);//Spelling
		ProductList n80=new ProductList(13,134,1345,"Food Processer Energy+","Premier",2125,14);
		Products.put(n76.productCode,n76 );
		Products.put(n77.productCode,n77 );
		Products.put(n78.productCode,n78 );
		Products.put(n79.productCode,n79 );
		Products.put(n80.productCode,n80 );
		
		
		LinkedHashMap<Integer,ProductList> m1=Products;//Dummy Initialisation
		
	for(Map.Entry<Integer, ProductList> e : m1.entrySet()) {
		if(e.getValue().itemCode==itemCodeRecieved) {
		System.out.println("Product Code: "+e.getValue().productCode);
		System.out.println("Product Name: "+e.getValue().name);
		System.out.println("Brand Name: "+e.getValue().Brandname);
		System.out.println("Discounted Price: "+e.getValue().price);
		System.out.println("Discount: "+e.getValue().discount+"%");
		System.out.println(".........................................................................");
		System.out.println();
		System.out.println();
		}
	}
	}
	
	public int toBilling(int productCode) {
		//use putall
		ProductList n1= new ProductList();
	
		//System.out.println(productCode);
		//ArrayList l=new ArrayList();Method  can return list!!!
		//l.add(Products.get(productCode));
		int pricedd=Products.get(productCode).price;
		return pricedd;
		//return 19;
	}
	@Override
	public String toString() {//Why?????????????????????????????????????????????????????
		return "ProductList [categoryCode=" + categoryCode + ", itemCode=" + itemCode + ", productCode=" + productCode
				+ ", name=" + name + ", Brandname=" + Brandname + ", price=" + price + ", discount=" + discount
				+  "]";
	}
	
	public static void main(String[] args) {
		ProductList n1= new ProductList();
		n1.iterateProduct(0);
		System.out.println(n1.toBilling(1114));
	}

	
}
