package math;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface LIBADDER_API extends Library
{
	LIBADDER_API INSTANCE = (LIBADDER_API) Native.load("Assignment_1_-_the_dll", LIBADDER_API.class);
	double do_Add(Pointer obj);
	Pointer generate_Program();
	long get_Output_Subset_praise0_value(Pointer obj);
	short get_PraiseEventId();
	void set_Input_Subset_praise0_valueA(Pointer obj, float newFloat);
	void set_Input_Subset_praise0_valueB(Pointer obj, float newFloat);
	void set_PraiseEventId(Pointer obj, short newValue);
	void updateFramPtr(Pointer s);
}