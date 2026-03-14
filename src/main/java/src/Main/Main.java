package src.Main;

import src.CLIBAdder.LIBADDER_API;
import src.CLIBAdder.PGM_LibAdder_Ptr;

import com.sun.jna.Pointer;

public class Main 
{
	private static Pointer objPGM = null;
	
	public static void main(String[] args) 
	{
		System.out.printf("exiting dll.IO generate_Program().%n");
		System.out.printf(".%n");
		System.out.printf("        ,     \\      /      ,.%n");
		System.out.printf("       / \\    )\\ __ /(     / \\ .%n");
		System.out.printf("      /   \\   (_\\  /_)    /   \\ .%n");
		System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____.%n");
		System.out.printf("|              |\\../|               |.%n");
		System.out.printf("|               \\VV/                |.%n");
		System.out.printf("| Introduction to Computer Systems  |.%n");
		System.out.printf("|___________________________________|.%n");
		System.out.printf("|    / \\ /        \\\\        \\ /\\    |.%n");
		System.out.printf("|  /    V          ))        V   \\  |.%n");
		System.out.printf("|/                //               \\| .%n");
		System.out.printf("`                 V                 '.%n");
		System.out.printf(".%n");
		System.out.printf("entered first member function, main().%n");
		
		PGM_LibAdder_Ptr objPGM = IO.generate_Program();
		System.out.printf("==========%n");
		System.out.printf("decliration.%n");
		System.out.printf("definition.%n");
		System.out.printf("substanciation.%n");
		System.out.printf("initialisation.%n");
		System.out.printf("instanciation.%n");
		System.out.printf("running.%n");
		System.out.printf("==========%n");
		System.out.printf("SIMULATION%n");
		
	}
}









