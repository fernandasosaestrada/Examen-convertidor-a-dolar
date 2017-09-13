


package convertidor;
/**
 *
 * @author Sosa Estrada María Fernanda
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;

public class Convertidor extends JFrame implements ActionListener {

    Conver objCalcu;
    
    private JTextField Jpesos, Jdolares;
    private JButton Convertir;
    private JLabel Titulo, Pesos, Dolares;

    public Convertidor() {
        objCalcu = new Conver();
        configurarVentana();
        iniciarComponentes();
    }

    /*
    * Todo lo relacionado con el diseño
    */
    private void configurarVentana() {
        setTitle("CONVERTIDOR");
        setSize(650, 510);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220, 216, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    
    /*
    * Ponemos los atributos de las variables
     */
	 
    private void iniciarComponentes() {
        //Labels

        Titulo= new JLabel("CONVERTIDOR");
        Titulo.setBounds(220, 40, 400, 30);
        Titulo.setFont(new Font("TimesRoman", Font.BOLD, 23));
        add(Titulo);
        Titulo.setVisible(true);

        Pesos = new JLabel("Cantidad a converitr");
        Pesos.setBounds(100, 180, 200, 20);
        Pesos.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(Pesos);
        Pesos.setVisible(true);

        Dolares = new JLabel("Dolares");
        Dolares.setBounds(100, 250, 200, 20);
        Dolares.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(Dolares);
        Dolares.setVisible(true);;

        //TextFields
        Jpesos = new JTextField();
        Jpesos.setBounds(300, 180, 200, 30);
        Jpesos.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(Jpesos);
        Jpesos.setVisible(true);

        Jdolares = new JTextField();
        Jdolares.setBounds(300, 250, 200, 30);
        Jdolares.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });

        add(Jdolares);
        Jdolares.setVisible(true);

        //buttons
		
        Convertir = new JButton("Convertir");
        Convertir.setBounds(430, 300, 100, 50);
        add(Convertir);
        Convertir.addActionListener(this);
        Convertir.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num, resultado;
        String resul, total;

        if (e.getSource() == Convertir) {
			
            num = Integer.parseInt(Jpesos.getText());
            objCalcu.setNum(num);
            resul = objCalcu.Result();
            Jdolares.setText(resul);

        } 

}
}

