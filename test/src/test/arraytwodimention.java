package test;

import java.util.Scanner;

public class arraytwodimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[3][3];
		Scanner input= new Scanner(System.in);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]= input.nextInt();
				//System.out.println(x[i][j]);
			}
		}
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				//x[i][j]= input.nextInt();
				System.out.print(" "+x[i][j]);
			}
			System.out.println("");
		}
	}

}
