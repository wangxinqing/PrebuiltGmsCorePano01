package defpackage;

import java.util.Collection;

/* renamed from: bvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bvv extends cbm {
    private final bsz a;
    private final Collection b;
    private final bun c;
    private final but d;
    private final bvp e;

    public bvv(bsz bsz, Collection collection, bun bun, but but, bvp bvp) {
        super("ContextManagerFEServerConsumer", "syncing context, account %s", bsz);
        iva.a((Object) bsz);
        this.a = bsz;
        iva.a((Object) collection);
        this.b = collection;
        iva.a((Object) but);
        this.c = bun;
        this.d = but;
        this.e = bvp;
    }

    public final void a(int i) {
        super.a(i);
        cbi.p().a(this.b, 1, cbi.i().a(), cbi.a(this.a, "ContextManagerFEServerConsumer"));
        buq.b(this.c, this.d, this.e);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atra atra = (atra) obj;
        new Object[1][0] = this.a;
        cbi.p().a(this.b, 3, cbi.i().a(), cbi.a(this.a, "ContextManagerFEServerConsumer"));
        buq.a(this.c, this.d, this.e);
    }
}
