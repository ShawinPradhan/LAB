package arrayexmaples;
import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, search,i;
		//initializing pos as -1 as the first element on an array is stored on location 0
		//int pos =-1;
		boolean flag=false; // using boolean variable flag and initially setting as false
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		int a[] = new int[size]; //instantiate array
		System.out.println("Enter "+size+ " elements of an array: ");
		for(i=0;i<size;i++) //using for loop to take array input from user
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("Enter element you want to search: ");
		search = sc.nextInt();
		
		//searching for the element
		for(i=0;i<size;i++)
		{	//checking if the element present in array is same as the searched element
			if(a[i]==search) 
			{
				flag=true; //if element found setting flag as true
				
				//pos = i; //storing the position of number(index) in pos
				break; //if we find the number break the loop
			}
		}
		//checking if the position of the element is not equal to 1 proving that the element
		// is not present in the array
		//if(pos!=-1)
		if(flag==true) //if flag is true the print the element found in position i	
			System.out.println("The element "+search+" is present in position: "+(i+1));
			//System.out.println("The element "+search+" is present in position: "+(pos+1));
		else
			System.out.println("Data not found in the array.");
	}

}
