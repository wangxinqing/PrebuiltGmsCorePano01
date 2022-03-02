package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bald  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bald implements azxm {
    final AtomicReference a = new AtomicReference();
    public volatile boolean b;

    static {
        azxg.a("internal-retry-policy");
        azxg.a("internal-hedging-policy");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: bajl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.azxl a(defpackage.baaj r5, defpackage.azxh r6, defpackage.azxi r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.a
            java.lang.Object r0 = r0.get()
            bajm r0 = (defpackage.bajm) r0
            if (r0 == 0) goto L_0x0015
            java.util.Map r1 = r0.a
            java.lang.String r2 = r5.b
            java.lang.Object r1 = r1.get(r2)
            bajl r1 = (defpackage.bajl) r1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 == 0) goto L_0x0019
            goto L_0x0026
        L_0x0019:
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = r5.c
            java.util.Map r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            bajl r1 = (defpackage.bajl) r1
        L_0x0026:
            if (r1 == 0) goto L_0x00b3
            java.lang.Long r0 = r1.a
            if (r0 == 0) goto L_0x0045
            long r2 = r0.longValue()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            azyf r0 = defpackage.azyf.a(r2, r0)
            azyf r2 = r6.b
            if (r2 == 0) goto L_0x0041
            int r2 = r0.compareTo((defpackage.azyf) r2)
            if (r2 < 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            azxh r6 = r6.a((defpackage.azyf) r0)
        L_0x0045:
            java.lang.Boolean r0 = r1.b
            if (r0 != 0) goto L_0x004a
            goto L_0x0065
        L_0x004a:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005b
            azxh r0 = new azxh
            r0.<init>(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.g = r6
            r6 = r0
            goto L_0x0065
        L_0x005b:
            azxh r0 = new azxh
            r0.<init>(r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0.g = r6
            r6 = r0
        L_0x0065:
            java.lang.Integer r0 = r1.c
            if (r0 != 0) goto L_0x006a
            goto L_0x0089
        L_0x006a:
            java.lang.Integer r2 = r6.h
            if (r2 != 0) goto L_0x0077
            int r0 = r0.intValue()
            azxh r6 = r6.a((int) r0)
            goto L_0x0089
        L_0x0077:
            int r0 = r2.intValue()
            java.lang.Integer r2 = r1.c
            int r2 = r2.intValue()
            int r0 = java.lang.Math.min(r0, r2)
            azxh r6 = r6.a((int) r0)
        L_0x0089:
            java.lang.Integer r0 = r1.d
            if (r0 == 0) goto L_0x00ad
            java.lang.Integer r2 = r6.i
            if (r2 != 0) goto L_0x009a
            int r0 = r0.intValue()
            azxh r6 = r6.b(r0)
            goto L_0x00ae
        L_0x009a:
            int r0 = r2.intValue()
            java.lang.Integer r1 = r1.d
            int r1 = r1.intValue()
            int r0 = java.lang.Math.min(r0, r1)
            azxh r6 = r6.b(r0)
            goto L_0x00ae
        L_0x00ad:
        L_0x00ae:
            azxl r5 = r7.a(r5, r6)
            return r5
        L_0x00b3:
            azxl r5 = r7.a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bald.a(baaj, azxh, azxi):azxl");
    }
}
