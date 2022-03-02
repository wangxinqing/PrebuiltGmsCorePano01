package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: lif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lif implements Runnable {
    public kis a = null;
    final /* synthetic */ lih b;
    private final khq c;
    private final knc d;
    private final lht e;
    private final CountDownLatch f = new CountDownLatch(1);
    private lig g = null;

    public lif(lih lih, kkz kkz, knc knc, lht lht) {
        this.b = lih;
        this.c = khq.a(kkz);
        this.d = knc;
        this.e = lht;
    }

    private final synchronized void a(lfq lfq, int i) {
        lfq.a(3, i, this.g.a(), this.b.m.a());
        lfq.h();
        lfq.a();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0279 A[ExcHandler: kcs (e kcs), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ad A[Catch:{ kcs -> 0x0246, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c4 A[Catch:{ kcs -> 0x0246, all -> 0x0195 }] */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            lih r0 = r1.b     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            khq r6 = r1.c     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            knc r7 = r1.d     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            kmp r0 = r0.a((defpackage.khq) r6, (defpackage.knc) r7)     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            monitor-enter(r16)     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            int r6 = r1.a(r0)     // Catch:{ all -> 0x0192 }
            if (r6 != r5) goto L_0x015f
            khq r6 = r1.c     // Catch:{ all -> 0x0192 }
            boolean r7 = r0.ai()     // Catch:{ all -> 0x0192 }
            if (r7 != 0) goto L_0x0022
            goto L_0x005d
        L_0x0022:
            lih r6 = r1.b     // Catch:{ all -> 0x0192 }
            khq r6 = r6.b(r0)     // Catch:{ all -> 0x0192 }
            if (r6 != 0) goto L_0x005d
            monitor-exit(r16)     // Catch:{ all -> 0x0192 }
            lih r0 = r1.b     // Catch:{ kcs -> 0x003d }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x003d }
            khq r2 = r1.c     // Catch:{ kcs -> 0x003d }
            knc r3 = r1.d     // Catch:{ kcs -> 0x003d }
            kmp r0 = r0.a((defpackage.khq) r2, (defpackage.knc) r3)     // Catch:{ kcs -> 0x003d }
            lih r2 = r1.b     // Catch:{ kcs -> 0x003d }
            r2.a((defpackage.kmp) r0)     // Catch:{ kcs -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            lih r0 = r1.b
            java.util.Map r6 = r0.g
            monitor-enter(r6)
            lht r0 = r1.e     // Catch:{ all -> 0x005a }
            r0.f()     // Catch:{ all -> 0x005a }
            lih r0 = r1.b     // Catch:{ all -> 0x005a }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x005a }
            knc r2 = r1.d     // Catch:{ all -> 0x005a }
            r0.remove(r2)     // Catch:{ all -> 0x005a }
            lih r0 = r1.b     // Catch:{ all -> 0x005a }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x005a }
            r0.notify()     // Catch:{ all -> 0x005a }
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            throw r0
        L_0x005d:
            lih r7 = r1.b     // Catch:{ all -> 0x0192 }
            lel r7 = r7.i     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0192 }
            lnk r8 = defpackage.lnk.a     // Catch:{ all -> 0x0192 }
            r7.a(r6, r0, r8)     // Catch:{ all -> 0x0192 }
            lih r0 = r1.b     // Catch:{ all -> 0x0192 }
            kkf r0 = r0.b     // Catch:{ all -> 0x0192 }
            khq r6 = r1.c     // Catch:{ all -> 0x0192 }
            knc r7 = r1.d     // Catch:{ all -> 0x0192 }
            kmp r0 = r0.a((defpackage.khq) r6, (defpackage.knc) r7)     // Catch:{ all -> 0x0192 }
            lih r6 = r1.b     // Catch:{ all -> 0x0192 }
            lfr r6 = r6.k     // Catch:{ all -> 0x0192 }
            lfq r6 = r6.c()     // Catch:{ all -> 0x0192 }
            r7 = 61
            r6.c(r5, r7)     // Catch:{ all -> 0x0192 }
            r6.c(r4)     // Catch:{ all -> 0x0192 }
            r6.i()     // Catch:{ all -> 0x0192 }
            lih r7 = r1.b     // Catch:{ all -> 0x0192 }
            kim r7 = r7.c     // Catch:{ all -> 0x0192 }
            khq r8 = r1.c     // Catch:{ all -> 0x0192 }
            lht r9 = r1.e     // Catch:{ all -> 0x0192 }
            kis r7 = r7.a(r8, r0, r9)     // Catch:{ all -> 0x0192 }
            r1.a = r7     // Catch:{ all -> 0x0192 }
            lig r7 = new lig     // Catch:{ all -> 0x0192 }
            lih r8 = r1.b     // Catch:{ all -> 0x0192 }
            khq r9 = r1.c     // Catch:{ all -> 0x0192 }
            knc r10 = r1.d     // Catch:{ all -> 0x0192 }
            r7.<init>(r8, r9, r10)     // Catch:{ all -> 0x0192 }
            r1.g = r7     // Catch:{ all -> 0x0192 }
            kis r8 = r1.a     // Catch:{ all -> 0x0192 }
            r8.a(r7)     // Catch:{ all -> 0x0192 }
            java.util.concurrent.CountDownLatch r7 = r1.f     // Catch:{ all -> 0x0192 }
            r7.countDown()     // Catch:{ all -> 0x0192 }
            monitor-exit(r16)     // Catch:{ all -> 0x0192 }
            kis r7 = r1.a     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            monitor-enter(r7)     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            java.util.concurrent.CountDownLatch r8 = r7.b     // Catch:{ all -> 0x015c }
            if (r8 != 0) goto L_0x00c5
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x015c }
            r8.<init>(r5)     // Catch:{ all -> 0x015c }
            r7.b = r8     // Catch:{ all -> 0x015c }
            kir r8 = new kir     // Catch:{ all -> 0x015c }
            r8.<init>(r7)     // Catch:{ all -> 0x015c }
            r7.a(r8)     // Catch:{ all -> 0x015c }
        L_0x00c5:
            monitor-exit(r7)     // Catch:{ all -> 0x015c }
            java.util.concurrent.CountDownLatch r8 = r7.b     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            r8.await()     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            int r7 = r7.c     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
            r1.a(r6, r7)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            if (r7 != r3) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            if (r7 != r2) goto L_0x0141
        L_0x00d5:
            lig r6 = r1.g     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.lang.Long r6 = r6.a()     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            long r14 = r6.longValue()     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            lih r6 = r1.b     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            int r11 = defpackage.lih.a((int) r7)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            com.google.android.gms.drive.events.internal.TransferProgressData r12 = new com.google.android.gms.drive.events.internal.TransferProgressData     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r9 = 1
            com.google.android.gms.drive.DriveId r10 = r0.g()     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r8 = r12
            r2 = r12
            r12 = r14
            r8.<init>(r9, r10, r11, r12, r14)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            ksw r6 = r6.j     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r6.a((com.google.android.gms.drive.events.internal.TransferProgressData) r2, (defpackage.kmp) r0)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            lih r0 = r1.b     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.util.Map r0 = r0.h     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            knc r2 = r1.d     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r0.remove(r2)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            ith r0 = defpackage.lih.a     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            knc r6 = r1.d     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r2[r4] = r6     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.lang.String r6 = "PinnedContentDownloader"
            java.lang.String r8 = "Finished downloading file: %s"
            r0.a((java.lang.String) r6, (java.lang.String) r8, (java.lang.Object[]) r2)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            lih r0 = r1.b     // Catch:{ kcs -> 0x0121 }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x0121 }
            khq r2 = r1.c     // Catch:{ kcs -> 0x0121 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0121 }
            kmp r0 = r0.a((defpackage.khq) r2, (defpackage.knc) r3)     // Catch:{ kcs -> 0x0121 }
            lih r2 = r1.b     // Catch:{ kcs -> 0x0121 }
            r2.a((defpackage.kmp) r0)     // Catch:{ kcs -> 0x0121 }
            goto L_0x0122
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            lih r0 = r1.b
            java.util.Map r2 = r0.g
            monitor-enter(r2)
            lht r0 = r1.e     // Catch:{ all -> 0x013e }
            r0.f()     // Catch:{ all -> 0x013e }
            lih r0 = r1.b     // Catch:{ all -> 0x013e }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x013e }
            knc r3 = r1.d     // Catch:{ all -> 0x013e }
            r0.remove(r3)     // Catch:{ all -> 0x013e }
            lih r0 = r1.b     // Catch:{ all -> 0x013e }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x013e }
            r0.notify()     // Catch:{ all -> 0x013e }
            monitor-exit(r2)     // Catch:{ all -> 0x013e }
            return
        L_0x013e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013e }
            throw r0
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r6 = 37
            r2.<init>(r6)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.lang.String r6 = "Download failed in state: "
            r2.append(r6)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r2.append(r7)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            java.lang.String r2 = r2.toString()     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            r0.<init>(r2)     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
            throw r0     // Catch:{ kcs -> 0x0279, Exception -> 0x015a, all -> 0x0195 }
        L_0x015a:
            r0 = move-exception
            goto L_0x019b
        L_0x015c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x015c }
            throw r0     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
        L_0x015f:
            monitor-exit(r16)     // Catch:{ all -> 0x0192 }
            lih r0 = r1.b     // Catch:{ kcs -> 0x0172 }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x0172 }
            khq r2 = r1.c     // Catch:{ kcs -> 0x0172 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0172 }
            kmp r0 = r0.a((defpackage.khq) r2, (defpackage.knc) r3)     // Catch:{ kcs -> 0x0172 }
            lih r2 = r1.b     // Catch:{ kcs -> 0x0172 }
            r2.a((defpackage.kmp) r0)     // Catch:{ kcs -> 0x0172 }
            goto L_0x0173
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            lih r0 = r1.b
            java.util.Map r2 = r0.g
            monitor-enter(r2)
            lht r0 = r1.e     // Catch:{ all -> 0x018f }
            r0.f()     // Catch:{ all -> 0x018f }
            lih r0 = r1.b     // Catch:{ all -> 0x018f }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x018f }
            knc r3 = r1.d     // Catch:{ all -> 0x018f }
            r0.remove(r3)     // Catch:{ all -> 0x018f }
            lih r0 = r1.b     // Catch:{ all -> 0x018f }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x018f }
            r0.notify()     // Catch:{ all -> 0x018f }
            monitor-exit(r2)     // Catch:{ all -> 0x018f }
            return
        L_0x018f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018f }
            throw r0
        L_0x0192:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ kcs -> 0x0279, Exception -> 0x0199, all -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            r2 = r0
            goto L_0x0214
        L_0x0199:
            r0 = move-exception
            r7 = 5
        L_0x019b:
            lih r2 = r1.b     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            kkf r2 = r2.b     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            khq r6 = r1.c     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            knc r8 = r1.d     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            kmp r2 = r2.a((defpackage.khq) r6, (defpackage.knc) r8)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            int r6 = r1.a(r2)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            if (r6 != 0) goto L_0x01c4
            lih r0 = r1.b     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r3 = 4
            r0.b(r2, r3)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            ith r0 = defpackage.lih.a     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r2[r4] = r3     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.String r3 = "PinnedContentDownloader"
            java.lang.String r4 = "File unpinned: %s"
            r0.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Object[]) r2)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            goto L_0x0247
        L_0x01c4:
            if (r6 != r3) goto L_0x01d6
            ith r0 = defpackage.lih.a     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r2[r4] = r3     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.String r3 = "PinnedContentDownloader"
            java.lang.String r4 = "Download paused: %s"
            r0.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Object[]) r2)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            goto L_0x0247
        L_0x01d6:
            lih r3 = r1.b     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r3.b(r2, r7)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            lih r2 = r1.b     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.util.Map r2 = r2.h     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            if (r2 == 0) goto L_0x01ef
            int r2 = r2.intValue()     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            int r2 = r2 + r5
            goto L_0x01f0
        L_0x01ef:
            r2 = 1
        L_0x01f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            ith r3 = defpackage.lih.a     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r6[r4] = r2     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            knc r4 = r1.d     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r6[r5] = r4     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.lang.String r4 = "PinnedContentDownloader"
            java.lang.String r5 = "Failed to download file (attempt %d): %s"
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r3.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.Throwable) r0)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            lih r0 = r1.b     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            java.util.Map r0 = r0.h     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            r0.put(r3, r2)     // Catch:{ kcs -> 0x0246, all -> 0x0195 }
            goto L_0x0247
        L_0x0214:
            lih r0 = r1.b     // Catch:{ kcs -> 0x0226 }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x0226 }
            khq r3 = r1.c     // Catch:{ kcs -> 0x0226 }
            knc r4 = r1.d     // Catch:{ kcs -> 0x0226 }
            kmp r0 = r0.a((defpackage.khq) r3, (defpackage.knc) r4)     // Catch:{ kcs -> 0x0226 }
            lih r3 = r1.b     // Catch:{ kcs -> 0x0226 }
            r3.a((defpackage.kmp) r0)     // Catch:{ kcs -> 0x0226 }
            goto L_0x0227
        L_0x0226:
            r0 = move-exception
        L_0x0227:
            lih r0 = r1.b
            java.util.Map r3 = r0.g
            monitor-enter(r3)
            lht r0 = r1.e     // Catch:{ all -> 0x0243 }
            r0.f()     // Catch:{ all -> 0x0243 }
            lih r0 = r1.b     // Catch:{ all -> 0x0243 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x0243 }
            knc r4 = r1.d     // Catch:{ all -> 0x0243 }
            r0.remove(r4)     // Catch:{ all -> 0x0243 }
            lih r0 = r1.b     // Catch:{ all -> 0x0243 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x0243 }
            r0.notify()     // Catch:{ all -> 0x0243 }
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            throw r2
        L_0x0243:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            throw r0
        L_0x0246:
            r0 = move-exception
        L_0x0247:
            lih r0 = r1.b     // Catch:{ kcs -> 0x0259 }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x0259 }
            khq r2 = r1.c     // Catch:{ kcs -> 0x0259 }
            knc r3 = r1.d     // Catch:{ kcs -> 0x0259 }
            kmp r0 = r0.a((defpackage.khq) r2, (defpackage.knc) r3)     // Catch:{ kcs -> 0x0259 }
            lih r2 = r1.b     // Catch:{ kcs -> 0x0259 }
            r2.a((defpackage.kmp) r0)     // Catch:{ kcs -> 0x0259 }
            goto L_0x025a
        L_0x0259:
            r0 = move-exception
        L_0x025a:
            lih r0 = r1.b
            java.util.Map r2 = r0.g
            monitor-enter(r2)
            lht r0 = r1.e     // Catch:{ all -> 0x0276 }
            r0.f()     // Catch:{ all -> 0x0276 }
            lih r0 = r1.b     // Catch:{ all -> 0x0276 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x0276 }
            knc r3 = r1.d     // Catch:{ all -> 0x0276 }
            r0.remove(r3)     // Catch:{ all -> 0x0276 }
            lih r0 = r1.b     // Catch:{ all -> 0x0276 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x0276 }
            r0.notify()     // Catch:{ all -> 0x0276 }
            monitor-exit(r2)     // Catch:{ all -> 0x0276 }
            return
        L_0x0276:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0276 }
            throw r0
        L_0x0279:
            r0 = move-exception
            lih r0 = r1.b     // Catch:{ kcs -> 0x028c }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x028c }
            khq r2 = r1.c     // Catch:{ kcs -> 0x028c }
            knc r3 = r1.d     // Catch:{ kcs -> 0x028c }
            kmp r0 = r0.a((defpackage.khq) r2, (defpackage.knc) r3)     // Catch:{ kcs -> 0x028c }
            lih r2 = r1.b     // Catch:{ kcs -> 0x028c }
            r2.a((defpackage.kmp) r0)     // Catch:{ kcs -> 0x028c }
            goto L_0x028d
        L_0x028c:
            r0 = move-exception
        L_0x028d:
            lih r0 = r1.b
            java.util.Map r2 = r0.g
            monitor-enter(r2)
            lht r0 = r1.e     // Catch:{ all -> 0x02a9 }
            r0.f()     // Catch:{ all -> 0x02a9 }
            lih r0 = r1.b     // Catch:{ all -> 0x02a9 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x02a9 }
            knc r3 = r1.d     // Catch:{ all -> 0x02a9 }
            r0.remove(r3)     // Catch:{ all -> 0x02a9 }
            lih r0 = r1.b     // Catch:{ all -> 0x02a9 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x02a9 }
            r0.notify()     // Catch:{ all -> 0x02a9 }
            monitor-exit(r2)     // Catch:{ all -> 0x02a9 }
            return
        L_0x02a9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02a9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lif.run():void");
    }

    public final int a(kmp kmp) {
        return this.b.a(kmp, this.e);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            lih r0 = r4.b     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            kkf r0 = r0.b     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            khq r1 = r4.c     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            knc r2 = r4.d     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            kmp r0 = r0.a((defpackage.khq) r1, (defpackage.knc) r2)     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            int r0 = r4.a(r0)     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            r1 = 1
            if (r0 == r1) goto L_0x0025
            java.util.concurrent.CountDownLatch r0 = r4.f     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            r1 = 500(0x1f4, double:2.47E-321)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            boolean r0 = r0.await(r1, r3)     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            kis r0 = r4.a     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
            r0.a()     // Catch:{ kcs -> 0x002c, InterruptedException -> 0x002a, all -> 0x0027 }
        L_0x0025:
            monitor-exit(r4)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x002a:
            r0 = move-exception
            goto L_0x0025
        L_0x002c:
            r0 = move-exception
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lif.a():void");
    }
}
