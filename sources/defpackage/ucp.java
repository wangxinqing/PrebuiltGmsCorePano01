package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: ucp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ucp extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucp(udb udb, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.b = udb;
        this.a = bluetoothDevice;
    }

    public final void run() {
        udb udb = this.b;
        Context context = udb.e;
        BluetoothDevice bluetoothDevice = this.a;
        tvd.a(context, bluetoothDevice, udb.b.a(bluetoothDevice.getAddress()), this.b.g);
    }
}
