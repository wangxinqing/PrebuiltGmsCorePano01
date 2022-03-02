package defpackage;

/* renamed from: aq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aq extends ar implements ah {
    final aj a;
    final /* synthetic */ as b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq(as asVar, aj ajVar, ax axVar) {
        super(asVar, axVar);
        this.b = asVar;
        this.a = ajVar;
    }

    public final void a(aj ajVar, ac acVar) {
        if (this.a.getLifecycle().a() == ad.DESTROYED) {
            this.b.a(this.c);
        } else {
            a(a());
        }
    }

    public final boolean a(aj ajVar) {
        return this.a == ajVar;
    }

    public final void b() {
        this.a.getLifecycle().b(this);
    }

    public final boolean a() {
        return this.a.getLifecycle().a().a(ad.STARTED);
    }
}
