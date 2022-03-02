package defpackage;

/* renamed from: adma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adma extends adly {
    public adma() {
        super("exponential-backoff-delay-execution");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
        iva.b(this.a.a((adri) admb.i), "The initial delay needs to be set.");
        iva.b(this.a.a((adri) admb.h), "The retry count needs to be set.");
    }

    public final void a(double d) {
        this.a.a(admb.k, Double.valueOf(d));
    }

    public final void a(int i) {
        this.a.a(admb.h, Integer.valueOf(i));
    }

    public final void a(long j, long j2) {
        this.a.a(admb.i, Long.valueOf(j));
        this.a.a(admb.j, Long.valueOf(j2));
    }
}
