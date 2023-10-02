import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;

public class WndEnumProc implements WinUser.WNDENUMPROC {
    @Override
    public boolean callback(WinDef.HWND hwnd, Pointer pointer) {
        WinDef.HWND hDefView = User32.INSTANCE.FindWindowEx(hwnd, null, "SHELLDLL_DefView", null);
        if (hDefView != null) {
            WinDef.HWND hWorkerw = User32.INSTANCE.FindWindowEx(null, hwnd, "WorkerW", null);
            User32.INSTANCE.ShowWindow(hWorkerw, User32.SW_HIDE);
            return false;
        }
        return true;
    }
}
