package javaPackage;

public class MulitiDimensionalArray_Program1 {
		public static void main(String[] args) {
			
		
	//defining multi dimensional array
			int a[][]= {{1,2,3,5}, { 7,8,6,9 }, {4,5,8,3}};
	
	//total number of rows
			int row = a.length;
			System.out.println("Total Rows :- " +row);//3
			
			//total number of columns
			int columns = a[0].length;
			System.out.println("Total number of columns :- " +columns);
			
			//print all data
			
			for (int i=0; i<row;i++)
			{
				for (int j=0;j<columns;j++)
				{
					System.out.print(a[i][j] + "  ");
					
					}
				System.out.println();
}
}
}