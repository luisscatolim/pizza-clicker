import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

public class Main {
    private static int contador = 0;

    public static void main(String[] args) {
        JFrame janela = new JFrame("Pizza Clicker"); // titulo
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 450);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel label = new JLabel("Total: 0");
        label.setFont(new Font("Arial", Font.BOLD, 22));
        janela.add(label, gbc);

        int largura = 250;
        int altura = 250;

        ImageIcon rawIcon = new ImageIcon("assets/pizza1.png");
        Image img = rawIcon.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        ImageIcon iconPizza = new ImageIcon(img);

        JButton pizza = new JButton(iconPizza);
        pizza.setPreferredSize(new Dimension(largura, altura));
        pizza.setContentAreaFilled(false);
        pizza.setBorderPainted(false);
        pizza.setFocusPainted(false);
        pizza.setOpaque(false);

        pizza.addActionListener(e -> {
            contador++;
            label.setText("Total: " + contador);
        });

        gbc.gridy = 1;
        janela.add(pizza, gbc);

        janela.setVisible(true);
    }
}