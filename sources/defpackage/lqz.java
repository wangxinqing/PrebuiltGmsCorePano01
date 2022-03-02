package defpackage;

import android.os.SystemClock;

/* renamed from: lqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqz implements Runnable {
    long a;
    long b;
    final /* synthetic */ lra c;

    public lqz(lra lra) {
        this.c = lra;
    }

    public final int a() {
        if (this.c.r != 4) {
            return 208;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.a;
        long j2 = this.b;
        if (uptimeMillis <= j + j2) {
            return (int) (208 - (((uptimeMillis - j) * 208) / j2));
        }
        return 0;
    }

    public final void run() {
        if (this.c.r != 4) {
            this.b = 200;
            this.a = SystemClock.uptimeMillis();
            this.c.a(4);
        } else if (a() > 0) {
            this.c.w.invalidate();
        } else {
            this.c.a(0);
        }
    }
}
