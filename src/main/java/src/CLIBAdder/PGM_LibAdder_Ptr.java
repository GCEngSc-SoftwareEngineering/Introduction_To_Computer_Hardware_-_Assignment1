package src.CLIBAdder;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import src.engine.App;

public class PGM_LibAdder_Ptr extends Structure
{
	private static App _App = null;
	
    public PGM_LibAdder_Ptr(Pointer p) 
    {
        super(p);
        read();
    }

    public PGM_LibAdder_Ptr() 
    {
        super();
    }
}
