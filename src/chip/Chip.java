package chip;

public class Chip {
	
	private char[] memory;
	private char[] V;
	private char I; 
	private char pc;
	private char stack[];
	private int stackPointer; 
	
	private int delay_timer;
	private int sound_timer;
	
	private byte[] keys;
	
	private byte[] display;
	
	
	public void init() {
		memory = new char[4096];
		V = new char[16];
		I = 0x0;
		pc = 0x200;
		stack = new char[16];
		stackPointer = 0;
		
		delay_timer = 0;
		sound_timer = 0;
		
		keys = new byte[16];
		
		display = new byte[64*32];
		
	}
	
	public void run() {
		//fetch op
		//exec op
		char op = (char)(memory[pc] << 8 | memory[pc+1]);
		System.out.println(Integer.toHexString(op) + ": ");
		//decode op
		
		switch(op & 0xF000) {
		
		case 0x8000: // Cointains more data in the last nibble
			
			switch(op & 0x000F) {
				
			case 0x0000: //8XY0 Sets VX to the value of VY.
				default:
					System.err.println("Unspported OP!");
					System.exit(0);
					break;
			
			}
			
			break;
			
		   default:
		   System.err.println("Unsupported opcode!");
		   System.exit(0);
		}
	}

	
	public byte[] getDisplay() {
		return display;
	} 
}