package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: affc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class affc implements Closeable, affw {
    public final awdn a;
    public final afbt b;
    public final afeb c;
    public final Map d;
    public final Map e;
    public final awdn f;
    public final afhn g;
    public final awdn h;
    public final awdn i;
    public final Object j = new Object();
    public final Map k = new HashMap();
    public boolean l;
    public long m;
    public final aeri n;
    public final afgm o;
    private final affs p;
    private final awdn q;
    private final Map r;
    private final afgs s;
    private final pbw t;

    public affc(pbw pbw, awdn awdn, afgm afgm, affs affs, afbt afbt, awdn awdn2, Map map, Map map2, Map map3, afeb afeb, afgs afgs, awdn awdn3, afhn afhn, awdn awdn4, awdn awdn5, aeri aeri) {
        this.t = pbw;
        this.a = awdn;
        this.o = afgm;
        this.p = affs;
        this.b = afbt;
        this.c = afeb;
        this.r = map;
        this.q = awdn2;
        this.d = map2;
        this.e = map3;
        this.s = afgs;
        this.f = awdn3;
        this.g = afhn;
        this.h = awdn4;
        this.i = awdn5;
        this.n = aeri;
        b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (defpackage.axua.a.b().a() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        throw new defpackage.afdm("Missing channel config");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.affb a(defpackage.aerd r13) {
        /*
            r12 = this;
            java.util.Map r0 = r12.k
            java.lang.Object r0 = r0.get(r13)
            affb r0 = (defpackage.affb) r0
            if (r0 != 0) goto L_0x00e7
            affs r0 = r12.p
            android.accounts.Account r1 = r13.a()
            aukh r2 = r13.b()
            afft r0 = r0.a(r1, r2)
            affb r1 = new affb     // Catch:{ IOException -> 0x00cc }
            java.util.Map r2 = r12.r     // Catch:{ IOException -> 0x00cc }
            aukh r3 = r13.b()     // Catch:{ IOException -> 0x00cc }
            int r3 = r3.a     // Catch:{ IOException -> 0x00cc }
            aukg r3 = defpackage.aukg.a(r3)     // Catch:{ IOException -> 0x00cc }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x00cc }
            r6 = r2
            afgb r6 = (defpackage.afgb) r6     // Catch:{ IOException -> 0x00cc }
            aukh r2 = r13.b()     // Catch:{ IOException -> 0x00cc }
            aeri r3 = r12.n     // Catch:{ IOException -> 0x00cc }
            boolean r3 = r3.m()     // Catch:{ IOException -> 0x00cc }
            r4 = 0
            if (r3 == 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            aeri r3 = r12.n     // Catch:{ IOException -> 0x00cc }
            boolean r3 = r3.n()     // Catch:{ IOException -> 0x00cc }
            if (r3 != 0) goto L_0x0045
            r7 = r4
            goto L_0x008f
        L_0x0045:
            awdn r3 = r12.q     // Catch:{ IOException -> 0x00cc }
            java.lang.Object r3 = r3.a()     // Catch:{ IOException -> 0x00cc }
            aorr r3 = (defpackage.aorr) r3     // Catch:{ IOException -> 0x00cc }
            boolean r3 = r3.isDone()     // Catch:{ IOException -> 0x00cc }
            if (r3 == 0) goto L_0x00c4
            awdn r3 = r12.q     // Catch:{ ExecutionException -> 0x00bb, InterruptedException -> 0x00b9 }
            java.lang.Object r3 = r3.a()     // Catch:{ ExecutionException -> 0x00bb, InterruptedException -> 0x00b9 }
            aorr r3 = (defpackage.aorr) r3     // Catch:{ ExecutionException -> 0x00bb, InterruptedException -> 0x00b9 }
            java.lang.Object r3 = r3.get()     // Catch:{ ExecutionException -> 0x00bb, InterruptedException -> 0x00b9 }
            auke r3 = (defpackage.auke) r3     // Catch:{ ExecutionException -> 0x00bb, InterruptedException -> 0x00b9 }
            aucx r3 = r3.a     // Catch:{ ExecutionException -> 0x00bb, InterruptedException -> 0x00b9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x00cc }
        L_0x0067:
            boolean r5 = r3.hasNext()     // Catch:{ IOException -> 0x00cc }
            if (r5 == 0) goto L_0x0082
            java.lang.Object r5 = r3.next()     // Catch:{ IOException -> 0x00cc }
            aukd r5 = (defpackage.aukd) r5     // Catch:{ IOException -> 0x00cc }
            aukh r7 = r5.c     // Catch:{ IOException -> 0x00cc }
            if (r7 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            aukh r7 = defpackage.aukh.c     // Catch:{ IOException -> 0x00cc }
        L_0x007a:
            boolean r7 = r7.equals(r2)     // Catch:{ IOException -> 0x00cc }
            if (r7 == 0) goto L_0x0067
            r7 = r5
            goto L_0x008f
        L_0x0082:
            axua r2 = defpackage.axua.a     // Catch:{ IOException -> 0x00cc }
            axub r2 = r2.a()     // Catch:{ IOException -> 0x00cc }
            boolean r2 = r2.a()     // Catch:{ IOException -> 0x00cc }
            if (r2 == 0) goto L_0x00b1
            r7 = r4
        L_0x008f:
            aukh r8 = r13.b()     // Catch:{ IOException -> 0x00cc }
            android.accounts.Account r9 = r13.a()     // Catch:{ IOException -> 0x00cc }
            afgs r2 = r12.s     // Catch:{ IOException -> 0x00cc }
            java.lang.Object r2 = r2.a()     // Catch:{ IOException -> 0x00cc }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x00cc }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x00cc }
            long r10 = (long) r2     // Catch:{ IOException -> 0x00cc }
            r3 = r1
            r4 = r12
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00cc }
            java.util.Map r0 = r12.k
            r0.put(r13, r1)
            r0 = r1
            goto L_0x00e8
        L_0x00b1:
            afdm r13 = new afdm     // Catch:{ IOException -> 0x00cc }
            java.lang.String r1 = "Missing channel config"
            r13.<init>(r1)     // Catch:{ IOException -> 0x00cc }
            throw r13     // Catch:{ IOException -> 0x00cc }
        L_0x00b9:
            r13 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r13 = move-exception
        L_0x00bc:
            afdm r1 = new afdm     // Catch:{ IOException -> 0x00cc }
            java.lang.String r2 = "Failed to access channel config"
            r1.<init>(r2, r13)     // Catch:{ IOException -> 0x00cc }
            throw r1     // Catch:{ IOException -> 0x00cc }
        L_0x00c4:
            afdm r13 = new afdm     // Catch:{ IOException -> 0x00cc }
            java.lang.String r1 = "Channel config not available."
            r13.<init>(r1)     // Catch:{ IOException -> 0x00cc }
            throw r13     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r13 = move-exception
            r0.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00e2
        L_0x00d1:
            r0 = move-exception
            awdn r0 = r12.a
            java.lang.Object r0 = r0.a()
            pia r0 = (defpackage.pia) r0
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failure cleaning up MdhSyncStateStorage after ChannelSync creation failed"
            r0.e(r2, r1)
        L_0x00e2:
            afdm r13 = defpackage.afdm.a(r13)
            throw r13
        L_0x00e7:
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affc.a(aerd):affb");
    }

    private final void b() {
        this.l = false;
    }

    public final affb c(aukh aukh, Account account) {
        return a(aerd.a(account, aukh));
    }

    public final void close() {
        synchronized (this.j) {
            for (Map.Entry value : this.k.entrySet()) {
                ((affb) value.getValue()).close();
            }
            this.k.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc A[Catch:{ afdm -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fd A[Catch:{ afdm -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0117 A[Catch:{ afdm -> 0x0136 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r21, defpackage.aukh r22, android.accounts.Account r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.Object r2 = r1.j
            monitor-enter(r2)
            r3 = r22
            r4 = r23
            affb r3 = r1.c(r3, r4)     // Catch:{ all -> 0x0151 }
            afdx r4 = r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x004d
            aump r5 = r4.d()     // Catch:{ all -> 0x0151 }
            affx r5 = defpackage.affx.a(r5)     // Catch:{ all -> 0x0151 }
            affc r6 = r3.k     // Catch:{ all -> 0x0151 }
            java.util.Map r6 = r6.e     // Catch:{ all -> 0x0151 }
            aukh r7 = r3.c     // Catch:{ all -> 0x0151 }
            int r7 = r7.a     // Catch:{ all -> 0x0151 }
            aukg r7 = defpackage.aukg.a(r7)     // Catch:{ all -> 0x0151 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0151 }
            aerf r6 = (defpackage.aerf) r6     // Catch:{ all -> 0x0151 }
            aukh r7 = r3.c     // Catch:{ all -> 0x0151 }
            android.accounts.Account r8 = r3.d     // Catch:{ all -> 0x0151 }
            boolean r6 = r6.a(r7, r8)     // Catch:{ all -> 0x0151 }
            affc r7 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r7 = r7.n     // Catch:{ all -> 0x0151 }
            long r7 = r7.j()     // Catch:{ all -> 0x0151 }
            int r8 = (int) r7     // Catch:{ all -> 0x0151 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0151 }
            aump r5 = r5.a     // Catch:{ all -> 0x0151 }
            aucx r8 = r5.d     // Catch:{ all -> 0x0151 }
            java.lang.Integer r5 = defpackage.affx.a(r5, r8, r6, r7)     // Catch:{ all -> 0x0151 }
            goto L_0x006f
        L_0x004d:
            affc r5 = r3.k     // Catch:{ all -> 0x0151 }
            awdn r5 = r5.f     // Catch:{ all -> 0x0151 }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x0151 }
            aetj r5 = (defpackage.aetj) r5     // Catch:{ all -> 0x0151 }
            r6 = 10015(0x271f, float:1.4034E-41)
            aukh r7 = r3.c     // Catch:{ all -> 0x0151 }
            aokg r7 = defpackage.afgq.a(r7)     // Catch:{ all -> 0x0151 }
            r5.a(r6, r7)     // Catch:{ all -> 0x0151 }
            affc r5 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r5 = r5.n     // Catch:{ all -> 0x0151 }
            long r5 = r5.j()     // Catch:{ all -> 0x0151 }
            int r6 = (int) r5     // Catch:{ all -> 0x0151 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0151 }
        L_0x006f:
            if (r5 == 0) goto L_0x014f
            affc r6 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r6 = r6.n     // Catch:{ all -> 0x0151 }
            boolean r6 = r6.m()     // Catch:{ all -> 0x0151 }
            r7 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r6 != 0) goto L_0x007f
            goto L_0x00c6
        L_0x007f:
            aukd r6 = r3.e     // Catch:{ all -> 0x0151 }
            if (r6 == 0) goto L_0x00c6
            aujy r0 = defpackage.affb.a((defpackage.aukd) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0151 }
            aumt r0 = r0.d     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            aumt r0 = defpackage.aumt.e     // Catch:{ all -> 0x0151 }
        L_0x008e:
            aums r0 = r0.b     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            aums r0 = defpackage.aums.e     // Catch:{ all -> 0x0151 }
        L_0x0095:
            affc r6 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r6 = r6.n     // Catch:{ all -> 0x0151 }
            boolean r6 = r6.c()     // Catch:{ all -> 0x0151 }
            if (r6 != 0) goto L_0x00a0
            goto L_0x00aa
        L_0x00a0:
            if (r4 == 0) goto L_0x00aa
            aump r4 = r4.d()     // Catch:{ all -> 0x0151 }
            aums r0 = defpackage.afgj.a((defpackage.aums) r0, (defpackage.aump) r4)     // Catch:{ all -> 0x0151 }
        L_0x00aa:
            int r4 = defpackage.affb.b(r0)     // Catch:{ all -> 0x0151 }
            boolean r6 = r0.b     // Catch:{ all -> 0x0151 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0151 }
            long r10 = (long) r5     // Catch:{ all -> 0x0151 }
            long r10 = r10 * r8
            long r12 = defpackage.affb.a((defpackage.aums) r0)     // Catch:{ all -> 0x0151 }
            long r10 = java.lang.Math.max(r10, r12)     // Catch:{ all -> 0x0151 }
            r18 = r10
            r10 = r4
            r11 = r6
            r4 = r18
            goto L_0x00d6
        L_0x00c6:
            affc r0 = r3.k     // Catch:{ all -> 0x0151 }
            int r0 = r0.a()     // Catch:{ all -> 0x0151 }
            int r4 = r5.intValue()     // Catch:{ all -> 0x0151 }
            long r4 = (long) r4     // Catch:{ all -> 0x0151 }
            long r10 = r4 * r8
            r4 = r10
            r11 = 0
            r10 = r0
        L_0x00d6:
            double r12 = (double) r4     // Catch:{ all -> 0x0151 }
            affc r0 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r0 = r0.n     // Catch:{ all -> 0x0151 }
            agvx r0 = defpackage.ozz.o     // Catch:{ all -> 0x0151 }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x0151 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ all -> 0x0151 }
            double r14 = r0.doubleValue()     // Catch:{ all -> 0x0151 }
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r14
            long r12 = (long) r12
            long r8 = r8 + r12
            long r8 = java.lang.Math.max(r4, r8)     // Catch:{ all -> 0x0151 }
            affc r0 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r0 = r0.n     // Catch:{ all -> 0x0151 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0151 }
            if (r0 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            aomv r0 = defpackage.aomv.SYNC_TRIGGER_WRITE     // Catch:{ all -> 0x0151 }
            r3.a((defpackage.aomv) r0)     // Catch:{ all -> 0x0151 }
        L_0x0102:
            affc r0 = r3.k     // Catch:{ all -> 0x0151 }
            aeri r0 = r0.n     // Catch:{ all -> 0x0151 }
            agvx r0 = defpackage.ozz.r     // Catch:{ all -> 0x0151 }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0151 }
            boolean r4 = r0.booleanValue()     // Catch:{ all -> 0x0151 }
            int r0 = r3.l     // Catch:{ all -> 0x0151 }
            r5 = 4
            if (r0 == r5) goto L_0x0148
            affr r0 = r3.f     // Catch:{ all -> 0x0151 }
            affq r5 = r0.d()     // Catch:{ all -> 0x0151 }
            long r14 = r0.b()     // Catch:{ all -> 0x0151 }
            r16 = 1
            long r14 = r14 + r16
            r5.b(r14)     // Catch:{ all -> 0x0151 }
            affr r0 = r5.a()     // Catch:{ all -> 0x0151 }
            r3.f = r0     // Catch:{ all -> 0x0151 }
            afft r0 = r3.a     // Catch:{ afdm -> 0x0136 }
            affr r5 = r3.f     // Catch:{ afdm -> 0x0136 }
            r0.a((defpackage.affr) r5)     // Catch:{ afdm -> 0x0136 }
            goto L_0x0148
        L_0x0136:
            r0 = move-exception
            affc r0 = r3.k     // Catch:{ all -> 0x0151 }
            awdn r0 = r0.a     // Catch:{ all -> 0x0151 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0151 }
            pia r0 = (defpackage.pia) r0     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "Storing channel state failed"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x0151 }
            r0.e(r5, r6)     // Catch:{ all -> 0x0151 }
        L_0x0148:
            r5 = r12
            r7 = r8
            r9 = r10
            r10 = r11
            r3.a(r4, r5, r7, r9, r10)     // Catch:{ all -> 0x0151 }
        L_0x014f:
            monitor-exit(r2)     // Catch:{ all -> 0x0151 }
            return
        L_0x0151:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0151 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affc.b(java.lang.String, aukh, android.accounts.Account):void");
    }

    public final int a() {
        return this.n.g() ? 1 : 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d7 A[Catch:{ Exception -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02e5 A[Catch:{ Exception -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0384 A[Catch:{ afdm -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0385 A[Catch:{ afdm -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03a0 A[Catch:{ afdm -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03a1 A[Catch:{ afdm -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3 A[Catch:{ all -> 0x0151, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8 A[Catch:{ all -> 0x0151, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da A[Catch:{ all -> 0x0151, all -> 0x0159 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(boolean r26) {
        /*
            r25 = this;
            r1 = r25
            r3 = 2
            r4 = 1
            afeb r0 = r1.c     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            java.util.List r0 = r0.a()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            amxc r6 = defpackage.amxc.p()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
        L_0x0012:
            boolean r7 = r0.hasNext()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            if (r7 == 0) goto L_0x002e
            java.lang.Object r7 = r0.next()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            afdx r7 = (defpackage.afdx) r7     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            android.accounts.Account r8 = r7.b()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            aukh r9 = r7.c()     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            aerd r8 = defpackage.aerd.a(r8, r9)     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            r6.a((java.lang.Object) r8, (java.lang.Object) r7)     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            goto L_0x0012
        L_0x002e:
            java.lang.Object r7 = r1.j     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            monitor-enter(r7)     // Catch:{ afdy -> 0x015d, afdm -> 0x015b }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0151 }
            java.util.Map r8 = r1.k     // Catch:{ all -> 0x0151 }
            java.util.Set r8 = r8.keySet()     // Catch:{ all -> 0x0151 }
            r0.<init>(r8)     // Catch:{ all -> 0x0151 }
            java.util.Map r6 = r6.o()     // Catch:{ all -> 0x0151 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0151 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0151 }
        L_0x0048:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0151 }
            r9 = 3
            if (r8 == 0) goto L_0x011f
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0151 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x0151 }
            java.lang.Object r10 = r8.getKey()     // Catch:{ all -> 0x0151 }
            aerd r10 = (defpackage.aerd) r10     // Catch:{ all -> 0x0151 }
            aukh r10 = r10.b()     // Catch:{ all -> 0x0151 }
            java.lang.Object r11 = r8.getKey()     // Catch:{ all -> 0x0151 }
            aerd r11 = (defpackage.aerd) r11     // Catch:{ all -> 0x0151 }
            android.accounts.Account r11 = r11.a()     // Catch:{ all -> 0x0151 }
            java.util.Map r12 = r1.e     // Catch:{ all -> 0x0151 }
            int r13 = r10.a     // Catch:{ all -> 0x0151 }
            aukg r13 = defpackage.aukg.a(r13)     // Catch:{ all -> 0x0151 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0151 }
            aerf r12 = (defpackage.aerf) r12     // Catch:{ all -> 0x0151 }
            boolean r10 = r12.a(r10, r11)     // Catch:{ all -> 0x0151 }
            java.lang.Object r11 = r8.getValue()     // Catch:{ all -> 0x0151 }
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x0151 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0151 }
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0088:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x0151 }
            if (r15 == 0) goto L_0x00e7
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x0151 }
            afdx r15 = (defpackage.afdx) r15     // Catch:{ all -> 0x0151 }
            aump r16 = r15.d()     // Catch:{ all -> 0x0151 }
            affx r5 = defpackage.affx.a(r16)     // Catch:{ all -> 0x0151 }
            if (r12 != 0) goto L_0x00b8
            aelh r12 = defpackage.pba.ah     // Catch:{ all -> 0x0151 }
            java.lang.Object r12 = r12.a()     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0151 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r12 == 0) goto L_0x00b8
            aump r12 = r5.a     // Catch:{ all -> 0x0151 }
            aucx r2 = r12.c     // Catch:{ all -> 0x0151 }
            boolean r2 = defpackage.affx.a(r12, r2, r10)     // Catch:{ all -> 0x0151 }
            if (r2 != 0) goto L_0x00b8
            r12 = 0
            goto L_0x00b9
        L_0x00b8:
            r12 = 1
        L_0x00b9:
            if (r13 != 0) goto L_0x00d5
            aelh r2 = defpackage.pba.am     // Catch:{ all -> 0x0151 }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0151 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x00d5
            aump r2 = r5.a     // Catch:{ all -> 0x0151 }
            aucx r5 = r2.d     // Catch:{ all -> 0x0151 }
            boolean r2 = defpackage.affx.a(r2, r5, r10)     // Catch:{ all -> 0x0151 }
            if (r2 != 0) goto L_0x00d5
            r13 = 0
            goto L_0x00d6
        L_0x00d5:
            r13 = 1
        L_0x00d6:
            if (r14 == 0) goto L_0x00da
            r14 = 1
            goto L_0x0088
        L_0x00da:
            aump r2 = r15.d()     // Catch:{ all -> 0x0151 }
            int r2 = r2.a     // Catch:{ all -> 0x0151 }
            r2 = r2 & r3
            if (r2 != 0) goto L_0x00e5
            r14 = 0
            goto L_0x0088
        L_0x00e5:
            r14 = 1
            goto L_0x0088
        L_0x00e7:
            if (r12 == 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            if (r13 == 0) goto L_0x0048
        L_0x00ec:
            java.lang.Object r2 = r8.getKey()     // Catch:{ all -> 0x0151 }
            r0.remove(r2)     // Catch:{ all -> 0x0151 }
            java.lang.Object r2 = r8.getKey()     // Catch:{ all -> 0x0151 }
            aerd r2 = (defpackage.aerd) r2     // Catch:{ all -> 0x0151 }
            affb r2 = r1.a((defpackage.aerd) r2)     // Catch:{ all -> 0x0151 }
            if (r26 == 0) goto L_0x010f
            affc r5 = r2.k     // Catch:{ all -> 0x0151 }
            aeri r5 = r5.n     // Catch:{ all -> 0x0151 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0151 }
            if (r5 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            aomv r5 = defpackage.aomv.SYNC_TRIGGER_TIMER     // Catch:{ all -> 0x0151 }
            r2.a((defpackage.aomv) r5)     // Catch:{ all -> 0x0151 }
        L_0x010f:
            int r5 = r2.l     // Catch:{ all -> 0x0151 }
            if (r5 == r9) goto L_0x0114
            goto L_0x0117
        L_0x0114:
            r2.a((int) r3)     // Catch:{ all -> 0x0151 }
        L_0x0117:
            r2.h = r12     // Catch:{ all -> 0x0151 }
            r2.i = r13     // Catch:{ all -> 0x0151 }
            r2.j = r14     // Catch:{ all -> 0x0151 }
            goto L_0x0048
        L_0x011f:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0151 }
        L_0x0123:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x014e
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0151 }
            aerd r2 = (defpackage.aerd) r2     // Catch:{ all -> 0x0151 }
            java.util.Map r5 = r1.k     // Catch:{ all -> 0x0151 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0151 }
            affb r5 = (defpackage.affb) r5     // Catch:{ all -> 0x0151 }
            int r6 = r5.l     // Catch:{ all -> 0x0151 }
            int r8 = r6 + -1
            if (r6 == 0) goto L_0x014b
            if (r8 == 0) goto L_0x0147
            if (r8 == r4) goto L_0x0142
            goto L_0x0123
        L_0x0142:
            r5.a((int) r9)     // Catch:{ all -> 0x0151 }
            goto L_0x0123
        L_0x0147:
            r5.a((defpackage.aerd) r2)     // Catch:{ all -> 0x0151 }
            goto L_0x0123
        L_0x014b:
            r2 = 0
            throw r2     // Catch:{ all -> 0x0159 }
        L_0x014e:
            r2 = 0
            monitor-exit(r7)     // Catch:{ all -> 0x0159 }
            goto L_0x0180
        L_0x0151:
            r0 = move-exception
            r2 = 0
        L_0x0153:
            monitor-exit(r7)     // Catch:{ all -> 0x0159 }
            throw r0     // Catch:{ afdy -> 0x0157, afdm -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            goto L_0x015f
        L_0x0157:
            r0 = move-exception
            goto L_0x015f
        L_0x0159:
            r0 = move-exception
            goto L_0x0153
        L_0x015b:
            r0 = move-exception
            goto L_0x015e
        L_0x015d:
            r0 = move-exception
        L_0x015e:
            r2 = 0
        L_0x015f:
            axtl r5 = defpackage.axtl.a
            axtm r5 = r5.a()
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0170
            aorr r0 = defpackage.aorl.a((java.lang.Throwable) r0)
            return r0
        L_0x0170:
            awdn r0 = r1.a
            java.lang.Object r0 = r0.a()
            pia r0 = (defpackage.pia) r0
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = "Subscribed channels refresh failed"
            r0.d(r5, r6)
        L_0x0180:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = r1.j
            monitor-enter(r6)
            r25.b()     // Catch:{ all -> 0x03fe }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x03fe }
            java.util.Map r7 = r1.k     // Catch:{ all -> 0x03fe }
            java.util.Collection r7 = r7.values()     // Catch:{ all -> 0x03fe }
            r0.<init>(r7)     // Catch:{ all -> 0x03fe }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x03fe }
        L_0x019a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ed
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x03fe }
            r15 = r0
            affb r15 = (defpackage.affb) r15     // Catch:{ all -> 0x03fe }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03fe }
            int r0 = r15.l     // Catch:{ all -> 0x03fe }
            if (r0 == r4) goto L_0x01c5
            affc r0 = r15.k     // Catch:{ all -> 0x03fe }
            awdn r0 = r0.a     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x03fe }
            pia r0 = (defpackage.pia) r0     // Catch:{ all -> 0x03fe }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x03fe }
            android.accounts.Account r8 = r15.d     // Catch:{ all -> 0x03fe }
            r9 = 0
            r0[r9] = r8     // Catch:{ all -> 0x03fe }
            aukh r8 = r15.c     // Catch:{ all -> 0x03fe }
            r0[r4] = r8     // Catch:{ all -> 0x03fe }
            goto L_0x019a
        L_0x01c5:
            if (r26 == 0) goto L_0x01dc
            affc r0 = r15.k     // Catch:{ all -> 0x03fe }
            aeri r0 = r0.n     // Catch:{ all -> 0x03fe }
            long r8 = r0.k()     // Catch:{ all -> 0x03fe }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            boolean r0 = r15.a((long) r13, (long) r8)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x01fb
            r2 = r15
            goto L_0x03d4
        L_0x01dc:
            boolean r0 = r15.h     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x01ea
            affr r0 = r15.f     // Catch:{ all -> 0x03fe }
            affr r8 = r15.g     // Catch:{ all -> 0x03fe }
            boolean r0 = defpackage.affr.a(r0, r8)     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x01fb
        L_0x01ea:
            boolean r0 = r15.i     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03d3
            affr r0 = r15.f     // Catch:{ all -> 0x03fe }
            affr r8 = r15.g     // Catch:{ all -> 0x03fe }
            boolean r0 = defpackage.affr.b(r0, r8)     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x01fb
            r2 = r15
            goto L_0x03d4
        L_0x01fb:
            boolean r12 = r15.j     // Catch:{ all -> 0x03fe }
            affq r0 = defpackage.affr.e()     // Catch:{ all -> 0x03fe }
            boolean r8 = r15.h     // Catch:{ all -> 0x03fe }
            if (r8 != 0) goto L_0x0208
            affr r8 = r15.g     // Catch:{ all -> 0x03fe }
            goto L_0x020a
        L_0x0208:
            affr r8 = r15.f     // Catch:{ all -> 0x03fe }
        L_0x020a:
            long r8 = r8.a()     // Catch:{ all -> 0x03fe }
            r0.a((long) r8)     // Catch:{ all -> 0x03fe }
            boolean r8 = r15.i     // Catch:{ all -> 0x03fe }
            if (r8 != 0) goto L_0x0218
            affr r8 = r15.g     // Catch:{ all -> 0x03fe }
            goto L_0x021a
        L_0x0218:
            affr r8 = r15.f     // Catch:{ all -> 0x03fe }
        L_0x021a:
            long r8 = r8.b()     // Catch:{ all -> 0x03fe }
            r0.b(r8)     // Catch:{ all -> 0x03fe }
            affr r8 = r15.f     // Catch:{ all -> 0x03fe }
            anaf r8 = r8.c()     // Catch:{ all -> 0x03fe }
            r0.a((defpackage.anaf) r8)     // Catch:{ all -> 0x03fe }
            affr r17 = r0.a()     // Catch:{ all -> 0x03fe }
            affc r0 = r15.k     // Catch:{ all -> 0x03fe }
            aeri r0 = r0.n     // Catch:{ all -> 0x03fe }
            boolean r0 = r0.d()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x025e
            afft r0 = r15.a     // Catch:{ afdm -> 0x0241 }
            java.lang.Long r0 = r0.e()     // Catch:{ afdm -> 0x0241 }
            r18 = r0
            goto L_0x0260
        L_0x0241:
            r0 = move-exception
            affc r8 = r15.k     // Catch:{ all -> 0x03fe }
            awdn r8 = r8.a     // Catch:{ all -> 0x03fe }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x03fe }
            pia r8 = (defpackage.pia) r8     // Catch:{ all -> 0x03fe }
            affc r8 = r15.k     // Catch:{ all -> 0x03fe }
            awdn r8 = r8.h     // Catch:{ all -> 0x03fe }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x03fe }
            pdg r8 = (defpackage.pdg) r8     // Catch:{ all -> 0x03fe }
            java.lang.String r9 = "Failed to retrieve push notification timestamp!"
            r8.a(r9, r0)     // Catch:{ all -> 0x03fe }
            r18 = r2
            goto L_0x0260
        L_0x025e:
            r18 = r2
        L_0x0260:
            affc r0 = r15.k     // Catch:{ all -> 0x03fe }
            aeri r0 = r0.n     // Catch:{ all -> 0x03fe }
            boolean r0 = r0.e()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x029c
            affc r0 = r15.k     // Catch:{ IOException -> 0x027f }
            awdn r0 = r0.i     // Catch:{ IOException -> 0x027f }
            java.lang.Object r0 = r0.a()     // Catch:{ IOException -> 0x027f }
            afai r0 = (defpackage.afai) r0     // Catch:{ IOException -> 0x027f }
            android.accounts.Account r8 = r15.d     // Catch:{ IOException -> 0x027f }
            boolean r0 = r0.d(r8)     // Catch:{ IOException -> 0x027f }
            if (r0 == 0) goto L_0x029c
            r19 = 1
            goto L_0x029e
        L_0x027f:
            r0 = move-exception
            affc r8 = r15.k     // Catch:{ all -> 0x03fe }
            awdn r8 = r8.a     // Catch:{ all -> 0x03fe }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x03fe }
            pia r8 = (defpackage.pia) r8     // Catch:{ all -> 0x03fe }
            affc r8 = r15.k     // Catch:{ all -> 0x03fe }
            awdn r8 = r8.h     // Catch:{ all -> 0x03fe }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x03fe }
            pdg r8 = (defpackage.pdg) r8     // Catch:{ all -> 0x03fe }
            java.lang.String r9 = "Failed to retrieve registration status!"
            r8.a(r9, r0)     // Catch:{ all -> 0x03fe }
            r19 = 0
            goto L_0x029e
        L_0x029c:
            r19 = 0
        L_0x029e:
            boolean r10 = r15.h     // Catch:{ all -> 0x03fe }
            affc r0 = r15.k     // Catch:{ all -> 0x03fe }
            afhn r0 = r0.g     // Catch:{ all -> 0x03fe }
            android.accounts.Account r8 = r15.d     // Catch:{ all -> 0x03fe }
            aukh r9 = r15.c     // Catch:{ all -> 0x03fe }
            r0.a((android.accounts.Account) r8, (defpackage.aukh) r9)     // Catch:{ all -> 0x03fe }
            r15.a((int) r3)     // Catch:{ all -> 0x03fe }
            afgb r0 = r15.b     // Catch:{ Exception -> 0x0358 }
            aukh r8 = r15.c     // Catch:{ Exception -> 0x0358 }
            android.accounts.Account r9 = r15.d     // Catch:{ Exception -> 0x0358 }
            boolean r11 = r15.h     // Catch:{ Exception -> 0x0358 }
            boolean r2 = r15.i     // Catch:{ Exception -> 0x0358 }
            aorr r0 = r0.a(r8, r9, r11, r2)     // Catch:{ Exception -> 0x0358 }
            afev r2 = new afev     // Catch:{ Exception -> 0x0358 }
            r2.<init>(r15)     // Catch:{ Exception -> 0x0358 }
            aoqm r8 = defpackage.aoqm.a     // Catch:{ Exception -> 0x0358 }
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.amqy) r2, (java.util.concurrent.Executor) r8)     // Catch:{ Exception -> 0x0358 }
            affc r2 = r15.k     // Catch:{ Exception -> 0x0358 }
            aeri r2 = r2.n     // Catch:{ Exception -> 0x0358 }
            axto r2 = defpackage.axto.a     // Catch:{ Exception -> 0x0358 }
            axtp r2 = r2.a()     // Catch:{ Exception -> 0x0358 }
            boolean r2 = r2.a()     // Catch:{ Exception -> 0x0358 }
            if (r2 == 0) goto L_0x02e5
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            afew r8 = new afew     // Catch:{ Exception -> 0x0358 }
            r8.<init>()     // Catch:{ Exception -> 0x0358 }
            aoqm r9 = defpackage.aoqm.a     // Catch:{ Exception -> 0x0358 }
            aorr r0 = defpackage.aooz.a((defpackage.aorr) r0, (java.lang.Class) r2, (defpackage.aoqb) r8, (java.util.concurrent.Executor) r9)     // Catch:{ Exception -> 0x0358 }
            goto L_0x02fc
        L_0x02e5:
            java.lang.Class<aern> r2 = defpackage.aern.class
            amqy r8 = defpackage.afex.a     // Catch:{ Exception -> 0x0358 }
            aoqm r9 = defpackage.aoqm.a     // Catch:{ Exception -> 0x0358 }
            aorr r0 = defpackage.aooz.a((defpackage.aorr) r0, (java.lang.Class) r2, (defpackage.amqy) r8, (java.util.concurrent.Executor) r9)     // Catch:{ Exception -> 0x0358 }
            java.lang.Class<affu> r2 = defpackage.affu.class
            afey r8 = new afey     // Catch:{ Exception -> 0x0358 }
            r8.<init>()     // Catch:{ Exception -> 0x0358 }
            aoqm r9 = defpackage.aoqm.a     // Catch:{ Exception -> 0x0358 }
            aorr r0 = defpackage.aooz.a((defpackage.aorr) r0, (java.lang.Class) r2, (defpackage.amqy) r8, (java.util.concurrent.Executor) r9)     // Catch:{ Exception -> 0x0358 }
        L_0x02fc:
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            afez r11 = new afez     // Catch:{ Exception -> 0x0358 }
            r8 = r11
            r9 = r15
            r20 = r10
            r4 = r11
            r10 = r13
            r21 = r12
            r22 = r13
            r13 = r17
            r14 = r18
            r24 = r15
            r15 = r19
            r16 = r20
            r8.<init>(r9, r10, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0354 }
            aoqm r8 = defpackage.aoqm.a     // Catch:{ Exception -> 0x0354 }
            aorr r0 = defpackage.aooz.a((defpackage.aorr) r0, (java.lang.Class) r2, (defpackage.aoqb) r4, (java.util.concurrent.Executor) r8)     // Catch:{ Exception -> 0x0354 }
            affa r2 = new affa     // Catch:{ Exception -> 0x0354 }
            r8 = r2
            r9 = r24
            r10 = r22
            r12 = r21
            r13 = r17
            r14 = r18
            r15 = r19
            r16 = r20
            r8.<init>(r9, r10, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0354 }
            aoqm r4 = defpackage.aoqm.a     // Catch:{ Exception -> 0x0354 }
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.amqy) r2, (java.util.concurrent.Executor) r4)     // Catch:{ Exception -> 0x0354 }
            r5.add(r0)     // Catch:{ Exception -> 0x0354 }
            r2 = r24
            affc r0 = r2.k     // Catch:{ Exception -> 0x0352 }
            awdn r0 = r0.a     // Catch:{ Exception -> 0x0352 }
            java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x0352 }
            pia r0 = (defpackage.pia) r0     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "Sync started"
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0352 }
            r0.a(r4, r9)     // Catch:{ Exception -> 0x0352 }
            r2 = 0
            r4 = 1
            goto L_0x019a
        L_0x0352:
            r0 = move-exception
            goto L_0x0360
        L_0x0354:
            r0 = move-exception
            r2 = r24
            goto L_0x0360
        L_0x0358:
            r0 = move-exception
            r20 = r10
            r21 = r12
            r22 = r13
            r2 = r15
        L_0x0360:
            affc r4 = r2.k     // Catch:{ all -> 0x03fe }
            awdn r4 = r4.a     // Catch:{ all -> 0x03fe }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x03fe }
            pia r4 = (defpackage.pia) r4     // Catch:{ all -> 0x03fe }
            java.lang.String r8 = "Sync trigger failed"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x03fe }
            r4.e(r8, r10)     // Catch:{ all -> 0x03fe }
            aokp r4 = defpackage.aokp.o     // Catch:{ all -> 0x03fe }
            aucd r4 = r4.o()     // Catch:{ all -> 0x03fe }
            java.lang.Class r8 = r0.getClass()     // Catch:{ all -> 0x03fe }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x03fe }
            boolean r9 = r4.c     // Catch:{ all -> 0x03fe }
            if (r9 != 0) goto L_0x0385
            goto L_0x038b
        L_0x0385:
            r4.c()     // Catch:{ all -> 0x03fe }
            r9 = 0
            r4.c = r9     // Catch:{ all -> 0x03fe }
        L_0x038b:
            aucj r9 = r4.b     // Catch:{ all -> 0x03fe }
            aokp r9 = (defpackage.aokp) r9     // Catch:{ all -> 0x03fe }
            r8.getClass()     // Catch:{ all -> 0x03fe }
            int r10 = r9.a     // Catch:{ all -> 0x03fe }
            r10 = r10 | 4
            r9.a = r10     // Catch:{ all -> 0x03fe }
            r9.d = r8     // Catch:{ all -> 0x03fe }
            aomx r8 = defpackage.aomx.NOT_STARTED     // Catch:{ all -> 0x03fe }
            boolean r9 = r4.c     // Catch:{ all -> 0x03fe }
            if (r9 != 0) goto L_0x03a1
            goto L_0x03a7
        L_0x03a1:
            r4.c()     // Catch:{ all -> 0x03fe }
            r9 = 0
            r4.c = r9     // Catch:{ all -> 0x03fe }
        L_0x03a7:
            aucj r9 = r4.b     // Catch:{ all -> 0x03fe }
            aokp r9 = (defpackage.aokp) r9     // Catch:{ all -> 0x03fe }
            int r8 = r8.a()     // Catch:{ all -> 0x03fe }
            r9.c = r8     // Catch:{ all -> 0x03fe }
            int r8 = r9.a     // Catch:{ all -> 0x03fe }
            r8 = r8 | r3
            r9.a = r8     // Catch:{ all -> 0x03fe }
            r8 = r2
            r9 = r22
            r11 = r21
            r12 = r17
            r13 = r18
            r14 = r19
            r15 = r20
            r16 = r4
            r8.a(r9, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x03fe }
            aorr r0 = defpackage.aorl.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x03fe }
            r5.add(r0)     // Catch:{ all -> 0x03fe }
            r2 = 0
            r4 = 1
            goto L_0x019a
        L_0x03d3:
            r2 = r15
        L_0x03d4:
            affc r0 = r2.k     // Catch:{ all -> 0x03fe }
            awdn r0 = r0.a     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x03fe }
            pia r0 = (defpackage.pia) r0     // Catch:{ all -> 0x03fe }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x03fe }
            android.accounts.Account r4 = r2.d     // Catch:{ all -> 0x03fe }
            r8 = 0
            r0[r8] = r4     // Catch:{ all -> 0x03fe }
            aukh r2 = r2.c     // Catch:{ all -> 0x03fe }
            r4 = 1
            r0[r4] = r2     // Catch:{ all -> 0x03fe }
            r2 = 0
            goto L_0x019a
        L_0x03ed:
            monitor-exit(r6)     // Catch:{ all -> 0x03fe }
            aord r0 = defpackage.aorl.b((java.lang.Iterable) r5)
            afeu r2 = new afeu
            r2.<init>(r1, r5)
            pbw r3 = r1.t
            aorr r0 = r0.a((java.util.concurrent.Callable) r2, (java.util.concurrent.Executor) r3)
            return r0
        L_0x03fe:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03fe }
            goto L_0x0402
        L_0x0401:
            throw r0
        L_0x0402:
            goto L_0x0401
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affc.a(boolean):aorr");
    }

    public final boolean b(aukh aukh, Account account) {
        boolean c2;
        synchronized (this.j) {
            affb c3 = c(aukh, account);
            c2 = affr.c(c3.f, c3.g);
        }
        return c2;
    }

    public final void a(long j2, int i2, boolean z) {
        this.l = true;
        this.m = j2;
        this.b.a(true, i2, z, (Bundle) null);
    }

    public final void a(aukh aukh, Account account) {
        synchronized (this.j) {
            affb c2 = c(aukh, account);
            if (c2.l != 4) {
                try {
                    c2.a.f();
                    if (c2.l != 1) {
                        c2.a(4);
                    } else {
                        c2.a();
                    }
                } catch (afdm e2) {
                    ((pia) c2.k.a.a()).e("Sync state delete failed", new Object[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e A[Catch:{ afdy -> 0x00ec }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aukh r10, android.accounts.Account r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.j
            monitor-enter(r0)
            affb r1 = r9.c(r10, r11)     // Catch:{ all -> 0x014a }
            affc r10 = r1.k     // Catch:{ all -> 0x014a }
            aeri r10 = r10.n     // Catch:{ all -> 0x014a }
            boolean r10 = r10.n()     // Catch:{ all -> 0x014a }
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r10 != 0) goto L_0x0015
            goto L_0x00f5
        L_0x0015:
            aukd r10 = r1.e     // Catch:{ all -> 0x014a }
            if (r10 == 0) goto L_0x00f5
            if (r12 == 0) goto L_0x001c
            goto L_0x0035
        L_0x001c:
            if (r13 != 0) goto L_0x0035
            affc r10 = r1.k     // Catch:{ all -> 0x014a }
            awdn r10 = r10.f     // Catch:{ all -> 0x014a }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x014a }
            aetj r10 = (defpackage.aetj) r10     // Catch:{ all -> 0x014a }
            r11 = 10016(0x2720, float:1.4035E-41)
            aukh r12 = r1.c     // Catch:{ all -> 0x014a }
            aokg r12 = defpackage.afgq.a(r12)     // Catch:{ all -> 0x014a }
            r10.a(r11, r12)     // Catch:{ all -> 0x014a }
            goto L_0x0148
        L_0x0035:
            affc r10 = r1.k     // Catch:{ afdy -> 0x00ec }
            afeb r10 = r10.c     // Catch:{ afdy -> 0x00ec }
            android.accounts.Account r11 = r1.d     // Catch:{ afdy -> 0x00ec }
            aukh r4 = r1.c     // Catch:{ afdy -> 0x00ec }
            java.util.List r10 = r10.a((android.accounts.Account) r11, (defpackage.aukh) r4)     // Catch:{ afdy -> 0x00ec }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x014a }
            r11 = 0
        L_0x0046:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x014a }
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x014a }
            afdx r4 = (defpackage.afdx) r4     // Catch:{ all -> 0x014a }
            aump r5 = r4.d()     // Catch:{ all -> 0x014a }
            boolean r5 = defpackage.afgu.a((defpackage.aump) r5)     // Catch:{ all -> 0x014a }
            if (r5 == 0) goto L_0x0046
            aukd r5 = r1.e     // Catch:{ all -> 0x014a }
            java.lang.String r6 = r4.a()     // Catch:{ all -> 0x014a }
            aujy r5 = defpackage.affb.a((defpackage.aukd) r5, (java.lang.String) r6)     // Catch:{ all -> 0x014a }
            aumt r5 = r5.d     // Catch:{ all -> 0x014a }
            if (r5 != 0) goto L_0x006c
            aumt r5 = defpackage.aumt.e     // Catch:{ all -> 0x014a }
        L_0x006c:
            if (r12 == 0) goto L_0x0092
            affc r6 = r1.k     // Catch:{ all -> 0x014a }
            aeri r6 = r6.n     // Catch:{ all -> 0x014a }
            boolean r6 = r6.c()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0088
            aums r6 = r5.c     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            aums r6 = defpackage.aums.e     // Catch:{ all -> 0x014a }
        L_0x007f:
            aump r7 = r4.d()     // Catch:{ all -> 0x014a }
            aums r6 = defpackage.afgj.a((defpackage.aums) r6, (defpackage.aump) r7)     // Catch:{ all -> 0x014a }
            goto L_0x008e
        L_0x0088:
            aums r6 = r5.c     // Catch:{ all -> 0x014a }
            if (r6 != 0) goto L_0x008e
            aums r6 = defpackage.aums.e     // Catch:{ all -> 0x014a }
        L_0x008e:
            aums r11 = defpackage.afgj.a((defpackage.aums) r11, (defpackage.aums) r6)     // Catch:{ all -> 0x014a }
        L_0x0092:
            if (r13 == 0) goto L_0x0046
            affc r6 = r1.k     // Catch:{ all -> 0x014a }
            aeri r6 = r6.n     // Catch:{ all -> 0x014a }
            boolean r6 = r6.c()     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x00ae
            aums r5 = r5.d     // Catch:{ all -> 0x014a }
            if (r5 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            aums r5 = defpackage.aums.e     // Catch:{ all -> 0x014a }
        L_0x00a5:
            aump r4 = r4.d()     // Catch:{ all -> 0x014a }
            aums r4 = defpackage.afgj.a((defpackage.aums) r5, (defpackage.aump) r4)     // Catch:{ all -> 0x014a }
            goto L_0x00b4
        L_0x00ae:
            aums r4 = r5.d     // Catch:{ all -> 0x014a }
            if (r4 != 0) goto L_0x00b4
            aums r4 = defpackage.aums.e     // Catch:{ all -> 0x014a }
        L_0x00b4:
            aums r11 = defpackage.afgj.a((defpackage.aums) r11, (defpackage.aums) r4)     // Catch:{ all -> 0x014a }
            goto L_0x0046
        L_0x00b9:
            if (r11 == 0) goto L_0x00d6
            int r10 = defpackage.affb.b(r11)     // Catch:{ all -> 0x014a }
            boolean r12 = r11.b     // Catch:{ all -> 0x014a }
            affc r13 = r1.k     // Catch:{ all -> 0x014a }
            aeri r13 = r13.n     // Catch:{ all -> 0x014a }
            long r4 = r13.i()     // Catch:{ all -> 0x014a }
            long r4 = r4 * r2
            long r6 = defpackage.affb.a((defpackage.aums) r11)     // Catch:{ all -> 0x014a }
            long r4 = java.lang.Math.max(r4, r6)     // Catch:{ all -> 0x014a }
            r7 = r10
            r8 = r12
            goto L_0x0108
        L_0x00d6:
            affc r10 = r1.k     // Catch:{ all -> 0x014a }
            awdn r10 = r10.f     // Catch:{ all -> 0x014a }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x014a }
            aetj r10 = (defpackage.aetj) r10     // Catch:{ all -> 0x014a }
            r11 = 10017(0x2721, float:1.4037E-41)
            aukh r12 = r1.c     // Catch:{ all -> 0x014a }
            aokg r12 = defpackage.afgq.a(r12)     // Catch:{ all -> 0x014a }
            r10.a(r11, r12)     // Catch:{ all -> 0x014a }
            goto L_0x0148
        L_0x00ec:
            r10 = move-exception
            afdm r11 = new afdm     // Catch:{ all -> 0x014a }
            java.lang.String r12 = "Unable to retrieve subscriptions"
            r11.<init>(r12, r10)     // Catch:{ all -> 0x014a }
            throw r11     // Catch:{ all -> 0x014a }
        L_0x00f5:
            affc r10 = r1.k     // Catch:{ all -> 0x014a }
            int r10 = r10.a()     // Catch:{ all -> 0x014a }
            affc r11 = r1.k     // Catch:{ all -> 0x014a }
            aeri r11 = r11.n     // Catch:{ all -> 0x014a }
            long r11 = r11.i()     // Catch:{ all -> 0x014a }
            long r4 = r11 * r2
            r11 = 0
            r7 = r10
            r8 = 0
        L_0x0108:
            double r10 = (double) r4     // Catch:{ all -> 0x014a }
            affc r12 = r1.k     // Catch:{ all -> 0x014a }
            aeri r12 = r12.n     // Catch:{ all -> 0x014a }
            agvx r12 = defpackage.ozz.q     // Catch:{ all -> 0x014a }
            java.lang.Object r12 = r12.c()     // Catch:{ all -> 0x014a }
            java.lang.Double r12 = (java.lang.Double) r12     // Catch:{ all -> 0x014a }
            double r12 = r12.doubleValue()     // Catch:{ all -> 0x014a }
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r12
            long r10 = (long) r10
            long r2 = r2 + r10
            long r5 = java.lang.Math.max(r4, r2)     // Catch:{ all -> 0x014a }
            affc r12 = r1.k     // Catch:{ all -> 0x014a }
            aeri r12 = r12.n     // Catch:{ all -> 0x014a }
            boolean r12 = r12.d()     // Catch:{ all -> 0x014a }
            if (r12 == 0) goto L_0x0140
            afft r12 = r1.a     // Catch:{ all -> 0x014a }
            affc r13 = r1.k     // Catch:{ all -> 0x014a }
            afgm r13 = r13.o     // Catch:{ all -> 0x014a }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x014a }
            r12.a((long) r2)     // Catch:{ all -> 0x014a }
            aomv r12 = defpackage.aomv.SYNC_TRIGGER_PUSH_NOTIFICATION     // Catch:{ all -> 0x014a }
            r1.a((defpackage.aomv) r12)     // Catch:{ all -> 0x014a }
        L_0x0140:
            r1.b()     // Catch:{ all -> 0x014a }
            r2 = 1
            r3 = r10
            r1.a(r2, r3, r5, r7, r8)     // Catch:{ all -> 0x014a }
        L_0x0148:
            monitor-exit(r0)     // Catch:{ all -> 0x014a }
            return
        L_0x014a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014a }
            goto L_0x014e
        L_0x014d:
            throw r10
        L_0x014e:
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affc.a(aukh, android.accounts.Account, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, defpackage.aukh r9, android.accounts.Account r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.j
            monitor-enter(r0)
            affb r9 = r7.c(r9, r10)     // Catch:{ all -> 0x00e1 }
            afdx r10 = r9.a((java.lang.String) r8)     // Catch:{ all -> 0x00e1 }
            if (r10 == 0) goto L_0x0041
            aump r1 = r10.d()     // Catch:{ all -> 0x00e1 }
            affx r1 = defpackage.affx.a(r1)     // Catch:{ all -> 0x00e1 }
            affc r2 = r9.k     // Catch:{ all -> 0x00e1 }
            java.util.Map r2 = r2.e     // Catch:{ all -> 0x00e1 }
            aukh r3 = r9.c     // Catch:{ all -> 0x00e1 }
            int r3 = r3.a     // Catch:{ all -> 0x00e1 }
            aukg r3 = defpackage.aukg.a(r3)     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00e1 }
            aerf r2 = (defpackage.aerf) r2     // Catch:{ all -> 0x00e1 }
            aukh r3 = r9.c     // Catch:{ all -> 0x00e1 }
            android.accounts.Account r4 = r9.d     // Catch:{ all -> 0x00e1 }
            boolean r2 = r2.a(r3, r4)     // Catch:{ all -> 0x00e1 }
            affc r3 = r9.k     // Catch:{ all -> 0x00e1 }
            aeri r3 = r3.n     // Catch:{ all -> 0x00e1 }
            long r3 = r3.h()     // Catch:{ all -> 0x00e1 }
            int r4 = (int) r3     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r1 = r1.a((boolean) r2, (java.lang.Integer) r3)     // Catch:{ all -> 0x00e1 }
            goto L_0x0063
        L_0x0041:
            affc r1 = r9.k     // Catch:{ all -> 0x00e1 }
            awdn r1 = r1.f     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x00e1 }
            aetj r1 = (defpackage.aetj) r1     // Catch:{ all -> 0x00e1 }
            r2 = 10014(0x271e, float:1.4033E-41)
            aukh r3 = r9.c     // Catch:{ all -> 0x00e1 }
            aokg r3 = defpackage.afgq.a(r3)     // Catch:{ all -> 0x00e1 }
            r1.a(r2, r3)     // Catch:{ all -> 0x00e1 }
            affc r1 = r9.k     // Catch:{ all -> 0x00e1 }
            aeri r1 = r1.n     // Catch:{ all -> 0x00e1 }
            long r1 = r1.h()     // Catch:{ all -> 0x00e1 }
            int r2 = (int) r1     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00e1 }
        L_0x0063:
            if (r1 == 0) goto L_0x00df
            affc r2 = r9.k     // Catch:{ all -> 0x00e1 }
            aeri r2 = r2.n     // Catch:{ all -> 0x00e1 }
            boolean r2 = r2.m()     // Catch:{ all -> 0x00e1 }
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 != 0) goto L_0x0072
            goto L_0x00b3
        L_0x0072:
            aukd r2 = r9.e     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x00b3
            aujy r8 = defpackage.affb.a((defpackage.aukd) r2, (java.lang.String) r8)     // Catch:{ all -> 0x00e1 }
            aumt r8 = r8.d     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            aumt r8 = defpackage.aumt.e     // Catch:{ all -> 0x00e1 }
        L_0x0081:
            aums r8 = r8.a     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            aums r8 = defpackage.aums.e     // Catch:{ all -> 0x00e1 }
        L_0x0088:
            affc r2 = r9.k     // Catch:{ all -> 0x00e1 }
            aeri r2 = r2.n     // Catch:{ all -> 0x00e1 }
            boolean r2 = r2.c()     // Catch:{ all -> 0x00e1 }
            if (r2 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            if (r10 == 0) goto L_0x009d
            aump r10 = r10.d()     // Catch:{ all -> 0x00e1 }
            aums r8 = defpackage.afgj.a((defpackage.aums) r8, (defpackage.aump) r10)     // Catch:{ all -> 0x00e1 }
        L_0x009d:
            int r10 = defpackage.affb.b(r8)     // Catch:{ all -> 0x00e1 }
            boolean r2 = r8.b     // Catch:{ all -> 0x00e1 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00e1 }
            long r5 = (long) r1     // Catch:{ all -> 0x00e1 }
            long r5 = r5 * r3
            long r3 = defpackage.affb.a((defpackage.aums) r8)     // Catch:{ all -> 0x00e1 }
            long r3 = java.lang.Math.max(r5, r3)     // Catch:{ all -> 0x00e1 }
            goto L_0x00cd
        L_0x00b3:
            affc r8 = r9.k     // Catch:{ all -> 0x00e1 }
            int r10 = r8.a()     // Catch:{ all -> 0x00e1 }
            int r8 = r1.intValue()     // Catch:{ all -> 0x00e1 }
            long r1 = (long) r8     // Catch:{ all -> 0x00e1 }
            long r1 = r1 * r3
            affc r8 = r9.k     // Catch:{ all -> 0x00e1 }
            aeri r8 = r8.n     // Catch:{ all -> 0x00e1 }
            long r3 = r8.l()     // Catch:{ all -> 0x00e1 }
            long r3 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x00e1 }
            r2 = 0
        L_0x00cd:
            affc r8 = r9.k     // Catch:{ all -> 0x00e1 }
            aeri r8 = r8.n     // Catch:{ all -> 0x00e1 }
            boolean r8 = r8.d()     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x00dc
            aomv r8 = defpackage.aomv.SYNC_TRIGGER_READ     // Catch:{ all -> 0x00e1 }
            r9.a((defpackage.aomv) r8)     // Catch:{ all -> 0x00e1 }
        L_0x00dc:
            r9.a(r3, r10, r2)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            return
        L_0x00e1:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affc.a(java.lang.String, aukh, android.accounts.Account):void");
    }

    public final boolean a(long j2) {
        return this.l && j2 - this.m > ((Long) ozz.t.c()).longValue() * 1000;
    }

    public final boolean a(long j2, long j3) {
        return this.l && this.m - j2 <= j3 && !a(j2);
    }
}
