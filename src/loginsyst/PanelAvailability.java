package loginsyst;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;

public class PanelAvailability extends JPanel implements ActionListener{
	ImageIcon standardRoom = new ImageIcon("/res/standard.jpg");
	ImageIcon deluxeRoom = new ImageIcon("/res/deluxe.jpg");
	ImageIcon suiteRoom = new ImageIcon("/res/suite.jpg");
	JButton button;
	JTextField date;

	public PanelAvailability() {
		
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JLabel avail = new JLabel("AVAILABILITY 2");
		avail.setBounds(189, 36, 143, 19);
		avail.setFont(new Font("Dialog", Font.BOLD, 14));

		button =  new JButton("enter");
		button.setBounds(300, 0, 100, 100);

		date = new JTextField();
		date.setPreferredSize(new Dimension(40, 40));
 
		avail.add(button);
		avail.add(avail);
		avail.add(date);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			//print on the Panel the new 
		}
		
	}

}
