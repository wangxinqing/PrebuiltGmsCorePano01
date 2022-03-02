package defpackage;

/* renamed from: ahcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcg implements agzr {
    private ahcg() {
    }

    public static ahcg a() {
        return new ahcg();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.agzq r7) {
        /*
            r6 = this;
            java.io.InputStream r0 = defpackage.ahcj.b(r7)
            boolean r1 = r0 instanceof defpackage.ahbn     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0010
            r1 = r0
            ahbn r1 = (defpackage.ahbn) r1     // Catch:{ all -> 0x004a }
            java.lang.Long r1 = r1.a()     // Catch:{ all -> 0x004a }
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r1 != 0) goto L_0x002d
            boolean r2 = r7.a()     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x002d
            agzs r2 = r7.a     // Catch:{ ahbp -> 0x002c }
            android.net.Uri r7 = r7.e     // Catch:{ ahbp -> 0x002c }
            long r2 = r2.e(r7)     // Catch:{ ahbp -> 0x002c }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x002d
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ ahbp -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r7 = move-exception
        L_0x002d:
            if (r1 == 0) goto L_0x0042
            long r1 = r1.longValue()     // Catch:{ all -> 0x004a }
            int r7 = defpackage.aoog.a((long) r1)     // Catch:{ all -> 0x004a }
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x004a }
            defpackage.anmr.a((java.io.InputStream) r0, (byte[]) r7)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0049
        L_0x003e:
            r0.close()
            return r7
        L_0x0042:
            byte[] r7 = defpackage.anmr.a((java.io.InputStream) r0)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0049
            goto L_0x003e
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r0)
        L_0x0055:
            goto L_0x0057
        L_0x0056:
            throw r7
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahcg.a(agzq):java.lang.Object");
    }
}
