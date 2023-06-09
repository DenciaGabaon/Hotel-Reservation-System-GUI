package loginsyst;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelAvailability extends JPanel {


	public PanelAvailability() {
		//setBackground(new Color(240, 230, 140));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JLabel lblThisIsAvailability = new JLabel("AVAILABILITY");
		lblThisIsAvailability.setBounds(189, 36, 143, 19);
		lblThisIsAvailability.setFont(new Font("Dialog", Font.BOLD, 14));
		add(lblThisIsAvailability);

	}

}
