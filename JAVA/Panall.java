// import javax.swing.*;
// import java.awt.*;

// public class Panall {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("JPanel Example");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(new GridLayout(5, 1));

//         JPanel panel1 = new JPanel();
//         panel1.setPreferredSize(new Dimension(100, 100));
//         frame.add(panel1);

//         JPanel panel2 = new JPanel();
//         panel2.setPreferredSize(new Dimension(200, 100));
//         frame.add(panel2);

//         JPanel panel3 = new JPanel();
//         panel3.setPreferredSize(new Dimension(300, 100));
//         frame.add(panel3);

//         JPanel panel4 = new JPanel();
//         panel4.setPreferredSize(new Dimension(400, 100));
//         frame.add(panel4);

//         JPanel panel5 = new JPanel();
//         panel5.setPreferredSize(new Dimension(500, 100));
//         frame.add(panel5);
//         frame.setLayout(new FlowLayout());
//         frame.pack();
//         frame.setVisible(true);
//     }
// }


import javax.swing.*;
import java.awt.*;

public class Panall {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the main container JPanel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create and add four child JPanels
        JPanel panel1 = createPanel(Color.RED, "Red", 100, 100);
        JPanel panel2 = createPanel(Color.GREEN, "Green", 150, 150);
        JPanel panel3 = createPanel(Color.BLUE, "Blue", 200, 200);
        JPanel panel4 = createPanel(Color.YELLOW, "yellow", 250, 250);

        mainPanel.add(panel1, BorderLayout.NORTH);
        mainPanel.add(panel2, BorderLayout.SOUTH);
        mainPanel.add(panel3, BorderLayout.WEST);
        mainPanel.add(panel4, BorderLayout.EAST);

        // Add the main panel to the frame
        frame.getContentPane().add(mainPanel);

        // Display the frame
        frame.setVisible(true);
    }

    private static JPanel createPanel(Color color, String name, int width, int height) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setPreferredSize(new Dimension(width, height));
        panel.setBorder(BorderFactory.createTitledBorder(name));

        return panel;
    }
}

