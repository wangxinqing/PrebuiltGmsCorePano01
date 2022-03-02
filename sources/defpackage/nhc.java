package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: nhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhc {
    public static final Status a = new Status(13);
    public final Object b;
    public final FontMatchSpec c;
    public final nhl d;
    public final String e;
    public int f;
    public final long g;
    private final nhf h;
    private final String i;
    private final nfw j;
    private List k;
    private Status l;
    private amsn m;

    public nhc(nhf nhf, FontMatchSpec fontMatchSpec, nhl nhl, aosh aosh, String str) {
        this.b = new Object();
        this.f = 0;
        this.g = 0;
        iva.a((Object) nhf, (Object) "server");
        this.h = nhf;
        iva.a((Object) fontMatchSpec, (Object) "spec");
        this.c = fontMatchSpec;
        iva.a((Object) nhl, (Object) "resolvedFont");
        this.d = nhl;
        nfw nfw = nhl.c.a;
        this.j = ngg.a(nfw == null ? nfw.e : nfw);
        iva.a((Object) str, (Object) "requestingPackage");
        this.e = str;
        this.i = ngt.a(nhl.c);
        ArrayList arrayList = new ArrayList(1);
        this.k = arrayList;
        iva.a((Object) aosh, (Object) "pendingResult");
        arrayList.add(aosh);
        this.l = new Status(23509);
        this.m = amsn.b(ampt.a);
    }

    static FontMatchSpec a(nfz nfz, nfy nfy) {
        String str = nfz.b;
        nfx nfx = nfy.c;
        if (nfx == null) {
            nfx = nfx.c;
        }
        float f2 = nfx.a;
        nga nga = nfy.b;
        if (nga == null) {
            nga = nga.c;
        }
        int i2 = nga.a;
        nfx nfx2 = nfy.d;
        if (nfx2 == null) {
            nfx2 = nfx.c;
        }
        return new FontMatchSpec(str, f2, i2, nfx2.a, false);
    }

    public final long b() {
        long a2;
        synchronized (this.b) {
            a2 = this.m.a(TimeUnit.MILLISECONDS);
        }
        return a2;
    }

    public final Status c() {
        Status status;
        synchronized (this.b) {
            status = this.l;
        }
        return status;
    }

    private final void a(ngo ngo, FontFetchResult fontFetchResult) {
        a(fontFetchResult);
        ngo.a(this.i, this.j.b);
    }

    public nhc(nhf nhf, FontMatchSpec fontMatchSpec, nhl nhl, aosh aosh, String str, long j2) {
        this(nhf, fontMatchSpec, nhl, aosh, str);
        boolean z;
        this.g = j2;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, "invalid timeout value %d", Long.valueOf(j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r0 = r10.a(r8.i, r8.j);
        defpackage.ngz.c("FontFetch", "Check status of %s: is %s, previous %s", r8.i, r0, r8.l);
        r1 = r0.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r1 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r1 == 23509) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        defpackage.ngz.a("FontFetch", "%s %s; declaring failure", r8.i, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r0.c() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r0 = a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        a(r10, com.google.android.gms.fonts.FontFetchResult.a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r1 = r10.a(r8.j.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2 = r8.d;
        r9 = r9.a(r1, r2.b, r2.c);
        r1 = r8.d;
        r9 = com.google.android.gms.fonts.FontFetchResult.a(a(r1.b, r1.c), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r9 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r9 = com.google.android.gms.fonts.FontFetchResult.a(a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        defpackage.ngz.a("FontFetch", (java.lang.Throwable) r9, "Disk encountered an error taking font.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r0.c() != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r0 = a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r9 = com.google.android.gms.fonts.FontFetchResult.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        a(r10, com.google.android.gms.fonts.FontFetchResult.a(a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.api.Status a(defpackage.ngm r9, defpackage.ngo r10) {
        /*
            r8 = this;
            java.lang.String r0 = "disk"
            defpackage.iva.a((java.lang.Object) r9, (java.lang.Object) r0)
            java.lang.String r0 = "downloader"
            defpackage.iva.a((java.lang.Object) r10, (java.lang.Object) r0)
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
            com.google.android.gms.common.api.Status r1 = r8.l     // Catch:{ all -> 0x00ed }
            int r2 = r1.i     // Catch:{ all -> 0x00ed }
            r3 = 23509(0x5bd5, float:3.2943E-41)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0026
            java.lang.String r9 = "FontFetch"
            java.lang.String r10 = "Status check nop; finished at %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ed }
            r2[r5] = r1     // Catch:{ all -> 0x00ed }
            defpackage.ngz.c(r9, r10, r2)     // Catch:{ all -> 0x00ed }
            com.google.android.gms.common.api.Status r9 = r8.l     // Catch:{ all -> 0x00ed }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r9
        L_0x0026:
            java.util.List r1 = r8.k     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x002c
            goto L_0x00d9
        L_0x002c:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ed }
        L_0x0030:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ed }
            aorr r2 = (defpackage.aorr) r2     // Catch:{ all -> 0x00ed }
            boolean r2 = r2.isCancelled()     // Catch:{ all -> 0x00ed }
            if (r2 != 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r8.i
            nfw r1 = r8.j
            com.google.android.gms.common.api.Status r0 = r10.a((java.lang.String) r0, (defpackage.nfw) r1)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r8.i
            r1[r5] = r2
            r1[r4] = r0
            com.google.android.gms.common.api.Status r2 = r8.l
            r6 = 2
            r1[r6] = r2
            java.lang.String r2 = "FontFetch"
            java.lang.String r7 = "Check status of %s: is %s, previous %s"
            defpackage.ngz.c(r2, r7, r1)
            int r1 = r0.i
            if (r1 == 0) goto L_0x0088
            if (r1 == r3) goto L_0x0087
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r1 = r8.i
            r9[r5] = r1
            r9[r4] = r0
            java.lang.String r1 = "FontFetch"
            java.lang.String r2 = "%s %s; declaring failure"
            defpackage.ngz.a(r1, r2, r9)
            boolean r9 = r0.c()
            if (r9 == 0) goto L_0x007e
            com.google.android.gms.common.api.Status r0 = a
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            com.google.android.gms.fonts.FontFetchResult r9 = com.google.android.gms.fonts.FontFetchResult.a(r0)
            r8.a((defpackage.ngo) r10, (com.google.android.gms.fonts.FontFetchResult) r9)
            goto L_0x00ce
        L_0x0087:
            goto L_0x00ce
        L_0x0088:
            nfw r1 = r8.j
            java.lang.String r1 = r1.b
            java.io.File r1 = r10.a(r1)
            nhl r2 = r8.d     // Catch:{ IllegalStateException -> 0x00b3 }
            nfz r3 = r2.b     // Catch:{ IllegalStateException -> 0x00b3 }
            nfy r2 = r2.c     // Catch:{ IllegalStateException -> 0x00b3 }
            java.io.File r9 = r9.a((java.io.File) r1, (defpackage.nfz) r3, (defpackage.nfy) r2)     // Catch:{ IllegalStateException -> 0x00b3 }
            nhl r1 = r8.d     // Catch:{ IllegalStateException -> 0x00b3 }
            nfz r2 = r1.b     // Catch:{ IllegalStateException -> 0x00b3 }
            nfy r1 = r1.c     // Catch:{ IllegalStateException -> 0x00b3 }
            com.google.android.gms.fonts.FontMatchSpec r1 = a((defpackage.nfz) r2, (defpackage.nfy) r1)     // Catch:{ IllegalStateException -> 0x00b3 }
            com.google.android.gms.fonts.FontFetchResult r9 = com.google.android.gms.fonts.FontFetchResult.a(r1, r9)     // Catch:{ IllegalStateException -> 0x00b3 }
            if (r9 != 0) goto L_0x00cb
            com.google.android.gms.common.api.Status r9 = a
            com.google.android.gms.fonts.FontFetchResult r9 = com.google.android.gms.fonts.FontFetchResult.a(r9)
            goto L_0x00cb
        L_0x00b1:
            r9 = move-exception
            goto L_0x00cf
        L_0x00b3:
            r9 = move-exception
            java.lang.String r1 = "FontFetch"
            java.lang.String r2 = "Disk encountered an error taking font."
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x00b1 }
            defpackage.ngz.a((java.lang.String) r1, (java.lang.Throwable) r9, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00b1 }
            boolean r9 = r0.c()     // Catch:{ all -> 0x00b1 }
            if (r9 == 0) goto L_0x00c6
            com.google.android.gms.common.api.Status r0 = a     // Catch:{ all -> 0x00b1 }
            goto L_0x00c7
        L_0x00c6:
        L_0x00c7:
            com.google.android.gms.fonts.FontFetchResult r9 = com.google.android.gms.fonts.FontFetchResult.a(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00cb:
            r8.a((defpackage.ngo) r10, (com.google.android.gms.fonts.FontFetchResult) r9)
        L_0x00ce:
            return r0
        L_0x00cf:
            com.google.android.gms.common.api.Status r0 = a
            com.google.android.gms.fonts.FontFetchResult r0 = com.google.android.gms.fonts.FontFetchResult.a(r0)
            r8.a((defpackage.ngo) r10, (com.google.android.gms.fonts.FontFetchResult) r0)
            throw r9
        L_0x00d9:
            java.lang.String r9 = "FontFetch"
            java.lang.String r10 = "Nobody is waiting for %s, fail checkStatus"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = r8.i     // Catch:{ all -> 0x00ed }
            r1[r5] = r2     // Catch:{ all -> 0x00ed }
            defpackage.ngz.c(r9, r10, r1)     // Catch:{ all -> 0x00ed }
            r9 = 0
            r8.k = r9     // Catch:{ all -> 0x00ed }
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x00ed }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r9
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00f1
        L_0x00f0:
            throw r9
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhc.a(ngm, ngo):com.google.android.gms.common.api.Status");
    }

    public final void a() {
        synchronized (this.b) {
            this.f++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r5.h.a(r5);
        r1 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r5.k;
        r5.k = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r1 = r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r3 >= r1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        ((defpackage.aosh) r0.get(r3)).b((java.lang.Object) r6);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.fonts.FontFetchResult r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            amsn r1 = r5.m     // Catch:{ all -> 0x004d }
            boolean r2 = r1.a     // Catch:{ all -> 0x004d }
            r3 = 0
            if (r2 != 0) goto L_0x001f
            java.lang.String r6 = "FontFetch"
            java.lang.String r1 = "End fetch nop; %s already ended with status %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x004d }
            com.google.android.gms.fonts.FontMatchSpec r4 = r5.c     // Catch:{ all -> 0x004d }
            r2[r3] = r4     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.Status r3 = r5.l     // Catch:{ all -> 0x004d }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x004d }
            defpackage.ngz.c(r6, r1, r2)     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x001f:
            r1.e()     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.Status r1 = r6.b     // Catch:{ all -> 0x004d }
            r5.l = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            nhf r0 = r5.h
            r0.a((defpackage.nhc) r5)
            java.lang.Object r1 = r5.b
            monitor-enter(r1)
            java.util.List r0 = r5.k     // Catch:{ all -> 0x004a }
            r2 = 0
            r5.k = r2     // Catch:{ all -> 0x004a }
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0049
            int r1 = r0.size()
        L_0x003b:
            if (r3 >= r1) goto L_0x0049
            java.lang.Object r2 = r0.get(r3)
            aosh r2 = (defpackage.aosh) r2
            r2.b((java.lang.Object) r6)
            int r3 = r3 + 1
            goto L_0x003b
        L_0x0049:
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            throw r6
        L_0x004d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x0050:
            throw r6
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhc.a(com.google.android.gms.fonts.FontFetchResult):void");
    }

    public final boolean a(aosh aosh) {
        iva.a((Object) aosh, (Object) "pendingResult");
        synchronized (this.b) {
            List list = this.k;
            if (list == null) {
                return false;
            }
            list.add(aosh);
            return true;
        }
    }
}
