import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacv.*;
import org.bytedeco.javacv.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Windowsmod {
    public static void main(String[] args) throws Exception {
//        FFmpegFrameGrabber g = new FFmpegFrameGrabber("D:\\迅雷下载\\Video\\759420803_nb3-1-112.flv");
//        g.start();
//        Frame frame = null;
//        CanvasFrame canvas = new CanvasFrame("winTitle",1);
//        canvas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        canvas.setAlwaysOnTop(true);
//        while (true) {
//            if (!canvas.isVisible()) {
//                break;
//            }
//            frame = g.grab();
//            canvas.showImage(frame);
//            Thread.sleep(1000/60);//50毫秒刷新一次图像



    }
    public void cpathaction(ActionEvent arg0) {
        JFileChooser fileChooser = null;
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            pathField.setText(fileChooser.getSelectedFile().getPath());//文本框给出路径
            imgname = fileChooser.getSelectedFile().getName();//获取加密文件名
            imgpath = pathField.getText();
            imgpath = imgpath.substring(0, imgpath.length() - imgname.length());//获取加密的文件所在的文件夹
        }
        fileChooser = new JFileChooser("C:/Users/Administrator/Desktop/");
        if (UIManager.getLookAndFeel().isSupportedLookAndFeel()) {//使用系统的文件管理器
            final String platform = UIManager.getSystemLookAndFeelClassName();
// If the current Look & Feel does not match the platform Look & Feel,
// change it so it does.
            if (!UIManager.getLookAndFeel().getName().equals(platform)) {
                try {
                    UIManager.setLookAndFeel(platform);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            pathField.setText(fileChooser.getSelectedFile().getPath());//文本框给出路径
            imgname = fileChooser.getSelectedFile().getName();//获取加密文件名
            imgpath = pathField.getText();
            imgpath = imgpath.substring(0, imgpath.length() - imgname.length());//获取加密的文件所在的文件夹
        }
    }
}
