package vista;

import controlador.ControladorDatos;
import beans.Cancion;
import beans.Usuario;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class vistaCanciones extends JFrame {

	private JPanel PanelFondo;
	private JTable table;
	private JTextField RUTATEXT;
	private JTextField NOMBRETEXT;
	
	int width = 1144;
	int height = 569;
	private JTextField IDTEXT;
	private JTextField ARTISTATEXT;

	public vistaCanciones() {
		
		setSize(1147, 570);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();    
        this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		setBackground(Color.WHITE);
		PanelFondo = new JPanel();
		PanelFondo.setBackground(new Color(25, 25, 112));
		PanelFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelFondo);
		
		// TABLA
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		table.setBounds(545, 142, 391, 339);		
		PanelFondo.add(table);
		
		dtm.addColumn("Nombre");
		dtm.addColumn("id");
		dtm.addColumn("ruta");
		dtm.addColumn("artista");

		
		JButton SALIRBUTTON = new JButton("SALIR");
		SALIRBUTTON.setForeground(new Color(147, 112, 219));
		SALIRBUTTON.setBounds(374, 439, 123, 68);
		SALIRBUTTON.setBackground(new Color(255, 0, 255));
		SALIRBUTTON.setIcon(null);
		
		SALIRBUTTON.setFont(new Font("Arial Black", Font.BOLD, 16));
		SALIRBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				dispose(); 
			}
		});
		
		JButton ReproduccionButton = new JButton("REPRODUCIR");
		ReproduccionButton.setBackground(new Color(255, 0, 255));
		ReproduccionButton.setForeground(new Color(147, 112, 219));
		ReproduccionButton.setBounds(225, 439, 139, 68);
		ReproduccionButton.setIcon(null);
		ReproduccionButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new Reproduccion().setVisible(true);
				dispose();
			}
		});
		ReproduccionButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		ReproduccionButton.setOpaque(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(233, 90, 252, 322);
		panel.setBackground(new Color(255, 255, 224));
		panel.setLayout(null);
		
		RUTATEXT = new JTextField();
		RUTATEXT.setBounds(107, 197, 114, 20);
		panel.add(RUTATEXT);
		RUTATEXT.setColumns(10);
		
		NOMBRETEXT = new JTextField();
		NOMBRETEXT.setBounds(107, 62, 114, 20);
		panel.add(NOMBRETEXT);
		NOMBRETEXT.setColumns(10);
		
		JButton botoncrearcancion = new JButton("CREAR");
		botoncrearcancion.setForeground(new Color(147, 112, 219));
		botoncrearcancion.setBackground(new Color(255, 0, 255));
		botoncrearcancion.setBounds(982, 153, 139, 52);
		botoncrearcancion.setFont(new Font("Arial Black", Font.BOLD, 15));
		botoncrearcancion.setIcon(null);
		
		JButton buttonRecargarListaCanciones = new JButton("RENOVAR LISTA");
		buttonRecargarListaCanciones.setBackground(new Color(255, 0, 255));
		buttonRecargarListaCanciones.setForeground(new Color(147, 112, 219));
		buttonRecargarListaCanciones.setBounds(982, 343, 139, 49);
		buttonRecargarListaCanciones.setIcon(null);
		buttonRecargarListaCanciones.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		JButton buttonBorrarCancion = new JButton("BORRAR");
		buttonBorrarCancion.setBackground(new Color(255, 0, 255));
		buttonBorrarCancion.setForeground(new Color(147, 112, 219));
		buttonBorrarCancion.setBounds(982, 245, 145, 49);
		buttonBorrarCancion.setFont(new Font("Arial Black", Font.BOLD, 16));
		buttonBorrarCancion.setIcon(null);
		
		JLabel informacioncanciontitulo = new JLabel("CANCIONES");
		informacioncanciontitulo.setForeground(new Color(34, 139, 34));
		informacioncanciontitulo.setFont(new Font("Microsoft Himalaya", Font.BOLD, 24));
		informacioncanciontitulo.setBounds(68, 0, 145, 51);
		panel.add(informacioncanciontitulo);
		PanelFondo.setLayout(null);
		PanelFondo.add(SALIRBUTTON);
		PanelFondo.add(ReproduccionButton);
		PanelFondo.add(botoncrearcancion);
		PanelFondo.add(panel);
		
		JLabel ID = new JLabel("ID:");
		ID.setForeground(new Color(0, 100, 0));
		ID.setFont(new Font("Arial Black", Font.BOLD, 16));
		ID.setBounds(47, 118, 62, 45);
		panel.add(ID);
		
		JLabel RUTA = new JLabel("RUTA:");
		RUTA.setForeground(new Color(0, 100, 0));
		RUTA.setFont(new Font("Arial Black", Font.BOLD, 16));
		RUTA.setBounds(31, 189, 89, 30);
		panel.add(RUTA);
		
		IDTEXT = new JTextField();
		IDTEXT.setColumns(10);
		IDTEXT.setBounds(107, 133, 114, 20);
		panel.add(IDTEXT);
		
		JLabel Nombr = new JLabel("NOMBRE:");
		Nombr.setForeground(new Color(0, 100, 0));
		Nombr.setFont(new Font("Arial Black", Font.BOLD, 16));
		Nombr.setBounds(20, 57, 89, 30);
		panel.add(Nombr);
		
		JLabel Artist = new JLabel("ARTISTA:");
		Artist.setForeground(new Color(0, 100, 0));
		Artist.setFont(new Font("Arial Black", Font.BOLD, 16));
		Artist.setBounds(20, 230, 89, 73);
		panel.add(Artist);
		
		ARTISTATEXT = new JTextField();
		ARTISTATEXT.setColumns(10);
		ARTISTATEXT.setBounds(107, 256, 114, 20);
		panel.add(ARTISTATEXT);
		PanelFondo.add(buttonRecargarListaCanciones);
		PanelFondo.add(buttonBorrarCancion);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setForeground(new Color(154, 205, 50));
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_8.setBounds(678, 114, 20, 27);
		PanelFondo.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setForeground(new Color(154, 205, 50));
		lblNewLabel_9.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_9.setBounds(558, 115, 65, 25);
		PanelFondo.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("RUTA");
		lblNewLabel_11.setForeground(new Color(154, 205, 50));
		lblNewLabel_11.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_11.setBounds(743, 120, 103, 14);
		PanelFondo.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Artista");
		lblNewLabel_12.setForeground(new Color(154, 205, 50));
		lblNewLabel_12.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_12.setBounds(847, 114, 89, 27);
		PanelFondo.add(lblNewLabel_12);
		
		JLabel lblJaviproyect = new JLabel("JAVIPROYECT");
		lblJaviproyect.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaviproyect.setForeground(Color.MAGENTA);
		lblJaviproyect.setFont(new Font("MV Boli", Font.ITALIC, 29));
		lblJaviproyect.setBounds(599, 11, 265, 79);
		PanelFondo.add(lblJaviproyect);
		
		JButton generarficheroboton = new JButton("GENERAR FICHERO");
		generarficheroboton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


	                String nombre = (NOMBRETEXT.getText());
	                
	                int id = Integer.parseInt(IDTEXT.getText());
	                
	                String ruta = (RUTATEXT.getText());
	                
	                String artista = (ARTISTATEXT.getText());


	                new ControladorDatos().crearFicheroCancion(nombre,id,ruta,artista);
	            }
			}
		);
		generarficheroboton.setForeground(new Color(147, 112, 219));
		generarficheroboton.setFont(new Font("Arial Black", Font.BOLD, 10));
		generarficheroboton.setBackground(Color.MAGENTA);
		generarficheroboton.setBounds(982, 439, 139, 49);
		PanelFondo.add(generarficheroboton);
		
		
		/* ACCIONES */
		
		botoncrearcancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Cancion cancion = crearlistacancion();
                    new ControladorDatos().crearCancion(cancion);
                } catch(Exception error) {
                    JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                    return;
                }
			}
		});
		
		buttonBorrarCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id_cancion = Integer.parseInt(NOMBRETEXT.getText());
					new ControladorDatos().borrarCancion(id_cancion);
					
					ArrayList<Cancion> canciones = new ControladorDatos().recargarCanciones();
					dtm.getDataVector().removeAllElements();
					dtm.fireTableDataChanged();
					

					for(Cancion cancion : canciones){
						Object[] fila = new Object[4];
						fila[0] = cancion.getNombre();
						fila[1] = cancion.getId_cancion();
						fila[2] = cancion.getRuta();					
						fila[3] = cancion.getArtista();						
						dtm.addRow(fila);
					}
					
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
					return;
				}
			}
		});

		buttonRecargarListaCanciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Cancion> canciones = new ControladorDatos().recargarCanciones();
				dtm.getDataVector().removeAllElements();
				dtm.fireTableDataChanged();
				

				for(Cancion cancion : canciones){
					Object[] fila = new Object[4];
					fila[0] = cancion.getNombre();
					fila[1] = cancion.getId_cancion();
					fila[2] = cancion.getRuta();					
					fila[3] = cancion.getArtista();

					dtm.addRow(fila);
				}
			}
		});
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	        	if(table.getSelectedRow() == -1) return;
	        	
	        	String nombre = (String) table.getValueAt(table.getSelectedRow(), 0);
	        	int id_cancion = (int) table.getValueAt(table.getSelectedRow(), 1);
	        	String ruta = (String) table.getValueAt(table.getSelectedRow(), 2);
	        	String artista = (String) table.getValueAt(table.getSelectedRow(), 3);
	        	NOMBRETEXT.setText(nombre);
	        	IDTEXT.setText(id_cancion+"");
	        	RUTATEXT.setText(ruta);
	        	ARTISTATEXT.setText(artista);

	        }
	    });
		
		
	}

	private Cancion crearlistacancion() {
        String nombre = NOMBRETEXT.getText();
        int id = Integer.parseInt(IDTEXT.getText());
        String ruta = RUTATEXT.getText();
        String artista = ARTISTATEXT.getText();  
        Cancion cancion = new Cancion(nombre, id, ruta, artista);
		return cancion;
	}
}