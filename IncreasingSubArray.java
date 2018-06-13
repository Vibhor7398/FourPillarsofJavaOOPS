package inheritance;

import java.util.Scanner;

public class IncreasingSubArray {

	public static void main(String[] args) {
		int max=0,temp=1,flag=0;
		int a[] = new int[10];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			
			if(temp > max)
			{
				max = temp;
			}
			if(a[i]<a[i+1])
			{
				temp++;
				flag = 1;
			}
			else
			{
				temp = 1;
			}
		}
		if(flag==0)
		{
			System.out.println("Array never increases.");
		}
		else
		{
		System.out.println("Maximum increasing subarray size is: " + max);
		}

	}

}
