package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: ucm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucm extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ String b;
    final /* synthetic */ udb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucm(udb udb, String str, BluetoothDevice bluetoothDevice, String str2) {
        super(str);
        this.c = udb;
        this.a = bluetoothDevice;
        this.b = str2;
    }

    public final void run() {
        tzi a2 = this.c.b.a(this.a.getAddress());
        if (a2 == null) {
            ((anih) tsp.a.c()).a("FastPair: no cached fast pair item when alias name changed.");
            return;
        }
        if (aymw.t()) {
            jjg jjg = tsp.a;
            this.c.b.a(a2, true, 0);
        }
        if (aymw.r()) {
            jfm.b(10).execute(new tvh(this.c.e, this.b, this.a.getAddress(), this.c.g));
        }
        if (aymw.F()) {
            this.c.k.a(a2.c, this.b);
        }
    }
}
