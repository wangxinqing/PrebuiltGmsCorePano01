package defpackage;

import android.content.Context;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.util.Random;

/* renamed from: uzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzr {
    public final arwg a;
    public final eej b;
    public TokenBroadcaster$Params c;
    public TokenReceiver$Params d;
    public final uzh e;
    public final vav f;
    public volatile boolean g;
    public uzq h;
    private final eet i;
    private final Random j = new Random();

    public uzr(Context context, uzh uzh, eet eet, eej eej) {
        this.f = (vav) thl.a(context, vav.class);
        this.a = (arwg) thl.a(context, arwg.class);
        this.i = eet;
        this.b = eej;
        this.e = uzh;
    }

    public final long a(long j2, long j3) {
        auyp auyp = this.f.f.e;
        if (auyp == null) {
            auyp = auyp.g;
        }
        long j4 = auyp.d;
        if (j4 == 0) {
            double d2 = (double) j2;
            double d3 = (double) j3;
            double nextDouble = this.j.nextDouble();
            Double.isNaN(d3);
            Double.isNaN(d2);
            return (long) (d2 + (d3 * nextDouble));
        }
        int i2 = ((int) (j3 / j4)) + 1;
        return j2 + (j4 * ((long) (i2 > 0 ? this.j.nextInt(i2) : 0)));
    }

    public final void b() {
        this.e.a(this.b);
    }

    public final void a() {
        this.e.a(this.i);
    }

    public final void a(int i2) {
        a(i2, 0);
    }

    public final synchronized void a(int i2, long j2) {
        uzq uzq = new uzq(this, i2);
        this.h = uzq;
        this.a.a(uzq, j2);
    }

    public final void a(boolean z) {
        uzp uzp = new uzp(this);
        auyp auyp = this.f.f.e;
        if (auyp == null) {
            auyp = auyp.g;
        }
        long j2 = auyp.b;
        auyp auyp2 = this.f.f.e;
        if (auyp2 == null) {
            auyp2 = auyp.g;
        }
        this.e.a(this.i, this.d, z, a(j2, auyp2.c), uzp);
    }
}
