package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ajbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajbp implements Runnable {
    private final WeakReference a;
    private final WeakReference b;

    public ajbp(ajbg ajbg, ajbr ajbr) {
        this.a = new WeakReference(ajbg);
        this.b = new WeakReference(ajbr);
    }

    public static final void a(ajbr ajbr) {
        if (ajbr != null) {
            synchronized (ajbr.b) {
                ajbh ajbh = ajbr.g;
                if (ajbh != null) {
                    ajbh.E();
                    ajbr.g = null;
                }
            }
        }
    }

    public final void run() {
        a((ajbr) this.b.get());
    }

    public final void a() {
        aicn aicn;
        aico aico;
        ajbg ajbg = (ajbg) this.a.get();
        ajbr ajbr = (ajbr) this.b.get();
        if (!(ajbr == null || (aicn = ajbr.e) == null || (aico = ajbr.f) == null)) {
            aicn.a(aico);
        }
        if (ajbg != null) {
            ajbg.a((Runnable) this);
        } else {
            a(ajbr);
        }
        if (ajbr != null) {
            new Object[1][0] = ajbr.a;
        }
    }
}
