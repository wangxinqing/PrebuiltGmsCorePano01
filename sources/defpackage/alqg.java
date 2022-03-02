package defpackage;

import java.util.Collections;

/* renamed from: alqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqg implements alqj {
    public int a;
    public long b;
    public long c;
    public alpo d;
    private boolean e;
    private final alqr f;
    private int g;

    public alqg() {
        this.e = false;
    }

    private final synchronized void a(alqh alqh) {
        this.f.b();
        this.g = 6;
        a(new alqi(alqh, 0, (Exception) null, -1));
    }

    public alqg(alqf alqf, alqt alqt) {
        this.e = false;
        this.g = 1;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        alqr a2 = alqt.a(alqy.a(alqf, alqf.d.a(alqc.TEST), Collections.singletonMap("VER", "8"), alqx.GET, (String) null));
        this.f = a2;
        a2.a(new alqk(this));
    }

    public final synchronized void a() {
        if (this.g == 1) {
            this.g = 2;
            this.f.a();
        } else {
            throw new IllegalStateException("Test has already been run.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.g     // Catch:{ all -> 0x0068 }
            r5.g = r6     // Catch:{ all -> 0x0068 }
            int r1 = defpackage.alql.b(r0)     // Catch:{ all -> 0x0068 }
            int r1 = r1 + 1
            int r2 = defpackage.alql.b(r6)     // Catch:{ all -> 0x0068 }
            if (r1 == r2) goto L_0x004c
            java.lang.String r1 = defpackage.alql.a(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = defpackage.alql.a(r0)     // Catch:{ all -> 0x0068 }
            int r2 = r1.length()     // Catch:{ all -> 0x0068 }
            int r3 = r0.length()     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            int r2 = r2 + 81
            int r2 = r2 + r3
            r4.<init>(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "Out-of sequence response. Server sent response for stage "
            r4.append(r2)     // Catch:{ all -> 0x0068 }
            r4.append(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = ", but actual stage was "
            r4.append(r1)     // Catch:{ all -> 0x0068 }
            r4.append(r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "."
            r4.append(r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0068 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r1.<init>(r0)     // Catch:{ all -> 0x0068 }
            r0 = 4
            r2 = -1
            r5.a(r0, r1, r2)     // Catch:{ all -> 0x0068 }
        L_0x004c:
            r0 = 6
            if (r6 != r0) goto L_0x0066
            long r0 = r5.c     // Catch:{ all -> 0x0068 }
            long r2 = r5.b     // Catch:{ all -> 0x0068 }
            long r0 = r0 - r2
            r2 = 500(0x1f4, double:2.47E-321)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0061
            alqh r6 = defpackage.alqh.OK_STREAMING     // Catch:{ all -> 0x0068 }
            r5.a((defpackage.alqh) r6)     // Catch:{ all -> 0x0068 }
            monitor-exit(r5)
            return
        L_0x0061:
            alqh r6 = defpackage.alqh.OK_NO_STREAMING     // Catch:{ all -> 0x0068 }
            r5.a((defpackage.alqh) r6)     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r5)
            return
        L_0x0068:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqg.a(int):void");
    }

    public final synchronized void a(int i, Exception exc, int i2) {
        this.f.b();
        this.g = 6;
        a(new alqi(alqh.FAIL, i, exc, i2));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.alqi r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.e     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x008e
            r0 = 1
            r8.e = r0     // Catch:{ all -> 0x0090 }
            alpo r1 = r8.d     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            alpq r2 = r1.a     // Catch:{ all -> 0x0090 }
            boolean r2 = r2.c()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x008e
            alqh r2 = r9.a     // Catch:{ all -> 0x0090 }
            boolean r2 = r2.d     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x0065
            java.util.logging.Logger r2 = defpackage.alpq.a     // Catch:{ all -> 0x0090 }
            java.util.logging.Level r3 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0090 }
            alqh r4 = r9.a     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0090 }
            int r5 = r5.length()     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            int r5 = r5 + 36
            r6.<init>(r5)     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "Connection test successful. Result: "
            r6.append(r5)     // Catch:{ all -> 0x0090 }
            r6.append(r4)     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener"
            java.lang.String r5 = "onTestComplete"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0090 }
            r2.logp(r3, r4, r5, r6)     // Catch:{ all -> 0x0090 }
            alpq r2 = r1.a     // Catch:{ all -> 0x0090 }
            alqh r9 = r9.a     // Catch:{ all -> 0x0090 }
            alqh r3 = defpackage.alqh.OK_STREAMING     // Catch:{ all -> 0x0090 }
            if (r9 != r3) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r2.g = r0     // Catch:{ all -> 0x0090 }
            alpq r9 = r1.a     // Catch:{ all -> 0x0090 }
            alrf r9 = r9.e     // Catch:{ all -> 0x0090 }
            alrg r0 = defpackage.alrg.SUCCESS     // Catch:{ all -> 0x0090 }
            alpm r2 = new alpm     // Catch:{ all -> 0x0090 }
            alpq r1 = r1.a     // Catch:{ all -> 0x0090 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0090 }
            r9.a(r0, r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r8)
            return
        L_0x0065:
            java.util.logging.Logger r2 = defpackage.alpq.a     // Catch:{ all -> 0x0090 }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener"
            java.lang.String r5 = "onTestComplete"
            java.lang.String r6 = "Connection test failed."
            java.lang.Exception r7 = r9.b     // Catch:{ all -> 0x0090 }
            r2.logp(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            alpq r0 = r1.a     // Catch:{ all -> 0x0090 }
            alrf r0 = r0.e     // Catch:{ all -> 0x0090 }
            alrg r2 = defpackage.alrg.FAILURE     // Catch:{ all -> 0x0090 }
            alpq r3 = r1.a     // Catch:{ all -> 0x0090 }
            alpp r3 = r3.b     // Catch:{ all -> 0x0090 }
            r0.a(r2, r3)     // Catch:{ all -> 0x0090 }
            alpq r0 = r1.a     // Catch:{ all -> 0x0090 }
            alpn r0 = r0.f     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008e
            int r1 = r9.d     // Catch:{ all -> 0x0090 }
            int r9 = r9.c     // Catch:{ all -> 0x0090 }
            r0.a(r1, r9)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqg.a(alqi):void");
    }
}
