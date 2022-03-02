package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: lku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lku {
    public final lgu a;
    private final ExecutorService b = jfm.b(9);
    private final lsm c;

    public lku(lsm lsm) {
        this.c = lsm;
        this.a = new lks(this);
    }

    public final void a() {
        lsm lsm = this.c;
        this.b.submit(new lkt(lni.a(lsm.b, lsm).d));
    }
}
