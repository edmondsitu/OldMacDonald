class Pig implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	Pig(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	Pig()
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