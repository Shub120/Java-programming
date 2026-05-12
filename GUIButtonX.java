import javax.swing.*;
class GUIButtonX
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("Marvallous PPa");
         JButton bobj=new JButton("ok");

        bobj.setBounds(100,100,150,50);
        fobj.add(bobj);

        fobj.setSize(400,300);
        

        fobj.setLayout(null);

        fobj.setVisible(true);
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

    }
}