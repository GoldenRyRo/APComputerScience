/*
 * By Cole Hudson
 * Date: 4/12/2015
 * Purpose: Use merge sort to sort movies by title, year, and studio.
 * 
 * PMR in README.txt
 */
public class Movie4 
{
	//instance variables
	private String title;
	private int year;
	private String studio;
	
	//getters
	public String getTitle() 
	{
		return title;
	}

	public int getYear() 
	{
		return year;
	}

	public String getStudio() 
	{
		return studio;
	}

	//setters
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public void setStudio(String studio) 
	{
		this.studio = studio;
	}

	//constructor
	Movie4(String title, int year, String studio)
	{
		this.title = title;
		this.year = year;
		this.studio = studio;
	}
	
	//alternate constructor
	Movie4()
	{
		
	}
	
	//methods
	
	//to string
	public String toString()
	{
		return String.format("%-30s| %-5d| %-20s", title, year, studio);
	}
}
