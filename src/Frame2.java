import com.sun.corba.se.impl.protocol.giopmsgheaders.FragmentMessage;
import com.sun.java.swing.plaf.motif.MotifBorders;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame {
    private JButton Add = new JButton(">>");
    private JButton Less = new JButton("<<");
    private JButton Exit = new JButton("Exit");
    private JLabel  lab = new JLabel("^___^");
    private JTextField lat =new JTextField("0");
    private int  x= 150;
    public  Frame2(){
        init();
    }
    private  void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(Add);
        this.add(Less);
        this.add(Exit);
        this.add(lab);
        this.add(lat);
        this.setLocation(100,50);
        this.setSize(1280,960);
        Add.setLocation(440,130);
        Add.setSize(150,50);
        Less.setLocation(590,130);
        Less.setSize(150,50);
        Exit.setLocation(740,130);
        Exit.setSize(150,50);
        lab.setBounds(x,150,150,150);
        lat.setBounds(250,250,50,50);
        Less.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x-=Integer.parseInt(lat.getText());
                lab.setLocation(x,150);
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x+=Integer.parseInt(lat.getText());
                lab.setLocation(x,150);
            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(EXIT_ON_CLOSE);
            }
        });

    }
}
