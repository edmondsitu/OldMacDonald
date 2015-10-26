class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	private String mySecSound;
	Chick(String type, String soundOne, String soundTwo)
	{
		myType = type;
		mySound = soundOne;
		mySecSound = soundTwo;
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