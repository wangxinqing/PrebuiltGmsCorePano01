package defpackage;

import android.content.Context;

/* renamed from: kiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kiu extends kit {
    private static final ith h = new ith("FileContentDownloadTask", "");
    private final khx i;
    private final kkf j;
    private final kix k;
    private final knc l;
    private final String m;
    private final long n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kiu(kin kin, khq khq, String str, Context context, khw khw, khx khx, kkf kkf, kix kix, kmp kmp, lht lht) {
        super(kin, khq, str, context, khw, lht);
        this.i = khx;
        this.j = kkf;
        this.k = kix;
        this.l = kmp.a();
        this.m = kmp.l();
        this.n = kmp.s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        h.c("FileContentDownloadTask", java.lang.String.format("Error downloading: %s", new java.lang.Object[]{r14}), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r14.d.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        h.c("FileContentDownloadTask", java.lang.String.format("No longer authorized: %s", new java.lang.Object[]{r14}), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r0 = r14.d;
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        h.c("FileContentDownloadTask", java.lang.String.format("Download interrupted: %s", new java.lang.Object[]{r14}), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        h.a("FileContentDownloadTask", "File is no longer available or permission was denied: %s", r14.l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0112, code lost:
        r14.d.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
        r14.d.a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080 A[ExcHandler: IOException (r1v11 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[ExcHandler: eif (r1v7 'e' eif A[CUSTOM_DECLARE]), Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de A[Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0104 A[ExcHandler: kcs (e kcs), Splitter:B:1:0x000e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00d6=Splitter:B:41:0x00d6, B:27:0x009b=Splitter:B:27:0x009b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r14 = this;
            java.lang.String r0 = "FileContentDownloadTask"
            kin r1 = r14.d
            r2 = 1
            r1.a((int) r2)
            r1 = 6
            r3 = 8
            r4 = 5
            r5 = 0
            r6 = 0
            kkf r7 = r14.j     // Catch:{ kcs -> 0x0104, lhp -> 0x00d2, eif -> 0x00be, kio -> 0x0097, IOException -> 0x0080 }
            khq r8 = r14.c     // Catch:{ kcs -> 0x0104, lhp -> 0x00d2, eif -> 0x00be, kio -> 0x0097, IOException -> 0x0080 }
            knc r9 = r14.l     // Catch:{ kcs -> 0x0104, lhp -> 0x00d2, eif -> 0x00be, kio -> 0x0097, IOException -> 0x0080 }
            kmp r7 = r7.a((defpackage.khq) r8, (defpackage.knc) r9)     // Catch:{ kcs -> 0x0104, lhp -> 0x00d2, eif -> 0x00be, kio -> 0x0097, IOException -> 0x0080 }
            khx r8 = r14.i     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            boolean r8 = r8.a((defpackage.kmp) r7)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            if (r8 != 0) goto L_0x0072
            kix r8 = r14.k     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            knc r9 = r14.l     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            java.lang.String r10 = r14.m     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            android.util.LruCache r8 = r8.b     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            kiw r8 = (defpackage.kiw) r8     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            if (r8 == 0) goto L_0x003b
            java.lang.String r9 = r8.b     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            boolean r9 = defpackage.ius.a(r9, r10)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            if (r9 == 0) goto L_0x003b
            kie r5 = r8.a     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            kie r5 = r14.a((defpackage.kie) r5)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            kia r8 = new kia     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            kkf r9 = r14.j     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            khq r10 = r14.c     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            knc r11 = r14.l     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            java.lang.String r12 = r14.m     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            r8.<init>(r9, r10, r11, r12)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            r5.a(r8)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            kix r5 = r14.k     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            knc r8 = r14.l     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            java.lang.String r9 = r14.m     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            android.util.LruCache r10 = r5.b     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            java.lang.Object r10 = r10.get(r8)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            kiw r10 = (defpackage.kiw) r10     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            java.lang.String r10 = r10.b     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            boolean r9 = defpackage.ius.a(r10, r9)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            if (r9 == 0) goto L_0x006b
            android.util.LruCache r5 = r5.b     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
            r5.remove(r8)     // Catch:{ kcs -> 0x0104, lhp -> 0x007b, eif -> 0x00be, kio -> 0x0079, IOException -> 0x0080 }
        L_0x006b:
            kin r0 = r14.d
            r1 = 2
            r0.a((int) r1)
            return r2
        L_0x0072:
            kin r0 = r14.d
            r1 = 3
            r0.a((int) r1)
            return r2
        L_0x0079:
            r5 = move-exception
            goto L_0x009b
        L_0x007b:
            r5 = move-exception
            goto L_0x00d6
        L_0x007d:
            r0 = move-exception
            goto L_0x0118
        L_0x0080:
            r1 = move-exception
            ith r3 = h     // Catch:{ all -> 0x007d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
            r2[r6] = r14     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "Error downloading: %s"
            java.lang.String r2 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x007d }
            r3.c(r0, r2, r1)     // Catch:{ all -> 0x007d }
            kin r0 = r14.d
            r0.a((int) r4)
            goto L_0x0103
        L_0x0097:
            r7 = move-exception
            r13 = r7
            r7 = r5
            r5 = r13
        L_0x009b:
            ith r8 = h     // Catch:{ all -> 0x007d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
            r2[r6] = r14     // Catch:{ all -> 0x007d }
            java.lang.String r9 = "Error starting a download: %s"
            java.lang.String r2 = java.lang.String.format(r9, r2)     // Catch:{ all -> 0x007d }
            r8.c(r0, r2, r5)     // Catch:{ all -> 0x007d }
            int r0 = defpackage.kit.a((defpackage.kio) r5)     // Catch:{ all -> 0x007d }
            if (r0 == r3) goto L_0x00b1
            goto L_0x00ba
        L_0x00b1:
            if (r7 == 0) goto L_0x00ba
            java.lang.String r2 = r7.q()
            if (r2 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r1 = r0
        L_0x00bb:
            kin r0 = r14.d
            goto L_0x0100
        L_0x00be:
            r1 = move-exception
            ith r3 = h     // Catch:{ all -> 0x007d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
            r2[r6] = r14     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "No longer authorized: %s"
            java.lang.String r2 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x007d }
            r3.c(r0, r2, r1)     // Catch:{ all -> 0x007d }
            kin r0 = r14.d
            r1 = 7
            goto L_0x0100
        L_0x00d2:
            r7 = move-exception
            r13 = r7
            r7 = r5
            r5 = r13
        L_0x00d6:
            lht r8 = r14.e     // Catch:{ all -> 0x007d }
            boolean r8 = r8.e()     // Catch:{ all -> 0x007d }
            if (r8 != 0) goto L_0x00f0
            ith r8 = h     // Catch:{ all -> 0x007d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
            r2[r6] = r14     // Catch:{ all -> 0x007d }
            java.lang.String r9 = "Download interrupted: %s"
            java.lang.String r2 = java.lang.String.format(r9, r2)     // Catch:{ all -> 0x007d }
            r8.c(r0, r2, r5)     // Catch:{ all -> 0x007d }
            r0 = 8
            goto L_0x00f1
        L_0x00f0:
            r0 = 4
        L_0x00f1:
            if (r0 == r3) goto L_0x00f4
            goto L_0x00fd
        L_0x00f4:
            if (r7 == 0) goto L_0x00fd
            java.lang.String r2 = r7.q()
            if (r2 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r1 = r0
        L_0x00fe:
            kin r0 = r14.d
        L_0x0100:
            r0.a((int) r1)
        L_0x0103:
            return r6
        L_0x0104:
            r1 = move-exception
            ith r1 = h     // Catch:{ all -> 0x007d }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
            knc r5 = r14.l     // Catch:{ all -> 0x007d }
            r3[r6] = r5     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "File is no longer available or permission was denied: %s"
            r1.a((java.lang.String) r0, (java.lang.String) r5, (java.lang.Object[]) r3)     // Catch:{ all -> 0x007d }
            kin r0 = r14.d
            r0.a((int) r4)
            return r2
        L_0x0118:
            kin r1 = r14.d
            r1.a((int) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiu.a():boolean");
    }

    public final kie c() {
        kix kix = this.k;
        knc knc = this.l;
        kiw kiw = new kiw(kix.a.a(), this.m);
        kix.b.put(knc, kiw);
        return kiw.a;
    }

    public final long d() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return lru.b(this.m);
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.l.equals(((kiu) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return String.format("FileContentDownloadTask[%s]", new Object[]{this.l});
    }
}
