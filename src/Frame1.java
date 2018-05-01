import com.sun.corba.se.impl.protocol.giopmsgheaders.FragmentMessage;
import com.sun.java.swing.plaf.motif.MotifBorders;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame {
    private JButton Add = new JButton("<<");
    private JButton Less = new JButton(">>");
    private JButton Exit = new JButton("Exit");
    private JLabel  lab = new JLabel("^___^");
    private int  x= 150;
    public  Frame1(){
        init();
    }
    private  void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(Add);
        this.add(Less);
        this.add(Exit);
        this.add(lab);
        this.setLocation(100,50);
        this.setSize(1280,960);
        Add.setLocation(440,130);
        Add.setSize(150,50);
        Less.setLocation(590,130);
        Less.setSize(150,50);
        Exit.setLocation(740,130);
        Exit.setSize(150,50);
        lab.setBounds(x,150,150,150);
        Less.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x-=10;
                lab.setLocation(x,150);
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x+=10;
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
