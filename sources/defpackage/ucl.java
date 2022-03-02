package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: ucl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ucl extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ ucy b;
    final /* synthetic */ Intent c;
    final /* synthetic */ udb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucl(udb udb, String str, BluetoothDevice bluetoothDevice, ucy ucy, Intent intent) {
        super(str);
        this.d = udb;
        this.a = bluetoothDevice;
        this.b = ucy;
        this.c = intent;
    }

    public final void run() {
        asqm a2;
        jjg jjg = tsp.a;
        tzi a3 = this.d.b.a(this.a.getAddress());
        if (!aymw.I()) {
            boolean contains = BluetoothAdapter.getDefaultAdapter().getBondedDevices().contains(this.a);
            if (aymw.k() && contains && this.b == ucy.CONNECTED) {
                this.d.a(this.a, a3);
            } else {
                aymw.k();
            }
        }
        if (a3 != null) {
            this.c.getAction();
            if (this.b == ucy.CONNECTED) {
                thp.a(this.d.e, "com.google.android.gms.nearby.ACTION_FAST_PAIR_CONNECTED");
            }
            if (aymw.aa()) {
                this.d.a(a3, this.c.getAction());
            } else {
                ((tvs) thl.a(this.d.e, tvs.class)).b(this.c.getAction(), a3);
            }
            udb udb = this.d;
            tvd.a(udb.e, this.a, a3, udb.g);
            udb udb2 = this.d;
            Context context = udb2.e;
            ttf ttf = udb2.b;
            if (aymw.h() && ((jiq) thl.a(context, jiq.class)).a() - a3.i > aymt.a.a().I() && (a2 = tuk.a(context, a3.k)) != null) {
                ttf.a(a3.b, a2.b);
            }
        }
    }
}
