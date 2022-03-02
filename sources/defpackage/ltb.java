package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ltb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltb {
    private final BluetoothAdapter a;
    private final Context b;

    public ltb(Context context) {
        this.b = context;
        this.a = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
    }

    public final String a(BluetoothDevice bluetoothDevice) {
        String str;
        try {
            str = (String) BluetoothDevice.class.getMethod("getAliasName", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("CAR.DRIVINGMODE", "Error invoking getAliasName on bluetooth device", e);
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!ltn.b(this.b) || TextUtils.isEmpty(bluetoothDevice.getName())) {
            return bluetoothDevice.getAddress();
        }
        return bluetoothDevice.getName();
    }

    public final boolean b() {
        return this.a != null && a();
    }

    public final List c() {
        ArrayList a2 = anda.a();
        if (b() && this.a.isEnabled()) {
            for (BluetoothDevice next : this.a.getBondedDevices()) {
                if (ltn.a.a(next)) {
                    a2.add(next);
                }
            }
        }
        return a2;
    }

    public final boolean a() {
        return ltn.a(this.b);
    }
}
