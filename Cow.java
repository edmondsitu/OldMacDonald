class Cow implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	Cow(String type, String sound)
	{
		myType = type;		
		mySound = sound;
	}
	Cow()
	{
		myType = "Unknown";		
		mySound = "Unknown";
	}
	public String getType()
	{
		return myType;
	}	
	public String getSound()
	{
		return mySound;
	}
}