package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: oys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oys {
    private long a = 0;
    private float b = oyt.a.nextFloat();

    public final synchronized boolean a(float f, long j, TimeUnit timeUnit) {
        boolean z;
        long millis = timeUnit.toMillis(j);
        long currentTimeMillis = System.currentTimeMillis();
        float f2 = this.b - f;
        this.b = f2;
        if (currentTimeMillis - this.a < millis || f2 >= 0.0f) {
            z = false;
        } else {
            this.a = currentTimeMillis;
            this.b = f2 + 1.0f;
            z = true;
        }
        return z;
    }
}
