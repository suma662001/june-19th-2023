class Carpenter
{
	static void wood()
	{
		System.out.println("running main wood in Carpenter");
	}
	static void wood(String item)
	{
		System.out.println("invoking wood(String) in Carpenter");
		System.out.println("item :" +item);
	}
	
	static void timber()
	{
		System.out.println("running main timber in Carpenter");
		
	}
	
	static void timber(String branch)
	{
		System.out.println("running main timber(String) in Carpenter");
		System.out.println("Branches : " +branch);
		
	}
	static void cutting( int size)
	{
		System.out.println("running main cutting(int) in Carpenter");
		System.out.println("size :" +size);
		
	}
	static void screw(String material)
	{
		System.out.println("running main screw(String) in Carpenter");
		System.out.println("material :" +material);
		
	}
	
	static void plumb( String material)
	{
		System.out.println("running main plumb(String) in Carpenter");
		System.out.println("material :" +material);
		
	}
	static void marking(int length)
	{
		System.out.println("running main marking(int) in Carpenter");
		System.out.println("length :" +length);
		
	}
	static void shape()
	{
		System.out.println("running main shape in Carpenter");
	}
	
	static void planing()
	{
		System.out.println("running main plan in Carpenter");
	}
	static void work()
	{
		System.out.println("running main work in Carpenter");
	}
	static void tool()
	{
		System.out.println("running main tool in Carpenter");
	}
	static void finish()
	{
		System.out.println("running main finish in Carpenter");
	}
	
	public static void main(String[] args)
	{
		Carpenter.wood();
		Carpenter.wood("furniture");
		Carpenter.timber();
		Carpenter.timber("branches");
		Carpenter.cutting(30);
		Carpenter.screw("jack");
		Carpenter.plumb("steel tape");
		Carpenter.marking(15);
		Carpenter.shape();
		Carpenter.planing();
		Carpenter.work();
		Carpenter.tool();
		Carpenter.finish();
		
		System.out.println("------------------------------------------------");
	}

}


