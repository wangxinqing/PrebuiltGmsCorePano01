package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: twn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class twn implements Runnable {
    private final tws a;
    private final BluetoothDevice b;
    private final String c;

    public twn(tws tws, BluetoothDevice bluetoothDevice, String str) {
        this.a = tws;
        this.b = bluetoothDevice;
        this.c = str;
    }

    public final void run() {
        this.a.b(this.b).c = this.c;
    }
}
