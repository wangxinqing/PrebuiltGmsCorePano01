package defpackage;

import com.google.android.chimera.Activity;

/* renamed from: qbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbt extends bl implements z {
    private static final Long c = -1L;
    private long d = c.longValue();
    private final amry e;
    private long f;
    private long g = 0;

    public qbt(aj ajVar, amry amry) {
        this.e = amry;
        ajVar.getLifecycle().a(this);
    }

    public static void a(Activity activity, aj ajVar, amry amry) {
        qbt qbt = (qbt) qck.a(activity, new qbs(ajVar, amry)).a(qbt.class);
    }

    public final void c() {
        if (this.d == c.longValue()) {
            this.d = System.currentTimeMillis();
        }
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void b() {
        this.g += System.currentTimeMillis() - this.d;
        this.d = c.longValue();
    }

    public final void a() {
        this.f = System.currentTimeMillis();
    }

    public final void a(aj ajVar) {
        if (ajVar.getLifecycle().a().equals(ad.DESTROYED)) {
            ajVar.getLifecycle().b(this);
            this.e.a(new qbu(this.f, System.currentTimeMillis(), this.g, (Object) null));
        }
    }
}
