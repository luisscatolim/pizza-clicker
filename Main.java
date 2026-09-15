import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

public class Main {
    // Num of pizzas
    private static int numPizzas = 0; 

    public static void main(String[] args) {
        // Config window
        JFrame window = new JFrame("Pizza Clicker"); // Ttitle
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program when click in X
        window.setSize(500, 500); // size of window, x, y
        window.setLocationRelativeTo(null); // open window in center of screen
        window.setResizable(false); // lock the resize of window

        // config the points
        JLabel totalText = new JLabel("Total: 0"); 
        totalText.setFont(new Font("Arial", Font.BOLD, 28));
        totalText.setHorizontalAlignment(JLabel.CENTER); // Centralize the text

        // Image configs
        int sizePizza = 250;
        ImageIcon rawIcon = new ImageIcon("assets/pizza1.png"); // load the image

        // Ajust the sze
        Image img = rawIcon.getImage().getScaledInstance(sizePizza, sizePizza, Image.SCALE_SMOOTH); 
        ImageIcon iconPizza = new ImageIcon(img); // create the final image of pizza ajusted

        // pizza button 
        JButton pizza = new JButton(iconPizza); 
        pizza.setContentAreaFilled(false); // background transparent
        pizza.setBorderPainted(false);     // remove the border
        pizza.setFocusPainted(false);      // remove the select box on hover 

        // click action
        pizza.addActionListener(e -> { 
            numPizzas++; // plus 1 in var
            totalText.setText("Total: " + numPizzas); // update the text
        });

        // add in window
        
        window.add(totalText, BorderLayout.NORTH); // set the text in north (top)
        window.add(pizza, BorderLayout.CENTER);    // set the button in center
        // I think this way is more easy to understand for every (java)programmer when see my code, but this project is a simple test when I create my classes of Git in OnlyOffice
        // It is the way how I learn programming... I write slides and documents about how Im going to teach a class

        // show the window
        window.setVisible(true);
    }
}