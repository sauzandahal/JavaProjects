//Create a table as given below :
/* import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class DeTable {
    JFrame f;
    JTable t;
    DefaultTableModel m;
    JScrollPane s;

    public DeTable(){
        f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);

        String col[]={"B1","B3"};
        Object[][] data={
            {"B7","B2"},
            {"B6","B8"},
            {"B9","B10"},
            {"B5","B4"}
        };
        m=new DefaultTableModel(data,col);
        t=new JTable(m);
        s=new JScrollPane(t);
        f.add(s);
        f.setVisible(true);
    }
} */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DeTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data = {
            {null, "Row 1, Column 2", null},
            {null, "Row 2, Column 2", null},
            {null, "Row 3, Column 2", null}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
    }
}

