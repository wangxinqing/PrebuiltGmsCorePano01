package defpackage;

import android.bluetooth.BluetoothAdapter;

/* renamed from: aejv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejv {
    public final BluetoothAdapter a;

    public aejv(BluetoothAdapter bluetoothAdapter) {
        this.a = bluetoothAdapter;
    }

    public static aejv a(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter != null) {
            return new aejv(bluetoothAdapter);
        }
        return null;
    }

    public final aejw a(String str) {
        return aejw.a(this.a.getRemoteDevice(str));
    }
}
