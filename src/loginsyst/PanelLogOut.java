package loginsyst;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelLogOut extends JPanel {


	public PanelLogOut() {
	//	setBackground(new Color(240, 230, 140));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JLabel lblThisIsLogOut = new JLabel("LOG OUT");
		lblThisIsLogOut.setBounds(189, 36, 143, 19);
		lblThisIsLogOut.setFont(new Font("Dialog", Font.BOLD, 14));
		add(lblThisIsLogOut);

	}

}
