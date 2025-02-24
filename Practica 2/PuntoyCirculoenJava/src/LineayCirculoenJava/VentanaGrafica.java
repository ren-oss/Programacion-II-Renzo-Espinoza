package LineayCirculoenJava;
import javax.swing.*;
import java.awt.*;
public class VentanaGrafica extends JPanel {
	private Linea linea;
    private Circulo circulo;
    private JLabel etiquetaInfo;

    public VentanaGrafica(Linea linea, Circulo circulo) {
        this.linea = linea;
        this.circulo = circulo;

        // Crear una etiqueta para mostrar la información
        etiquetaInfo = new JLabel();
        etiquetaInfo.setFont(new Font("Arial", Font.PLAIN, 16));
        actualizarEtiqueta();

        // Añadir la etiqueta al panel
        setLayout(new BorderLayout());
        add(etiquetaInfo, BorderLayout.SOUTH);
    }

    private void actualizarEtiqueta() {
        String infoLinea = linea.toString();
        String infoCirculo = circulo.toString();
        etiquetaInfo.setText(infoLinea + " | " + infoCirculo);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.dibujarLinea(g);
        circulo.dibujarCirculo(g);
    }

    public static void main(String[] args) {
        // Crear puntos, línea y círculo
        Punto p1 = new Punto(50, 50);
        Punto p2 = new Punto(200, 200);
        Linea linea = new Linea(p1, p2);

        Punto centro = new Punto(150, 150);
        Circulo circulo = new Circulo(centro, 50);

        // Crear la ventana
        JFrame frame = new JFrame("Ventana Gráfica con Coordenadas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new VentanaGrafica(linea, circulo));
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
