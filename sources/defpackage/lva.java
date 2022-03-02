package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: lva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lva extends lut {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ boolean b;
    final /* synthetic */ lvd c;

    public lva(lvd lvd, BluetoothDevice bluetoothDevice, boolean z) {
        this.c = lvd;
        this.a = bluetoothDevice;
        this.b = z;
    }

    public final void a() {
        this.c.f.a(ltn.a(this.a), this.b);
        this.c.f.a((lut) null);
    }
}
