package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: cgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgp {
    public final WifiManager a;
    public final cgo b;
    public long c;
    public volatile boolean d = false;
    public volatile boolean e;
    public long f;
    public long g;

    public cgp(Context context, Looper looper) {
        this.a = (WifiManager) context.getSystemService("wifi");
        this.b = new cgo(this, looper);
        long millis = TimeUnit.SECONDS.toMillis(10);
        this.c = millis;
        a(millis);
        this.f = Long.MIN_VALUE;
    }

    public static void a(long j) {
        if (j < 5000) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("scanPeriodMillis must be at least 5000, but found ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a() {
        if (this.d && this.e) {
            long j = this.f;
            long j2 = this.c;
            cgo cgo = this.b;
            long j3 = j + j2;
            if (!cgo.hasMessages(2)) {
                Message obtainMessage = cgo.obtainMessage(1);
                cgo.removeCallbacksAndMessages((Object) null);
                cgo.sendMessageAtTime(obtainMessage, j3);
                return;
            }
            return;
        }
        this.b.removeCallbacksAndMessages((Object) null);
    }
}
