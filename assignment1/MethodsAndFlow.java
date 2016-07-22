package com.week1.day5.assignment1;

public class MethodsAndFlow 
{
	private String[] stringArray;
	private Integer numberOfValuesToOutput;
	
	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}
	public void outputSubset(int startPosition, int numberOfValues)
	{
		numberOfValuesToOutput = startPosition + numberOfValues;
		if(startPosition >= 0 && startPosition < stringArray.length)
		{
			if(startPosition + numberOfValues > stringArray.length)
			{
				numberOfValuesToOutput = stringArray.length - 1;
			}
			for(int i=startPosition; i < numberOfValuesToOutput; i++)
			{
			 System.out.println(stringArray[i]);
			}
		}
		else 
		{
			System.out.println("Error!!!!!!!! :(");
		}
	}
	public void outputAll()
	{
		outputSubset(0, stringArray.length);
	}
}

