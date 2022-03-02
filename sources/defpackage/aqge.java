package defpackage;

/* renamed from: aqge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqge extends aqfd {
    long b = 0;
    private final aqgg c;
    private final long d;

    public aqge(aqgg aqgg, long j) {
        this.c = aqgg;
        this.d = j;
        this.a = new aqgg[]{aqgg};
    }

    public final aqey a() {
        return this.c.a();
    }

    public final long b() {
        return this.c.b();
    }

    public final void a(long j, float f, float f2) {
        if (j > this.b + this.d) {
            this.c.d();
        }
        this.c.a(j, f, f2);
    }

    public final void a(long j, aqey aqey) {
        if (j > this.b + this.d) {
            this.c.d();
        }
        this.b = j;
        this.c.a(j, aqey);
    }
}
