package defpackage;

import java.io.Closeable;

/* renamed from: tqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqb implements Runnable {
    private final tqc a;
    private final upc b;

    public tqb(tqc tqc, upc upc) {
        this.a = tqc;
        this.b = upc;
    }

    public final void run() {
        tqc tqc = this.a;
        upc upc = this.b;
        tne a2 = tne.a(upc);
        if (a2 != null) {
            jjg jjg = tky.a;
            tky.a(tqc.b);
        } else {
            jjt.a((Closeable) upc);
        }
        tqc.c.a(tqc.a, upc.a, (tnm) a2, asoe.BLUETOOTH);
    }
}
