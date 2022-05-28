package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Cancion;
import controlador.ControladorDatos;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class Reproduccion extends JFrame {

	private JPanel contentPane;
	private JLabel lblJaviproyect;
	private JButton btnReproducir;

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
		

		
		lblJaviproyect = new JLabel("JAVIPROYECT");
		lblJaviproyect.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaviproyect.setForeground(Color.MAGENTA);
		lblJaviproyect.setFont(new Font("MV Boli", Font.ITALIC, 29));
		lblJaviproyect.setBounds(90, 0, 265, 79);
		contentPane.add(lblJaviproyect);
		
		JComboBox pepe = new JComboBox();
		pepe.setBounds(148, 94, 145, 24);
		contentPane.add(pepe);
		


		ArrayList<Cancion> pepesito=ControladorDatos.recargarCanciones();
		for (Cancion o : pepesito){
		    pepe.addItem(o.toString());//RECORRE EL ARRAYLIST DE CANCIONES PARA PODER ELEGIR CUAL S
		}
		JButton botonpausar = new JButton("Pausar");
		botonpausar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		botonpausar.setBackground(Color.MAGENTA);
		botonpausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La cancion: "+ pepe.getSelectedItem() +" esta reproduciendose");
			}
		});
		botonpausar.setBounds(261, 193, 104, 35);
		contentPane.add(botonpausar);
		
		btnReproducir = new JButton("Reproducir");
		btnReproducir.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnReproducir.setBackground(Color.MAGENTA);
		btnReproducir.setBounds(47, 193, 104, 35);
		contentPane.add(btnReproducir);
		btnReproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La cancion: "+ pepe.getSelectedItem() +" esta reproduciendose");
			}
		});
		
	}
}
