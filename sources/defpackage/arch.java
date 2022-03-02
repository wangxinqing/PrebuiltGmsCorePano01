package defpackage;

import android.os.SystemClock;

/* renamed from: arch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arch implements acvv {
    private final arci a;
    private final anzg b;

    public arch(arci arci, anzg anzg) {
        this.a = arci;
        this.b = anzg;
    }

    public final void a(Object obj) {
        arci arci = this.a;
        anzg anzg = this.b;
        if (((ick) obj).p()) {
            aucd o = anzg.c.o();
            o.a((aucj) anzg);
            anzi anzi = arci.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anzg anzg2 = (anzg) o.b;
            anzi.getClass();
            anzg2.b = anzi;
            anzg2.a |= 32768;
            aucd o2 = anui.p.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anui anui = (anui) o2.b;
            anui.b = 15;
            anui.a |= 1;
            anzg anzg3 = (anzg) o.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anui anui2 = (anui) o2.b;
            anzg3.getClass();
            anui2.o = anzg3;
            anui2.a |= 32768;
            arci.a.a((audx) o2.i()).b();
            arci.d = SystemClock.elapsedRealtime();
        }
    }
}
