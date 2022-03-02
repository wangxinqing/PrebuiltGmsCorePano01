package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: uca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uca implements Runnable {
    private final udb a;
    private final ucy b;
    private final BluetoothDevice c;

    public uca(udb udb, ucy ucy, BluetoothDevice bluetoothDevice) {
        this.a = udb;
        this.b = ucy;
        this.c = bluetoothDevice;
    }

    public final void run() {
        udb udb = this.a;
        ucy ucy = this.b;
        BluetoothDevice bluetoothDevice = this.c;
        if (ucy == ucy.CONNECTED && udb.k.a(bluetoothDevice.getAddress()) == null) {
            udb.a.a(new uck(udb, "batteryLevelToast", bluetoothDevice), aymt.a.a().g());
        }
    }
}
