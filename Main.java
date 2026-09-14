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
    private static int numPizzas = 0; // number of clicks/pizzas

    public static void main(String[] args) {
        JFrame window = new JFrame("Pizza Clicker"); // title of window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program when close the window
        window.setSize(500, 500); // set the size of window
        window.setLocationRelativeTo(null); // 
        window.setLayout(new GridBagLayout());
        window.setResizable(false);

        GridBagConstraints gbc = new GridBagConstraints(); // create to control the swing
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER; // set on center

        JLabel totalText = new JLabel("Total: 0"); // create the text of points
        totalText.setFont(new Font("Arial", Font.BOLD, 22)); // simple configs of text
        window.add(totalText, gbc);

        int largura = 250;
        int altura = 250;

        ImageIcon rawIcon = new ImageIcon("assets/pizza1.png"); //  load the original image
        Image img = rawIcon.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH); // configure the image to create the icon
        ImageIcon iconPizza = new ImageIcon(img); // create the icon of pizza's button

        JButton pizza = new JButton(iconPizza); // create the button/clicker
        pizza.setPreferredSize(new Dimension(largura, altura)); // set the size of button
        pizza.setContentAreaFilled(false); // set the area of button
        pizza.setBorderPainted(false);
        pizza.setFocusPainted(false);
        pizza.setOpaque(false);

        pizza.addActionListener(e -> { // when click on pizza button
            numPizzas++; // add in num of pizzas
            totalText.setText("Total: " + numPizzas); //update the text
        });

        gbc.gridy = 1;
        window.add(pizza, gbc);

        window.setVisible(true);
    }
}