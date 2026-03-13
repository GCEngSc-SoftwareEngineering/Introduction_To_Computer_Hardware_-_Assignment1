package src.Main;
import src.CLIBConcurrentServerIO.LIBSERVERIOCONCURRNECY_API;
import src.engine.Framework_Ptr;
import com.sun.jna.Pointer;

public class Main {
// classes.

// registers.

// constructor.

// public.
	// dynamic.
		// get.
		// set.
	// static.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.printf("entered first member function, main().%n");
		Framework_Ptr pgmID_SERVERIOCONCURRNECY = LIBSERVERIOCONCURRNECY_API.generate_Program();
		System.out.printf("==========%n");
		System.out.printf("decliration.%n");
		System.out.printf("definition.%n");
		System.out.printf("substanciation.%n");
		System.out.printf("initialisation.%n");
		System.out.printf("instanciation.%n");
		System.out.printf("running.%n");
		System.out.printf("==========%n");
		System.out.printf("SIMULATION%n");
		
		
		//SIMULATION TestBench.
		LIBSERVERIOCONCURRNECY_API.set_Item_input_praise0_Value_A(pgmID_SERVERIOCONCURRNECY, 0);
		LIBSERVERIOCONCURRNECY_API.set_Item_input_praise0_Value_B(pgmID_SERVERIOCONCURRNECY, 0);
		LIBSERVERIOCONCURRNECY_API.do_Add(pgmID_SERVERIOCONCURRNECY);
		System.out.printf("answer = " + LIBSERVERIOCONCURRNECY_API.get_REG_ptr_output_praise0_Value(pgmID_SERVERIOCONCURRNECY) + "%n");
	}
		// get.
		// set.
}









