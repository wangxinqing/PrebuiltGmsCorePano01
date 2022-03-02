package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: twq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class twq extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ tws b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public twq(tws tws, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.b = tws;
        this.a = bluetoothDevice;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
