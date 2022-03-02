package defpackage;

import java.util.Set;

/* renamed from: ckz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ckz implements Runnable {
    private final Set a;
    private final cky b;

    public ckz(Set set, cky cky) {
        this.a = set;
        this.b = cky;
    }

    public final void run() {
        for (Object a2 : this.a) {
            this.b.a(a2);
        }
    }
}
