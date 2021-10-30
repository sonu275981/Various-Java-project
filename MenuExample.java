import javax.swing.*;  
class MenuExample  
{  
          JMenu menu, submenu, cupmenu;  
          JMenuItem i1, i2, i3, i4, i5,i6,i7,i8;  
          MenuExample(){  
          JFrame f= new JFrame("Menu and MenuItem cupmenu Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu = new JMenu("Sub Menu"); 
          cupmenu = new JMenu("cupmenu"); 
          i1=new JMenuItem("Item 1");  
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");
          i6=new JMenuItem("Item 6");
          i7=new JMenuItem("Item 7");
          i8=new JMenuItem("Item 8");
  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);cupmenu.add(i6);cupmenu.add(i7);cupmenu.add(i8);  
          menu.add(submenu); submenu.add(cupmenu); 
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}}  