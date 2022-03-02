package defpackage;

import android.os.SystemClock;

/* renamed from: ahte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahte {
    public long a = 0;
    final /* synthetic */ ahtf b;
    private long c = SystemClock.elapsedRealtime();
    private long d = 200;
    private long e = 0;

    public ahte(ahtf ahtf) {
        this.b = ahtf;
        aizy aizy = this.b.a;
    }

    public final synchronized boolean a() {
        boolean z;
        long j;
        long j2;
        long j3;
        synchronized (this) {
            aizy aizy = this.b.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.e > this.d) {
                aqek aqek = this.b.b;
                if (aqek != null) {
                    j = (long) aqek.c();
                } else {
                    j = 0;
                }
                aqek aqek2 = this.b.c;
                if (aqek2 != null) {
                    j2 = (long) aqek2.c();
                } else {
                    j2 = 0;
                }
                aqek aqek3 = this.b.d;
                if (aqek3 != null) {
                    j3 = (long) aqek3.c();
                } else {
                    j3 = 0;
                }
                long j4 = j + j2 + j3;
                long j5 = this.d;
                if (j5 >= 100) {
                    long j6 = this.a;
                    long j7 = this.e;
                    double d2 = (double) (j4 - j6);
                    double d3 = (double) (elapsedRealtime - j7);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d2 / d3;
                    if (j7 <= 0 || d4 <= 0.0d || j4 >= 204800) {
                        j5 = 200;
                    } else {
                        double d5 = (double) (204800 - j4);
                        Double.isNaN(d5);
                        double d6 = d5 / d4;
                        j5 = Math.min(2000, ((long) (d6 + d6)) / 3);
                    }
                }
                this.d = j5;
                this.a = j4;
                this.e = elapsedRealtime;
            }
            z = this.a >= 204800 || elapsedRealtime - this.c > 60000;
        }
        return z;
    }

    public final synchronized void b() {
        aizy aizy = this.b.a;
        this.c = SystemClock.elapsedRealtime();
        this.d = 200;
        this.a = 0;
        this.e = 0;
    }
}
