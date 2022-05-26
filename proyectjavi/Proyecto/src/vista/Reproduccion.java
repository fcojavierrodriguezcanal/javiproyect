package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Reproduccion extends JFrame {

	private JPanel contentPane;
	private JLabel lblJaviproyect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reproduccion frame = new Reproduccion();
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
	public Reproduccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Reproducir = new JButton("REPRODUCIR");
		Reproducir.setBackground(new Color(255, 0, 255));
		Reproducir.setFont(new Font("Arial Black", Font.PLAIN, 11));
		Reproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Su cancion se esta reproduciendo");
			}
		});
		Reproducir.setBounds(50, 154, 115, 23);
		contentPane.add(Reproducir);
		
		JButton Pausar = new JButton("PAUSAR");
		Pausar.setBackground(new Color(255, 0, 255));
		Pausar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		Pausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Su cancion se ha pausado");
			}
		});
		Pausar.setBounds(262, 154, 101, 23);
		contentPane.add(Pausar);
		
		lblJaviproyect = new JLabel("JAVIPROYECT");
		lblJaviproyect.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaviproyect.setForeground(Color.MAGENTA);
		lblJaviproyect.setFont(new Font("MV Boli", Font.ITALIC, 29));
		lblJaviproyect.setBounds(67, 39, 265, 79);
		contentPane.add(lblJaviproyect);
		
	}

}
