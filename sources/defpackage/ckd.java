package defpackage;

import java.util.Collection;

/* renamed from: ckd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckd extends bwp implements bun {
    private final bvt c;
    private final Collection d;
    private final bsz e;

    public ckd(bvt bvt, Collection collection, bsz bsz, bun bun) {
        super("ConsumerSyncOperation", bun);
        iva.a((Object) bvt);
        this.c = bvt;
        iva.a((Object) collection);
        this.d = collection;
        iva.a((Object) bsz);
        this.e = bsz;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c.a(this.e, this.d, this, cbi.k());
    }

    public final void b() {
        iva.a((Object) this.a);
        buq.a(this.a, cbi.k(), a("successCallback"));
    }

    public final void a(int i) {
        iva.a((Object) this.a);
        buq.b(this.a, cbi.k(), a("failureCallback"));
    }
}
