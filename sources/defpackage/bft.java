package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: bft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bft implements Runnable {
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            bfu.b = MessageDigest.getInstance("MD5");
            countDownLatch = bfu.c;
        } catch (NoSuchAlgorithmException e) {
            countDownLatch = bfu.c;
        } catch (Throwable th) {
            bfu.c.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
