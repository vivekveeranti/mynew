package com.lkm.collectionsdemo;

import java.util.ArrayList;
//import java.util.Iterator;

public class P2{

	public static void main(String[] args) 
	{
		ArrayList<P3> a=new ArrayList<P3>();
		a.add(new P3("Akhil","Itchguard",20,"Warangal"));
		a.add(new P3("Sanjay","fogg",220,"Kazipet"));
		a.add(new P3("Saketh","rice",60,"hanumakonda"));
		a.add(new P3("sushanth","maggi",24,"Warangal"));
		/*Iterator<P3> i=a.iterator();
		while(i.hasNext())
		{
			a.disp();
			System.out.println();
		}*/
		System.out.println("------------------------------");
		for(P3 s:a)
		{
			s.disp();
			System.out.println("------------------------------");
		}
	}
}