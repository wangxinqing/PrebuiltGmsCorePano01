package defpackage;

/* renamed from: ahth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahth {
    private final ahtg a;
    private final aqem b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int j = -1;
    private long k = Long.MAX_VALUE;
    private long l = Long.MAX_VALUE;

    public ahth(ahtg ahtg, aqem aqem, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = ahtg;
        this.b = aqem;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
    }

    private static final int a(long j2, long j3) {
        return (int) ((j3 - j2) / 1000);
    }

    private static final int b(long j2, long j3) {
        return (int) ((j3 - j2) % 1000);
    }

    public final void a() {
        this.k = Long.MAX_VALUE;
    }

    public final aqek a(aqek aqek, int i2, long j2, long j3) {
        int i3;
        int i4;
        this.a.a(j3);
        this.a.a(j2, j3);
        aqek aqek2 = new aqek(this.b, this.c);
        if (this.l == Long.MAX_VALUE) {
            this.l = this.a.c(j2, j3);
        }
        if (!aqek.i(1)) {
            aqek.b(1, this.a.b(j2, this.l));
        }
        if (!aqek.i(this.d)) {
            aqek2.b(this.h, j2);
            aqek2.b(this.i, j3 * 1000000);
        }
        long j4 = this.k;
        if (j4 == Long.MAX_VALUE) {
            long c2 = aqek.c(1);
            long b2 = this.a.b(j2, this.l);
            i4 = a(c2, b2);
            i3 = b(c2, b2);
        } else {
            i4 = a(j4, j2);
            i3 = b(this.k, j2);
        }
        if (i4 != 0) {
            aqek2.g(this.f, i4);
        }
        if (i3 != 0) {
            aqek2.g(this.g, i3);
        }
        this.k = j2;
        if (aqek.j(this.d) == 0 || this.j != i2) {
            aqek2.g(this.e, i2);
            this.j = i2;
        }
        return aqek2;
    }
}
