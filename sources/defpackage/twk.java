package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: twk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class twk implements Runnable {
    private final tws a;
    private final BluetoothDevice b;
    private final String c;

    public twk(tws tws, BluetoothDevice bluetoothDevice, String str) {
        this.a = tws;
        this.b = bluetoothDevice;
        this.c = str;
    }

    public final void run() {
        tws tws = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        tws.a(bluetoothDevice, new two(tws, bluetoothDevice, this.c));
    }
}
