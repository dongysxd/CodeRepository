class Child extends Parent
{
	Child(int i)
	{
		super(2);
		System.out.println("Child");
	}
	public static void main(String[] args)
	{
		Child child = new Child(1);
	}

}

class Parent
{
	Parent(int i)
	{
		System.out.println("Parent");
	
	}
	Parent()
	{
		System.out.println("no args Parent");
	
	}

}
