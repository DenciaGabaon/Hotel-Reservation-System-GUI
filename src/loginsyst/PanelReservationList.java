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
	private static JTable jTable1_1;


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
		
		jTable1_1 = new JTable();
		scrollPane.setViewportView(jTable1_1);
		jTable1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		jTable1_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jTable1_1.setBackground(new Color(230, 230, 250));
		jTable1_1.setModel(new DefaultTableModel(
			new Object[][] {
				//{null, null, null, null, null},
				//{null, null, null, null, null},
				//{null, null, null, null, null},
				//{null, null, null, null, null},
			},
			new String[] {
					"ROOM ID", "NAME", "ROOM TYPE", "DATE", "PRICE"  
			}
		));
		
		JButton btnBackToMakeRes = new JButton("GO BACK");
		btnBackToMakeRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMakeReservation panelText = new PanelMakeReservation();
				panelText.setVisible(true);
				panelText.pack();
				panelText.setLocationRelativeTo(null);
				
			}
			
			private javax.swing.JButton JButtonOpen;
			private javax.swing.JScrollPane JScrollPane1;
			private javax.swing.JTable jTable1_1;
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
	
	public static void AddRowToJTable(String name, String date)
	{
		DefaultTableModel model = (DefaultTableModel) jTable1_1.getModel();
		 model.addRow(new Object [] { name, date });
	}

	public static void roomIDgenerator() {
		//
	}
}
