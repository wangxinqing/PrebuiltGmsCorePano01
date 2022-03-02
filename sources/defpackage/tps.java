package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;
import java.util.Map;

/* renamed from: tps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tps {
    final tlh a;
    final String b;
    final byte[] c;
    final Map d = new nz();
    public final /* synthetic */ tql e;

    public tps(tql tql, tlh tlh, String str) {
        this.e = tql;
        this.a = tlh;
        this.b = str;
        this.c = tql.a(str);
    }

    public final void a(BluetoothDevice bluetoothDevice) {
        this.e.a((Runnable) new tpq(this, bluetoothDevice));
    }

    public final boolean a(tnd tnd) {
        if (tnd == null) {
            jjg jjg = tky.a;
            return false;
        } else if (tnd.b != this.e.h()) {
            jjg jjg2 = tky.a;
            return false;
        } else if (Arrays.equals(tnd.d, this.c)) {
            return true;
        } else {
            jjg jjg3 = tky.a;
            tky.a(this.c);
            tky.a(tnd.d);
            return false;
        }
    }
}
