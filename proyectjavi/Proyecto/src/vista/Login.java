package vista;

import java.util.Scanner;
import java.util.logging.Logger;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Usuario;
import controlador.ControladorDatos;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField TEXTUSUARIO;
	private JTextField TEXTCONTRASENA;
	private static Scanner sc;
	private static int intentos;
	private static String user, pwd;
	
	int width= 592;
	int height = 357;
	
	public Login() {
		getContentPane().setLayout(null);
		
		JButton IniciarButton = new JButton("Iniciar Sesion");
		IniciarButton.setBounds(152, 190, 120, 23);
		getContentPane().add(IniciarButton);
		
		setSize(width, height);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();     //El posicionamiento de la ventana en el medio de la pantalla
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 327);
		panel.setBackground(new Color(0, 0, 128));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(162, 11, 272, 305);
		panel.add(panel_1);
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		
		TEXTUSUARIO = new JTextField();
		TEXTUSUARIO.setBackground(new Color(255, 218, 185));
		TEXTUSUARIO.setBounds(104, 106, 124, 20);
		panel_1.add(TEXTUSUARIO);
		TEXTUSUARIO.setColumns(10);
		
		TEXTCONTRASENA = new JTextField();
		TEXTCONTRASENA.setBackground(new Color(255, 218, 185));
		TEXTCONTRASENA.setBounds(104, 154, 124, 20);
		panel_1.add(TEXTCONTRASENA);
		TEXTCONTRASENA.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO");
		lblNewLabel_2.setForeground(new Color(154, 205, 50));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 10));
		lblNewLabel_2.setBounds(28, 98, 66, 37);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_3.setForeground(new Color(154, 205, 50));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 146, 114, 37);
		panel_1.add(lblNewLabel_3);
		
		JButton Iniciarsesionbuton = new JButton("INICIA SESI\u00D3N");
		Iniciarsesionbuton.setForeground(new Color(147, 112, 219));
		Iniciarsesionbuton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {

                    if(TEXTUSUARIO.getText().trim().isEmpty()||TEXTCONTRASENA.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    }else{
                  
                        String nombre = TEXTUSUARIO.getText();
                        String contrasena=TEXTCONTRASENA.getText();
                        Usuario usuario=new Usuario(nombre,contrasena);
                        ControladorDatos.crearUsuario(usuario);

                         new vistaCanciones().setVisible(true);
                         dispose();

                    }

                }catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "CHUNGO ALGO SALIO MAL");
                }
				
		}
		});
		
		Iniciarsesionbuton.setBackground(new Color(255, 0, 255));
		Iniciarsesionbuton.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		Iniciarsesionbuton.setBounds(51, 215, 165, 29);
		panel_1.add(Iniciarsesionbuton);
		
		JLabel lblJaviproyect = new JLabel("JAVIPROYECT");
		lblJaviproyect.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaviproyect.setForeground(Color.MAGENTA);
		lblJaviproyect.setFont(new Font("MV Boli", Font.ITALIC, 29));
		lblJaviproyect.setBounds(0, 0, 265, 79);
		panel_1.add(lblJaviproyect);
		

	}
}	

