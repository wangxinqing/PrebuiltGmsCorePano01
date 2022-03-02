package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: wht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wht {
    public static acwa a(Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return acws.a(new Exception("Bluetooth adapter is null."));
        }
        if (defaultAdapter.isEnabled()) {
            return acws.a((Object) null);
        }
        return acws.a((Executor) tid.c(), (Callable) new whs(context, defaultAdapter));
    }

    public static boolean a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }
}
