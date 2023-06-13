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
	JComboBox comboBox;
	JLabel lblNewLabel;
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
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "STANDARD", "DELUXE", "SUITE"}));
		comboBox.setBounds(155, 248, 232, 31);
		comboBox.addActionListener(comboBox);
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
		
		lblNewLabel = new JLabel("NA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblNewLabel);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton && e.getSource()== comboBox) {
			int roomType = comboBox.getSelectedIndex(); // 1 "STANDARD", 2 is "DELUXE", 3 is "SUITE" 
			String date = textField.getSelectedText();
			int available_rooms = 0;
		//	for (int i = 0; i < 10; i++) // I changed this from num_rooms to MAX_ROOMS, this was the main reason why it won't print more than one
		//    {
		//        if (strcmp(rooms[i].type, type) == 0)
		//        {
		//            if (strcmp(rooms[i].isReserved, date) != 0)
		//            {
		//                available_rooms++;
		//               }
		//        }
		//    }
		//	available_rooms.ToString(available_rooms);
		//	lblNewLabel.setText(available_rooms);
		}
		
	}
}

/*for (int i = 0; i < MAX_ROOMS; i++) // I changed this from num_rooms to MAX_ROOMS, this was the main reason why it won't print more than one
    {
       // printf("%s (to show how many rooms)\n", rooms[i].type); //  This is the debugging thing
        if (strcmp(rooms[i].type, type) == 0)
        {
            if (strcmp(rooms[i].isReserved, date) != 0)
            {
                available_rooms++;
               }
        }
    }
    if (available_rooms == 0)
        printf("\n\t\t\tThere are no available rooms of type %s on the requested date %s\n", type,date);
    else
        printf("\n\t\t\t%d Rooms is/are available for type %s.\n", available_rooms, type);
    getch();
    
    
    void room_Update(char newDate[MAX_DATE_LENGTH], char newType[MAX_TYPE_LENGTH], int roomAmount) // room update for availability
{
    int roomFlag = 0;
    char aab[MAX_DATE_LENGTH] = "NA/NA/NA";
    for (int i = 0; i < MAX_ROOMS; i++)
    {
        if (strcmp(rooms[i].type, newType) == 0)
        {
            if (strcmp(rooms[i].isReserved, aab) == 0)
            {
                strcpy(rooms[i].isReserved, newDate);
                roomFlag++;
                if(roomFlag == roomAmount)
                    i = MAX_ROOMS;
            }
        }
    }
}*/
