package defpackage;

/* renamed from: akov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akov {
    public float a;
    public long b = 0;
    public aklx c = new aklx(0.0d, 0.0d, 0.0d);
    public akli d;
    public aklx e = new aklx(0.0d, 0.0d, 0.0d);
    private aklx f;
    private long g = 0;
    private final int[] h = {0, 0, 0, 0};
    private int i = 0;
    private int j = 0;

    public final long a() {
        return this.g - this.b;
    }

    public final boolean b() {
        return this.a == 0.0f;
    }

    public final long c() {
        if (this.f != null) {
            return this.g;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.akln r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            akli r2 = r0.d
            if (r2 == 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            akli r2 = new akli
            r2.<init>()
            r0.d = r2
        L_0x0010:
            aklr r2 = r1.a
            aklx r2 = defpackage.aklx.a(r2)
            aklr r3 = r1.a
            int r4 = r3.e
            long r5 = r3.f
            boolean r3 = r19.b()
            if (r3 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0.b = r5
        L_0x0025:
            float r3 = defpackage.akot.a((int) r4)
            float r7 = r0.a
            float r7 = r7 + r3
            r0.a = r7
            int[] r7 = r0.h
            r8 = r7[r4]
            r9 = 1
            int r8 = r8 + r9
            r7[r4] = r8
            aklx r4 = r0.c
            aklx r4 = defpackage.aklx.b((defpackage.aklx) r2, (defpackage.aklx) r4)
            double r7 = (double) r3
            aklx r3 = defpackage.aklx.a((defpackage.aklx) r4, (double) r7)
            aklx r4 = r0.c
            float r7 = r0.a
            double r7 = (double) r7
            aklx r7 = defpackage.aklx.b((defpackage.aklx) r3, (double) r7)
            aklx r4 = defpackage.aklx.a((defpackage.aklx) r4, (defpackage.aklx) r7)
            r0.c = r4
            aklx r7 = r0.e
            aklx r4 = defpackage.aklx.b((defpackage.aklx) r2, (defpackage.aklx) r4)
            aklx r3 = defpackage.aklx.c(r3, r4)
            aklx r3 = defpackage.aklx.a((defpackage.aklx) r7, (defpackage.aklx) r3)
            r0.e = r3
            r0.f = r2
            r0.g = r5
            int r2 = r0.i
            int r2 = r2 + r9
            r0.i = r2
            int r3 = r0.j
            aklr r4 = r1.a
            int r4 = r4.c
            int r4 = r4 - r3
            int r4 = r4 / r2
            int r3 = r3 + r4
            r0.j = r3
            akli r2 = r0.d
            r3 = 0
            r4 = 1
            r5 = 0
        L_0x0079:
            int[] r6 = r0.h
            int r7 = r6.length
            if (r4 >= r7) goto L_0x0089
            r7 = r6[r4]
            r6 = r6[r5]
            if (r7 > r6) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            int r4 = r4 + 1
            goto L_0x0079
        L_0x0089:
            if (r5 == r9) goto L_0x009b
            r4 = 2
            if (r5 == r4) goto L_0x0098
            r4 = 3
            if (r5 == r4) goto L_0x0095
            java.lang.String r4 = "unknown"
            r15 = r4
            goto L_0x009e
        L_0x0095:
            java.lang.String r4 = "wifi"
            goto L_0x009d
        L_0x0098:
            java.lang.String r4 = "cell"
            goto L_0x009d
        L_0x009b:
            java.lang.String r4 = "gps"
        L_0x009d:
            r15 = r4
        L_0x009e:
            aklr r4 = new aklr
            aklx r5 = r0.c
            aklr r5 = r5.a()
            int r11 = r5.a
            aklx r5 = r0.c
            aklr r5 = r5.a()
            int r12 = r5.b
            int r13 = r0.j
            r14 = 2143289344(0x7fc00000, float:NaN)
            long r5 = r0.g
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = r4
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r18)
            aklt r5 = r2.a
            akoh r6 = r1.b
            if (r6 == 0) goto L_0x0147
            r7 = 0
            r5.d = r7
            ob r7 = new ob
            r7.<init>()
            int r8 = r5.b
            int r8 = r8 + r9
            r5.b = r8
            r8 = 0
        L_0x00d2:
            int r10 = r6.a()
            r11 = -1024458752(0xffffffffc2f00000, float:-120.0)
            if (r8 >= r10) goto L_0x0111
            akog r10 = r6.a(r8)
            r7.add(r10)
            ou r12 = r5.a
            boolean r12 = r12.containsKey(r10)
            if (r12 == 0) goto L_0x00f6
            ou r11 = r5.a
            java.lang.Object r11 = r11.get(r10)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            akog r12 = r6.a(r8)
            int r12 = r12.d
            int r13 = r5.b
            ou r14 = r5.a
            byte r12 = (byte) r12
            float r12 = (float) r12
            float r12 = r12 - r11
            float r13 = (float) r13
            float r12 = r12 / r13
            float r11 = r11 + r12
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r14.put(r10, r11)
            int r8 = r8 + 1
            goto L_0x00d2
        L_0x0111:
            long r12 = r6.a
            r5.c = r12
            r6 = 0
        L_0x0116:
            ou r8 = r5.a
            int r10 = r8.h
            if (r6 >= r10) goto L_0x0147
            java.lang.Object r8 = r8.b((int) r6)
            akog r8 = (defpackage.akog) r8
            boolean r10 = r7.contains(r8)
            if (r10 != 0) goto L_0x0144
            ou r10 = r5.a
            java.lang.Object r10 = r10.c(r6)
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            int r12 = r5.b
            ou r13 = r5.a
            float r14 = r11 - r10
            float r12 = (float) r12
            float r14 = r14 / r12
            float r10 = r10 + r14
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r13.put(r8, r10)
        L_0x0144:
            int r6 = r6 + 1
            goto L_0x0116
        L_0x0147:
            r2.b = r4
            aklk r4 = r1.c
            r2.c = r4
            boolean r4 = r2.d
            if (r4 != 0) goto L_0x0156
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x0156
            r9 = 0
        L_0x0156:
            r2.d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akov.a(akln):void");
    }
}
