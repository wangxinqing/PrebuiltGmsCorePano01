package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: twp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class twp implements Runnable {
    private final tws a;
    private final BluetoothDevice b;

    public twp(tws tws, BluetoothDevice bluetoothDevice) {
        this.a = tws;
        this.b = bluetoothDevice;
    }

    public final void run() {
        tws tws = this.a;
        tws.b(this.b).a = tws.b.b() + aymt.a.a().aL();
    }
}
