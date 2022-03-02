package defpackage;

import android.os.SystemClock;

/* renamed from: ahuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahuf {
    private int a = 0;
    private long b = -1;

    public final synchronized long a() {
        long j;
        int i = this.a;
        if (i != 0) {
            j = this.b + ((long) Math.ceil((double) (((float) i) * 400.0f)));
        } else {
            j = SystemClock.uptimeMillis();
        }
        return j;
    }

    public final synchronized void b() {
        if (this.b == -1) {
            this.b = SystemClock.uptimeMillis();
        }
        this.a++;
    }
}
