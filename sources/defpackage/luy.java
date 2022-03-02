package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: luy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class luy implements bds {
    private final lvd a;
    private final BluetoothDevice b;

    public luy(lvd lvd, BluetoothDevice bluetoothDevice) {
        this.a = lvd;
        this.b = bluetoothDevice;
    }

    public final void a(boolean z) {
        lvd lvd = this.a;
        lvd.f.a((lut) new lva(lvd, this.b, z));
    }
}
