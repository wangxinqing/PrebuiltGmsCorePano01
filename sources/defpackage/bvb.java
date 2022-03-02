package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;

/* renamed from: bvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bvb implements PendingIntent.OnFinished {
    public final CountDownLatch a;
    public final bvp b;

    public bvb(boolean z) {
        bvp bvp = null;
        this.a = !z ? new CountDownLatch(1) : null;
        this.b = z ? bvq.a("PendingIntentCompat") : bvp;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.a;
        if (countDownLatch == null) {
            bwn k = cbi.k();
            bvp bvp = this.b;
            new Object[1][0] = bvp.a;
            bvp.c();
            clj D = cbi.D();
            if (D != null) {
                D.b(bvp);
            }
            bwl bwl = k.c;
            int i2 = bwl.b;
            bwl.a(bvp);
            return;
        }
        countDownLatch.countDown();
    }
}
