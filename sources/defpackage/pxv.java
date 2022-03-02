package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: pxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxv extends amvu implements pws {
    private final Iterator a;
    private final ParcelFileDescriptor b;
    private final pxt c;
    private final pxf d;

    public pxv(Iterator it, ParcelFileDescriptor parcelFileDescriptor, pxt pxt, pxf pxf) {
        this.a = it;
        this.b = parcelFileDescriptor;
        this.c = pxt;
        this.d = pxf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.Set} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0102 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.Iterator r0 = r9.a
            boolean r0 = r0.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0122
            java.util.Iterator r0 = r9.a
            java.lang.Object r0 = r0.next()
            ovc r0 = (defpackage.ovc) r0
            pxt r2 = r9.c
            java.lang.String r3 = r0.b
            java.lang.String r4 = r0.d
            long r5 = r0.c
            boolean r5 = r2.a(r3, r5)
            if (r5 != 0) goto L_0x0025
            java.lang.String r0 = "Invalid usage report: reporting package installed after report -- %s"
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r3)
            goto L_0x0000
        L_0x0025:
            long r5 = r0.c
            boolean r5 = r2.a(r4, r5)
            if (r5 == 0) goto L_0x011a
            int r5 = r0.h
            ovg r5 = defpackage.ovg.a(r5)
            if (r5 != 0) goto L_0x0037
            ovg r5 = defpackage.ovg.GENERAL_USE
        L_0x0037:
            ovg r6 = defpackage.ovg.GLOBAL_SEARCH_USE
            if (r5 != r6) goto L_0x0057
            ozc r2 = r2.a(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0047
            goto L_0x0057
        L_0x0047:
            int r0 = r0.h
            ovg r0 = defpackage.ovg.a(r0)
            if (r0 != 0) goto L_0x0051
            ovg r0 = defpackage.ovg.GENERAL_USE
        L_0x0051:
            java.lang.String r1 = "Illegal usage type: %s from %s"
            defpackage.oso.e(r1, r0, r3)
            goto L_0x0000
        L_0x0057:
            java.lang.String r2 = r0.e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x007a
            boolean r2 = r3.equals(r4)
            if (r2 == 0) goto L_0x0073
            int r2 = r0.a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x006c
            goto L_0x007a
        L_0x006c:
            java.lang.String r0 = "Invalid usage report: no corpus name and no document -- %s"
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r3)
            goto L_0x0000
        L_0x0073:
            java.lang.String r0 = "Invalid usage report: pkg name mismatch -- caller %s vs %s"
            defpackage.oso.e(r0, r3, r4)
            goto L_0x0000
        L_0x007a:
            java.lang.String r2 = r0.e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0092
            pxu r2 = new pxu
            pxt r3 = r9.c
            java.lang.String r4 = r0.b
            ozc r3 = r3.a(r4)
            r2.<init>(r0, r1, r3)
            r1 = r2
            goto L_0x0125
        L_0x0092:
            pxt r2 = r9.c
            pxf r3 = r9.d
            pao r4 = new pao
            java.lang.String r5 = r0.d
            java.lang.String r6 = r0.e
            r4.<init>(r5, r6)
            java.lang.String r5 = r0.b
            java.util.Map r6 = r2.b
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L_0x00c1
            ozc r6 = r2.a(r5)
            if (r6 != 0) goto L_0x00b4
            java.util.Set r6 = java.util.Collections.emptySet()
            goto L_0x00bb
        L_0x00b4:
            ozs r7 = r2.c
            r8 = 1
            java.util.Set r6 = r7.a(r6, r1, r8, r1)
        L_0x00bb:
            java.util.Map r7 = r2.b
            r7.put(r5, r6)
            goto L_0x00ca
        L_0x00c1:
            java.util.Map r6 = r2.b
            java.lang.Object r5 = r6.get(r5)
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
        L_0x00ca:
            boolean r5 = r6.contains(r4)
            if (r5 != 0) goto L_0x00f1
            java.lang.String r5 = r0.d
            java.lang.String r6 = "com.google.android.gms"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00ea
            java.lang.String r5 = r0.b     // Catch:{ pxe -> 0x00e2 }
            java.lang.String r6 = r0.e     // Catch:{ pxe -> 0x00e2 }
            r3.a(r5, r6)     // Catch:{ pxe -> 0x00e2 }
            goto L_0x00f1
        L_0x00e2:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            defpackage.oso.e(r2)
        L_0x00ea:
            java.lang.String r2 = "Invalid usage report: no access"
            defpackage.oso.e(r2)
            goto L_0x0100
        L_0x00f1:
            ozs r2 = r2.c
            osz r2 = r2.d(r4)
            if (r2 != 0) goto L_0x00ff
            java.lang.String r2 = "Invalid usage report: missing config"
            defpackage.oso.e(r2)
            goto L_0x0100
        L_0x00ff:
            r1 = r2
        L_0x0100:
            if (r1 == 0) goto L_0x0111
            pxu r2 = new pxu
            pxt r3 = r9.c
            java.lang.String r4 = r0.b
            ozc r3 = r3.a(r4)
            r2.<init>(r0, r1, r3)
            r1 = r2
            goto L_0x0125
        L_0x0111:
            java.lang.String r0 = r0.b
            java.lang.String r1 = "UsageReport from %s ignored -- corpus not found"
            defpackage.oso.e((java.lang.String) r1, (java.lang.Object) r0)
            goto L_0x0000
        L_0x011a:
            java.lang.String r0 = "Invalid usage report: doc package installed after report -- %s"
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r4)
            goto L_0x0000
        L_0x0122:
            r9.d()
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxv.a():java.lang.Object");
    }

    public final void close() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                oso.b("Failed to close file descriptor.");
            }
        }
        pxt pxt = this.c;
        pxt.a.clear();
        pxt.b.clear();
    }
}
