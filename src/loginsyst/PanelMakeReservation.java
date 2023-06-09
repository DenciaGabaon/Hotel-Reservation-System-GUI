package loginsyst;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class PanelMakeReservation extends JPanel {


	public PanelMakeReservation() {
		//setBackground(new Color(240, 230, 140));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JLabel lblThisIsMakeRes = new JLabel("MAKE RESERVATION");
		lblThisIsMakeRes.setBounds(189, 36, 143, 19);
		lblThisIsMakeRes.setFont(new Font("Dialog", Font.BOLD, 14));
		add(lblThisIsMakeRes);

	}

}
