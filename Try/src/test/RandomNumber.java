package test;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		double min=10.0;
		double max=100.0;
		double val=random.nextDouble();
		//int x=random.nextInt(10);
				//System.out.println(x+" "+val);
		double x=random.nextDouble();
		
				while(x < 0.85){
					x+=random.nextDouble();
				}
				System.out.println(x);
				while(x>0.45){
					x-=random.nextDouble();
					if(x<0)
						x*=-1;
					if(x<0.1)
						x+=0.1;
				}
				System.out.println(x);
				
				ArrayList<String> arrayList=new ArrayList();
				arrayList.add("hello");
				arrayList.set(0, "world");
				System.out.println(arrayList);
				
				
	}
	
	
	
	
	

}
