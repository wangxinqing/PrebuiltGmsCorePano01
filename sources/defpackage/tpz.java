package defpackage;

import java.io.Closeable;

/* renamed from: tpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tpz implements Runnable {
    private final tqa a;
    private final uqe b;

    public tpz(tqa tqa, uqe uqe) {
        this.a = tqa;
        this.b = uqe;
    }

    public final void run() {
        tqa tqa = this.a;
        uqe uqe = this.b;
        tnb a2 = tnb.a(uqe);
        if (a2 != null) {
            jjg jjg = tky.a;
            tky.a(tqa.b);
        } else {
            jjt.a((Closeable) uqe);
        }
        tqa.c.a(tqa.a, uqe.a, (tnm) a2, asoe.BLE);
    }
}
