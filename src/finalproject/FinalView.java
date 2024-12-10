package finalproject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FinalView extends JFrame{
    //Interface Implementation
    JPanel p1=new JPanel();
    JLabel Title=new JLabel("Employee Data Entry");
    JLabel Lname=new JLabel("Last Name : ");
    JLabel Fname=new JLabel("First Name : ");
    JLabel Ptype=new JLabel("Phone Type: ");
    JLabel Pnumber=new JLabel("Phone Number : ");
    JLabel Address=new JLabel("Address : ");
    JLabel Apt = new JLabel("Apartment/Floor : ");
    JLabel City=new JLabel("City : ");
    JLabel State=new JLabel("State : ");
    static JTextField Tlname=new JTextField();
    static JTextField Tfname=new JTextField();
    static JTextField Tnumber=new JTextField();
    static JTextField Taddress=new JTextField();
    static JTextField Tapt = new JTextField();
    static JTextField Tcity=new JTextField();
    static JTextField Tstate=new JTextField();
    JTextArea TAcomments=new JTextArea();
    JButton bt1 = new JButton("Clear Fields");
    JButton bt2 = new JButton("Save");
    JRadioButton r1=new JRadioButton("Cell Phone");    
    JRadioButton r2=new JRadioButton("Land Phone");  
    ButtonGroup bg=new ButtonGroup();
    static FinalModel();
 
    //bg.add(r1);bg.add(r2); 
    //Put thiong together

    public FinalView() {
        p1.setLayout(null);
        Font f1=new Font("Verdana",Font.BOLD, 25);
        Title.setFont(f1);
        Title.setBounds(120, 10, 300, 30);
        Lname.setBounds(40, 100, 150, 30);
        Tlname.setBounds(140, 100, 150, 30);
        Fname.setBounds(40, 150, 150, 30);
        Tfname.setBounds(140, 150, 150, 30);
        Ptype.setBounds(40, 200, 150, 30);
        r1.setBounds(60, 230, 150, 30);
        r2.setBounds(60, 260, 150, 30);
        Pnumber.setBounds(40, 300, 150, 30);
        Tnumber.setBounds(140, 300, 150, 30);
        Address.setBounds(40, 350, 150, 30);
        Taddress.setBounds(140, 350, 250, 30);
        Apt.setBounds(40, 400, 150, 30);
        Tapt.setBounds(140, 400, 150, 30);
        City.setBounds(40, 450, 150, 30);
        Tcity.setBounds(140, 450, 150, 30);
        State.setBounds(40, 500, 150, 30);
        Tstate.setBounds(140, 500, 150, 30);
        bt1.setBounds(80, 575, 100, 30);
        bt2.setBounds(250, 575, 100, 30);
        bg.add(r1);bg.add(r2);
        TAcomments.setBounds(430, 100, 200, 300);
        TAcomments.setBackground(Color.CYAN);
        bt1.addActionListener(new clearButton());
        bt2.addActionListener(new gustavo());

        //ADD
        p1.add(Title);
        p1.add(Lname);
        p1.add(Fname);
        p1.add(Tfname);
        p1.add(Tlname);
        p1.add(Ptype);
        p1.add(r1);
        p1.add(r2);
        p1.add(TAcomments);
        p1.add(Pnumber);
        p1.add(Tnumber);
        p1.add(Address);
        p1.add(Taddress);
        p1.add(Apt);
        p1.add(Tapt);
        p1.add(City);
        p1.add(Tcity);
        p1.add(State);
        p1.add(Tstate);
        p1.add(bt1);
        p1.add(bt2);
        
        add(p1);
        setTitle("Employee Data Entry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(new Dimension(700, 700));
        setLocation(350, 100);
        setVisible(true);
    }
    public static class clearButton implements ActionListener {
            @Override  
            public void ActionPerformed(ActionEvent e)
            {
                Tlname.setText("");
                Tfname.setText("");
                Tnumber.setText("");
                Taddress.setText("");
                Tapt.setText("");
                Tcity.setText("");
                Tstate.setText("");
            }        
        }
    public static class gustavo implements ActionListener {
        @Override
        public void ActionPerformed(ActionEvent e)
        {
            
        }
    }
}
