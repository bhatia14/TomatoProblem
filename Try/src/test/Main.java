package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

public class Main {

	
	static ArrayList<Cluster> clusterList=new ArrayList<Cluster>();
	static ArrayList<Loose> looseList=new ArrayList<Loose>();
	static Random random=new Random();
	static Scanner sc=new Scanner(System.in);
	static Cluster cluster=new Cluster();
	static Loose loose= new Loose();	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int clusterPots;
		int looosePots;
		double clusterTomato;
		double looseTomato;
		

		
		
	
		System.out.print("Enter the number of cluster tomato pots: ");
		clusterPots=sc.nextInt();
		System.out.print("Enter the number of loose tomato pots: ");
		looosePots=sc.nextInt();
		
		

		
		for(int i=1;i<=clusterPots;i++){
			System.out.print("Enter the max weight of cluster pots number (can hold between 1 to 5 kg) "+i+": ");
			Cluster cluster=new Cluster();
			double val=sc.nextDouble();
			if(val>=0.9 && val<5){
				cluster.setMax(val);
				cluster.setContains(0);
				clusterList.add(cluster);
			}
			else {
				System.out.println();
				System.err.println("Wrong Input!! try again");
				System.out.println();
				i--;
			}
		}
		
		
		for(int i=1;i<=looosePots;i++){
			System.out.print("Enter the max weight of loose pots number(can hold between 0.1 to 0.4 kg) "+i+": ");
			double val=sc.nextDouble();
			if(val>=0.1 && val<0.6){
				Loose loose=new Loose();
				loose.setMax(val);
				loose.setContains(0);
				looseList.add(loose);
			}
			else {
				System.out.println();
				System.err.println("Wrong Input!! try again");
				System.out.println();
				i--;
			}
		}
		
		
		
		
		boolean val=true;
		while(val){
			System.out.println("pick up a 1> cluster, 2> loose tomatos, 3> want to pack, 4>Show the pots 5> done with your work");
			int option=sc.nextInt();
			switch(option){
				
				case 1:
					clusterTomato=clusterWeight();
					System.out.println("Weight of cluster is "+clusterTomato+". you want to add or not... press 1 to add or 0 to ignore ");
					int temp=sc.nextInt();
					if(temp==1)
						addClusterTomato(clusterTomato);
					break;
			
				case 2:
					looseTomato=looseWeight();
					System.out.println("Weight of loose tomato is "+looseTomato+". you want to add or not... press 1 to add or 0 to ignore ");
					temp=sc.nextInt();
					if(temp==1)
						addLooseTomato(looseTomato);
					break;
					
				case 3:
					combine();				
					break;
				case 4:
					show();
					break;
					
				default:
					val=false;
					System.out.println("Bye Bye!! Enjoy your holiday");
					break;
					
			}
			
		}
		
		
		
	}
	
	
	
	private static void combine(){
		show();
		ArrayList<Double> arrayList=new ArrayList<Double>();
		ArrayList<Double> arrayList1=new ArrayList<Double>();
		double[] diff=new double[looseList.size()];
		double[] data=new double[looseList.size()];
		int i=0;
		for(Loose loose:looseList){
    		
    		data[i]=loose.getContains();
    		i++;
    	}
		
		
			for(Cluster cluster2:clusterList){
				
			//				arrayList.add(cluster2.getMax()-cluster2.getContains());
		arrayList.add(cluster2.getMax()-cluster2.getContains());		
			}
			
			
			for(i=0;i<data.length;i++){
				for(Double ar:arrayList){
					if(data[i]>ar){
						diff[i]=data[i]-ar;
					}else{
						diff[i]=ar-data[i];
					}
				}
				
		 }
		//System.out.println(arrayList);
			double min=0;
			for(i=0;i<diff.length-1;i++){
				System.out.println(diff[i]);
				min=diff[0];
				min=Math.min(min,diff[i+1]);
			}
		System.out.println(min);
		
		
		
		
		
		
		
		
	}
	
	
	private static double clusterWeight(){
	
		double cluster=random.nextDouble();
		while(cluster < 0.85){
			cluster+=random.nextDouble();
		}
		return cluster;
	}
	
	private static double looseWeight(){
		
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
		return loose;
	}
	
	
	private static void addClusterTomato(double clusterTomato){
		int i=1;
		//System.out.println("");
		for(Cluster cluster2:clusterList){
			System.out.print("Weight in "+i+" bucket    ");
			System.out.print(cluster2.getContains());
			System.out.print(" Maximum Weight "+i+" bucket can have    ");
			System.out.print(cluster2.getMax());
			System.out.println();
			i++;
		}
		System.out.println("where you want to put choose the number between 1 to "+clusterList.size()+" or put 0 for discard");
		int val=sc.nextInt();
		
		if(val==0)
			System.err.println("Discarded");
		else{
			Cluster cluster3=clusterList.get(val-1);	
			if((cluster3.getMax()-cluster3.getContains())>clusterTomato){
				cluster3.setContains(cluster3.getContains()+clusterTomato);
				clusterList.set(val-1, cluster3);
			}
	
			else{
				System.err.println("Overflow for this  pot! choose another");
				addClusterTomato(clusterTomato);
			}
		}
		
	}
	
	private static void addLooseTomato(double looseTomato){
		int i=1;
		//System.out.println("");
		for(Loose loose:looseList){
			System.out.print("Weight in loose "+i+" bucket    ");
			System.out.print(loose.getContains());
			System.out.print("Maximum Weight in loose "+i+" bucket can have    ");
			System.out.print(loose.getMax());
			System.out.println();
			i++;
		}
		System.out.println("Where you want to put... choose the number between 1 to "+looseList.size()+"  or put 0 for discard");
		int val=sc.nextInt();
		
		if(val==0)
			System.err.println("Discarded");
		else{
			Loose loose3=looseList.get(val-1);
			
			
			 if((loose3.getMax()-loose3.getContains())>looseTomato){
				loose3.setContains(loose3.getContains()+looseTomato);
				looseList.set(val-1, loose3);
			}
			else{
				System.err.println("Overflow for this  pot! choose another");
				addLooseTomato(looseTomato);
			}
		
		}
	}

	private static void show(){
		int i=0;
		for(Cluster cluster2:clusterList){
			System.out.print("Weight in "+i+" bucket    ");
			System.out.print(cluster2.getContains());
			System.out.print(" Maximum Weight "+i+" bucket can have    ");
			System.out.print(cluster2.getMax());
			System.out.println();
			i++;
		}
		i=0;
		for(Loose loose:looseList){
			System.out.print("Weight in loose "+i+" bucket    ");
			System.out.print(loose.getContains());
			System.out.print("Maximum Weight in loose "+i+" bucket can have    ");
			System.out.print(loose.getMax());
			System.out.println();
			i++;
		}
	
	}
	

	    
	
	    private static int binarySearch(double key,double[] data) 
	    {
	    	int size=looseList.size();	
	    	
	    	
	    	
	         int low = 0;
	         int high = size - 1;
	          int index=0;
	         while(high >= low) {
	             int middle = (low + high) / 2;
	             if(data[middle] == key) {
	            	 index=middle;
	                 return index;
	             }
	             if(data[middle] < key) {
	                 low = middle + 1;
	                 index=low;
	             }
	             if(data[middle] > key) {
	                 high = middle - 1;
	                 index=high;
	             }
	        }
	        return index;
	   }
	
	
}



