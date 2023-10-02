package test;

import com.sun.jna.platform.win32.WinDef;

public class ATest {
    Core core ;
    Windows windows;
    MyError myError;
    Jna jna;
    WinDef.HWND PW;
    WinDef.HWND Video;


    public void 初始化() {
        core = new Core();
        windows = new Windows();
        myError = new MyError();
        jna = new Jna();

    }

    public void start() {
        初始化();
        if ((PW = jna.getWindow("Progman",null)) == null){
            System.out.println("未找到桌面，初始化失败");
            return;
        }

    }
}
