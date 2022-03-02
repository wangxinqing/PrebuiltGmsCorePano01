package defpackage;

import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: aczy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aczy {
    public final UdcCacheResponse.UdcSetting a;
    public final boolean b;
    public final int c;

    public aczy(atwg atwg) {
        int i;
        int a2 = adht.a(atwg.b);
        if (!atwg.c) {
            i = 3;
        } else {
            i = 2;
        }
        this.a = aczz.a(a2, i, true);
        this.b = atwg.e;
        this.c = adht.a(atwg.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if ((r6 == null ? defpackage.atyq.e : r6).b != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aczy(defpackage.atyt r6) {
        /*
            r5 = this;
            r5.<init>()
            int r0 = r6.b
            int r1 = r6.d
            int r1 = defpackage.atzq.a(r1)
            r2 = 1
            if (r1 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            int r1 = r1 + -1
            int r3 = r6.a
            r3 = r3 & 8
            r4 = 0
            if (r3 == 0) goto L_0x0025
            atyq r3 = r6.e
            if (r3 != 0) goto L_0x001f
            atyq r3 = defpackage.atyq.e
        L_0x001f:
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            com.google.android.gms.udc.UdcCacheResponse$UdcSetting r0 = defpackage.aczz.a(r0, r1, r3)
            r5.a = r0
            int r0 = r6.b
            r5.c = r0
            int r0 = r6.a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0041
            atyq r6 = r6.e
            if (r6 != 0) goto L_0x003c
            atyq r6 = defpackage.atyq.e
        L_0x003c:
            boolean r6 = r6.b
            if (r6 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczy.<init>(atyt):void");
    }
}
