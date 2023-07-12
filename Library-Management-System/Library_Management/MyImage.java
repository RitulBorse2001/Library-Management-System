package Library_Management;

import java.awt.*;  
import javax.swing.JFrame;  
  
public class MyImage extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("lib_logo.png");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) 
    {  
        MyImage m=new MyImage();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  


}