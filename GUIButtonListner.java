import javax.swing.*;
import java.awt.event.*;
class GUIButtonListner
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("Marvallous PPA");
         JButton bobj=new JButton("ok");

        bobj.setBounds(100,100,150,50);
        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button clicked");


            }
        });
        fobj.add(bobj);

        fobj.setSize(400,300);
        

        fobj.setLayout(null);

        fobj.setVisible(true);
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

    }
}