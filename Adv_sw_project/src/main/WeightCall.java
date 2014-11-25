


package main;

import java.text.DecimalFormat;
import java.util.Random;

public class WeightCall {
	
	static Random random=new Random();
	public  double clusterWeight(){
		
		double cluster=random.nextDouble();
		while(cluster < 0.85){
			cluster+=random.nextDouble();
		}
		
		DecimalFormat df=new DecimalFormat("0.00");
		String formate = df.format(cluster);
		cluster = Double.parseDouble(formate) ;
		
		return cluster;
	}
	
	public  double looseWeight(){
		
		double loose=random.nextDouble();
		while(loose>0.45){
			loose-=random.nextDouble();
			if(loose<0)
				loose*=-1;
			if(loose<0.1)
				loose+=0.1;
		}
		if(loose<0.1)
			loose+=0.1;
		
		DecimalFormat df=new DecimalFormat("0.00");
		String formate = df.format(loose);
		loose = Double.parseDouble(formate) ;
		
		
		
		return loose;
	}
}
