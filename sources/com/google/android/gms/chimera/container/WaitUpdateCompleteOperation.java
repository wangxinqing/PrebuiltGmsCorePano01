package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WaitUpdateCompleteOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        boj a = bpx.a(intent, "liveListener");
        hgw hgw = a instanceof hgw ? (hgw) a : null;
        long longExtra = intent.getLongExtra("startTime", 0);
        if (hgw != null) {
            long max = Math.max(TimeUnit.SECONDS.toMillis(awxp.e()) - (SystemClock.uptimeMillis() - longExtra), 0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            boj boj = hgw.a;
            amtf.a((Object) boj);
            try {
                hgw.b.await(max, timeUnit);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            bpx.a(boj, hgw.c);
            hgw.a = null;
        } else if (intent.getIntExtra("retryCount", 2) >= 2) {
            boj a2 = bpx.a(intent, "progressListener");
            if (a2 != null) {
                bpx.a(a2, 1);
            }
        } else {
            Intent a3 = ble.a(this, (byte[]) null, (boj) null, (String) null);
            a(intent, a3, true);
            startService(a3);
        }
    }

    public static final void a(Intent intent, Intent intent2, boolean z) {
        bpx.a(intent2, "progressListener", bpx.a(intent, "progressListener"));
        intent2.putExtra("chimera.URGENTLY_REQUESTED_FEATURES", intent.getByteArrayExtra("chimera.URGENTLY_REQUESTED_FEATURES"));
        intent2.putExtra("chimera.CLIENT_SESSION_ID", intent.getStringExtra("chimera.CLIENT_SESSION_ID"));
        intent2.putExtra("startTime", intent.getLongExtra("startTime", SystemClock.uptimeMillis()));
        intent2.putExtra("retryCount", intent.getIntExtra("retryCount", 0) + (z ? 1 : 0));
    }
}
