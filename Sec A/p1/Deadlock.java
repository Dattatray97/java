class A
{
	synchronized void foo(B b)
	{
		string name=Thread.currentThread().getName();
		System.out.println("Name of the thread is"+name);
		
		try
		{
			Thread.sleep(1000);
		
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception "+e);
		}
	}

}
class B
{
	synchronized void bar(A a)
	{
		string name=Thread.currentThread().getName();
		System.out.println("the thread is Inside the B class"+name);
		
		try
		{
			Thread.sleep(1000);
		
		}
		catch(interruptedException e)
		{
			System.out.println("Exception "+e);
		}
	}


}
class Deadlock impliments Runnable
{
	A a=new A();
	B b=new B();
	Thread t;
	Deadlock()
	{
		Thread.currentThread().setName("Main");
		t=new Thread(this,"Racing thread");
		void deadlockStart()
		{
			t.start();
			a.foo(b);
			System.out.println("Back inside main thread");
			
		
		}
	}
	public void run()
	{
		b.bar(a);
		System.out.println("Inside the another thread");
		
	}
	
	public static void main(String [] args)
	{
		Deadlock dl=new Deadlock();
		dl.deadlockStart();
		
	 
	
	}

}
