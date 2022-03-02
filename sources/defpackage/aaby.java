package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: aaby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaby {
    public static boolean a(IBinder iBinder) {
        return a("android.os.IMessenger", iBinder);
    }

    public static boolean a(String str, IBinder iBinder) {
        if (iBinder != null) {
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (str.equals(interfaceDescriptor)) {
                    return true;
                }
                StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(interfaceDescriptor).length());
                sb.append("Expected ");
                sb.append(str);
                sb.append(", got ");
                sb.append(interfaceDescriptor);
                Log.w("BinderUtils", sb.toString());
                return false;
            } catch (RemoteException e) {
                Log.w("BinderUtils", "Couldn't identify descriptor.");
                return false;
            }
        } else {
            Log.w("BinderUtils", str.length() == 0 ? new String("Binder is null, expected ") : "Binder is null, expected ".concat(str));
            return false;
        }
    }
}
