package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: baym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baym {
    public static boolean a(Thread thread) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 2000;
        boolean z = false;
        while (j > 0) {
            try {
                thread.join(j);
                break;
            } catch (InterruptedException e) {
                j = 2000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean a(CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        boolean z2 = false;
        long j = 5000;
        boolean z3 = false;
        while (true) {
            try {
                z2 = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                z = z3;
                break;
            } catch (InterruptedException e) {
                j = 5000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j <= 0) {
                    break;
                }
                z3 = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return z2;
    }
}
