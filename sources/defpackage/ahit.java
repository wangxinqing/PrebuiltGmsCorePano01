package defpackage;

/* renamed from: ahit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahit extends ahir {
    final /* synthetic */ ahiu b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ahit(ahiu ahiu) {
        super(ahiu);
        this.b = ahiu;
    }

    /* access modifiers changed from: protected */
    public final void a(long j, long j2, ahyq ahyq, ahyq ahyq2, ahyq ahyq3) {
        ahip ahip;
        ahip ahip2;
        ahyq ahyq4 = ahyq;
        ahyq a = ahiu.a(ahyq4, this.b.c);
        this.b.b(a);
        ahis.a(ahyq4, a);
        this.b.q.a(aico.ACCEL_SAMPLE_RATE, (int) Math.round(ahis.a(ahyq)));
        long j3 = j;
        long j4 = j2;
        this.b.e.a(j3, j4, ahup.ACCELEROMETER, ahyq);
        this.b.e.a(j3, j4, ahup.BAROMETER, ahyq2);
        this.b.e.a(j3, j4, ahup.LIGHT, ahyq3);
        ahiu ahiu = this.b;
        if (ahiu.r != null && ahiu.k) {
            ahyq a2 = ahiu.a(ahyq3, ahiu.c);
            ahiu ahiu2 = this.b;
            ahiu2.r.a(ahiu2.l, j, j2, a, a2);
        }
        int i = a.b;
        if (i < 4) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Not enough accel samples for activity detection: ");
            sb.append(i);
            sb.toString();
            ahjb.a(this.b.q, a.b);
            ahip = ahip.b((long) a.b);
        } else {
            if (this.b.g != null) {
                c(j, j2, a);
            }
            ahip ahip3 = ahip.c;
            if (this.b.h == null) {
                ahip2 = ahip3;
            } else {
                ahip2 = b(j, j2, a);
            }
            ahip ahip4 = ahip.c;
            ahil ahil = this.b.d;
            if (ahil != null && ahil.c) {
                ahip4 = a(j, j2, a);
            }
            ahip = ahis.a(ahip2, ahip4);
        }
        this.b.e.a(ahip);
    }
}
