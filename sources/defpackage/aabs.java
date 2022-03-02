package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: aabs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabs {
    private static final anfm a = anfm.a((Comparable) 0L, (Comparable) 0L);

    public static int a(aabq aabq) {
        int i;
        int i2;
        qxl qxl = aabq.n.l;
        int i3 = qxl.c;
        int i4 = qxl.d;
        int i5 = qxl.b;
        int j = (int) axlu.a.a().j();
        if (j >= 0) {
            i = Math.max(j, i3);
        } else {
            i = i3;
        }
        int g = (int) axlu.a.a().g();
        if (g > 0) {
            i3 = Math.max(g, i3);
        }
        int o = (int) axlu.a.a().o();
        if (o != -1 && a(o)) {
            i5 = o;
        }
        int i6 = aabq.h;
        if (!a(i5)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Invalid RetryStrategy policy: ");
            sb.append(i5);
            Log.e("NetworkScheduler", sb.toString());
        }
        if (i5 != 1) {
            i2 = (int) Math.scalb((float) i3, i6);
        } else {
            i2 = (i6 + 1) * i3;
        }
        return Math.max(i, Math.min(i2, i4));
    }

    private static boolean a(int i) {
        return i == 0 || i == 1;
    }

    public static anfm a(qxx qxx) {
        if (qxx instanceof qxg) {
            qxg qxg = (qxg) qxx;
            return anfm.a((Comparable) Long.valueOf(TimeUnit.SECONDS.toMillis(qxg.a)), (Comparable) Long.valueOf(TimeUnit.SECONDS.toMillis(qxg.b)));
        } else if (qxx instanceof qxj) {
            qxj qxj = (qxj) qxx;
            long millis = TimeUnit.SECONDS.toMillis(qxj.a);
            long millis2 = TimeUnit.SECONDS.toMillis(qxj.b);
            long millis3 = TimeUnit.SECONDS.toMillis(axlu.a.a().l());
            if (millis < millis3) {
                double d = (double) millis3;
                double d2 = (double) millis;
                double d3 = (double) millis2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                millis2 = (long) (d / (d2 / d3));
                millis = millis3;
            }
            long[] jArr = {millis2, millis / 20, TimeUnit.SECONDS.toMillis(axlu.a.a().k())};
            amrl.a(true);
            long j = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
            }
            return anfm.a((Comparable) Long.valueOf(millis - Math.min(j, millis)), (Comparable) Long.valueOf(millis));
        } else if (qxx instanceof qwb) {
            return a;
        } else {
            throw new IllegalArgumentException("Unknown task type.");
        }
    }
}
