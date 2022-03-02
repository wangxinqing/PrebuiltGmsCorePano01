package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: pgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgj {
    public final Map a = new IdentityHashMap();
    public final pia b;
    private final afeb c;
    private final aeva d;
    private final aepp e;
    private final aerd f;
    private final awdn g;

    public pgj(pia pia, afeb afeb, aeva aeva, aepp aepp, awdn awdn, aerd aerd) {
        boolean z;
        if (((aere) aerd).b.a == 2) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "Cannot instantiate LatestFootprintsListenersHandler for non-Footprints channel");
        this.b = pia;
        this.c = afeb;
        this.d = aeva;
        this.e = aepp;
        this.g = awdn;
        this.f = aerd;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0180, code lost:
        r6 = r1.a.values().iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02db A[SYNTHETIC, Splitter:B:155:0x02db] */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r15 = this;
            r1 = r15
            aeva r0 = r1.d     // Catch:{ IOException -> 0x0367 }
            aerd r2 = r1.f     // Catch:{ IOException -> 0x0367 }
            r3 = r2
            aere r3 = (defpackage.aere) r3     // Catch:{ IOException -> 0x0367 }
            android.accounts.Account r3 = r3.a     // Catch:{ IOException -> 0x0367 }
            aere r2 = (defpackage.aere) r2     // Catch:{ IOException -> 0x0367 }
            aukh r2 = r2.b     // Catch:{ IOException -> 0x0367 }
            int r4 = r2.a     // Catch:{ IOException -> 0x0367 }
            r5 = 2
            if (r4 != r5) goto L_0x0018
            java.lang.Object r2 = r2.b     // Catch:{ IOException -> 0x0367 }
            aukv r2 = (defpackage.aukv) r2     // Catch:{ IOException -> 0x0367 }
            goto L_0x001a
        L_0x0018:
            aukv r2 = defpackage.aukv.e     // Catch:{ IOException -> 0x0367 }
        L_0x001a:
            int r2 = r2.b     // Catch:{ IOException -> 0x0367 }
            aerd r4 = r1.f     // Catch:{ IOException -> 0x0367 }
            aere r4 = (defpackage.aere) r4     // Catch:{ IOException -> 0x0367 }
            aukh r4 = r4.b     // Catch:{ IOException -> 0x0367 }
            int r6 = r4.a     // Catch:{ IOException -> 0x0367 }
            if (r6 != r5) goto L_0x002b
            java.lang.Object r4 = r4.b     // Catch:{ IOException -> 0x0367 }
            aukv r4 = (defpackage.aukv) r4     // Catch:{ IOException -> 0x0367 }
            goto L_0x002d
        L_0x002b:
            aukv r4 = defpackage.aukv.e     // Catch:{ IOException -> 0x0367 }
        L_0x002d:
            int r4 = r4.c     // Catch:{ IOException -> 0x0367 }
            aevc r2 = r0.a(r3, r2, r4)     // Catch:{ IOException -> 0x0367 }
            java.util.Map r3 = r1.a     // Catch:{ all -> 0x0359 }
            monitor-enter(r3)     // Catch:{ all -> 0x0359 }
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x0356 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0356 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0356 }
        L_0x0040:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0356 }
            if (r4 != 0) goto L_0x033d
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x0356 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0356 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0356 }
        L_0x0050:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0356 }
            if (r4 != 0) goto L_0x0308
        L_0x0056:
            afcv r0 = r2.c()     // Catch:{ all -> 0x0356 }
            afdo r4 = r0.a()     // Catch:{ all -> 0x0356 }
            afcw r0 = r2.a()     // Catch:{ all -> 0x02fc }
            afcd r0 = r0.b(r4)     // Catch:{ all -> 0x02fc }
            r4.close()     // Catch:{ all -> 0x0356 }
            amzy r4 = r0.a     // Catch:{ all -> 0x0356 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0356 }
        L_0x006f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0356 }
            r8 = 1
            if (r6 == 0) goto L_0x015d
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0356 }
            aukz r6 = (defpackage.aukz) r6     // Catch:{ all -> 0x0356 }
            java.util.Map r9 = r1.a     // Catch:{ all -> 0x0356 }
            java.util.Collection r9 = r9.values()     // Catch:{ all -> 0x0356 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0356 }
        L_0x0086:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0356 }
            if (r10 != 0) goto L_0x0100
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
        L_0x00a6:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x00f7 }
            if (r11 == 0) goto L_0x00e6
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x00f7 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ IOException -> 0x00f7 }
            java.lang.Object r12 = r11.second     // Catch:{ IOException -> 0x00f7 }
            aept r12 = (defpackage.aept) r12     // Catch:{ IOException -> 0x00f7 }
            aukf r12 = r12.a()     // Catch:{ IOException -> 0x00f7 }
            int r12 = r12.a     // Catch:{ IOException -> 0x00f7 }
            if (r12 != r8) goto L_0x00a6
            java.lang.Object r12 = r11.second     // Catch:{ IOException -> 0x00f7 }
            aept r12 = (defpackage.aept) r12     // Catch:{ IOException -> 0x00f7 }
            aukf r12 = r12.a()     // Catch:{ IOException -> 0x00f7 }
            aeta r12 = defpackage.aeuz.a((defpackage.aukf) r12)     // Catch:{ IOException -> 0x00f7 }
            auay r13 = r6.d     // Catch:{ IOException -> 0x00f7 }
            auay r13 = r2.a((defpackage.auay) r13)     // Catch:{ IOException -> 0x00f7 }
            if (r13 == 0) goto L_0x00d7
            byte[] r13 = r13.k()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00d8
        L_0x00d7:
            r13 = 0
        L_0x00d8:
            boolean r12 = r12.a(r13)     // Catch:{ IOException -> 0x00f7 }
            if (r12 == 0) goto L_0x00a6
            java.lang.Object r11 = r11.first     // Catch:{ IOException -> 0x00f7 }
            aeps r11 = (defpackage.aeps) r11     // Catch:{ IOException -> 0x00f7 }
            r9.b(r11)     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00a6
        L_0x00e6:
            anax r6 = r9.a()     // Catch:{ IOException -> 0x00f7 }
            boolean r7 = r6.isEmpty()     // Catch:{ IOException -> 0x00f7 }
            if (r7 != 0) goto L_0x006f
            aepp r7 = r1.e     // Catch:{ IOException -> 0x00f7 }
            r7.a((java.util.Collection) r6)     // Catch:{ IOException -> 0x00f7 }
            goto L_0x006f
        L_0x00f7:
            r0 = move-exception
            afdm r4 = new afdm     // Catch:{ all -> 0x0356 }
            java.lang.String r5 = "Exception occurred while processing BroadcastListener subscriptions"
            r4.<init>(r5, r0)     // Catch:{ all -> 0x0356 }
            throw r4     // Catch:{ all -> 0x0356 }
        L_0x0100:
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0356 }
            pgh r10 = (defpackage.pgh) r10     // Catch:{ all -> 0x0356 }
            int r11 = r10.f     // Catch:{ all -> 0x0356 }
            if (r11 == r8) goto L_0x015a
            auay r11 = r6.d     // Catch:{ all -> 0x0356 }
            auay r11 = r2.a((defpackage.auay) r11)     // Catch:{ all -> 0x0356 }
            if (r11 == 0) goto L_0x0117
            byte[] r11 = r11.k()     // Catch:{ all -> 0x0356 }
            goto L_0x0118
        L_0x0117:
            r11 = 0
        L_0x0118:
            aeta r12 = r10.c     // Catch:{ all -> 0x0356 }
            boolean r12 = r12.a(r11)     // Catch:{ all -> 0x0356 }
            if (r12 == 0) goto L_0x0157
            aeta r12 = r10.d     // Catch:{ all -> 0x0356 }
            boolean r12 = r12.a(r11)     // Catch:{ all -> 0x0356 }
            if (r12 == 0) goto L_0x0154
            int r12 = r6.b     // Catch:{ all -> 0x0356 }
            auky r12 = defpackage.auky.a(r12)     // Catch:{ all -> 0x0356 }
            if (r12 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            auky r12 = defpackage.auky.UNKNOWN     // Catch:{ all -> 0x0356 }
        L_0x0133:
            int r13 = r6.a     // Catch:{ all -> 0x0356 }
            r13 = r13 & r5
            if (r13 == 0) goto L_0x0146
            com.google.android.gms.mdh.MdhFootprint r13 = new com.google.android.gms.mdh.MdhFootprint     // Catch:{ all -> 0x0356 }
            auay r14 = r6.c     // Catch:{ all -> 0x0356 }
            byte[] r14 = r14.k()     // Catch:{ all -> 0x0356 }
            long r7 = r6.e     // Catch:{ all -> 0x0356 }
            r13.<init>(r14, r11, r7)     // Catch:{ all -> 0x0356 }
            goto L_0x0147
        L_0x0146:
            r13 = 0
        L_0x0147:
            pgi r7 = new pgi     // Catch:{ all -> 0x0356 }
            r7.<init>((defpackage.auky) r12, (com.google.android.gms.mdh.MdhFootprint) r13)     // Catch:{ all -> 0x0356 }
            pgg r8 = r10.b     // Catch:{ all -> 0x0356 }
            r8.a((defpackage.pgi) r7)     // Catch:{ all -> 0x0356 }
            r8 = 1
            goto L_0x0086
        L_0x0154:
            r8 = 1
            goto L_0x0086
        L_0x0157:
            r8 = 1
            goto L_0x0086
        L_0x015a:
            r8 = 1
            goto L_0x0086
        L_0x015d:
            afcv r4 = r2.c()     // Catch:{ all -> 0x0356 }
            afdp r4 = r4.b()     // Catch:{ all -> 0x0356 }
            r0.a(r4)     // Catch:{ all -> 0x02f0 }
            r4.b()     // Catch:{ all -> 0x02f0 }
            r4.close()     // Catch:{ all -> 0x0356 }
            afcv r0 = r2.c()     // Catch:{ all -> 0x0356 }
            afdp r4 = r0.b()     // Catch:{ all -> 0x0356 }
            afcw r0 = r2.a()     // Catch:{ all -> 0x02e4 }
            boolean r0 = r0.a(r4)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x02df
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x02e4 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x02e4 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x02e4 }
        L_0x018a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x02e4 }
            r7 = r0
            pgh r7 = (defpackage.pgh) r7     // Catch:{ all -> 0x02e4 }
            int r0 = r7.f     // Catch:{ IOException -> 0x02cd }
            r8 = 1
            if (r0 == r8) goto L_0x019e
            r9 = 0
            goto L_0x020b
        L_0x019e:
            r7.f = r5     // Catch:{ IOException -> 0x02cd }
            amzt r0 = defpackage.amzy.j()     // Catch:{ IOException -> 0x02cd }
            aeta r8 = r7.d     // Catch:{ IOException -> 0x02cd }
            r9 = 0
            java.util.List r8 = r2.a(r4, r8, r9)     // Catch:{ IOException -> 0x02cb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x02cb }
        L_0x01af:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x02cb }
            if (r10 == 0) goto L_0x01cf
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x02cb }
            aetb r10 = (defpackage.aetb) r10     // Catch:{ IOException -> 0x02cb }
            aeta r11 = r7.c     // Catch:{ IOException -> 0x02cb }
            byte[] r12 = r10.b()     // Catch:{ IOException -> 0x02cb }
            boolean r11 = r11.a(r12)     // Catch:{ IOException -> 0x02cb }
            if (r11 == 0) goto L_0x01af
            com.google.android.gms.mdh.MdhFootprint r10 = defpackage.pga.a((defpackage.aetb) r10)     // Catch:{ IOException -> 0x02cb }
            r0.c(r10)     // Catch:{ IOException -> 0x02cb }
            goto L_0x01af
        L_0x01cf:
            aeta r8 = r7.c     // Catch:{ IOException -> 0x02cb }
            if (r8 == 0) goto L_0x01fc
            ryc r10 = com.google.android.gms.mdh.LatestFootprintFilter.a()     // Catch:{ IOException -> 0x02cb }
            amzy r8 = r8.a()     // Catch:{ IOException -> 0x02cb }
            anhk r8 = r8.listIterator()     // Catch:{ IOException -> 0x02cb }
        L_0x01df:
            boolean r11 = r8.hasNext()     // Catch:{ IOException -> 0x02cb }
            if (r11 == 0) goto L_0x01f7
            java.lang.Object r11 = r8.next()     // Catch:{ IOException -> 0x02cb }
            aetg r11 = (defpackage.aetg) r11     // Catch:{ IOException -> 0x02cb }
            byte[] r12 = r11.a()     // Catch:{ IOException -> 0x02cb }
            int r11 = r11.b()     // Catch:{ IOException -> 0x02cb }
            r10.a(r12, r11)     // Catch:{ IOException -> 0x02cb }
            goto L_0x01df
        L_0x01f7:
            com.google.android.gms.mdh.LatestFootprintFilter r8 = r10.a()     // Catch:{ IOException -> 0x02cb }
            goto L_0x01fd
        L_0x01fc:
            r8 = r9
        L_0x01fd:
            amzy r0 = r0.a()     // Catch:{ IOException -> 0x02cb }
            pgi r10 = new pgi     // Catch:{ IOException -> 0x02cb }
            r10.<init>((com.google.android.gms.mdh.LatestFootprintFilter) r8, (java.lang.Iterable) r0)     // Catch:{ IOException -> 0x02cb }
            pgg r0 = r7.b     // Catch:{ IOException -> 0x02cb }
            r0.a((defpackage.pgi) r10)     // Catch:{ IOException -> 0x02cb }
        L_0x020b:
            int r0 = r7.f     // Catch:{ IOException -> 0x02cb }
            r8 = 1
            if (r0 == r8) goto L_0x02c8
            aeta r0 = r2.b((defpackage.afdo) r4)     // Catch:{ IOException -> 0x02cb }
            aeta r8 = r7.c     // Catch:{ IOException -> 0x02cb }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x02cb }
            amzy r0 = r0.a()     // Catch:{ IOException -> 0x02cb }
            r10.<init>(r0)     // Catch:{ IOException -> 0x02cb }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x02cb }
            amzy r8 = r8.a()     // Catch:{ IOException -> 0x02cb }
            r0.<init>(r8)     // Catch:{ IOException -> 0x02cb }
            aetf r8 = defpackage.aetf.a     // Catch:{ IOException -> 0x02cb }
            java.util.Collections.sort(r10, r8)     // Catch:{ IOException -> 0x02cb }
            aetf r8 = defpackage.aetf.a     // Catch:{ IOException -> 0x02cb }
            java.util.Collections.sort(r0, r8)     // Catch:{ IOException -> 0x02cb }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ IOException -> 0x02cb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x02cb }
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x02cb }
            if (r10 == 0) goto L_0x0299
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x02cb }
            aetg r10 = (defpackage.aetg) r10     // Catch:{ IOException -> 0x02cb }
        L_0x0246:
            boolean r11 = r0.hasNext()     // Catch:{ IOException -> 0x02cb }
            if (r11 != 0) goto L_0x024e
            r13 = 1
            goto L_0x02a0
        L_0x024e:
            java.lang.Object r11 = r0.next()     // Catch:{ IOException -> 0x02cb }
            aetg r11 = (defpackage.aetg) r11     // Catch:{ IOException -> 0x02cb }
        L_0x0254:
            aetf r12 = defpackage.aetf.a     // Catch:{ IOException -> 0x02cb }
            int r12 = r12.compare(r10, r11)     // Catch:{ IOException -> 0x02cb }
            if (r12 > 0) goto L_0x0296
            byte[] r12 = r10.a()     // Catch:{ IOException -> 0x02cb }
            byte[] r13 = r11.a()     // Catch:{ IOException -> 0x02cb }
            boolean r12 = defpackage.aesp.a(r12, r13)     // Catch:{ IOException -> 0x02cb }
            if (r12 == 0) goto L_0x0288
            int r12 = r10.b()     // Catch:{ IOException -> 0x02cb }
            if (r12 == r5) goto L_0x0286
            byte[] r12 = r10.a()     // Catch:{ IOException -> 0x02cb }
            int r12 = r12.length     // Catch:{ IOException -> 0x02cb }
            byte[] r13 = r11.a()     // Catch:{ IOException -> 0x02cb }
            int r13 = r13.length     // Catch:{ IOException -> 0x02cb }
            if (r12 != r13) goto L_0x0284
            int r12 = r11.b()     // Catch:{ IOException -> 0x02cb }
            r13 = 1
            if (r12 == r13) goto L_0x0246
            goto L_0x0289
        L_0x0284:
            r13 = 1
            goto L_0x0289
        L_0x0286:
            r13 = 1
            goto L_0x0246
        L_0x0288:
            r13 = 1
        L_0x0289:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x02c6 }
            if (r10 == 0) goto L_0x018a
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x02c6 }
            aetg r10 = (defpackage.aetg) r10     // Catch:{ IOException -> 0x02c6 }
            goto L_0x0254
        L_0x0296:
            r13 = 1
            goto L_0x018a
        L_0x0299:
            r13 = 1
            boolean r0 = r0.hasNext()     // Catch:{ IOException -> 0x02c6 }
            if (r0 != 0) goto L_0x018a
        L_0x02a0:
            aesm r0 = r2.c(r4)     // Catch:{ IOException -> 0x02c6 }
            com.google.android.gms.mdh.SyncStatus r0 = defpackage.pcy.a((defpackage.aesm) r0)     // Catch:{ IOException -> 0x02c6 }
            int r8 = r7.f     // Catch:{ IOException -> 0x02c6 }
            r10 = 3
            if (r8 == r10) goto L_0x02ae
            goto L_0x02b6
        L_0x02ae:
            com.google.android.gms.mdh.SyncStatus r8 = r7.e     // Catch:{ IOException -> 0x02c6 }
            boolean r8 = r0.equals(r8)     // Catch:{ IOException -> 0x02c6 }
            if (r8 != 0) goto L_0x018a
        L_0x02b6:
            r7.e = r0     // Catch:{ IOException -> 0x02c6 }
            r7.f = r10     // Catch:{ IOException -> 0x02c6 }
            pgg r8 = r7.b     // Catch:{ IOException -> 0x02c6 }
            pgi r10 = new pgi     // Catch:{ IOException -> 0x02c6 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x02c6 }
            r8.a((defpackage.pgi) r10)     // Catch:{ IOException -> 0x02c6 }
            goto L_0x018a
        L_0x02c6:
            r0 = move-exception
            goto L_0x02d0
        L_0x02c8:
            r13 = 1
            goto L_0x018a
        L_0x02cb:
            r0 = move-exception
            goto L_0x02cf
        L_0x02cd:
            r0 = move-exception
            r9 = 0
        L_0x02cf:
            r13 = 1
        L_0x02d0:
            r7.a()     // Catch:{ all -> 0x02e4 }
            goto L_0x018a
        L_0x02d5:
            r4.close()     // Catch:{ all -> 0x0356 }
            monitor-exit(r3)     // Catch:{ all -> 0x0356 }
            if (r2 == 0) goto L_0x02de
            r2.close()     // Catch:{ IOException -> 0x0367 }
        L_0x02de:
            return
        L_0x02df:
            r4.close()     // Catch:{ all -> 0x0356 }
            goto L_0x0056
        L_0x02e4:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x02ea }
            goto L_0x02ef
        L_0x02ea:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0356 }
        L_0x02ef:
            throw r5     // Catch:{ all -> 0x0356 }
        L_0x02f0:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x02f6 }
            goto L_0x02fb
        L_0x02f6:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0356 }
        L_0x02fb:
            throw r5     // Catch:{ all -> 0x0356 }
        L_0x02fc:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x0302 }
            goto L_0x0307
        L_0x0302:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0356 }
        L_0x0307:
            throw r5     // Catch:{ all -> 0x0356 }
        L_0x0308:
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0356 }
            pgh r4 = (defpackage.pgh) r4     // Catch:{ all -> 0x0356 }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x0356 }
            afeb r7 = r1.c     // Catch:{ all -> 0x0356 }
            aerd r8 = r1.f     // Catch:{ all -> 0x0356 }
            r9 = r8
            aere r9 = (defpackage.aere) r9     // Catch:{ all -> 0x0356 }
            android.accounts.Account r9 = r9.a     // Catch:{ all -> 0x0356 }
            aere r8 = (defpackage.aere) r8     // Catch:{ all -> 0x0356 }
            aukh r8 = r8.b     // Catch:{ all -> 0x0356 }
            afdx r6 = r7.b(r6, r9, r8)     // Catch:{ all -> 0x0356 }
            if (r6 == 0) goto L_0x032c
            aukf r6 = r6.e()     // Catch:{ all -> 0x0356 }
            aeta r6 = defpackage.aeuz.a((defpackage.aukf) r6)     // Catch:{ all -> 0x0356 }
            goto L_0x032e
        L_0x032c:
            aeta r6 = defpackage.aeta.a     // Catch:{ all -> 0x0356 }
        L_0x032e:
            aeta r7 = r4.c     // Catch:{ all -> 0x0356 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x0356 }
            if (r7 != 0) goto L_0x0050
            r4.c = r6     // Catch:{ all -> 0x0356 }
            r4.a()     // Catch:{ all -> 0x0356 }
            goto L_0x0050
        L_0x033d:
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0356 }
            pgh r4 = (defpackage.pgh) r4     // Catch:{ all -> 0x0356 }
            pgg r4 = r4.b     // Catch:{ all -> 0x0356 }
            sah r4 = r4.a     // Catch:{ all -> 0x0356 }
            android.os.IBinder r4 = r4.asBinder()     // Catch:{ all -> 0x0356 }
            boolean r4 = r4.isBinderAlive()     // Catch:{ all -> 0x0356 }
            if (r4 != 0) goto L_0x0040
            r0.remove()     // Catch:{ all -> 0x0356 }
            goto L_0x0040
        L_0x0356:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0356 }
            throw r0     // Catch:{ all -> 0x0359 }
        L_0x0359:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x0366
            r2.close()     // Catch:{ all -> 0x0361 }
            goto L_0x0366
        L_0x0361:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r2)     // Catch:{ IOException -> 0x0367 }
        L_0x0366:
            throw r3     // Catch:{ IOException -> 0x0367 }
        L_0x0367:
            r0 = move-exception
            pia r2 = r1.b
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Trigger listeners failed"
            r2.e(r4, r3)
            awdn r2 = r1.g
            java.lang.Object r2 = r2.a()
            pdg r2 = (defpackage.pdg) r2
            java.lang.String r3 = "MDH Trigger listeners failed"
            r2.a(r3, r0)
            java.util.Map r2 = r1.a
            monitor-enter(r2)
            java.util.Map r0 = r1.a     // Catch:{ all -> 0x039e }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x039e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x039e }
        L_0x038c:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x039e }
            if (r3 == 0) goto L_0x039c
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x039e }
            pgh r3 = (defpackage.pgh) r3     // Catch:{ all -> 0x039e }
            r3.a()     // Catch:{ all -> 0x039e }
            goto L_0x038c
        L_0x039c:
            monitor-exit(r2)     // Catch:{ all -> 0x039e }
            return
        L_0x039e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x039e }
            goto L_0x03a2
        L_0x03a1:
            throw r0
        L_0x03a2:
            goto L_0x03a1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgj.a():void");
    }
}
