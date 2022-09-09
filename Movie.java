/**
 * ITEC 2150
 * Created By Adrian Moreno
 * 8/30/2022
 * Purpose is to set getters and setters for movie title, release year, director and lead actor.
 */
public class Movie
{
	private String title;
	private int releaseYr;
	private String director;
	private String lead;
	
	public Movie(String newTitle, int newReleaseYr, String newDirector,String newLead)
	{
		this.title = newTitle;
		this.releaseYr = newReleaseYr;
		this.director = newDirector;
		this.lead = newLead;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getReleaseYr()
	{
		return releaseYr;
	}

	public void setReleaseYr(int releaseYr)
	{
		this.releaseYr = releaseYr;
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public String getLead()
	{
		return lead;
	}

	public void setLead(String lead)
	{
		this.lead = lead;
	}
	
	public String toString()
	{
		return "Title of Movie: " + title + " Release Year: " + releaseYr + " Name of Director: " + director + " Name of leading role: " + lead;
 	}

}
