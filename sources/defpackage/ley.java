package defpackage;

import android.content.Context;
import android.content.SyncResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: ley  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ley {
    public static final ith a = new ith("SyncScheduler", "");
    public final Context b;
    public final ExecutorService c;
    public final lih d;
    public final khw e;
    public volatile lex f;
    private final Map g = new HashMap();
    private final jiq h;
    private final lhx i;
    private final ExecutorService j = jfm.b(10);
    private final lgy k;

    public ley(Context context, lgy lgy, jiq jiq, lhx lhx, lih lih, khw khw) {
        this.b = context;
        this.k = lgy;
        this.h = jiq;
        this.i = lhx;
        this.c = jfb.a(((Integer) jzq.aN.c()).intValue(), 10);
        iva.a((Object) lih);
        this.d = lih;
        iva.a((Object) khw);
        this.e = khw;
    }

    private final lsa a(String str, String str2, agvx agvx, agvx agvx2) {
        iva.a((Object) str);
        String valueOf = String.valueOf(str);
        return new lsa(this.h, this.i, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), agvx, agvx2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = d(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b(java.lang.String r7, android.content.SyncResult r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.c(r7)     // Catch:{ all -> 0x002f }
            r1 = 2
            if (r0 != r1) goto L_0x002d
            lew r7 = r6.d(r7)     // Catch:{ all -> 0x002f }
            java.util.List r0 = r7.f     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            int r1 = r0.size()     // Catch:{ all -> 0x002f }
            r2 = 0
        L_0x0015:
            if (r2 >= r1) goto L_0x002a
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x002f }
            lev r3 = (defpackage.lev) r3     // Catch:{ all -> 0x002f }
            java.util.concurrent.ExecutorService r4 = r6.j     // Catch:{ all -> 0x002f }
            leu r5 = new leu     // Catch:{ all -> 0x002f }
            r5.<init>(r3, r8)     // Catch:{ all -> 0x002f }
            r4.submit(r5)     // Catch:{ all -> 0x002f }
            int r2 = r2 + 1
            goto L_0x0015
        L_0x002a:
            r8 = 0
            r7.f = r8     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r6)
            return
        L_0x002f:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0033
        L_0x0032:
            throw r7
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ley.b(java.lang.String, android.content.SyncResult):void");
    }

    private final synchronized int c(String str) {
        iva.a((Object) str);
        return d(str).e;
    }

    private final synchronized lew d(String str) {
        lew lew = (lew) this.g.get(str);
        if (lew != null) {
            return lew;
        }
        lew lew2 = new lew(a(str, "SyncScheduler.rateLimiter.", jzq.aQ, jzq.aR), a(str, "SyncScheduler.firstPartyRateLimiter.", jzq.aL, jzq.aM), a(str, "SyncScheduler.onConnectRateLimiter.", jzq.aO, jzq.aP));
        this.g.put(str, lew2);
        return lew2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r0 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5 = new defpackage.let(r11, "drive", r12, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (defpackage.axds.b() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        defpackage.jca.a().a(r11.b, "SyncScheduler", new android.content.Intent().setClassName(r11.b, "com.google.android.gms.drive.metadata.sync.syncadapter.MetadataSyncService"), (android.content.ServiceConnection) r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        ((defpackage.jfz) r11.c).submit((java.lang.Runnable) new defpackage.ler(r11, r5, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        a(r12, 2, (android.content.SyncResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00df, code lost:
        a(r12, 2, (android.content.SyncResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        throw r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r12, int r13, int r14, java.util.List r15) {
        /*
            r11 = this;
            monitor-enter(r11)
            android.content.Context r0 = r11.b     // Catch:{ all -> 0x00e3 }
            android.accounts.Account r0 = defpackage.lrg.a((android.content.Context) r0, (java.lang.String) r12)     // Catch:{ all -> 0x00e3 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            ith r12 = a     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "Ignoring sync request: "
            r13[r2] = r14     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "SyncScheduler"
            java.lang.String r15 = "%s account does not exist."
            r12.b((java.lang.String) r14, (java.lang.String) r15, (java.lang.Object[]) r13)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            r12 = 4
            return r12
        L_0x001d:
            lgy r0 = r11.k     // Catch:{ all -> 0x00e3 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x0037
            ith r12 = a     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "Ignoring sync request: "
            r13[r2] = r14     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "SyncScheduler"
            java.lang.String r15 = "%s device offline."
            r12.b((java.lang.String) r14, (java.lang.String) r15, (java.lang.Object[]) r13)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            r12 = 3
            return r12
        L_0x0037:
            lew r0 = r11.d(r12)     // Catch:{ all -> 0x00e3 }
            int r3 = r0.e     // Catch:{ all -> 0x00e3 }
            r4 = 2
            if (r3 == r4) goto L_0x004f
            ith r12 = a     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "Ignoring sync request: "
            r13[r2] = r14     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "%s already syncing."
            r12.a((java.lang.String) r14, (java.lang.Object[]) r13)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            return r1
        L_0x004f:
            r3 = 103(0x67, float:1.44E-43)
            if (r13 == r3) goto L_0x0056
            lsg r3 = r0.c     // Catch:{ all -> 0x00e3 }
            goto L_0x0058
        L_0x0056:
            lsg r3 = r0.b     // Catch:{ all -> 0x00e3 }
        L_0x0058:
            boolean r3 = r3.d()     // Catch:{ all -> 0x00e3 }
            lsg r0 = r0.a     // Catch:{ all -> 0x00e3 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x00e3 }
            r5 = 102(0x66, float:1.43E-43)
            if (r13 == r5) goto L_0x008d
            if (r3 != 0) goto L_0x0077
            ith r12 = a     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "Ignoring sync request: "
            r13[r2] = r14     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "%s rate limited (normal limit)"
            r12.a((java.lang.String) r14, (java.lang.Object[]) r13)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            return r4
        L_0x0077:
            r3 = 101(0x65, float:1.42E-43)
            if (r13 == r3) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            if (r0 != 0) goto L_0x0099
            ith r12 = a     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "Ignoring sync request: "
            r13[r2] = r14     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "%s rate limited (on connection limit)"
            r12.a((java.lang.String) r14, (java.lang.Object[]) r13)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            return r4
        L_0x008d:
            if (r3 != 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            if (r0 != 0) goto L_0x0099
        L_0x0092:
            ith r13 = a     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "Rate limit exceeded but proceeding anyway with non-rate-limited sync"
            r13.b(r0)     // Catch:{ all -> 0x00e3 }
        L_0x0099:
            r13 = 0
            r11.a(r12, r2, r13)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            let r0 = new let     // Catch:{ RuntimeException -> 0x00de }
            java.lang.String r7 = "drive"
            r5 = r0
            r6 = r11
            r8 = r12
            r9 = r14
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ RuntimeException -> 0x00de }
            boolean r14 = defpackage.axds.b()     // Catch:{ RuntimeException -> 0x00de }
            if (r14 != 0) goto L_0x00cc
            android.content.Intent r14 = new android.content.Intent     // Catch:{ RuntimeException -> 0x00de }
            r14.<init>()     // Catch:{ RuntimeException -> 0x00de }
            android.content.Context r15 = r11.b     // Catch:{ RuntimeException -> 0x00de }
            java.lang.String r1 = "com.google.android.gms.drive.metadata.sync.syncadapter.MetadataSyncService"
            android.content.Intent r8 = r14.setClassName(r15, r1)     // Catch:{ RuntimeException -> 0x00de }
            jca r5 = defpackage.jca.a()     // Catch:{ RuntimeException -> 0x00de }
            android.content.Context r6 = r11.b     // Catch:{ RuntimeException -> 0x00de }
            java.lang.String r7 = "SyncScheduler"
            r10 = 1
            r9 = r0
            r5.a((android.content.Context) r6, (java.lang.String) r7, (android.content.Intent) r8, (android.content.ServiceConnection) r9, (int) r10)     // Catch:{ RuntimeException -> 0x00de }
            goto L_0x00dd
        L_0x00cc:
            ler r14 = new ler     // Catch:{ RuntimeException -> 0x00de }
            r14.<init>(r11, r0, r12)     // Catch:{ RuntimeException -> 0x00de }
            java.util.concurrent.ExecutorService r15 = r11.c     // Catch:{ RejectedExecutionException -> 0x00d9 }
            jfz r15 = (defpackage.jfz) r15     // Catch:{ RejectedExecutionException -> 0x00d9 }
            r15.submit((java.lang.Runnable) r14)     // Catch:{ RejectedExecutionException -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r14 = move-exception
            r11.a(r12, r4, r13)     // Catch:{ RuntimeException -> 0x00de }
        L_0x00dd:
            return r2
        L_0x00de:
            r14 = move-exception
            r11.a(r12, r4, r13)
            throw r14
        L_0x00e3:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00e3 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ley.a(java.lang.String, int, int, java.util.List):int");
    }

    public final synchronized void b(String str) {
        lew d2 = d(str);
        iva.a(d2.d > 0, (Object) "Sync not started?");
        d2.d--;
    }

    public final synchronized void a(String str) {
        d(str).d++;
    }

    public final synchronized void a(String str, int i2, SyncResult syncResult) {
        iva.a((Object) str);
        iva.a((Object) Integer.valueOf(i2));
        d(str).e = i2;
        b(str, syncResult);
    }

    public final void a(String str, SyncResult syncResult) {
        if (this.f != null) {
            ldj a2 = ((ldn) this.f).a(str);
            boolean z = false;
            if (syncResult != null && !syncResult.hasError()) {
                z = true;
            }
            a2.a(z);
        }
    }

    public final synchronized void a(String str, lev lev) {
        lew d2 = d(str);
        if (d2.f == null) {
            d2.f = new ArrayList();
        }
        d2.f.add(lev);
        b(str, new SyncResult());
    }

    public final synchronized boolean a(String str, int i2, int i3, SyncResult syncResult) {
        boolean z;
        Integer valueOf = Integer.valueOf(i2);
        iva.a((Object) valueOf);
        Integer valueOf2 = Integer.valueOf(i3);
        iva.a((Object) valueOf2);
        int c2 = c(str);
        if (c2 == i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a.b("Current sync status %s != %s, not setting to %s", Integer.valueOf(c2), valueOf, valueOf2);
        } else {
            a(str, i3, syncResult);
        }
        return z;
    }
}
