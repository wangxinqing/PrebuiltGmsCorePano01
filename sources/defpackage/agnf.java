package defpackage;

import android.os.SystemClock;

/* renamed from: agnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnf {
    public final Object a = new Object();
    public final int b;
    public int c = 0;
    public long d = 0;

    public agnf(int i) {
        this.b = i;
    }

    public static agnf a() {
        return new agnf(Integer.MAX_VALUE);
    }

    public final boolean b() {
        if (this.b == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (SystemClock.elapsedRealtime() - this.d > 1000) {
                return false;
            }
            if (this.c < this.b) {
                return false;
            }
            return true;
        }
    }
}
