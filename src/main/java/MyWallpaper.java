import com.sun.jna.platform.win32.WinDef;

public class MyWallpaper {
    public static void main(String[] args) throws InterruptedException {
        Jna jna = new Jna();
        MainWindow mainWindow =new MainWindow();


        WinDef.HWND PW;
        WinDef.HWND Video;
        if ((PW = jna.getWindow("Progman",null)) == null){
            System.out.println("未找到桌面，初始化失败");
            return;
        }
        if ((Video = jna.getWindow(null,"MyWallpaper"))==null) {
            System.out.println("未找到视频窗口，初始化失败");
            return;
        }
        jna.initialization(PW);
        jna.setParent(Video,PW);











    }
}
