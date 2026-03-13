package src.engine;

import com.sun.jna.Structure;

public class Framework_Ptr extends Structure
{
	private static App _App = null;
	
	public Framework_Ptr()
	{
		stat_create_App();
	}
	public void initalise(Framework_Ptr obj)
	{
		obj.get_App().get_Execute().initalise_Control(obj.get_App().get_Execute());
		obj.get_App().get_Execute().initialise_Programs();
	}

	public App get_App()
	{
		return null;
	}
	
    // For passing a pointer to the structure
    public static class ByReference extends Framework_Ptr implements Structure.ByReference 
    {
    	
    }
    
    // For passing the structure by value
    public static class ByValue extends Framework_Ptr implements Structure.ByValue 
    {
    	
    }
    
	// static.
	private static void stat_create_App()
	{
		App _App = new App();
		try {
			stat_get_App();
		} 
		catch (NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
		// get.
	private static App stat_get_App()
	{
		return _App;
	}
		// set.
}