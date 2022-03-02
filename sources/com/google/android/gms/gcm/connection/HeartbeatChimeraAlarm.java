package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.cast.JGCastService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HeartbeatChimeraAlarm extends nla {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    private static final long n = TimeUnit.SECONDS.toMillis(10);
    public nut b;
    public final nva c;
    public final nuk d;
    public nui e;
    public long f;
    public int g;
    public volatile nul h;
    public int i;
    public boolean j;
    public long k;
    public long l = 0;
    private long m = 0;
    private final Context o;
    private long p = 0;
    private long q = 0;
    private boolean r = false;
    private final Intent s;
    private boolean t;

    public HeartbeatChimeraAlarm(Context context, nva nva, nuk nuk, nui nui) {
        super("gcm");
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_DID_HEARTBEAT");
        this.s = intent;
        this.t = false;
        this.o = context;
        this.c = nva;
        this.d = nuk;
        this.e = nui;
        intent.setFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        this.j = false;
    }

    public static boolean a(int i2) {
        return !Arrays.asList(axlf.a.a().n().split(";")).contains(Integer.toString(i2));
    }

    private final void h() {
        nul nul = this.h;
        if (nul != null && a(nul)) {
            int a2 = nul.a();
            boolean z = true;
            nul.a(1);
            if (a2 != nul.a()) {
                z = false;
            }
            this.j = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void i() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0041 }
            long r2 = r7.m     // Catch:{ all -> 0x0041 }
            long r0 = r0 - r2
            long r2 = defpackage.axlf.e()     // Catch:{ all -> 0x0041 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x003f
            nut r6 = r7.b     // Catch:{ all -> 0x0041 }
            boolean r6 = r6.g()     // Catch:{ all -> 0x0041 }
            if (r6 != 0) goto L_0x003f
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            long r0 = r7.m     // Catch:{ all -> 0x0041 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0026
            goto L_0x003f
        L_0x0026:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0041 }
            r7.m = r0     // Catch:{ all -> 0x0041 }
            nut r0 = r7.b     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003a
            r0 = 0
            r7.a((boolean) r0)     // Catch:{ all -> 0x0041 }
            monitor-exit(r7)
            return
        L_0x003a:
            nva r0 = r7.c     // Catch:{ all -> 0x0041 }
            r0.b()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r7)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm.i():void");
    }

    public final long b() {
        nul a2;
        long k2 = axlf.a.a().k();
        long j2 = (long) this.g;
        if (j2 > 0 && k2 > j2) {
            k2 = j2;
        }
        this.h = null;
        int h2 = this.c.h();
        if (!a(h2) || (a2 = this.d.a(h2).a(this.o)) == null) {
            return k2;
        }
        this.h = a2;
        return (long) a2.a();
    }

    public final void c() {
        this.b.a(false);
        this.e.d();
    }

    public final void d() {
        if (this.b.g()) {
            this.k = SystemClock.elapsedRealtime() - this.p;
            this.b.a(false);
            if (this.r) {
                h();
            }
        } else if (axlf.a.a().h() && this.b.h() && SystemClock.elapsedRealtime() - Math.max(this.l, this.q) > b() - n) {
            h();
        }
        this.q = SystemClock.elapsedRealtime();
        this.e.a(a());
    }

    public final int e() {
        nul nul = this.h;
        int a2 = (nul == null || !a(nul)) ? -1 : nul.a();
        if (a2 == -1 || a2 == this.i) {
            return -1;
        }
        return a2;
    }

    public final void f() {
        this.e.b.c();
    }

    public final boolean g() {
        if (axlf.a.a().l()) {
            return this.b.h();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = defpackage.axlf.e()     // Catch:{ all -> 0x0026 }
            boolean r2 = r5.t     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0012
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            monitor-exit(r5)
            return r0
        L_0x0012:
            boolean r0 = r5.g()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0021
            long r0 = r5.b()     // Catch:{ all -> 0x0026 }
            long r2 = a     // Catch:{ all -> 0x0026 }
            long r0 = r0 + r2
            monitor-exit(r5)
            return r0
        L_0x0021:
            long r0 = r5.b()     // Catch:{ all -> 0x0026 }
            goto L_0x0010
        L_0x0026:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x002a
        L_0x0029:
            throw r0
        L_0x002a:
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm.a():long");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r6 = r7.getAction()     // Catch:{ all -> 0x00f4 }
            int r7 = r6.hashCode()     // Catch:{ all -> 0x00f4 }
            r0 = 0
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            switch(r7) {
                case -2128145023: goto L_0x003a;
                case -1700544179: goto L_0x0030;
                case -264073239: goto L_0x0026;
                case 764219535: goto L_0x001c;
                case 823795052: goto L_0x0012;
                default: goto L_0x0011;
            }     // Catch:{ all -> 0x00f4 }
        L_0x0011:
            goto L_0x0044
        L_0x0012:
            java.lang.String r7 = "android.intent.action.USER_PRESENT"
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r7 == 0) goto L_0x0044
            r7 = 0
            goto L_0x0045
        L_0x001c:
            java.lang.String r7 = "com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW"
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r7 == 0) goto L_0x0044
            r7 = 2
            goto L_0x0045
        L_0x0026:
            java.lang.String r7 = "com.google.android.gms.gcm.HEARTBEAT_ALARM"
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r7 == 0) goto L_0x0044
            r7 = 4
            goto L_0x0045
        L_0x0030:
            java.lang.String r7 = "com.google.android.intent.action.MCS_HEARTBEAT"
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r7 == 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x003a:
            java.lang.String r7 = "android.intent.action.SCREEN_OFF"
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x00f4 }
            if (r7 == 0) goto L_0x0044
            r7 = 3
            goto L_0x0045
        L_0x0044:
            r7 = -1
        L_0x0045:
            if (r7 == 0) goto L_0x00ed
            if (r7 == r4) goto L_0x00ef
            if (r7 == r2) goto L_0x00ef
            if (r7 == r1) goto L_0x00ea
            if (r7 == r3) goto L_0x0074
            java.lang.String r7 = "GCM"
            boolean r7 = android.util.Log.isLoggable(r7, r3)     // Catch:{ all -> 0x00f4 }
            if (r7 == 0) goto L_0x0072
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f4 }
            java.lang.String r7 = "Unknown intent action in HeartbeatAlarm: "
            int r0 = r6.length()     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x0069
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00f4 }
            r6.<init>(r7)     // Catch:{ all -> 0x00f4 }
            goto L_0x006d
        L_0x0069:
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00f4 }
        L_0x006d:
            java.lang.String r7 = "GCM"
            android.util.Log.i(r7, r6)     // Catch:{ all -> 0x00f4 }
        L_0x0072:
            monitor-exit(r5)
            return
        L_0x0074:
            nut r6 = r5.b     // Catch:{ all -> 0x00f4 }
            boolean r6 = r6.b()     // Catch:{ all -> 0x00f4 }
            if (r6 == 0) goto L_0x0072
            nut r6 = r5.b     // Catch:{ all -> 0x00f4 }
            boolean r6 = r6.g()     // Catch:{ all -> 0x00f4 }
            if (r6 == 0) goto L_0x00e4
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00f4 }
            long r0 = r5.p     // Catch:{ all -> 0x00f4 }
            long r0 = r6 - r0
            long r2 = defpackage.axlf.d()     // Catch:{ all -> 0x00f4 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b4
            nui r6 = r5.e     // Catch:{ all -> 0x00f4 }
            long r2 = r2 - r0
            r6.a(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r7 = 49
            r6.<init>(r7)     // Catch:{ all -> 0x00f4 }
            java.lang.String r7 = "Heartbeat alarm fired early: "
            r6.append(r7)     // Catch:{ all -> 0x00f4 }
            r6.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r7 = "GCM"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r5)
            return
        L_0x00b4:
            nui r0 = r5.e     // Catch:{ all -> 0x00f4 }
            long r0 = r0.a()     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r3 = 60
            r2.<init>(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "Heartbeat timeout, GCM connection reset "
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            long r0 = r0 - r6
            r2.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r6 = "GCM"
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.w(r6, r7)     // Catch:{ all -> 0x00f4 }
            r5.c()     // Catch:{ all -> 0x00f4 }
            nut r6 = r5.b     // Catch:{ all -> 0x00f4 }
            r7 = 6
            r6.a((int) r7)     // Catch:{ all -> 0x00f4 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00f4 }
            r5.f = r6     // Catch:{ all -> 0x00f4 }
            monitor-exit(r5)
            return
        L_0x00e4:
            r5.a((boolean) r4)     // Catch:{ all -> 0x00f4 }
        L_0x00e8:
            monitor-exit(r5)
            return
        L_0x00ea:
            r5.t = r0     // Catch:{ all -> 0x00f4 }
            goto L_0x00e8
        L_0x00ed:
            r5.t = r4     // Catch:{ all -> 0x00f4 }
        L_0x00ef:
            r5.i()     // Catch:{ all -> 0x00f4 }
            monitor-exit(r5)
            return
        L_0x00f4:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x00f8
        L_0x00f7:
            throw r6
        L_0x00f8:
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm.a(android.content.Context, android.content.Intent):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        boolean z2;
        this.e.b.a((long) nur.a());
        if (SystemClock.elapsedRealtime() >= this.l + b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.r = z2;
        nut nut = this.b;
        amni amni = (amni) amnj.e.o();
        nvh nvh = (nvh) nut;
        nvi nvi = nvh.a;
        if (!nvi.g) {
            acws.a((Object) false);
        } else {
            nvi.i = true;
            nvh.a((audw) amni);
        }
        this.p = SystemClock.elapsedRealtime();
        if (axlf.a.a().m() && z) {
            this.o.sendBroadcast(this.s);
        }
        this.b.a(true);
        this.e.a(axlf.d());
    }

    public final boolean a(nul nul) {
        int h2 = this.c.h();
        return a(h2) && nul.a.c == h2;
    }
}
