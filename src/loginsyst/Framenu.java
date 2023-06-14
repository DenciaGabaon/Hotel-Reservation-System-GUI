package loginsyst;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Framenu extends JFrame {

	private JPanel contentPane;
	
	private final JPanel panel = new JPanel();
	private Image img_logo = new ImageIcon(loginsyst.class.getResource("/res/PicadiliLogo.png")).getImage().getScaledInstance(250, 220, Image.SCALE_SMOOTH);
	
	private PanelMakeReservation panelMakeReservation;
	private PanelHotelInformation panelHotelInformation;
	//private PanelAvailability panelAvailability;
	private PanelReservationList panelReservationList;
	private PanelLogOut panelLogOut;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Framenu frame = new Framenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Framenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 238, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panelMakeReservation = new PanelMakeReservation();
		panelHotelInformation = new PanelHotelInformation();
		//panelAvailability = new PanelAvailability();
		panelReservationList = new PanelReservationList();
		panelLogOut = new PanelLogOut();
		
		final JPanel panelinfo = new JPanel();
		panelinfo.addMouseListener(new PanelButtonMouseAdapter(panelinfo) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHotelInformation);
			}
		});
		
		panelinfo.setBackground(new Color(51, 0, 0));
		panelinfo.setBounds(0, 221, 238, 35);
		panel.add(panelinfo);
		panelinfo.setLayout(null);
		
		JLabel lblinfo = new JLabel("HOTEL INFORMATION");
		lblinfo.setForeground(Color.WHITE);
		lblinfo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo.setBounds(25, 11, 182, 14);
		panelinfo.add(lblinfo);
		
		final JPanel panelmakeres = new JPanel();
		panelmakeres.addMouseListener(new PanelButtonMouseAdapter(panelmakeres) {
				@Override
				public void mouseClicked(MouseEvent e) {
					menuClicked(panelMakeReservation);
				}
	     });
		panelmakeres.setBackground(new Color(51, 0, 0));
		panelmakeres.setBounds(0, 257, 238, 35);
		panel.add(panelmakeres);
		panelmakeres.setLayout(null);
		
		JLabel lblinfo_1_1 = new JLabel("MAKE RESERVATION");
		lblinfo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo_1_1.setForeground(Color.WHITE);
		lblinfo_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblinfo_1_1.setBounds(25, 11, 182, 14);
		panelmakeres.add(lblinfo_1_1);
		
		final JPanel panellogout = new JPanel();
		panellogout.addMouseListener(new PanelButtonMouseAdapter(panellogout) {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?")==0) {
					loginsyst loginSyst = new loginsyst();
					loginSyst.setVisible(true);
					Framenu.this.dispose();
				}
			}
		});
		panellogout.setBackground(new Color(51, 0, 0));
		panellogout.setBounds(0, 329, 238, 35);
		panel.add(panellogout);
		panellogout.setLayout(null);
		
		JLabel lblinfo_1_3 = new JLabel("LOG OUT");
		lblinfo_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo_1_3.setForeground(Color.WHITE);
		lblinfo_1_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblinfo_1_3.setBounds(26, 11, 182, 14);
		panellogout.add(lblinfo_1_3);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setBounds(18, 15, 218, 183);
		panel.add(lbllogo);
		lbllogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogo.setIcon(new ImageIcon (img_logo));
		
		final JPanel paneldisplay = new JPanel();
		paneldisplay.addMouseListener(new PanelButtonMouseAdapter(paneldisplay) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelReservationList);
			}
		});
		paneldisplay.setBackground(new Color(51, 0, 0));
		paneldisplay.setBounds(0, 293, 238, 35);
		panel.add(paneldisplay);
		paneldisplay.setLayout(null);
		
		JLabel lblinfo_1_2 = new JLabel("RESERVATION LIST");
		lblinfo_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo_1_2.setForeground(Color.WHITE);
		lblinfo_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblinfo_1_2.setBounds(26, 11, 182, 14);
		paneldisplay.add(lblinfo_1_2);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBackground(new Color(230, 230, 250));
		//panelMainContent.setBackground(new Color(240, 230, 140));
		panelMainContent.setBounds(248, 28, 526, 446);
		contentPane.add(panelMainContent);
		
		panelMainContent.add(panelMakeReservation);
		panelMainContent.add(panelHotelInformation);
	//	panelMainContent.add(panelAvailability);
		panelMainContent.add(panelReservationList);
		panelMainContent.add(panelLogOut);
		panelMainContent.setLayout(null);
		
		menuClicked(panelHotelInformation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 165, 32));
		panel_1.setBounds(238, 0, 562, 24);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		final JLabel lblClose = new JLabel("X");
		lblClose.setBounds(536, 2, 16, 21);
		panel_1.add(lblClose);
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClose.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				lblClose.setForeground(Color.WHITE);
			}
			
		});
		lblClose.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblClose.setForeground(new Color(240, 248, 255));
		lblClose.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
	}
	
	public void menuClicked(JPanel panel) {
		
		panelMakeReservation.setVisible(false);
		panelHotelInformation.setVisible(false);
	//	panelAvailability.setVisible(false);
		panelReservationList.setVisible(false);
		panelLogOut.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		public PanelButtonMouseAdapter (JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(255, 255, 102));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(51, 0, 0));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
	  }
	}
  
