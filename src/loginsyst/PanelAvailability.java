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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class PanelAvailability extends JPanel implements ActionListener{
	private JTextField textField;

	JButton btnNewButton;
	public PanelAvailability() {
		setBackground(new Color(255, 215, 0));
		
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(155, 181, 232, 38);
		add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("ENTER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.setBounds(155, 303, 232, 31);
		add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "STANDARD", "DELUXE", "SUITE"}));
		comboBox.setBounds(155, 248, 232, 31);
		add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 58, 510, 38);
		add(panel);
		
		JLabel avail = new JLabel("ROOM AVAILABILITY");
		panel.add(avail);
		avail.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblDatemmddyy = new JLabel("DATE (MM/DD/YY)");
		lblDatemmddyy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatemmddyy.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatemmddyy.setBounds(155, 161, 131, 19);
		add(lblDatemmddyy);
		
		JLabel lblRoomType = new JLabel("ROOM TYPE");
		lblRoomType.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomType.setFont(new Font("Dialog", Font.BOLD, 14));
		lblRoomType.setBounds(155, 229, 95, 19);
		add(lblRoomType);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 361, 510, 38);
		add(panel_1);
		
		JLabel lblRoomAvailabile = new JLabel("ROOMS AVAILABILE:");
		lblRoomAvailabile.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_1.add(lblRoomAvailabile);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			//print on the Panel the new 
			//get string
			//get room type from combo box
		}
		
	}
}
