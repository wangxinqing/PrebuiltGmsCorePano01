package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: mfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfr {
    private volatile mfq a;

    private static final boolean a(mfq mfq) {
        return mfq == null || (mfq.b >= 0 && SystemClock.elapsedRealtime() >= mfq.b);
    }

    public final long b() {
        mfq mfq = this.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(mfq)) {
            return 0;
        }
        long j = mfq.b;
        return j >= 0 ? TimeUnit.MILLISECONDS.toSeconds(mfq.b - elapsedRealtime) : j;
    }

    public final String a() {
        mfq mfq = this.a;
        return !a(mfq) ? mfq.a : "";
    }

    public final void a(String str, long j) {
        if (str == null || j == 0) {
            this.a = null;
            return;
        }
        if (j >= 0) {
            j = TimeUnit.SECONDS.toMillis(j) + SystemClock.elapsedRealtime();
        }
        this.a = new mfq(str, j);
    }
}
