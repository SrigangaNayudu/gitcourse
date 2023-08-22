import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seats[]= {"Harry", "Nevile", "Ron", "Harmione", "Seamus"};
		System.out.println("It's time to take 5th year exam, please take your seats.\n");
		System.out.println(seats[0]+", you will take seat 0");
		System.out.println(seats[1]+", you will take seat 1");
		System.out.println(seats[2]+", you will take seat 2");
		System.out.println(seats[3]+", you will take seat 3");
		System.out.println(seats[4]+", you will take seat 4");
		
		//Workbook 6.2 
		System.out.println("\n-----  WorkBook 6.2  -----\n");
		String seats1[]= {"Malfoy" ,"Crabbe","Goyle","Pansy","Dean"};
		System.out.println("It's time to take 6th year exam, please take your seats.\n");
		for(int i=0;i<seats1.length;i++)
		{
			System.out.println(seats1[i]+", you will take seat "+i);
		}
		
		//Workbook 6.3
		System.out.println("\n----- Workbook 6.3 -----");
		String aisels[]= {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
		System.out.println("Do you sell coffee ?");
		for(int i=0;i<aisels.length;i++)
		{
			if(aisels[i].equals("coffee"))
			{
				System.out.println("We have that in aisel: "+i);
			}
		}
		
		//Workbook 6.4
		System.out.println("\n----- Workbook 6.4 -----\n");
		System.out.println("Welcome to java Grocers");
		System.out.println("What can i help you find");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();		
		for(int j=0;j<aisels.length;j++)
		{
			if(aisels[j].equals(st))
			{
				System.out.println("We have that in aisel: "+j);
			}
		}
		
		//Workbook 6.5
		System.out.println("\n----- Workbook 6.5 -----\n");
		int rn[]= {ran(),ran(),ran(),ran(),ran(),ran(),ran(),ran(),ran(),ran()};
		int highScore=0;
		int seat=0;
		System.out.print("Here are the Scores: ");
		for(int k=0;k<rn.length;k++)
		{
			System.out.print(rn[k]+" ");
			if(rn[k]>highScore)
			{
				highScore=rn[k];
				seat=k;
			}
			
		}		
		System.out.println("\nThe HighestScore is: "+highScore+" Give that man a cookie!");
		//Workbook 6.6
		System.out.println("\n----- Workbook 6.6 -----\n");
		System.out.println("The highest score is: "+highScore+" Impressive!");
		System.out.println("It's the gentleman in the seat: "+seat +" Give that man a cookie!");
		
		//Workbook 6.7
		System.out.println("\n----- Workbook 6.7-----\n");
		String record[]= {"WIN","WIN", "WIN","LOSS", "WIN", "WIN", "LOSS"};
		int wins=0;
		int losses=0;
		for(int x=0;x<record.length;x++)
		{
			if(record[x].equals("WIN"))
				wins+=1;
			if(record[x].equals("LOSS"))
				losses+=1;
		}
		System.out.println("With a professional record of "+wins+" wins and "+losses+" losses.");
		
		//Workbook 6.7
		System.out.println("\n----- Workbook 6.7-----\n");
		String a1[]= {"Gala","Granny Smith", "Macintosh"};
		double a2[]= {1.99,1.49,1.29};
		System.out.println("Here is your Receipt");
		for(int p=0;p<a1.length;p++)
		{
			System.out.println(a1[p]+": $"+a2[p]);
		}

		
	}
	public static int ran()
	{
		double r=Math.random()*49999;
		r+=1;
		int d=(int)r;
		return d;
	}

}
