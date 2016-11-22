
public class TwoDimesionalArrays
	{
		static int i;
		static int j;
		public static void main(String[] args)
			{
				exercise1();
				exercise2();
//				exercise3();
			}

		public static void exercise1()
		{
			int myArray[][] = new int [3][2];
			myArray [0] [0] = 22;
			myArray [0] [1] = 23;
			myArray [1] [0] = 24;
			myArray [1] [1] = 25;
			myArray [2] [0] = 26;
			myArray [2] [1] = 27;
			
			System.out.println(myArray[2][1]);
			
		}
		
		public static void exercise2()
		{
			String myArray[][] = new String[4][3];
				{
					for(int i = 0; i<myArray.length; i++)
						{
							for(int j = 0; j < myArray[0].length; j++)
								{
									myArray[i][j] = " MHS ";
									System.out.print(myArray[i][j]);
								}
							System.out.println();
						}
					
				}
		
		}
		
		public static void exercise3()
		{
			int myArray[][] = new int [3][3];
			int counter = 0;
				{
					for(int i = 0; i < myArray.length; i++)
						{
							for(int j = 0; j < myArray.length; j++)
							{
								System.out.println(myArray[i][j]);
								counter++;
								myArray[i][j] = counter;
								System.out.print(myArray[i][j]);
						    }
							
							System.out.println();
						}
//					int three = myArray[0][0] + myArray [0][1] + myArray;
				}
				
//				
//			System.out.println(myArray[i][j]);
//			System.out.println();
//			System.out.println();
//			
			

			
			
		}	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
