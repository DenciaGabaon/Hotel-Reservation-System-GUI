package loginsyst;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelReservationList extends JPanel {


	public PanelReservationList() {
		//setBackground(new Color(240, 230, 140));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JLabel lblThisIsResList = new JLabel("RESERVATION LIST");
		lblThisIsResList.setBounds(189, 36, 143, 19);
		lblThisIsResList.setFont(new Font("Dialog", Font.BOLD, 14));
		add(lblThisIsResList);

	}

}
