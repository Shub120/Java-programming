import javax.swing.*;
import java.awt.event.*;
class LoginForm extends JFrame
{
    public LoginForm()
    {
        setTitle("Marvallous Login Form");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOpereation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String a[])
    {
      new LoginForm();
       

    }
}