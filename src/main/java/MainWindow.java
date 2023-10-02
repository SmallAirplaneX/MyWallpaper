

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener
{
    JButton close = new JButton("关闭") ;
    JFileChooser jFileChooser = new JFileChooser("D:\\迅雷下载\\Video");
    MainWindow(){
        this.setTitle("壁纸");
        this.setSize(500,500);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);




        JPanel jPanel = new JPanel();
        jPanel.add(close);
        jPanel.add(jFileChooser);
        close.setBounds(450,450,50,50);
        jFileChooser.setBounds(200,200,50,50);
        this.setContentPane(jPanel);
        this.setVisible(true);
    }







    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
