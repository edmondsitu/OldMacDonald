public void setup()
{
	//your variable declarations here
	Cow c = new Cow("Cow","moo");
	System.out.println(c.getType() + " goes " + c.getSound());
	Farm one = new Farm();
	one.animalSounds();

}