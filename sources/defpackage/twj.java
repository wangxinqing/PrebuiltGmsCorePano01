package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: twj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class twj implements Runnable {
    private final tws a;
    private final BluetoothDevice b;

    public twj(tws tws, BluetoothDevice bluetoothDevice) {
        this.a = tws;
        this.b = bluetoothDevice;
    }

    public final void run() {
        tws tws = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        tws.a(bluetoothDevice, new twp(tws, bluetoothDevice));
    }
}
