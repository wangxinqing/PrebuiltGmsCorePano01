package defpackage;

import android.bluetooth.BluetoothAdapter;

/* renamed from: ijp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijp {
    public final BluetoothAdapter a;

    public ijp(BluetoothAdapter bluetoothAdapter) {
        iva.a((Object) bluetoothAdapter);
        this.a = bluetoothAdapter;
    }

    public static ijp a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return new ijp(defaultAdapter);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass().equals(obj.getClass()) && this.a.equals(((ijp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
