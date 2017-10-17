package lbd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Example1 {

	public static void main(String[] args) {
		JButton testButton = new JButton("Test Button");
		testButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Detected by Anon Class");
			}
			
		});
		
	}
	
}
