package defpackage;

import android.os.SystemClock;

/* renamed from: ixy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ixy {
    public static final ixy a = new ixx();
    private final long b;
    private final long c;
    private long d;

    public ixy(int i, int i2, int i3) {
        long j = ((long) i) * 1000;
        this.b = j;
        this.c = ((long) i3) * j;
        this.d = SystemClock.elapsedRealtime() + (((long) (1 - i2)) * this.b);
    }

    public boolean a() {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.d;
            if (elapsedRealtime < j) {
                return false;
            }
            this.d = Math.max(j, elapsedRealtime - this.c) + this.b;
            return true;
        }
    }
}
