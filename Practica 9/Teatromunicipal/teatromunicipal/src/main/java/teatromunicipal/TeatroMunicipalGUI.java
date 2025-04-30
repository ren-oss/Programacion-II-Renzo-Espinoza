/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatromunicipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Renzo
 */
public class TeatroMunicipalGUI extends JFrame implements ActionListener{
    private JRadioButton rbPalco, rbPlatea, rbGaleria;
    private JTextField tfNumero, tfDias;
    private JButton btnVende, btnSalir;
    private JTextArea areaResultado;

    public TeatroMunicipalGUI() {
        setTitle("Teatro Municipal");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Encabezado
        JPanel header = new JPanel(new BorderLayout());
        JLabel titulo = new JLabel("Teatro Municipal", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        header.add(titulo, BorderLayout.CENTER);

        ImageIcon icono = new ImageIcon("C:\\Users\\PC\\Desktop\\Renzo 2025\\Programación y web\\Segundo Semestre\\Programacion-II-Renzo-Espinoza\\Practica 9\\Teatromunicipal\\teatromunicipal\\src\\main\\java\\teatromunicipal\\images.jpeg");
        JLabel imagen = new JLabel(icono);
        header.add(imagen, BorderLayout.EAST);
        add(header, BorderLayout.NORTH);

        // Panel Central
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.setBorder(BorderFactory.createTitledBorder("Datos del Boleto"));

        JPanel tipoPanel = new JPanel(new FlowLayout());
        rbPalco = new JRadioButton("Palco", true);
        rbPlatea = new JRadioButton("Platea");
        rbGaleria = new JRadioButton("Galeria");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbPalco);
        grupo.add(rbPlatea);
        grupo.add(rbGaleria);
        tipoPanel.add(rbPalco);
        tipoPanel.add(rbPlatea);
        tipoPanel.add(rbGaleria);
        centro.add(tipoPanel);

        JPanel datosPanel = new JPanel(new FlowLayout());
        datosPanel.add(new JLabel("Número:"));
        tfNumero = new JTextField(5);
        datosPanel.add(tfNumero);

        datosPanel.add(new JLabel("Cant. Días para el Evento:"));
        tfDias = new JTextField(5);
        datosPanel.add(tfDias);
        centro.add(datosPanel);

        JPanel botones = new JPanel(new FlowLayout());
        btnVende = new JButton("Vende");
        btnSalir = new JButton("Salir");
        botones.add(btnVende);
        botones.add(btnSalir);
        centro.add(botones);

        add(centro, BorderLayout.CENTER);

        // Área de resultado
        areaResultado = new JTextArea(3, 40);
        areaResultado.setEditable(false);
        areaResultado.setForeground(Color.BLUE);
        areaResultado.setFont(new Font("Arial", Font.BOLD, 14));
        add(areaResultado, BorderLayout.SOUTH);

        btnVende.addActionListener(this);
        btnSalir.addActionListener(e -> System.exit(0));
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int numero = Integer.parseInt(tfNumero.getText());
            int dias = tfDias.getText().isEmpty() ? 0 : Integer.parseInt(tfDias.getText());

            Boleto boleto = null;
            if (rbPalco.isSelected()) {
                boleto = new Palco(numero);
            } else if (rbPlatea.isSelected()) {
                boleto = new Platea(numero, dias);
            } else if (rbGaleria.isSelected()) {
                boleto = new Galeria(numero, dias);
            }

            areaResultado.setText(boleto.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "¡Ingrese números válidos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeatroMunicipalGUI().setVisible(true));
    }
}
