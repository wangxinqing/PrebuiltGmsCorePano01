package defpackage;

/* renamed from: pxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxr {
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.util.Collection r4) {
        /*
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0017
            java.lang.Object r3 = r4.get(r2)
            oqy r3 = (defpackage.oqy) r3
            int r3 = r3.e
            int r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxr.a(java.util.Collection):int");
    }

    public static ouk a(osz osz, int i, oqy oqy, int i2, boolean z) {
        double d = (double) oqy.e;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        if (!z && d3 == 1.0d) {
            return null;
        }
        aucd o = ouk.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ouk ouk = (ouk) o.b;
        int i3 = ouk.a | 2;
        ouk.a = i3;
        ouk.c = i;
        int i4 = osz.b;
        int i5 = i3 | 1;
        ouk.a = i5;
        ouk.b = i4;
        ouk.a = i5 | 4;
        ouk.d = d3;
        return (ouk) o.i();
    }
}
