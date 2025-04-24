import javax.swing.*;  
class MenuExample  
{  
          JMenu m,m1;  
          JMenuItem i1, i2, i3, i4, i5;  
          MenuExample(){  
          JFrame f= new JFrame("Example of menu and menu item ");  
          JMenuBar mb=new JMenuBar();  
          m=new JMenu("File");  
        //   submenu=new JMenu("Out");  
          i1=new JMenuItem("Open");  
          i2=new JMenuItem("Save");  
          i3=new JMenuItem("Save As");  
          i4=new JMenuItem("Exit");  
          
          m.add(i1); m.add(i2); m.add(i3);  
          m.add(i4); 		  
        //   m.add(submenu);  
          mb.add(m);  
		  
		  m1 = new JMenu("Help");
		  i5 = new JMenuItem("About option");
		  m1.add(i5);
		  mb.add(m1);
		  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
		  f.setTitle("JMenu");
		  f.setLocationRelativeTo(null);
          f.setVisible(true);  
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public static void main(String args[])  
{  
new MenuExample();  
}
}  
