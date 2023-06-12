package loginsyst;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelReservationList extends JPanel {
	private JTable table;


	public PanelReservationList() {
		setBackground(new Color(255, 215, 0));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 36, 530, 34);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblThisIsResList = new JLabel("RESERVATION LIST");
		lblThisIsResList.setBounds(177, 8, 184, 19);
		panel.add(lblThisIsResList);
		lblThisIsResList.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsResList.setFont(new Font("Dialog", Font.BOLD, 14));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 425, 530, 19);
		add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 101, 432, 245);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Dialog", Font.PLAIN, 12));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setBackground(new Color(230, 230, 250));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"NAME", "ROOM TYPE", "PRICE", "DATE", "ROOM ID"
			}
		));
		
		JButton btnBackToMakeRes = new JButton("GO BACK");
		btnBackToMakeRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBackToMakeRes.setBackground(new Color(51, 0, 0));
		btnBackToMakeRes.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBackToMakeRes.setBounds(152, 370, 232, 34);
		btnBackToMakeRes.setForeground(Color.WHITE);
		btnBackToMakeRes.setBorderPainted(false);
		btnBackToMakeRes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBackToMakeRes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(btnBackToMakeRes);
		

	}
}
