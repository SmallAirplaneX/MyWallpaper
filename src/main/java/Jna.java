import com.sun.jna.Native;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;

public class Jna {

    public WinDef.HWND getWindow(String windowName,String sClass) {
        WinDef.HWND hwnd = User32.INSTANCE.FindWindow(windowName,sClass);
        return hwnd;
    }

    public void initialization(WinDef.HWND hwnd) {
        User32.INSTANCE.SendMessageTimeout(hwnd,0x52C,null,null,0,100,null);
        User32.INSTANCE.EnumWindows(new WndEnumProc(),null);
    }
    public void setParent(WinDef.HWND Video,WinDef.HWND PW){
        if (Video==null ||PW ==null){}
        User32.INSTANCE.SetParent(Video,PW);
    }
}
