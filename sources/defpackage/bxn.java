package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: bxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bxn extends bwp {
    private final ContextData c;
    private final bsz d;
    private final amxb e;

    public bxn(ContextData contextData, bsz bsz, amxb amxb) {
        super("ControllerOperation");
        this.c = contextData;
        this.d = bsz;
        this.e = amxb;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        for (bvt bvt : this.e.m()) {
            if (bvt.a().equals(this.d)) {
                if (!bvt.b()) {
                    new Object[1][0] = bvt;
                    cbi.r().a(this.d, bvt);
                } else if (ckt.a(this.c, this.e.c((Object) bvt))) {
                    bvt.a(this.d, this.c);
                    if (!bvt.b()) {
                        new Object[1][0] = bvt;
                        cbi.r().a(this.d, bvt);
                    }
                }
            }
        }
    }
}
