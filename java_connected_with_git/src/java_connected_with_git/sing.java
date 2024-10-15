package java_connected_with_git;

	class sing 
{
	static sing se = new sing();
	public static sing getInstance() 
	{
		return se;
	}
	
	public static sing getInstance1()
	{
		return new sing();
	}
}
