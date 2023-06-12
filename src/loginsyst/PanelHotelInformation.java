package loginsyst;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PanelHotelInformation extends JPanel {
    private Image standard = new ImageIcon(loginsyst.class.getResource("/res/standard.jpg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    private Image deluxe = new ImageIcon(loginsyst.class.getResource("/res/deluxe.jpg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    private Image suite = new ImageIcon(loginsyst.class.getResource("/res/suite.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);


	public PanelHotelInformation() {
		setBackground(new Color(255, 215, 0));
	//	setBackground(new Color(240, 230, 140));
		
		setBounds(0, 0, 530, 450);
		setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 530, 34);
		add(panel);
		panel.setLayout(null);
		
		
		JLabel lblThisIsHotelInfo = new JLabel("HOTEL PICADILI TRAVELS");
		lblThisIsHotelInfo.setBounds(177, 8, 174, 19);
		panel.add(lblThisIsHotelInfo);
		lblThisIsHotelInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsHotelInfo.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblHotelPicadiliTravels = new JLabel("<html>Hotel Picadili Travels, is a 15 Storey hotel in a vibrant commercial<br> area. This sleek luxury hotel is 3 km from SM Mall of Asia, and 5 km <br>from both World Trade Center Metro Manila and Ninoy Aquino <br>International Airport. This Hotel serves a 24 hours reservation.</html>");
		lblHotelPicadiliTravels.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelPicadiliTravels.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHotelPicadiliTravels.setBounds(0, 78, 530, 110);
		add(lblHotelPicadiliTravels);
		
		JLabel lblNewLabel = new JLabel("<html>40Sq-Meter, Table and Queen Bed</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 380, 151, 34);
		add(lblNewLabel);
		
		JLabel lblStandard = new JLabel("STANDARD");
		lblStandard.setBounds(10, 202, 161, 19);
		add(lblStandard);
		lblStandard.setHorizontalAlignment(SwingConstants.CENTER);
		lblStandard.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblDeluxe = new JLabel("DELUXE");
		lblDeluxe.setBounds(181, 202, 161, 19);
		add(lblDeluxe);
		lblDeluxe.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeluxe.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblSuite = new JLabel("SUITE");
		lblSuite.setBounds(352, 202, 161, 19);
		add(lblSuite);
		lblSuite.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuite.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel_1 = new JLabel("<html>60Sq-M, Sofa, Table, and King Bed</html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(191, 380, 151, 34);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>2Rooms, 120Sq-M, Sofa and King Bed</html>");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(362, 380, 151, 34);
		add(lblNewLabel_2);
		
		JLabel lblstandard = new JLabel("");
		lblstandard.setIcon(new ImageIcon(standard));
		lblstandard.setBounds(20, 220, 151, 133);
		add(lblstandard);
		
		JLabel lbldeluxe = new JLabel("");
		lbldeluxe.setIcon(new ImageIcon(deluxe));
		lbldeluxe.setBounds(191, 220, 151, 133);
		add(lbldeluxe);
		
		JLabel lblsuite = new JLabel("");
		lblsuite.setIcon(new ImageIcon(suite));
		lblsuite.setBounds(362, 220, 151, 133);
		add(lblsuite);
		
		JLabel lblHours = new JLabel("3000/24 Hours");
		lblHours.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHours.setHorizontalAlignment(SwingConstants.CENTER);
		lblHours.setBounds(20, 355, 151, 34);
		add(lblHours);
		
		JLabel lblHours_3 = new JLabel("6000/24 Hours");
		lblHours_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHours_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHours_3.setBounds(191, 355, 151, 34);
		add(lblHours_3);
		
		JLabel lblHours_1 = new JLabel("10000/24 Hours");
		lblHours_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHours_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHours_1.setBounds(362, 355, 151, 34);
		add(lblHours_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 425, 530, 19);
		add(panel_1);

		
		
	}
}
