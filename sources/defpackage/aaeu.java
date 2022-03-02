package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aaeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaeu {
    public static final /* synthetic */ int c = 0;
    public final Map a = new EnumMap(nxn.class);
    public final EnumMap b = new EnumMap(nxn.class);
    private final jbs d;
    private final PendingIntent e;
    private long f = Long.MAX_VALUE;
    private nwq g = nwq.i;
    private final Map h = new nz();
    private Set i = new HashSet();
    private boolean j = false;

    static {
        int i2 = aekp.a;
    }

    public aaeu(Context context, jbs jbs) {
        this.d = jbs;
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_CHECK_QUEUE");
        intent.setClassName(context, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
        this.e = PendingIntent.getBroadcast(context, 0, intent, 0);
        this.j = axbn.c();
    }

    private static String a(nwq nwq) {
        StringBuilder sb = new StringBuilder();
        nxn nxn = nxn.CAUSE_UNKNOWN;
        int a2 = nwp.a(nwq.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 == 2) {
            sb.append("/CONNECTED_NETWORK");
        } else if (i2 == 3) {
            sb.append("/UNMETERED_NETWORK");
        }
        int a3 = nwl.a(nwq.d);
        if (a3 != 0 && a3 == 3) {
            sb.append("/CHARGING");
        }
        int a4 = nwn.a(nwq.g);
        if (a4 != 0 && a4 == 2) {
            sb.append("/DEVICE_IDLE");
        }
        if (sb.length() == 0) {
            sb.append("/NO_CONSTRAINTS");
        }
        sb.append('/');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean b() {
        return !this.i.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        return !this.j || !b();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        long j2 = this.f;
        if (j2 != Long.MAX_VALUE) {
            this.d.a("NetworkScheduler.Wakeup", 2, j2, this.e, "com.google.android.gms");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized long e() {
        long j2;
        j2 = Long.MAX_VALUE;
        for (Long longValue : this.h.values()) {
            j2 = Math.min(longValue.longValue(), j2);
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        this.f = Long.MAX_VALUE;
        this.h.clear();
        this.g = nwq.i;
        this.d.a(this.e);
        this.i = new HashSet();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(aabq aabq) {
        if (this.j) {
            this.i.remove(aabq);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(PrintWriter printWriter) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f;
        String a2 = a(this.g);
        printWriter.println(String.format(Locale.US, "Next wakeup: %d s for %s", new Object[]{Long.valueOf((j2 - elapsedRealtime) / 1000), a2}));
        for (Map.Entry entry : this.h.entrySet()) {
            long max = Math.max(0, TimeUnit.MILLISECONDS.toSeconds(((Long) entry.getValue()).longValue() - elapsedRealtime));
            printWriter.println(String.format(Locale.US, "Next %s eligible %d seconds.", new Object[]{a((nwq) entry.getKey()), Long.valueOf(max)}));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r9.h() < r0.longValue()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r7, defpackage.aabq r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r9.o     // Catch:{ all -> 0x0090 }
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x0008
            goto L_0x0014
        L_0x0008:
            java.util.Set r0 = r9.b()     // Catch:{ all -> 0x0090 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r6)
            return r2
        L_0x0014:
            java.util.Map r0 = r6.h     // Catch:{ all -> 0x0090 }
            nwq r1 = r9.m     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0090 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            long r3 = r9.h()     // Catch:{ all -> 0x0090 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0090 }
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
        L_0x002d:
            java.util.Map r0 = r6.h     // Catch:{ all -> 0x0090 }
            nwq r1 = r9.m     // Catch:{ all -> 0x0090 }
            long r3 = r9.h()     // Catch:{ all -> 0x0090 }
            long r3 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0090 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0090 }
            r0.put(r1, r3)     // Catch:{ all -> 0x0090 }
        L_0x0040:
            long r0 = r9.i()     // Catch:{ all -> 0x0090 }
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0073
            long r0 = r9.i()     // Catch:{ all -> 0x0090 }
            long r3 = r6.f     // Catch:{ all -> 0x0090 }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0073
            long r7 = r9.i()     // Catch:{ all -> 0x0090 }
            r0 = 0
            long r7 = java.lang.Math.max(r7, r0)     // Catch:{ all -> 0x0090 }
            r6.f = r7     // Catch:{ all -> 0x0090 }
            nwq r7 = r9.m     // Catch:{ all -> 0x0090 }
            r6.g = r7     // Catch:{ all -> 0x0090 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0090 }
            r7.<init>()     // Catch:{ all -> 0x0090 }
            r6.i = r7     // Catch:{ all -> 0x0090 }
            boolean r8 = r6.j     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x0070
            r7.add(r9)     // Catch:{ all -> 0x0090 }
        L_0x0070:
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x0073:
            boolean r0 = r6.j     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008e
            long r0 = r9.i()     // Catch:{ all -> 0x0090 }
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x008e
            long r7 = r9.i()     // Catch:{ all -> 0x0090 }
            long r0 = r6.f     // Catch:{ all -> 0x0090 }
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x008e
            java.util.Set r7 = r6.i     // Catch:{ all -> 0x0090 }
            r7.add(r9)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r6)
            return r2
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeu.a(long, aabq):boolean");
    }
}
