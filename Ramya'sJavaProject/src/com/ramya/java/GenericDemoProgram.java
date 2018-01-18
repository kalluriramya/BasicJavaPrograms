package com.ramya.java;

class Generic<T>
{
	T obj;
	Generic(T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println("Type of Object:" +obj.getClass().getName());
	}
	public T getobj()
	{
		return obj;
	}
}

public class GenericDemoProgram 
{
	public static void main(String[] args) 
	{
		Generic<String> g1=new Generic<String>("Ramya");
		g1.show();
		System.out.println(g1.getobj());
		
		Generic<Integer> g2=new Generic<Integer>(10);
		g2.show();
		System.out.println(g2.getobj());
		
		Generic<Double> g3=new Generic<Double>(4.5);
		g3.show();
		System.out.println(g3.getobj());
	}

}
