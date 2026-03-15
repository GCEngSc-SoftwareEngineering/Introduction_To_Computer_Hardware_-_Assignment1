package src.CLIBAdder;

import src.PraiseSets.Algorithim_praise0;
import src.PraiseSets.Input_praise0;
import src.PraiseSets.Output_praise0;
import src.engine.Framework;

// library imports.
import com.sun.jna.Pointer;

public class CLIBAdder implements LIBADDER_API
{
// classes.
	public static Pointer _framework = null;
		
// registers.

// pointers.

// dynamic.
	// API member functions.
	@Override
	public double do_Add(Pointer obj) 
	{
		//Algorithim_praise0 objAlg = (Algorithim_praise0)obj.get_App().get_Algorithms().dyn_REG_get_Item_On_list_Of_Subset_For_Algorithm((char) 0);
		//Input_praise0 objIn = (Input_praise0)obj.get_App().get_Data().dyn_REG_get_Item_On_list_Of_Subsets_For_Input((char) 0);
		//Output_praise0 objOut = (Output_praise0)obj.get_App().get_Data().dyn_REG_get_Item_On_list_Of_Subsets_For_Output((char) 0);
		return 0;//objAlg.do_Add(objIn, objOut);
	}

	@Override
	public Pointer generate_Program() 
	{
		System.out.printf("%n");
		System.out.printf("        ,     \\      /      ,%n");
		System.out.printf("       / \\    )\\ __ /(     / \\ %n");
		System.out.printf("      /   \\   (_\\  /_)    /   \\ %n");
		System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____%n");
		System.out.printf("|              |\\../|               |%n");
		System.out.printf("|               \\VV/                |%n");
		System.out.printf("|           CLIBAdder.dll           |%n");
		System.out.printf("|___________________________________|%n");
		System.out.printf("|    / \\ /        \\\\        \\ /\\    |%n");
		System.out.printf("|  /    V          ))        V   \\  |%n");
		System.out.printf("|/                //               \\|%n");
		System.out.printf("`                 V                 '%n");
		System.out.printf("%n");
		return (Pointer)stat_CLASS_get_Framework();
	}

	@Override
	public long get_Output_Subset_praise0_value(Pointer obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short get_PraiseEventId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void set_Input_Subset_praise0_valueA(Pointer obj, float newFloat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_Input_Subset_praise0_valueB(Pointer obj, float newFloat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_PraiseEventId(Pointer obj, short newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFramPtr(Pointer s) {
		// TODO Auto-generated method stub
		
	}

// static.
	// classes.
		// create.

		// get.
	private static Pointer stat_CLASS_get_Framework()
	{
		return _framework;
	}
		// set.
	// registers.
		// create.
		// get.
		// set.


}
