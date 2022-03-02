package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.concurrent.ScheduledFuture;
import org.apache.http.client.methods.HttpGet;

/* renamed from: ngq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngq implements Runnable {
    public final String a;
    public final nfw b;
    public final Object c = new Object();
    public final aosh d;
    public Status e = ngs.b;
    ScheduledFuture f;
    private final HttpGet g;
    private final File h;
    private final Runnable i;
    private final opc j;

    public ngq(opc opc, String str, nfw nfw, File file, Runnable runnable, ngp ngp) {
        amrl.a((Object) opc, (Object) "httpClient");
        this.j = opc;
        amrl.a((Object) str, (Object) "url");
        this.a = str;
        amrl.a((Object) nfw, (Object) "spec");
        this.b = nfw;
        amrl.a((Object) file, (Object) "destFile");
        this.h = file;
        amrl.a((Object) runnable, (Object) "resultPump");
        this.i = runnable;
        amrl.a((Object) ngp, (Object) "downloadTagging");
        this.g = new HttpGet(str);
        this.d = aosh.f();
    }

    private final void a() {
        Status status;
        synchronized (this.c) {
            status = this.e;
        }
        ngz.c("FontsHttpClientDL", "Pump result %s for %s", status, this.a);
        if (!this.d.isDone()) {
            this.d.b((Object) status);
        }
        if (!this.f.isDone()) {
            this.f.cancel(false);
        }
        this.i.run();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
    public final void run() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            monitor-enter(r0)
            com.google.android.gms.common.api.Status r1 = r12.e     // Catch:{ all -> 0x01a7 }
            int r2 = r1.i     // Catch:{ all -> 0x01a7 }
            r3 = 2
            r4 = 23509(0x5bd5, float:3.2943E-41)
            r5 = 1
            r6 = 0
            if (r2 == r4) goto L_0x001f
            java.lang.String r2 = "FontsHttpClientDL"
            java.lang.String r4 = "Skip download, status %s already set for %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x01a7 }
            r3[r6] = r1     // Catch:{ all -> 0x01a7 }
            java.lang.String r1 = r12.a     // Catch:{ all -> 0x01a7 }
            r3[r5] = r1     // Catch:{ all -> 0x01a7 }
            defpackage.ngz.c(r2, r4, r3)     // Catch:{ all -> 0x01a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            r0 = 8
            r1 = 0
            boolean r2 = defpackage.awyg.b()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            if (r2 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r2 = 24577(0x6001, float:3.444E-41)
            defpackage.izj.b(r2)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
        L_0x002f:
            opc r2 = r12.j     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            org.apache.http.client.methods.HttpGet r7 = r12.g     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            org.apache.http.HttpResponse r2 = r2.execute(r7)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            org.apache.http.StatusLine r7 = r2.getStatusLine()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            int r7 = r7.getStatusCode()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x00aa
            org.apache.http.HttpEntity r2 = r2.getEntity()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            java.io.File r7 = r12.h     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            java.io.File r7 = r7.getParentFile()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            boolean r8 = r7.isDirectory()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            if (r8 != 0) goto L_0x0061
            java.lang.String r8 = "FontsHttpClientDL"
            java.lang.String r9 = "Restoring lost download dir %s"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            r10[r6] = r7     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            defpackage.ngz.a(r8, r9, r10)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            r7.mkdirs()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
        L_0x0061:
            nfw r7 = r12.b     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            auay r7 = r7.d     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            byte[] r7 = r7.k()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r8 = "hash"
            defpackage.amrl.a((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            anli r8 = defpackage.anln.d()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            int r7 = r7.length     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            r9 = 20
            if (r7 != r9) goto L_0x0085
            java.lang.String r7 = "FontsHttpClientDL"
            java.lang.String r8 = "SHA1 hash detected; bad!"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            defpackage.ngz.a(r7, r8, r9)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            anli r8 = defpackage.anln.c()     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            java.io.File r9 = r12.h     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            r7.<init>(r9)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            anlo r9 = new anlo     // Catch:{ IOException -> 0x00a6, Exception -> 0x00a2, all -> 0x009f }
            r9.<init>(r8, r7)     // Catch:{ IOException -> 0x00a6, Exception -> 0x00a2, all -> 0x009f }
            r2.writeTo(r9)     // Catch:{ IOException -> 0x009d, Exception -> 0x009b, all -> 0x0097 }
            goto L_0x010a
        L_0x0097:
            r0 = move-exception
            r1 = r9
            goto L_0x019d
        L_0x009b:
            r1 = move-exception
            goto L_0x00ba
        L_0x009d:
            r1 = move-exception
            goto L_0x00e8
        L_0x009f:
            r0 = move-exception
            goto L_0x019d
        L_0x00a2:
            r2 = move-exception
            r9 = r1
            r1 = r2
            goto L_0x00ba
        L_0x00a6:
            r2 = move-exception
            r9 = r1
            r1 = r2
            goto L_0x00e8
        L_0x00aa:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r7 = "Non-200 response"
            r2.<init>(r7)     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
            throw r2     // Catch:{ IOException -> 0x00e4, Exception -> 0x00b6, all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            r7 = r1
            goto L_0x019d
        L_0x00b6:
            r2 = move-exception
            r7 = r1
            r9 = r7
            r1 = r2
        L_0x00ba:
            java.lang.String r2 = "FontsHttpClientDL"
            java.lang.String r8 = "Download %s failed in an unexpected way"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e0 }
            java.lang.String r11 = r12.a     // Catch:{ all -> 0x00e0 }
            r10[r6] = r11     // Catch:{ all -> 0x00e0 }
            defpackage.ngz.a((java.lang.String) r2, (java.lang.Throwable) r1, (java.lang.String) r8, (java.lang.Object[]) r10)     // Catch:{ all -> 0x00e0 }
            java.lang.Object r2 = r12.c     // Catch:{ all -> 0x00e0 }
            monitor-enter(r2)     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.common.api.Status r8 = r12.e     // Catch:{ all -> 0x00dd }
            int r8 = r8.i     // Catch:{ all -> 0x00dd }
            if (r8 != r4) goto L_0x00db
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00dd }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x00dd }
            r12.e = r8     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            goto L_0x010a
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            r1 = r9
            goto L_0x019d
        L_0x00e4:
            r2 = move-exception
            r7 = r1
            r9 = r7
            r1 = r2
        L_0x00e8:
            java.lang.String r2 = "FontsHttpClientDL"
            java.lang.String r8 = "Download %s failed"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x019b }
            java.lang.String r11 = r12.a     // Catch:{ all -> 0x019b }
            r10[r6] = r11     // Catch:{ all -> 0x019b }
            defpackage.ngz.a((java.lang.String) r2, (java.lang.Throwable) r1, (java.lang.String) r8, (java.lang.Object[]) r10)     // Catch:{ all -> 0x019b }
            java.lang.Object r2 = r12.c     // Catch:{ all -> 0x019b }
            monitor-enter(r2)     // Catch:{ all -> 0x019b }
            com.google.android.gms.common.api.Status r8 = r12.e     // Catch:{ all -> 0x0198 }
            int r8 = r8.i     // Catch:{ all -> 0x0198 }
            if (r8 != r4) goto L_0x0109
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0198 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0198 }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x0198 }
            r12.e = r8     // Catch:{ all -> 0x0198 }
        L_0x0109:
            monitor-exit(r2)     // Catch:{ all -> 0x0198 }
        L_0x010a:
            defpackage.jjt.a((java.io.Closeable) r9)
            defpackage.jjt.a((java.io.Closeable) r7)
            defpackage.ngp.a()
            java.lang.Object r0 = r12.c
            monitor-enter(r0)
            com.google.android.gms.common.api.Status r1 = r12.e     // Catch:{ all -> 0x0195 }
            int r1 = r1.i     // Catch:{ all -> 0x0195 }
            if (r1 != r4) goto L_0x017d
            anlj r1 = r9.a     // Catch:{ all -> 0x0195 }
            anlh r1 = r1.a()     // Catch:{ all -> 0x0195 }
            byte[] r1 = r1.b()     // Catch:{ all -> 0x0195 }
            nfw r2 = r12.b     // Catch:{ all -> 0x0195 }
            auay r2 = r2.d     // Catch:{ all -> 0x0195 }
            byte[] r2 = r2.k()     // Catch:{ all -> 0x0195 }
            boolean r1 = java.util.Arrays.equals(r1, r2)     // Catch:{ all -> 0x0195 }
            if (r1 != 0) goto L_0x0146
            java.lang.String r1 = "FontsHttpClientDL"
            java.lang.String r2 = "Wrong hash for %s"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0195 }
            java.lang.String r4 = r12.a     // Catch:{ all -> 0x0195 }
            r3[r6] = r4     // Catch:{ all -> 0x0195 }
            defpackage.ngz.a(r1, r2, r3)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.common.api.Status r1 = defpackage.ngs.d     // Catch:{ all -> 0x0195 }
            r12.e = r1     // Catch:{ all -> 0x0195 }
            goto L_0x017d
        L_0x0146:
            java.io.File r1 = r12.h     // Catch:{ all -> 0x0195 }
            long r1 = r1.length()     // Catch:{ all -> 0x0195 }
            nfw r4 = r12.b     // Catch:{ all -> 0x0195 }
            long r7 = r4.c     // Catch:{ all -> 0x0195 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0179
            java.lang.String r1 = "FontsHttpClientDL"
            java.lang.String r2 = "Wrong filesize, expected %d, got %d from %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0195 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0195 }
            r4[r6] = r7     // Catch:{ all -> 0x0195 }
            java.io.File r6 = r12.h     // Catch:{ all -> 0x0195 }
            long r6 = r6.length()     // Catch:{ all -> 0x0195 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0195 }
            r4[r5] = r6     // Catch:{ all -> 0x0195 }
            java.lang.String r5 = r12.a     // Catch:{ all -> 0x0195 }
            r4[r3] = r5     // Catch:{ all -> 0x0195 }
            defpackage.ngz.a(r1, r2, r4)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.common.api.Status r1 = defpackage.ngs.e     // Catch:{ all -> 0x0195 }
            r12.e = r1     // Catch:{ all -> 0x0195 }
            goto L_0x017d
        L_0x0179:
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x0195 }
            r12.e = r1     // Catch:{ all -> 0x0195 }
        L_0x017d:
            com.google.android.gms.common.api.Status r1 = r12.e     // Catch:{ all -> 0x0195 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0195 }
            monitor-exit(r0)     // Catch:{ all -> 0x0195 }
            if (r1 != 0) goto L_0x0191
            java.io.File r0 = r12.h     // Catch:{ all -> 0x018c }
            r0.delete()     // Catch:{ all -> 0x018c }
            goto L_0x0191
        L_0x018c:
            r0 = move-exception
            r12.a()
            throw r0
        L_0x0191:
            r12.a()
            return
        L_0x0195:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0195 }
            throw r1
        L_0x0198:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0198 }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x019b:
            r0 = move-exception
            r1 = r9
        L_0x019d:
            defpackage.jjt.a((java.io.Closeable) r1)
            defpackage.jjt.a((java.io.Closeable) r7)
            defpackage.ngp.a()
            throw r0
        L_0x01a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01a7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngq.run():void");
    }

    public final void a(Status status) {
        amrl.a((Object) status, (Object) "cancellationStatus");
        synchronized (this.c) {
            Status status2 = this.e;
            if (status2.i == 23509) {
                this.e = status;
                ngz.a("FontsHttpClientDL", "Rejecting cancel for completed (%s) download of %s", status2, this.a);
                try {
                    this.g.abort();
                } finally {
                    a();
                }
            }
        }
    }
}
