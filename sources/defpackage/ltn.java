package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: ltn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltn {
    public static final amrm a = ltm.a(awqy.a.a().a());

    public static String a(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        if (name != null) {
            try {
                name = URLEncoder.encode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.w("DRIVINGMODE.BT", name.length() == 0 ? new String("Could not encode device name: ") : "Could not encode device name: ".concat(name), e);
            }
        }
        return String.format("%s/%s/%s", new Object[]{"bt_autolaunch", name, bluetoothDevice.getAddress()});
    }

    public static boolean b(Context context) {
        return a(context, "android.permission.BLUETOOTH");
    }

    public static boolean a(Context context) {
        return b(context) && a(context, "android.permission.BLUETOOTH_ADMIN");
    }

    private static boolean a(Context context, String str) {
        return kr.a(context, str) == 0;
    }
}
