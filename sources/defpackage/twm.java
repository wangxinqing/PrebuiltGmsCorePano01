package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: twm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class twm implements Runnable {
    private final tws a;
    private final BluetoothDevice b;

    public twm(tws tws, BluetoothDevice bluetoothDevice) {
        this.a = tws;
        this.b = bluetoothDevice;
    }

    public final void run() {
        tws tws = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        if (tws.d.containsKey(bluetoothDevice)) {
            ((anih) tsp.a.d()).a("RetroactivePairManager: Remove info for device (%s)", (Object) bluetoothDevice);
            tws.d.remove(bluetoothDevice);
        }
    }
}
