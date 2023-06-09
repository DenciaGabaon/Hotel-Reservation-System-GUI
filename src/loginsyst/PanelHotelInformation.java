package loginsyst;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelHotelInformation extends JPanel {


	public PanelHotelInformation() {
	//	setBackground(new Color(240, 230, 140));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		setVisible(true);
		
		
		JLabel lblThisIsHotelInfo = new JLabel("HOTEL INFORMATION");
		lblThisIsHotelInfo.setForeground(new Color(0, 0, 128));
		lblThisIsHotelInfo.setBounds(189, 36, 205, 19);
		lblThisIsHotelInfo.setFont(new Font("Dialog", Font.BOLD, 14));
		add(lblThisIsHotelInfo);

	}

}
