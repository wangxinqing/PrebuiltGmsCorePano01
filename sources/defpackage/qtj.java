package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.smsindexer.SmsMonitorIntentOperation;

/* renamed from: qtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtj extends qvv {
    private static qtj d;
    private final Context a;
    private final jbs b;
    private long c = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private qtj(Context context) {
        super("ipa", "SmsContentObserver", (Handler) null);
        jbs jbs = new jbs(context);
        this.a = context;
        this.b = jbs;
    }

    public static synchronized void a() {
        synchronized (qtj.class) {
            if (d != null) {
                d.a.getContentResolver().unregisterContentObserver(d);
                d.c();
                d = null;
            }
        }
    }

    private final synchronized void a(long j) {
        this.c = j;
    }

    static synchronized void b(Context context) {
        synchronized (qtj.class) {
            a(context);
            if (d != null) {
                d.c();
                d.a(SystemClock.elapsedRealtime());
            }
        }
    }

    private final void c() {
        PendingIntent service = PendingIntent.getService(this.a, 0, d(this.a), 536870912);
        if (service != null) {
            synchronized (qtj.class) {
                d.b.a(service);
            }
            service.cancel();
        }
    }

    static Intent d(Context context) {
        return IntentOperation.getStartIntent(context, SmsMonitorIntentOperation.class, "com.google.android.gms.ipa.smsindexer.SMS_CHANGED");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<qtj> r0 = defpackage.qtj.class
            monitor-enter(r0)
            boolean r1 = defpackage.qtp.a((android.content.Context) r2)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x001d
            qtj r1 = d     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x001b
            qtj r1 = new qtj     // Catch:{ all -> 0x0022 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0022 }
            r1.<init>(r2)     // Catch:{ all -> 0x0022 }
            d = r1     // Catch:{ all -> 0x0022 }
            r1.b()     // Catch:{ all -> 0x0022 }
        L_0x001b:
            monitor-exit(r0)
            return
        L_0x001d:
            a()     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtj.a(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        try {
            this.a.getContentResolver().registerContentObserver(qtp.c, false, this);
        } catch (NoClassDefFoundError | SecurityException e) {
            qoh.a().a(51);
        }
    }

    public static synchronized void c(Context context) {
        synchronized (qtj.class) {
            a(context);
            if (d != null) {
                d.onChange(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r2 <= (r1.c + defpackage.axvz.a.a().z())) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(boolean r16, android.net.Uri r17) {
        /*
            r15 = this;
            r1 = r15
            monitor-enter(r15)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x005d }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x005d }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x005d }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005d }
            android.content.Context r5 = r1.a     // Catch:{ all -> 0x005d }
            android.content.Intent r5 = d(r5)     // Catch:{ all -> 0x005d }
            android.content.Context r6 = r1.a     // Catch:{ all -> 0x005d }
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r4, r5, r7)     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0034
            axvz r6 = defpackage.axvz.a     // Catch:{ all -> 0x005d }
            axwa r6 = r6.a()     // Catch:{ all -> 0x005d }
            long r6 = r6.z()     // Catch:{ all -> 0x005d }
            long r8 = r1.c     // Catch:{ all -> 0x005d }
            long r8 = r8 + r6
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            monitor-exit(r15)
            return
        L_0x0034:
            android.content.Context r6 = r1.a     // Catch:{ all -> 0x005d }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r13 = android.app.PendingIntent.getService(r6, r4, r5, r7)     // Catch:{ all -> 0x005d }
            axvz r5 = defpackage.axvz.a     // Catch:{ all -> 0x005d }
            axwa r5 = r5.a()     // Catch:{ all -> 0x005d }
            long r5 = r5.M()     // Catch:{ all -> 0x005d }
            jbs r8 = r1.b     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "Ipa:SmsObserverOnChange"
            r10 = 2
            long r11 = r2 + r5
            r2 = 0
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x005d }
            r8.a((java.lang.String) r9, (int) r10, (long) r11, (android.app.PendingIntent) r13, (java.lang.String) r14)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x005d }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x005d }
            r0[r4] = r2     // Catch:{ all -> 0x005d }
            goto L_0x0032
        L_0x005d:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x0061
        L_0x0060:
            throw r0
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtj.a(boolean, android.net.Uri):void");
    }
}
