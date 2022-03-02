package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: pgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgr {
    public final Map a = new IdentityHashMap();
    public final pia b;
    private final afeb c;
    private final aevl d;
    private final aepp e;
    private final aerd f;
    private long g;
    private final awdn h;

    public pgr(pia pia, afeb afeb, aevl aevl, aepp aepp, awdn awdn, aerd aerd) {
        boolean z;
        aukv aukv;
        aere aere = (aere) aerd;
        boolean z2 = true;
        if (aere.b.a == 2) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "Cannot instantiate TimeSeriesFootprintsListenersHandler for non-Footprints channel.");
        aukh aukh = aere.b;
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a2 = auku.a(aukv.d);
        amrl.a((a2 == null ? auku.UNKNOWN : a2) != auku.SYNC_FULL_SNAPSHOT ? false : z2, (Object) "Cannot instantiate TimeSeriesFootprintsListenersHandler for wrong sync variant.");
        this.b = pia;
        this.c = afeb;
        this.d = aevl;
        this.e = aepp;
        this.h = awdn;
        this.f = aerd;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019d, code lost:
        r6 = r1.a.values().iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0307 A[SYNTHETIC, Splitter:B:152:0x0307] */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r22 = this;
            r1 = r22
            aevl r0 = r1.d     // Catch:{ IOException -> 0x039a }
            aerd r3 = r1.f     // Catch:{ IOException -> 0x039a }
            r4 = r3
            aere r4 = (defpackage.aere) r4     // Catch:{ IOException -> 0x039a }
            android.accounts.Account r4 = r4.a     // Catch:{ IOException -> 0x039a }
            aere r3 = (defpackage.aere) r3     // Catch:{ IOException -> 0x039a }
            aukh r3 = r3.b     // Catch:{ IOException -> 0x039a }
            int r5 = r3.a     // Catch:{ IOException -> 0x039a }
            r6 = 2
            if (r5 != r6) goto L_0x0019
            java.lang.Object r3 = r3.b     // Catch:{ IOException -> 0x039a }
            aukv r3 = (defpackage.aukv) r3     // Catch:{ IOException -> 0x039a }
            goto L_0x001b
        L_0x0019:
            aukv r3 = defpackage.aukv.e     // Catch:{ IOException -> 0x039a }
        L_0x001b:
            int r3 = r3.b     // Catch:{ IOException -> 0x039a }
            aerd r5 = r1.f     // Catch:{ IOException -> 0x039a }
            aere r5 = (defpackage.aere) r5     // Catch:{ IOException -> 0x039a }
            aukh r5 = r5.b     // Catch:{ IOException -> 0x039a }
            int r7 = r5.a     // Catch:{ IOException -> 0x039a }
            if (r7 != r6) goto L_0x002c
            java.lang.Object r5 = r5.b     // Catch:{ IOException -> 0x039a }
            aukv r5 = (defpackage.aukv) r5     // Catch:{ IOException -> 0x039a }
            goto L_0x002e
        L_0x002c:
            aukv r5 = defpackage.aukv.e     // Catch:{ IOException -> 0x039a }
        L_0x002e:
            int r5 = r5.c     // Catch:{ IOException -> 0x039a }
            aevm r3 = r0.a(r4, r3, r5)     // Catch:{ IOException -> 0x039a }
            java.util.Map r4 = r1.a     // Catch:{ all -> 0x038c }
            monitor-enter(r4)     // Catch:{ all -> 0x038c }
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x0389 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0389 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0389 }
        L_0x0041:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0389 }
            if (r5 != 0) goto L_0x036e
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x0389 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0389 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0389 }
        L_0x0051:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0389 }
            if (r5 != 0) goto L_0x0335
        L_0x0057:
            afcv r0 = r3.c()     // Catch:{ all -> 0x0389 }
            afdo r5 = r0.a()     // Catch:{ all -> 0x0389 }
            afcw r0 = r3.a()     // Catch:{ all -> 0x0329 }
            afcd r0 = r0.b(r5)     // Catch:{ all -> 0x0329 }
            long r7 = r3.c(r5)     // Catch:{ all -> 0x0329 }
            r5.close()     // Catch:{ all -> 0x0389 }
            long r9 = r1.g     // Catch:{ all -> 0x0389 }
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0090
            r1.g = r7     // Catch:{ all -> 0x0389 }
            java.util.Map r5 = r1.a     // Catch:{ all -> 0x0389 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0389 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0389 }
        L_0x0080:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x0389 }
            if (r9 == 0) goto L_0x0090
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0389 }
            pgp r9 = (defpackage.pgp) r9     // Catch:{ all -> 0x0389 }
            r9.a()     // Catch:{ all -> 0x0389 }
            goto L_0x0080
        L_0x0090:
            amzy r5 = r0.a     // Catch:{ all -> 0x0389 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0389 }
        L_0x0096:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x0389 }
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
            r11 = 1
            if (r9 == 0) goto L_0x017a
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0389 }
            aulg r9 = (defpackage.aulg) r9     // Catch:{ all -> 0x0389 }
            java.util.Map r10 = r1.a     // Catch:{ all -> 0x0389 }
            java.util.Collection r10 = r10.values()     // Catch:{ all -> 0x0389 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0389 }
        L_0x00b3:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x0389 }
            if (r12 != 0) goto L_0x0100
            anav r9 = new anav     // Catch:{ IOException -> 0x00f7 }
            r9.<init>()     // Catch:{ IOException -> 0x00f7 }
            aepp r10 = r1.e     // Catch:{ IOException -> 0x00f7 }
            aerd r11 = r1.f     // Catch:{ IOException -> 0x00f7 }
            r12 = r11
            aere r12 = (defpackage.aere) r12     // Catch:{ IOException -> 0x00f7 }
            aukh r12 = r12.b     // Catch:{ IOException -> 0x00f7 }
            aere r11 = (defpackage.aere) r11     // Catch:{ IOException -> 0x00f7 }
            android.accounts.Account r11 = r11.a     // Catch:{ IOException -> 0x00f7 }
            java.util.Collection r10 = r10.a((defpackage.aukh) r12, (android.accounts.Account) r11)     // Catch:{ IOException -> 0x00f7 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x00f7 }
        L_0x00d3:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x00f7 }
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x00f7 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ IOException -> 0x00f7 }
            java.lang.Object r11 = r11.first     // Catch:{ IOException -> 0x00f7 }
            aeps r11 = (defpackage.aeps) r11     // Catch:{ IOException -> 0x00f7 }
            r9.b(r11)     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00d3
        L_0x00e7:
            anax r9 = r9.a()     // Catch:{ IOException -> 0x00f7 }
            boolean r10 = r9.isEmpty()     // Catch:{ IOException -> 0x00f7 }
            if (r10 != 0) goto L_0x0096
            aepp r10 = r1.e     // Catch:{ IOException -> 0x00f7 }
            r10.a((java.util.Collection) r9)     // Catch:{ IOException -> 0x00f7 }
            goto L_0x0096
        L_0x00f7:
            r0 = move-exception
            afdm r5 = new afdm     // Catch:{ all -> 0x0389 }
            java.lang.String r6 = "Exception occurred while processing BroadcastListener subscriptions"
            r5.<init>(r6, r0)     // Catch:{ all -> 0x0389 }
            throw r5     // Catch:{ all -> 0x0389 }
        L_0x0100:
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x0389 }
            pgp r12 = (defpackage.pgp) r12     // Catch:{ all -> 0x0389 }
            int r14 = r12.e     // Catch:{ all -> 0x0389 }
            if (r14 == r11) goto L_0x0175
            aeti r14 = r12.c     // Catch:{ all -> 0x0389 }
            java.lang.Long r14 = r14.c()     // Catch:{ all -> 0x0389 }
            if (r14 == 0) goto L_0x011e
            aeti r14 = r12.c     // Catch:{ all -> 0x0389 }
            java.lang.Long r14 = r14.c()     // Catch:{ all -> 0x0389 }
            long r14 = r14.longValue()     // Catch:{ all -> 0x0389 }
            long r14 = r14 + r7
            goto L_0x0120
        L_0x011e:
            r14 = r16
        L_0x0120:
            aeti r2 = r12.c     // Catch:{ all -> 0x0389 }
            java.lang.Long r2 = r2.b()     // Catch:{ all -> 0x0389 }
            if (r2 == 0) goto L_0x0135
            aeti r2 = r12.c     // Catch:{ all -> 0x0389 }
            java.lang.Long r2 = r2.b()     // Catch:{ all -> 0x0389 }
            long r18 = r2.longValue()     // Catch:{ all -> 0x0389 }
            long r18 = r7 + r18
            goto L_0x0137
        L_0x0135:
            r18 = -9223372036854775808
        L_0x0137:
            r20 = r7
            long r6 = r9.d     // Catch:{ all -> 0x0389 }
            int r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x0170
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x0170
            pgo r8 = r12.b     // Catch:{ all -> 0x0389 }
            int r12 = r9.b     // Catch:{ all -> 0x0389 }
            aulf r12 = defpackage.aulf.a(r12)     // Catch:{ all -> 0x0389 }
            if (r12 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            aulf r12 = defpackage.aulf.UNKNOWN     // Catch:{ all -> 0x0389 }
        L_0x0150:
            int r14 = r9.a     // Catch:{ all -> 0x0389 }
            r2 = 2
            r14 = r14 & r2
            if (r14 == 0) goto L_0x0162
            com.google.android.gms.mdh.MdhFootprint r14 = new com.google.android.gms.mdh.MdhFootprint     // Catch:{ all -> 0x0389 }
            auay r15 = r9.c     // Catch:{ all -> 0x0389 }
            byte[] r15 = r15.k()     // Catch:{ all -> 0x0389 }
            r14.<init>(r15, r13, r6)     // Catch:{ all -> 0x0389 }
            goto L_0x0163
        L_0x0162:
            r14 = r13
        L_0x0163:
            pgq r6 = new pgq     // Catch:{ all -> 0x0389 }
            r6.<init>((defpackage.aulf) r12, (com.google.android.gms.mdh.MdhFootprint) r14)     // Catch:{ all -> 0x0389 }
            r8.a((defpackage.pgq) r6)     // Catch:{ all -> 0x0389 }
            r7 = r20
            r6 = 2
            goto L_0x00b3
        L_0x0170:
            r7 = r20
            r6 = 2
            goto L_0x00b3
        L_0x0175:
            r20 = r7
            r6 = 2
            goto L_0x00b3
        L_0x017a:
            afcv r5 = r3.c()     // Catch:{ all -> 0x0389 }
            afdp r5 = r5.b()     // Catch:{ all -> 0x0389 }
            r0.a(r5)     // Catch:{ all -> 0x031d }
            r5.b()     // Catch:{ all -> 0x031d }
            r5.close()     // Catch:{ all -> 0x0389 }
            afcv r0 = r3.c()     // Catch:{ all -> 0x0389 }
            afdp r5 = r0.b()     // Catch:{ all -> 0x0389 }
            afcw r0 = r3.a()     // Catch:{ all -> 0x0311 }
            boolean r0 = r0.a(r5)     // Catch:{ all -> 0x0311 }
            if (r0 == 0) goto L_0x030b
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x0311 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0311 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0311 }
        L_0x01a7:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0311 }
            if (r0 == 0) goto L_0x0301
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0311 }
            r14 = r0
            pgp r14 = (defpackage.pgp) r14     // Catch:{ all -> 0x0311 }
            int r0 = r14.e     // Catch:{ IOException -> 0x02f5 }
            if (r0 == r11) goto L_0x01bd
            r18 = r13
            r2 = 1
            goto L_0x0255
        L_0x01bd:
            r2 = 2
            r14.e = r2     // Catch:{ IOException -> 0x02f5 }
            amzt r0 = defpackage.amzy.j()     // Catch:{ IOException -> 0x02f5 }
            long r7 = r3.c(r5)     // Catch:{ IOException -> 0x02f5 }
            aeti r9 = r14.c     // Catch:{ IOException -> 0x02f5 }
            java.lang.Long r9 = r9.c()     // Catch:{ IOException -> 0x02f5 }
            if (r9 == 0) goto L_0x01dc
            aeti r9 = r14.c     // Catch:{ IOException -> 0x02f5 }
            java.lang.Long r9 = r9.c()     // Catch:{ IOException -> 0x02f5 }
            long r9 = r9.longValue()     // Catch:{ IOException -> 0x02f5 }
            long r9 = r9 + r7
            goto L_0x01de
        L_0x01dc:
            r9 = r16
        L_0x01de:
            aeti r12 = r14.c     // Catch:{ IOException -> 0x02f5 }
            java.lang.Long r12 = r12.b()     // Catch:{ IOException -> 0x02f5 }
            if (r12 == 0) goto L_0x01f5
            aeti r12 = r14.c     // Catch:{ IOException -> 0x02f5 }
            java.lang.Long r12 = r12.b()     // Catch:{ IOException -> 0x02f5 }
            long r18 = r12.longValue()     // Catch:{ IOException -> 0x02f5 }
            long r7 = r7 + r18
            r18 = r7
            goto L_0x01f7
        L_0x01f5:
            r18 = -9223372036854775808
        L_0x01f7:
            r15 = 0
            r7 = r3
            r8 = r5
            r2 = 1
            r11 = r18
            r18 = r13
            r13 = r15
            java.util.List r7 = r7.a((defpackage.afdo) r8, (long) r9, (long) r11, (java.lang.String) r13)     // Catch:{ IOException -> 0x02f3 }
            int r8 = r7.size()     // Catch:{ IOException -> 0x02f3 }
            aeti r9 = r14.c     // Catch:{ IOException -> 0x02f3 }
            int r9 = r9.a()     // Catch:{ IOException -> 0x02f3 }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ IOException -> 0x02f3 }
            r9 = 0
            java.util.List r7 = r7.subList(r9, r8)     // Catch:{ IOException -> 0x02f3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x02f3 }
        L_0x021b:
            boolean r8 = r7.hasNext()     // Catch:{ IOException -> 0x02f3 }
            if (r8 == 0) goto L_0x022f
            java.lang.Object r8 = r7.next()     // Catch:{ IOException -> 0x02f3 }
            aetb r8 = (defpackage.aetb) r8     // Catch:{ IOException -> 0x02f3 }
            com.google.android.gms.mdh.MdhFootprint r8 = defpackage.pga.a((defpackage.aetb) r8)     // Catch:{ IOException -> 0x02f3 }
            r0.c(r8)     // Catch:{ IOException -> 0x02f3 }
            goto L_0x021b
        L_0x022f:
            pgo r7 = r14.b     // Catch:{ IOException -> 0x02f3 }
            aeti r8 = r14.c     // Catch:{ IOException -> 0x02f3 }
            if (r8 == 0) goto L_0x0247
            com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter r13 = new com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter     // Catch:{ IOException -> 0x02f3 }
            int r9 = r8.a()     // Catch:{ IOException -> 0x02f3 }
            java.lang.Long r10 = r8.b()     // Catch:{ IOException -> 0x02f3 }
            java.lang.Long r8 = r8.c()     // Catch:{ IOException -> 0x02f3 }
            r13.<init>(r9, r10, r8)     // Catch:{ IOException -> 0x02f3 }
            goto L_0x0249
        L_0x0247:
            r13 = r18
        L_0x0249:
            amzy r0 = r0.a()     // Catch:{ IOException -> 0x02f3 }
            pgq r8 = new pgq     // Catch:{ IOException -> 0x02f3 }
            r8.<init>((com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter) r13, (java.lang.Iterable) r0)     // Catch:{ IOException -> 0x02f3 }
            r7.a((defpackage.pgq) r8)     // Catch:{ IOException -> 0x02f3 }
        L_0x0255:
            aeti r0 = r3.b((defpackage.afdo) r5)     // Catch:{ IOException -> 0x02f3 }
            aesm r7 = r3.d(r5)     // Catch:{ IOException -> 0x02f3 }
            int r8 = r14.e     // Catch:{ IOException -> 0x02f3 }
            if (r8 == r2) goto L_0x02ee
            aeti r8 = r14.c     // Catch:{ IOException -> 0x02f3 }
            int r9 = r0.a()     // Catch:{ IOException -> 0x02f3 }
            int r10 = r8.a()     // Catch:{ IOException -> 0x02f3 }
            if (r9 < r10) goto L_0x02e9
            java.lang.Long r9 = r0.c()     // Catch:{ IOException -> 0x02f3 }
            if (r9 == 0) goto L_0x0298
            java.lang.Long r9 = r8.c()     // Catch:{ IOException -> 0x02f3 }
            if (r9 == 0) goto L_0x0293
            java.lang.Long r9 = r0.c()     // Catch:{ IOException -> 0x02f3 }
            long r9 = r9.longValue()     // Catch:{ IOException -> 0x02f3 }
            java.lang.Long r11 = r8.c()     // Catch:{ IOException -> 0x02f3 }
            long r11 = r11.longValue()     // Catch:{ IOException -> 0x02f3 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x028e
            goto L_0x0298
        L_0x028e:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x0293:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x0298:
            java.lang.Long r9 = r0.b()     // Catch:{ IOException -> 0x02f3 }
            if (r9 == 0) goto L_0x02c3
            java.lang.Long r9 = r8.b()     // Catch:{ IOException -> 0x02f3 }
            if (r9 == 0) goto L_0x02be
            java.lang.Long r0 = r0.b()     // Catch:{ IOException -> 0x02f3 }
            long r9 = r0.longValue()     // Catch:{ IOException -> 0x02f3 }
            java.lang.Long r0 = r8.b()     // Catch:{ IOException -> 0x02f3 }
            long r11 = r0.longValue()     // Catch:{ IOException -> 0x02f3 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x02b9
            goto L_0x02c3
        L_0x02b9:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x02be:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x02c3:
            int r0 = r14.e     // Catch:{ IOException -> 0x02f3 }
            r8 = 3
            if (r0 == r8) goto L_0x02c9
            goto L_0x02d1
        L_0x02c9:
            aesm r0 = r14.d     // Catch:{ IOException -> 0x02f3 }
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x02f3 }
            if (r0 != 0) goto L_0x02e4
        L_0x02d1:
            r14.d = r7     // Catch:{ IOException -> 0x02f3 }
            r14.e = r8     // Catch:{ IOException -> 0x02f3 }
            pgo r0 = r14.b     // Catch:{ IOException -> 0x02f3 }
            pgq r8 = new pgq     // Catch:{ IOException -> 0x02f3 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x02f3 }
            r0.a((defpackage.pgq) r8)     // Catch:{ IOException -> 0x02f3 }
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x02e4:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x02e9:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x02ee:
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x02f3:
            r0 = move-exception
            goto L_0x02f9
        L_0x02f5:
            r0 = move-exception
            r18 = r13
            r2 = 1
        L_0x02f9:
            r14.a()     // Catch:{ all -> 0x0311 }
            r13 = r18
            r11 = 1
            goto L_0x01a7
        L_0x0301:
            r5.close()     // Catch:{ all -> 0x0389 }
            monitor-exit(r4)     // Catch:{ all -> 0x0389 }
            if (r3 == 0) goto L_0x030a
            r3.close()     // Catch:{ IOException -> 0x039a }
        L_0x030a:
            return
        L_0x030b:
            r5.close()     // Catch:{ all -> 0x0389 }
            r6 = 2
            goto L_0x0057
        L_0x0311:
            r0 = move-exception
            r2 = r0
            r5.close()     // Catch:{ all -> 0x0317 }
            goto L_0x031c
        L_0x0317:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0389 }
        L_0x031c:
            throw r2     // Catch:{ all -> 0x0389 }
        L_0x031d:
            r0 = move-exception
            r2 = r0
            r5.close()     // Catch:{ all -> 0x0323 }
            goto L_0x0328
        L_0x0323:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0389 }
        L_0x0328:
            throw r2     // Catch:{ all -> 0x0389 }
        L_0x0329:
            r0 = move-exception
            r2 = r0
            r5.close()     // Catch:{ all -> 0x032f }
            goto L_0x0334
        L_0x032f:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0389 }
        L_0x0334:
            throw r2     // Catch:{ all -> 0x0389 }
        L_0x0335:
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0389 }
            pgp r2 = (defpackage.pgp) r2     // Catch:{ all -> 0x0389 }
            java.lang.String r5 = r2.a     // Catch:{ all -> 0x0389 }
            afeb r6 = r1.c     // Catch:{ all -> 0x0389 }
            aerd r7 = r1.f     // Catch:{ all -> 0x0389 }
            r8 = r7
            aere r8 = (defpackage.aere) r8     // Catch:{ all -> 0x0389 }
            android.accounts.Account r8 = r8.a     // Catch:{ all -> 0x0389 }
            aere r7 = (defpackage.aere) r7     // Catch:{ all -> 0x0389 }
            aukh r7 = r7.b     // Catch:{ all -> 0x0389 }
            afdx r5 = r6.b(r5, r8, r7)     // Catch:{ all -> 0x0389 }
            if (r5 == 0) goto L_0x0359
            aukf r5 = r5.e()     // Catch:{ all -> 0x0389 }
            aeti r5 = defpackage.aeuz.b((defpackage.aukf) r5)     // Catch:{ all -> 0x0389 }
            goto L_0x035b
        L_0x0359:
            aeti r5 = defpackage.aeti.a     // Catch:{ all -> 0x0389 }
        L_0x035b:
            aeti r6 = r2.c     // Catch:{ all -> 0x0389 }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0389 }
            if (r6 != 0) goto L_0x036b
            r2.c = r5     // Catch:{ all -> 0x0389 }
            r2.a()     // Catch:{ all -> 0x0389 }
            r6 = 2
            goto L_0x0051
        L_0x036b:
            r6 = 2
            goto L_0x0051
        L_0x036e:
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0389 }
            pgp r2 = (defpackage.pgp) r2     // Catch:{ all -> 0x0389 }
            pgo r2 = r2.b     // Catch:{ all -> 0x0389 }
            saw r2 = r2.b     // Catch:{ all -> 0x0389 }
            android.os.IBinder r2 = r2.a     // Catch:{ all -> 0x0389 }
            boolean r2 = r2.isBinderAlive()     // Catch:{ all -> 0x0389 }
            if (r2 != 0) goto L_0x0386
            r0.remove()     // Catch:{ all -> 0x0389 }
            r6 = 2
            goto L_0x0041
        L_0x0386:
            r6 = 2
            goto L_0x0041
        L_0x0389:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0389 }
            throw r0     // Catch:{ all -> 0x038c }
        L_0x038c:
            r0 = move-exception
            r2 = r0
            if (r3 == 0) goto L_0x0399
            r3.close()     // Catch:{ all -> 0x0394 }
            goto L_0x0399
        L_0x0394:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x039a }
        L_0x0399:
            throw r2     // Catch:{ IOException -> 0x039a }
        L_0x039a:
            r0 = move-exception
            pia r2 = r1.b
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Trigger listeners failed"
            r2.e(r4, r3)
            awdn r2 = r1.h
            java.lang.Object r2 = r2.a()
            pdg r2 = (defpackage.pdg) r2
            java.lang.String r3 = "MDH Trigger listeners failed"
            r2.a(r3, r0)
            java.util.Map r2 = r1.a
            monitor-enter(r2)
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x03d1 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x03d1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03d1 }
        L_0x03bf:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03d1 }
            if (r3 == 0) goto L_0x03cf
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03d1 }
            pgp r3 = (defpackage.pgp) r3     // Catch:{ all -> 0x03d1 }
            r3.a()     // Catch:{ all -> 0x03d1 }
            goto L_0x03bf
        L_0x03cf:
            monitor-exit(r2)     // Catch:{ all -> 0x03d1 }
            return
        L_0x03d1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03d1 }
            goto L_0x03d5
        L_0x03d4:
            throw r0
        L_0x03d5:
            goto L_0x03d4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgr.a():void");
    }
}
