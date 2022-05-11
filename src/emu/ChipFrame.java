package emu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyListener;

public class ChipFrame extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	private ChipPanel panel;
	private int[] keybuffer;
	private int[] keyIdToKey;
	
	
	
}
import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import chip.Chip;

public class ChipFrame extends JFrame {
	
	private ChipPanel panel;

	public ChipFrame(Chip c) {
		setPreferredSize(new Dimension(640, 320));
		pack();
		setPreferredSize(new Dimension(640 + getInsets().left + getInsets().right, 320 + getInsets().top + getInsets().bottom));
		panel = new ChipPanel(c);
		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Chip 8 Emulator");
		pack();
		setVisible(true);
		
		keyIdToKey = new int[256];
		keyBuffer = new int[16];
		fillKeyIds();
	}
	
	private void fillKeyIds() {
		for(int i = 0; i < keyIdToKey.length; i++) {
			keyIdToKey[i] = -1;
			
			keyIdToKey['1'] = 1;   
			keyIdToKey['1'] = 2;   
			keyIdToKey['1'] = 3;   
			keyIdToKey['1'] = 4;   
			keyIdToKey['1'] = 5;   
			keyIdToKey['1'] = 6;   
			keyIdToKey['1'] = 7;   
			keyIdToKey['1'] = 8;   
			keyIdToKey['1'] = 9;   
			keyIdToKey['1'] = 0xA;   
			keyIdToKey['1'] = 0;   
			keyIdToKey['1'] = 0xB;   
			keyIdToKey['1'] = 0xC;   
			keyIdToKey['1'] = 0xD;   
			keyIdToKey['1'] = 0xE;   
			keyIdToKey['1'] = 0xF;
			
					}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(keyIdToKey[e.getKeyCode()] != -1) {
			keyBuffer[keyIdToKey[e.getKeyCode()]] = 1;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	
	public int[] getKeyBuffer() {
		return KeyBuffer;
	}
	
}
