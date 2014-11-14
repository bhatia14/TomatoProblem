package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int clusterPots;
		int looosePots;
		double clusterTomato;
		double looseTomato;
		
		Cluster cluster=new Cluster();
		Loose loose= new Loose();
		Random random=new Random();	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number of cluster tomato pots");
		clusterPots=sc.nextInt();
		System.out.println("Eneter the number of loose tomato pots");
		looosePots=sc.nextInt();
		
		
		ArrayList<Cluster> clusterList=new ArrayList<Cluster>();
		ArrayList<Loose> looseList=new ArrayList<Loose>();
		
		for(int i=0;i<clusterPots;i++){
			System.out.println("Enter the max weight of cluster pots number "+i);
			cluster.setMax(sc.nextInt());
			cluster.setContains(0);
			clusterList.add(cluster);
		}
		
		
		for(int i=0;i<looosePots;i++){
			System.out.println("Enter the max weight of loose pots number "+i);
			loose.setMax(sc.nextInt());
			loose.setContains(0);
			looseList.add(loose);
		}
		
		
		
		
		boolean val=true;
		while(val){
			System.out.println("pick up a 1> cluster, 2> loose tomato, 3> want to pack, 4> done with your work");
			int option=sc.nextInt();
			if(option==1){
				clusterTomato=clusterWeight();
				System.out.println("Weight of cluster is "+cluster);
				for(Cluster cluster2:clusterList){
					System.out.println("Weight in ");
				}
				
				
				
				System.out.println("where you want to put choose the number between 1 to "+clusterList.size());
			}
			else if(option==2){
				looseTomato=looseWeight();
				
			}
			
			
		}
		
		
		
	}
	
	private static double clusterWeight(){
		Random random=new Random();
		double cluster=random.nextDouble();
		while(cluster < 0.85){
			cluster+=random.nextDouble();
		}
		return cluster;
	}
	
	private static double looseWeight(){
		Random random=new Random();
		double loose=random.nextDouble();
		while(loose>0.45){
			loose-=random.nextDouble();
			if(loose<0)
				loose*=-1;
			if(loose<0.1)
				loose+=0.1;
		}
		return loose;
	}
	

}



