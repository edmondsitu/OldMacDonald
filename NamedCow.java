class NamedCow extends Cow
{
	private String myName;
	NamedCow(String type, String name, String sound)
	{
		myName = name;
	}
	public String getName()
	{
		return myName;
	}
}