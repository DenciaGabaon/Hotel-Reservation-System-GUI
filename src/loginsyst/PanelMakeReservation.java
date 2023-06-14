package loginsyst;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PanelMakeReservation extends JPanel {
	
	private JTextField NameTextField;
	private JTextField DateTextField;
	protected int flags;
	

	public PanelMakeReservation() {
		setBackground(new Color(255, 215, 0));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 530, 34);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblThisIsMakeRes = new JLabel("MAKE RESERVATION");
		lblThisIsMakeRes.setBounds(177, 8, 184, 19);
		panel.add(lblThisIsMakeRes);
		lblThisIsMakeRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsMakeRes.setFont(new Font("Dialog", Font.BOLD, 14));
			
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 425, 530, 19);
		panel_1.setLayout(null);
		add(panel_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setBounds(154, 108, 55, 19);
		add(lblName);
		
		JLabel lblDatemmddyy = new JLabel("DATE (MM/DD/YY)");
		lblDatemmddyy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatemmddyy.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDatemmddyy.setBounds(154, 177, 131, 19);
		add(lblDatemmddyy);
		
		JLabel lblRoomType = new JLabel("ROOM TYPE");
		lblRoomType.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomType.setFont(new Font("Dialog", Font.BOLD, 14));
		lblRoomType.setBounds(154, 245, 95, 19);
		add(lblRoomType);
		
		final JComboBox<Object> RoomType = new JComboBox<Object>();
		RoomType.setFont(new Font("Dialog", Font.PLAIN, 12));
		RoomType.setModel(new DefaultComboBoxModel<Object>(new String[] {"-SELECT-", "STANDARD", "DELUXE", "SUITE"}));
		RoomType.setBackground(new Color(255, 255, 255));
		RoomType.setBounds(154, 267, 232, 39);
		add(RoomType);
		
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Dialog", Font.PLAIN, 12));
		NameTextField.setBounds(154, 128, 232, 38);
		add(NameTextField);
		NameTextField.setColumns(10);

		
		DateTextField = new JTextField();
		DateTextField.setFont(new Font("Dialog", Font.PLAIN, 12));
		DateTextField.setColumns(10);
		DateTextField.setBounds(154, 196, 232, 38);
		add(DateTextField);

		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String name = NameTextField.getText();
		        String date = DateTextField.getText();
		        
		      /*  FileWriter writer = new FileWriter("/res/list.txt");
		        writer.write(name + "\n");
		        writer.write(date + "\n");*/
		        
		        // Call the AddRowToJTable() method with the obtained values
		        AddRowToJTable(name, date);
		    }
		});
				
		btnAdd.setBackground(new Color(51, 0, 0));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setBounds(154, 347, 232, 34);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBorderPainted(false);
		btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdd.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		add(btnAdd);
		

			
}


	protected void AddRowToJTable(String name, String date) {
		// TODO Auto-generated method stub
		
	}


	public void pack() {
		// TODO Auto-generated method stub
		
	}


	public void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}}
	
