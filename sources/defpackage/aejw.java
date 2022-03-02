package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: aejw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejw {
    public final BluetoothDevice a;

    private aejw(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    public static aejw a(BluetoothDevice bluetoothDevice) {
        return new aejw(bluetoothDevice);
    }

    public final int b() {
        return this.a.getType();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aejw) {
            return this.a.equals(((aejw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final String a() {
        return this.a.getAddress();
    }
}
