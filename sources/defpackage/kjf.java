package defpackage;

import android.os.SystemClock;

/* renamed from: kjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kjf {
    private long a;

    public final void a() {
        this.a = SystemClock.uptimeMillis();
    }

    public final int b() {
        return (int) Math.min(SystemClock.uptimeMillis() - this.a, 2147483647L);
    }
}
