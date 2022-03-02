package defpackage;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;

/* renamed from: bavc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavc implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bavi b;

    public bavc(bavi bavi, Runnable runnable) {
        this.b = bavi;
        this.a = runnable;
    }

    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.b.b);
        bavi bavi = this.b;
        if (bavi.c) {
            ThreadStatsUid.set(bavi.d);
        }
        try {
            this.a.run();
            if (this.b.c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (this.b.c) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            throw th;
        }
    }
}
