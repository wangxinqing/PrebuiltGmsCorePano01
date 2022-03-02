package defpackage;

import java.util.Collections;

/* renamed from: akjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akjw implements akin {
    private akip a;
    private akip b;
    private long c;
    private final akjv d;
    private final int e;
    private final double f;

    public akjw(akjv akjv, int i, double d2) {
        this.d = akjv;
        this.e = i;
        this.f = d2;
    }

    private static final int a(akip akip, akip akip2) {
        int i = 0;
        if (akip != null) {
            int i2 = akip2.a;
            if (i2 == 1 && akip.a == 2) {
                i = 9;
            }
            if (i2 == 2 && akip.a == 1) {
                i = 6;
            }
            if (i2 == 1 && akip.a == 1 && akip.b != akip2.b) {
                return i | 3;
            }
        } else {
            int i3 = akip2.a;
            if (i3 == 1) {
                i = 1;
            }
            if (i3 == 2) {
                return i | 4;
            }
        }
        return i;
    }

    private final void a(int i, akip akip, akip akip2) {
        long j = akip2.b;
        long j2 = this.c;
        if (j2 > j) {
            j = j2;
        }
        if ((i & this.e) != 0) {
            this.d.a(akip, j2, akip2, j);
        }
        this.a = akip2;
        this.b = null;
        this.c = j;
    }

    public final void a(akip akip) {
        akip akip2 = akip;
        if (akip2.g != 0) {
            return;
        }
        if (akip2.a != 0) {
            akip akip3 = this.b;
            if (!(akip3 == null || akip3.b == akip2.b)) {
                a(a(this.a, akip3), this.a, this.b);
            }
            int a2 = a(this.a, akip2);
            if (a2 != 0) {
                if ((a2 & 1) != 0) {
                    double d2 = this.f;
                    if (akip2.c.b.isEmpty() || ((double) ((akhx) akip2.c.b.get(0)).f) <= d2) {
                        akhy akhy = akip2.c;
                        akhy a3 = akhy.a(Collections.emptyList(), akhy.d, akhy.e, akhy.f, akhy.g, akhy.i, akhy.k, akhy.c, akhy.j);
                        this.b = new akip(akip2.a, a3, akip2.d, akip2.e, akip2.b, akip2.f, akip2.g, akip2.h);
                        return;
                    }
                }
                a(a2, this.a, akip2);
                return;
            }
            aklz.a();
            return;
        }
        aklz.a();
    }
}
