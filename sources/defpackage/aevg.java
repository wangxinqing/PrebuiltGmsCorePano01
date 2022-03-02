package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aevg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aevg implements aeva {
    private static final afde c;
    public final Map a = new HashMap();
    public final aoqd b = aoqd.a();
    private final awdn d;
    private final awdn e;
    private final afgs f;
    private final afgs g;
    private final afci h;
    private final awdn i;
    private final bapu j;
    private final aeri k;

    static {
        afdd a2 = afde.a();
        a2.a(':');
        c = a2.a();
    }

    public aevg(awdn awdn, awdn awdn2, afgs afgs, afgs afgs2, afci afci, awdn awdn3, bapu bapu, aeri aeri) {
        this.d = awdn;
        this.e = awdn2;
        this.f = afgs;
        this.g = afgs2;
        this.h = afci;
        this.i = awdn3;
        this.j = bapu;
        this.k = aeri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        ((defpackage.pia) r13.e.a()).e("Failure cleaning up erroneous creation of accessor object", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x014f, B:35:0x015b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aevc a(android.accounts.Account r28, int r29, int r30) {
        /*
            r27 = this;
            r13 = r27
            r0 = r28
            r1 = r29
            r2 = r30
            auku r3 = defpackage.auku.SYNC_LATEST_PER_SECONDARY_ID
            aukh r3 = defpackage.aeuz.a(r1, r2, r3)
            bapu r4 = r13.j     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            aeqi r4 = (defpackage.aeqi) r4     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            aorr r4 = r4.a()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.lang.Object r4 = r4.get()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            auke r4 = (defpackage.auke) r4     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            aucx r4 = r4.a     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
        L_0x0022:
            boolean r5 = r4.hasNext()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r4.next()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            aukd r5 = (defpackage.aukd) r5     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            aukh r6 = r5.c     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            if (r6 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            aukh r6 = defpackage.aukh.c     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
        L_0x0035:
            boolean r6 = r6.equals(r3)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            if (r6 == 0) goto L_0x0022
            int r4 = r5.a     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            r6 = 4
            if (r4 != r6) goto L_0x0045
            java.lang.Object r4 = r5.b     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            aula r4 = (defpackage.aula) r4     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            goto L_0x0047
        L_0x0045:
            aula r4 = defpackage.aula.c     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
        L_0x0047:
            aerd r14 = defpackage.aerd.a(r0, r3)
            anmx r15 = defpackage.anmx.a()
            java.util.Map r12 = r13.a
            monitor-enter(r12)
            java.util.Map r3 = r13.a     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Object r3 = r3.get(r14)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            aevc r3 = (defpackage.aevc) r3     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            if (r3 != 0) goto L_0x0148
            afde r3 = c     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r5 = r0.type     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r3 = r3.a(r5)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afde r5 = c     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r0 = r0.name     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r0 = r5.a(r0)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r5 = r5 + 25
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.append(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r3 = 58
            r6.append(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.append(r0)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.append(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.append(r1)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.append(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r6.append(r2)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afci r1 = r13.h     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afci r9 = r1.b(r0)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r15.a((java.io.Closeable) r9)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            aevh r0 = new aevh     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            awdn r2 = r13.e     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r1 = "data"
            afch r5 = r9.a(r1)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r15.a((java.io.Closeable) r5)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afce r6 = new afce     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            awdn r1 = r13.d     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afgs r3 = r13.f     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Object r3 = r3.a()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r18 = r3.intValue()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            aukz r3 = defpackage.aukz.g     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r7 = 7
            java.lang.Object r3 = r3.c(r7)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r19 = r3
            auef r19 = (defpackage.auef) r19     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r3 = "changelog"
            afch r20 = r9.a(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            aeri r3 = r13.k     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r16 = r6
            r17 = r1
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r15.a((java.io.Closeable) r6)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afce r8 = new afce     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            awdn r1 = r13.d     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afgs r3 = r13.f     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Object r3 = r3.a()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r23 = r3.intValue()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            aukz r3 = defpackage.aukz.g     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Object r3 = r3.c(r7)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r24 = r3
            auef r24 = (defpackage.auef) r24     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r3 = "synclog"
            afch r25 = r9.a(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            aeri r3 = r13.k     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r21 = r8
            r22 = r1
            r26 = r3
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r15.a((java.io.Closeable) r8)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afcf r1 = new afcf     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.String r3 = "metadata"
            afch r3 = r9.a(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afbw r10 = new afbw     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r10.<init>(r1)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r15.a((java.io.Closeable) r10)     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            awdn r11 = r13.i     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            afgs r1 = r13.g     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Object r1 = r1.a()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            int r16 = r1.intValue()     // Catch:{ IOException -> 0x0157, all -> 0x0153 }
            r1 = r0
            r3 = r14
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r27
            r17 = r12
            r12 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0151 }
            java.util.Map r1 = r13.a     // Catch:{ IOException -> 0x0151 }
            r1.put(r14, r0)     // Catch:{ IOException -> 0x0151 }
            r3 = r0
            goto L_0x014a
        L_0x0148:
            r17 = r12
        L_0x014a:
            aoqd r0 = r13.b     // Catch:{ IOException -> 0x0151 }
            r0.c(r14)     // Catch:{ IOException -> 0x0151 }
            monitor-exit(r17)     // Catch:{ all -> 0x015f }
            return r3
        L_0x0151:
            r0 = move-exception
            goto L_0x015a
        L_0x0153:
            r0 = move-exception
            r17 = r12
            goto L_0x0177
        L_0x0157:
            r0 = move-exception
            r17 = r12
        L_0x015a:
            r1 = r0
            r15.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x0172
        L_0x015f:
            r0 = move-exception
            goto L_0x0177
        L_0x0161:
            r0 = move-exception
            awdn r0 = r13.e     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x015f }
            pia r0 = (defpackage.pia) r0     // Catch:{ all -> 0x015f }
            java.lang.String r2 = "Failure cleaning up erroneous creation of accessor object"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x015f }
            r0.e(r2, r3)     // Catch:{ all -> 0x015f }
        L_0x0172:
            afdm r0 = defpackage.afdm.a(r1)     // Catch:{ all -> 0x015f }
            throw r0     // Catch:{ all -> 0x015f }
        L_0x0177:
            monitor-exit(r17)     // Catch:{ all -> 0x015f }
            throw r0
        L_0x0179:
            afdm r0 = new afdm     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            int r2 = r2.length()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            int r2 = r2 + 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            r3.<init>(r2)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.lang.String r2 = "Didn't find find channel "
            r3.append(r2)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            r3.append(r1)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.lang.String r1 = " in ChannelConfigList."
            r3.append(r1)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            java.lang.String r1 = r3.toString()     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
            throw r0     // Catch:{ InterruptedException -> 0x01a5, ExecutionException -> 0x01a3 }
        L_0x01a3:
            r0 = move-exception
            goto L_0x01a6
        L_0x01a5:
            r0 = move-exception
        L_0x01a6:
            afdm r1 = new afdm
            java.lang.String r2 = "Failed to retrieve Channel properties"
            r1.<init>(r2, r0)
            goto L_0x01af
        L_0x01ae:
            throw r1
        L_0x01af:
            goto L_0x01ae
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevg.a(android.accounts.Account, int, int):aevc");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.a) {
            for (Map.Entry entry : this.a.entrySet()) {
                ((pia) this.e.a()).d("Channel %s was not closed. Closing it in finalizer.", entry.getKey());
                ((aevc) entry.getValue()).close();
            }
        }
        super.finalize();
    }

    public final void a() {
        synchronized (this.a) {
            while (!this.b.b()) {
                try {
                    this.a.wait();
                } catch (InterruptedException e2) {
                    ((pia) this.e.a()).e("resetAndDelete interrupted", e2, new Object[0]);
                }
            }
            this.h.a();
        }
    }
}
