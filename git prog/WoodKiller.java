class WoodKiller
{
public static void main(String []args)
{
	System.out.println("invoking main in woodkiller");
	Wood wood=new Wood("beech tree","round");
	
	System.out.println(" -------------");
	
	Wood wood1=new Wood("green tree","oven",70);
	
	System.out.println("--------------");

	Wood wood2=new Wood("broun tree","triangle",10,3000);
	
	System.out.println("--------------");

	Wood wood3=new Wood("co-tree","square",30,1000,"pine");
		
}
	
}