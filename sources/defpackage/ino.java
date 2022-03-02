package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: ino  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ino extends imh {
    public ino() {
        super("SafebootCrashThresholdCondition");
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        if (inp.b()) {
            ilu a = inb.a();
            if (a == null) {
                Log.e("SfbtCrashThresholdCond", "Missing crash data");
                return false;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j = a.e;
            if (seconds - j <= 3600) {
                double d = (double) a.c;
                double max = (double) Math.max(1, j - a.d);
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double seconds2 = (double) TimeUnit.HOURS.toSeconds(1);
                Double.isNaN(seconds2);
                if (d2 * seconds2 < awyw.a.a().K() || a.c < awyw.a.a().L()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
