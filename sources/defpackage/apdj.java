package defpackage;

import java.util.Map;

/* renamed from: apdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apdj extends apek {
    private final int a;
    private final int b;
    private final int c;
    private final apef d;
    private final Map e;
    private final int f;
    private final apel g;
    private final int h;

    public apdj(int i, int i2, int i3, apef apef, Map map, int i4, apel apel, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = apef;
        this.e = map;
        this.f = i4;
        this.g = apel;
        this.h = i5;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final apef d() {
        return this.d;
    }

    public final Map e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r1 = r4.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0062
            boolean r1 = r5 instanceof defpackage.apek
            r2 = 0
            if (r1 == 0) goto L_0x0061
            apek r5 = (defpackage.apek) r5
            int r1 = r4.a
            int r3 = r5.a()
            if (r1 != r3) goto L_0x0061
            int r1 = r4.b
            int r3 = r5.b()
            if (r1 != r3) goto L_0x0061
            int r1 = r4.c
            int r3 = r5.c()
            if (r1 != r3) goto L_0x0061
            apef r1 = r4.d
            if (r1 == 0) goto L_0x0031
            apef r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0031:
            apef r1 = r5.d()
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            goto L_0x0061
        L_0x0038:
            java.util.Map r1 = r4.e
            java.util.Map r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            int r1 = r4.f
            int r3 = r5.f()
            if (r1 != r3) goto L_0x0061
            apel r1 = r4.g
            apel r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            int r1 = r4.h
            int r5 = r5.h()
            if (r1 != r5) goto L_0x0061
            return r0
        L_0x0061:
            return r2
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apdj.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f;
    }

    public final apel g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        apef apef = this.d;
        if (apef != null) {
            i = apef.hashCode();
        } else {
            i = 0;
        }
        return ((((((((i2 ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }
}
