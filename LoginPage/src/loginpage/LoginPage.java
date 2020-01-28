package loginpage;
import javax.swing.*;
public class LoginPage extends JFrame
{
    JLabel fname,lname,emailid,gender,password,state;
    JTextField ftext,ltext,etext;
    JRadioButton male,female;
    JPasswordField pwd;
    ButtonGroup bg;
    JComboBox states;
    JButton jb;
    public LoginPage()
    {
        fname=new JLabel("Enter First Name:");
        fname.setBounds(10,10,100,100);
        add(fname);
        ftext=new JTextField();
        ftext.setBounds(120,40,80,30);
        add(ftext);
        
        lname=new JLabel("Enter Last Name:");
        lname.setBounds(10, 30, 100, 100);
        add(lname);
        ltext=new JTextField();
        ltext.setBounds(120, 70, 80, 30);
        add(ltext);
        
        emailid=new JLabel("Enter EmailId:");
        emailid.setBounds(10, 55, 100, 100);
        add(emailid);
        etext=new JTextField();
        etext.setBounds(120, 100, 80, 30);
        add(etext);
        
        password=new JLabel("Password:");
        password.setBounds(220, 55, 100, 100);
        add(password);
        
        
        pwd=new JPasswordField();
        pwd.setBounds(300, 100, 80, 30);
        add(pwd);
        
        gender=new JLabel("Gender");
        gender.setBounds(10, 105, 100, 100);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(70, 140, 80, 30);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(150, 140, 80, 30);
        add(female);
        
        bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        states=new JComboBox();
        states.setBounds(10, 180, 100, 60);
        states.addItem("Maharashtra");
        states.addItem("Gujrat");
        states.addItem("Assam");
        states.addItem("Punjab");
        add(states);
        
        jb=new JButton("Submit");
        jb.setBounds(10, 250, 80, 30);
        add(jb);
        
        setLayout(null);
        setSize(300,300);
        setVisible(true);
        
        
        
    }
    public static void main(String[] args) 
    {
        LoginPage l=new LoginPage();
    }
    
}
