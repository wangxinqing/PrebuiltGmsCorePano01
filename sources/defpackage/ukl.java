package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;
import java.io.IOException;

/* renamed from: ukl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukl extends jfx {
    final /* synthetic */ ukm a;
    private final aosh e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ukl(ukm ukm, aosh aosh) {
        super(9);
        this.a = ukm;
        this.e = aosh;
    }

    public final void run() {
        try {
            ukm ukm = this.a;
            aejf aejf = new aejf(ukm.d, aejv.a(ukm.a));
            ukm ukm2 = this.a;
            aeiy a2 = aejf.a(ukm2.b, ukm2.c);
            a2.a(aymi.m());
            if (!this.e.b((Object) a2)) {
                a2.close();
            }
        } catch (BluetoothException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("ukl", "run", 2554, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to an advertisement GATT server for peripheral %s.", (Object) this.a.b);
            this.e.a((Throwable) new IOException());
        }
    }
}
