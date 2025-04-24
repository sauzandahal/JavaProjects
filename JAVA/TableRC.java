
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableRC {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        String[] columnNames = {"B1", "B3"};
        Object[][] data = {
            {"B7", "B2"},
            {"B6", "B8"},
            {"B9", "B10"},
            {"B5", "B4"}
            
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
