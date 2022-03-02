package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bake  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bake extends azzm {
    public final azzl a;
    final /* synthetic */ bakf b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public bake(bakf bakf, azzl azzl) {
        this.b = bakf;
        amrl.a((Object) azzl, (Object) "subchannel");
        this.a = azzl;
    }

    public final azzh a() {
        if (this.c.compareAndSet(false, true)) {
            ((baix) this.b.c).b.l.execute(new bakd(this));
        }
        return azzh.a;
    }
}
