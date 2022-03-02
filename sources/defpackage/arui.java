package defpackage;

/* renamed from: arui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arui {
    public final aruk a = new aruk();
    private final aruk b = new aruk();
    private final aruk c = new aruk();
    private final aruk d = new aruk();
    private final aruk e = new aruk();
    private final aruk f = new aruk();
    private final arug g = new arug();
    private final arug h = new arug();
    private final aruk i = new aruk();

    private static final void a(aruk aruk, double d2, double d3, arug arug) {
        aruk aruk2 = aruk;
        arug arug2 = arug;
        double d4 = aruk2.a;
        double d5 = d4 * d4;
        double d6 = aruk2.b;
        double d7 = d6 * d6;
        double d8 = aruk2.c;
        double d9 = d8 * d8;
        arug2.a(0, 0, 1.0d - ((d7 + d9) * d3));
        arug2.a(1, 1, 1.0d - ((d9 + d5) * d3));
        arug2.a(2, 2, 1.0d - ((d5 + d7) * d3));
        double d10 = aruk2.c * d2;
        double d11 = aruk2.a * aruk2.b * d3;
        arug2.a(0, 1, d11 - d10);
        arug2.a(1, 0, d11 + d10);
        double d12 = aruk2.b * d2;
        double d13 = aruk2.a * aruk2.c * d3;
        arug2.a(0, 2, d13 + d12);
        arug2.a(2, 0, d13 - d12);
        double d14 = aruk2.a * d2;
        double d15 = aruk2.b * aruk2.c * d3;
        arug2.a(1, 2, d15 - d14);
        arug2.a(2, 1, d15 + d14);
    }

    public static final void a(aruk aruk, arug arug) {
        double d2;
        double d3;
        double a2 = aruk.a(aruk, aruk);
        double sqrt = Math.sqrt(a2);
        if (a2 < 1.0E-8d) {
            d2 = 0.5d;
            d3 = 1.0d - (a2 * 0.1666666716337204d);
        } else if (a2 >= 1.0E-6d) {
            double d4 = 1.0d / sqrt;
            double sin = Math.sin(sqrt) * d4;
            double cos = (1.0d - Math.cos(sqrt)) * d4 * d4;
            d3 = sin;
            d2 = cos;
        } else {
            double d5 = 0.5d - (0.0416666679084301d * a2);
            double d6 = a2 * 0.1666666716337204d;
            d2 = d5;
            d3 = 1.0d - (d6 * (1.0d - d6));
        }
        a(aruk, d3, d2, arug);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r1 > r8) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aruk r11, defpackage.aruk r12, defpackage.arug r13) {
        /*
            r10 = this;
            double r0 = r11.c()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x010a
            double r0 = r12.c()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0014
            goto L_0x010a
        L_0x0014:
            aruk r0 = r10.d
            r0.a((defpackage.aruk) r11)
            aruk r0 = r10.e
            r0.a((defpackage.aruk) r12)
            aruk r12 = r10.d
            r12.b()
            aruk r12 = r10.e
            r12.b()
            aruk r12 = r10.d
            aruk r0 = r10.e
            aruk r1 = r10.c
            defpackage.aruk.a((defpackage.aruk) r12, (defpackage.aruk) r0, (defpackage.aruk) r1)
            aruk r12 = r10.c
            double r0 = r12.c()
            r4 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            r12 = 0
            r6 = 1
            r7 = 2
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x00af
            aruk r0 = r10.d
            aruk r1 = r10.e
            double r0 = defpackage.aruk.a((defpackage.aruk) r0, (defpackage.aruk) r1)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0053
            r13.b()
            return
        L_0x0053:
            aruk r0 = r10.f
            double r1 = r11.a
            double r1 = java.lang.Math.abs(r1)
            double r3 = r11.b
            double r3 = java.lang.Math.abs(r3)
            double r8 = r11.c
            double r8 = java.lang.Math.abs(r8)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0071
            int r12 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0076
            r12 = 1
            goto L_0x0077
        L_0x0071:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r12 = 2
        L_0x0077:
            int r12 = r12 + -1
            if (r12 >= 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r7 = r12
        L_0x007d:
            r0.a()
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.a((int) r7, (double) r1)
            defpackage.aruk.a((defpackage.aruk) r11, (defpackage.aruk) r0, (defpackage.aruk) r0)
            r0.b()
            aruk r11 = r10.f
            aruk r12 = r10.i
            r12.a((defpackage.aruk) r11)
            aruk r11 = r10.i
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r11.c()
            double r0 = r0 / r2
            r11.a((double) r0)
            aruk r2 = r10.i
            r3 = 0
            r5 = 4596468981008877345(0x3fc9f02f6222c721, double:0.20264236728467558)
            r7 = r13
            a(r2, r3, r5, r7)
            return
        L_0x00af:
            aruk r11 = r10.c
            r11.b()
            arug r11 = r10.g
            aruk r0 = r10.d
            r11.a((int) r12, (defpackage.aruk) r0)
            aruk r0 = r10.c
            r11.a((int) r6, (defpackage.aruk) r0)
            aruk r0 = r10.c
            aruk r1 = r10.d
            aruk r2 = r10.b
            defpackage.aruk.a((defpackage.aruk) r0, (defpackage.aruk) r1, (defpackage.aruk) r2)
            aruk r0 = r10.b
            r11.a((int) r7, (defpackage.aruk) r0)
            arug r0 = r10.h
            aruk r1 = r10.e
            r0.a((int) r12, (defpackage.aruk) r1)
            aruk r12 = r10.c
            r0.a((int) r6, (defpackage.aruk) r12)
            aruk r12 = r10.c
            aruk r1 = r10.e
            aruk r2 = r10.b
            defpackage.aruk.a((defpackage.aruk) r12, (defpackage.aruk) r1, (defpackage.aruk) r2)
            aruk r12 = r10.b
            r0.a((int) r7, (defpackage.aruk) r12)
            double[] r12 = r11.a
            r1 = r12[r6]
            r3 = 3
            r4 = r12[r3]
            r12[r6] = r4
            r12[r3] = r1
            r1 = r12[r7]
            r3 = 6
            r4 = r12[r3]
            r12[r7] = r4
            r12[r3] = r1
            r1 = 5
            r2 = r12[r1]
            r4 = 7
            r5 = r12[r4]
            r12[r1] = r5
            r12[r4] = r2
            defpackage.arug.b(r0, r11, r13)
            return
        L_0x010a:
            r13.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arui.a(aruk, aruk, arug):void");
    }
}
