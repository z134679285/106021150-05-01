import com.sun.corba.se.impl.protocol.giopmsgheaders.FragmentMessage;
import com.sun.java.swing.plaf.motif.MotifBorders;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JButton Add= new JButton("Add");
    private JButton Less= new JButton("Less");
    private int count=0;
    public  Frame(){
        init();
    }
    private  void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(Add);
        this.add(Less);
        this.setLocation(100,50);
        this.setSize(1280,960);
        Add.setLocation(540,430);
        Add.setSize(150,50);
        Less.setLocation(690,430);
        Less.setSize(150,50);
        Less.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count--;
                Frame.this.setTitle(Integer.toString(count));
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                Frame.this.setTitle(Integer.toString(count));
            }
        });
    }
}
