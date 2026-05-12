import javax.swing.*;
import java.awt.event.*;

class GUIButtonListnerX
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("Marvallous PPA");
         JButton bobj=new JButton("ok");

        bobj.setBounds(100,100,150,50);
        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
               JOptionPane.showMessageDialog(fobj,"Button Clicked");
            }
        });
        fobj.add(bobj);

        fobj.setSize(400,300);
        

        fobj.setLayout(null);

        fobj.setVisible(true);
        
       

    }
}