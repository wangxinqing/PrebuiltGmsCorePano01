package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: jco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jco {
    public final ou a;
    private final long b;

    public jco() {
        this.b = 60000;
        this.a = new ou(10);
    }

    public final boolean a(String str) {
        boolean z;
        synchronized (this) {
            z = this.a.remove(str) != null;
        }
        return z;
    }

    public final void b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        synchronized (this) {
            while (true) {
                ou ouVar = this.a;
                int i = ouVar.h;
                if (i >= 1024) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        if (elapsedRealtime - ((Long) this.a.c(i2)).longValue() > j) {
                            this.a.d(i2);
                        }
                    }
                    j /= 2;
                    StringBuilder sb = new StringBuilder(94);
                    sb.append("The max capacity ");
                    sb.append(1024);
                    sb.append(" is not enough. Current durationThreshold is: ");
                    sb.append(j);
                    Log.w("ConnectionTracker", sb.toString());
                } else {
                    Long l = (Long) ouVar.put(str, Long.valueOf(elapsedRealtime));
                }
            }
        }
    }

    public jco(long j) {
        this.b = j;
        this.a = new ou();
    }
}
