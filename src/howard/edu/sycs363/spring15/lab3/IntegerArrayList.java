package howard.edu.sycs363.spring15.lab3;

/**
 * Implementing Dynamic Integer Array 
 * @author roshan
 *
 */
public class IntegerArrayList {

	/**
	 * Size of the array
	 */
	private int size;
	
	/**
	 * Current index where the element can be inserted
	 */
	private int current_index;
	
	/**
	 * Our array to hold the integers
	 */
	private int myIntArray[] ;
	
	
	/**
	 * Constructor
	 */
	public IntegerArrayList()
	{
		//Constructor to initialize the value
		size=50;
		current_index=0;
		myIntArray=new int[size];
	}
	
	/**
	 * Constructor
	 */
	public IntegerArrayList(int new_size)
	{
		size=new_size;
		current_index=0;
		myIntArray= new int[new_size];
	}
	
	/**
	 * Add integer value at current_index
	 */
	public void add(int value)
	{	
		if (current_index==size)
		{
			int tempArray[]=new int[size];
			size=size+100;
			
			for (int x=0; x<current_index; x=x+1)
			{
				tempArray[x]=myIntArray[x];
			}
			
			myIntArray=new int [size];
			
			for (int x=0; x<current_index; x=x+1)
			{
				myIntArray[x]=tempArray[x];
			}	
		}
		
		myIntArray[current_index]=value;
		current_index++;
	}
	
	/**
	 * Add integer value at given_index
	 */
	public void add(int index,int value)
	{
		if (current_index==size)
		{
			int tempArray[]=new int[size];
			size=size+100;
			
			for (int x=0; x<current_index; x=x+1)
			{
				tempArray[x]=myIntArray[x];
			}
			
			myIntArray=new int [size];
			
			for (int x=0; x<current_index; x=x+1)
			{
				myIntArray[x]=tempArray[x];
			}
		}
		
		for (int i=current_index; i>index; i=i-1)
		{
			
			myIntArray[i]=myIntArray[i-1];
			
		}
		myIntArray[index]=value;
		current_index=current_index+1;
		
	}
	
	
	/**
	 * Get integer value at given index
	 */
	public int get(int index)
	{
		if (index<current_index)
		{
			return myIntArray[index];
		}
		return -1;
		
	}
	
	/**
	 * Give index of first occurence of given integer value
	 */
	public int indexOf(int value)
	{
		for (int x=0;x<current_index;x=x+1)
		{
			if (myIntArray[x]==value)
				return x;
		}
		return -1;
		
	}
	
	/**
	 * Check if the list is empty
	 */
	public boolean isEmpty()
	{
		return current_index==0;
	}
	
	/**
	 * Remove the integer value at the given index
	 */
	public int remove(int index)
	{
		if (index<current_index)
		{
			if (current_index!=0)
			{
				if (index==current_index-1)
				{
					int val=myIntArray[index];
					current_index=current_index-1;
					return val;
				}
				else
				{
					int val=myIntArray[index];
					for (int x=index;x<current_index-1;x=x+1)
					{
						myIntArray[x]=myIntArray[x+1];
					}
					current_index=current_index-1;
					return val;
				}
		}
		
		}
		
		
		return -1;
	}
	
	
}


