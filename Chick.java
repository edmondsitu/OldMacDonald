class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	private String mySecSound;
	Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
		mySecSound = "cheep";
	}
	Chick()
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
		if((Math.random()*1) > 0.5) {return mySound;}

		else {return mySecSound;}
	}
}