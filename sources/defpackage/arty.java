package defpackage;

/* renamed from: arty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arty {
    private static final aruk d = new aruk(1.0d, 0.0d);
    private static final aruk e = new aruk(0.0d, 9.80665d);
    private arug A;
    private arug B;
    private arug C;
    private arug D;
    private arug E;
    private aruk F;
    private aruk G;
    private aruk H;
    private arug I;
    private arug J;
    private arug K;
    private aruk L;
    private aruk M;
    private aruk N;
    private aruk O;
    public final float[] a;
    arug b;
    public boolean c;
    private final boolean f;
    private arug g;
    private boolean h;
    private arug i;
    private arug j;
    private arug k;
    private arug l;
    private arug m;
    private arug n;
    private arug o;
    private aruk p;
    private final arui q;
    private aruk r;
    private aruk s;
    private arug t;
    private long u;
    private float v;
    private boolean w;
    private int x;
    private boolean y;
    private arug z;

    public arty() {
        this((byte[]) null);
    }

    private final void a(int i2) {
        char c2;
        int i3 = i2;
        a(this.b, this.p, i3, this.M);
        for (int i4 = 0; i4 < 3; i4++) {
            this.H.a();
            this.H.a(i4, 1.0E-7d);
            arui.a(this.H, this.A);
            arug.b(this.A, this.b, this.B);
            a(this.B, this.p, i3, this.N);
            aruk aruk = this.M;
            aruk aruk2 = this.N;
            this.G.a(aruk.a - aruk2.a, aruk.b - aruk2.b, aruk.c - aruk2.c);
            this.G.a(1.0E7d);
            this.n.a(i4, this.G);
        }
        this.n.b(this.C);
        arug.b(this.i, this.C, this.D);
        arug.b(this.n, this.D, this.E);
        if (i3 == 0) {
            arug.a(this.E, this.l, this.m);
        } else {
            arug.a(this.E, this.k, this.m);
        }
        arug arug = this.m;
        arug arug2 = this.C;
        double a2 = ((arug.a(0, 0) * ((arug.a(1, 1) * arug.a(2, 2)) - (arug.a(2, 1) * arug.a(1, 2)))) - (arug.a(0, 1) * ((arug.a(1, 0) * arug.a(2, 2)) - (arug.a(1, 2) * arug.a(2, 0))))) + (arug.a(0, 2) * ((arug.a(1, 0) * arug.a(2, 1)) - (arug.a(1, 1) * arug.a(2, 0))));
        if (a2 != 0.0d) {
            double d2 = 1.0d / a2;
            double[] dArr = arug.a;
            double d3 = dArr[4];
            double d4 = dArr[8];
            double d5 = dArr[7];
            double d6 = dArr[5];
            double d7 = dArr[1];
            double d8 = dArr[2];
            double d9 = dArr[3];
            double d10 = dArr[6];
            double d11 = dArr[0];
            c2 = 2;
            arug2.a(((d3 * d4) - (d5 * d6)) * d2, (-((d7 * d4) - (d8 * d5))) * d2, ((d7 * d6) - (d8 * d3)) * d2, (-((d9 * d4) - (d6 * d10))) * d2, ((d4 * d11) - (d8 * d10)) * d2, (-((d6 * d11) - (d8 * d9))) * d2, ((d9 * d5) - (d10 * d3)) * d2, (-((d5 * d11) - (d10 * d7))) * d2, d2 * ((d11 * d3) - (d9 * d7)));
        } else {
            c2 = 2;
        }
        this.n.b(this.D);
        arug.b(this.D, this.C, this.E);
        arug.b(this.i, this.E, this.o);
        arug.a(this.o, this.M, this.s);
        arug.b(this.o, this.n, this.C);
        this.D.b();
        arug arug3 = this.D;
        arug arug4 = this.C;
        double[] dArr2 = arug3.a;
        double d12 = dArr2[0];
        double[] dArr3 = arug4.a;
        dArr2[0] = d12 - dArr3[0];
        dArr2[1] = dArr2[1] - dArr3[1];
        dArr2[c2] = dArr2[c2] - dArr3[c2];
        dArr2[3] = dArr2[3] - dArr3[3];
        dArr2[4] = dArr2[4] - dArr3[4];
        dArr2[5] = dArr2[5] - dArr3[5];
        dArr2[6] = dArr2[6] - dArr3[6];
        dArr2[7] = dArr2[7] - dArr3[7];
        dArr2[8] = dArr2[8] - dArr3[8];
        arug.b(arug3, this.i, arug4);
        this.i.a(this.C);
        arui.a(this.s, this.g);
        arug arug5 = this.g;
        arug arug6 = this.b;
        arug.b(arug5, arug6, arug6);
        c();
    }

    private final void c() {
        this.g.b(this.I);
        arug.b(this.i, this.I, this.J);
        arug.b(this.g, this.J, this.i);
        this.g.b();
    }

    public final void b() {
        this.u = 0;
        this.b.b();
        this.g.b();
        this.t.b();
        this.i.a();
        this.i.a(1.0d);
        this.j.a();
        this.j.a(1.0d);
        this.k.a();
        this.k.a(14400.0d);
        this.l.a();
        this.l.a(9.0d);
        this.m.a();
        this.n.a();
        this.o.a();
        this.M.a();
        this.p.a();
        this.r.a();
        this.s.a();
        this.L.a();
        this.h = false;
        this.c = false;
    }

    public arty(byte[] bArr) {
        this.a = new float[9];
        this.b = new arug();
        this.g = new arug();
        this.i = new arug();
        this.j = new arug();
        this.k = new arug();
        this.l = new arug();
        this.m = new arug();
        this.n = new arug();
        this.o = new arug();
        this.p = new aruk();
        this.q = new arui();
        this.r = new aruk();
        this.s = new aruk();
        this.t = new arug();
        this.w = false;
        this.y = true;
        this.z = new arug();
        this.A = new arug();
        this.B = new arug();
        this.C = new arug();
        this.D = new arug();
        this.E = new arug();
        this.F = new aruk();
        this.G = new aruk();
        this.H = new aruk();
        this.I = new arug();
        this.J = new arug();
        this.K = new arug();
        this.L = new aruk();
        this.M = new aruk();
        this.N = new aruk();
        this.O = new aruk();
        this.f = true;
        b();
    }

    private final void a(arug arug, aruk aruk, int i2, aruk aruk2) {
        arug arug2 = arug;
        aruk aruk3 = aruk;
        aruk aruk4 = aruk2;
        if (i2 == 0) {
            arug.a(arug2, e, this.L);
            this.q.a(this.L, aruk3, this.K);
        } else {
            arug.a(arug2, d, this.L);
            this.q.a(this.L, aruk3, this.K);
        }
        arui arui = this.q;
        arug arug3 = this.K;
        double a2 = (((arug3.a(0, 0) + arug3.a(1, 1)) + arug3.a(2, 2)) - 4.0d) * 0.5d;
        aruk2.a((arug3.a(2, 1) - arug3.a(1, 2)) / 2.0d, (arug3.a(0, 2) - arug3.a(2, 0)) / 2.0d, (arug3.a(1, 0) - arug3.a(0, 1)) / 2.0d);
        double c2 = aruk2.c();
        if (a2 <= 0.7071067094802856d) {
            if (a2 <= -0.7071067094802856d) {
                double asin = 3.141592653589793d - Math.asin(c2);
                double a3 = arug3.a(0, 0) - a2;
                double a4 = arug3.a(1, 1) - a2;
                double a5 = arug3.a(2, 2) - a2;
                aruk aruk5 = arui.a;
                double d2 = a3 * a3;
                double d3 = a4 * a4;
                if (d2 > d3 && d2 > a5 * a5) {
                    aruk5.a(a3, (arug3.a(1, 0) + arug3.a(0, 1)) / 2.0d, (arug3.a(0, 2) + arug3.a(2, 0)) / 2.0d);
                } else if (d3 <= a5 * a5) {
                    aruk5.a((arug3.a(0, 2) + arug3.a(2, 0)) / 2.0d, (arug3.a(2, 1) + arug3.a(1, 2)) / 2.0d, a5);
                } else {
                    aruk5.a((arug3.a(1, 0) + arug3.a(0, 1)) / 2.0d, a4, (arug3.a(2, 1) + arug3.a(1, 2)) / 2.0d);
                }
                if (aruk.a(aruk5, aruk4) < 0.0d) {
                    aruk5.a(-1.0d);
                }
                aruk5.b();
                aruk5.a(asin);
                aruk4.a(aruk5);
                return;
            }
            aruk4.a(Math.acos(a2) / c2);
        } else if (c2 > 0.0d) {
            aruk4.a(Math.asin(c2) / c2);
        }
    }

    public final synchronized float a() {
        return (float) Math.abs(Math.atan2(this.i.a(2, 1), this.i.a(2, 0)));
    }

    public final synchronized void a(float f2, float f3, float f4) {
        this.p.a((double) f2, (double) f3, (double) f4);
        if (this.h) {
            a(0);
            return;
        }
        aruk aruk = this.p;
        aruk.a(aruk);
        a(this.b, this.p, 0, this.M);
        arui.a(this.M, this.g);
        arug arug = this.g;
        arug arug2 = this.b;
        arug.b(arug, arug2, arug2);
        c();
        this.h = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(float r9, float r10, float r11, float r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.h     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0080
            aruk r1 = r8.p     // Catch:{ all -> 0x0082 }
            double r2 = (double) r9     // Catch:{ all -> 0x0082 }
            double r4 = (double) r10     // Catch:{ all -> 0x0082 }
            double r6 = (double) r11     // Catch:{ all -> 0x0082 }
            r1.a((double) r2, (double) r4, (double) r6)     // Catch:{ all -> 0x0082 }
            aruk r9 = r8.p     // Catch:{ all -> 0x0082 }
            arug r10 = r8.b     // Catch:{ all -> 0x0082 }
            aruk r11 = r8.O     // Catch:{ all -> 0x0082 }
            double[] r10 = r10.a     // Catch:{ all -> 0x0082 }
            r0 = 2
            r0 = r10[r0]     // Catch:{ all -> 0x0082 }
            r11.a = r0     // Catch:{ all -> 0x0082 }
            r0 = 5
            r0 = r10[r0]     // Catch:{ all -> 0x0082 }
            r11.b = r0     // Catch:{ all -> 0x0082 }
            r0 = 8
            r0 = r10[r0]     // Catch:{ all -> 0x0082 }
            r11.c = r0     // Catch:{ all -> 0x0082 }
            r11.b()     // Catch:{ all -> 0x0082 }
            aruk r10 = r8.O     // Catch:{ all -> 0x0082 }
            aruk r11 = r8.F     // Catch:{ all -> 0x0082 }
            defpackage.aruk.a((defpackage.aruk) r9, (defpackage.aruk) r10, (defpackage.aruk) r11)     // Catch:{ all -> 0x0082 }
            aruk r10 = r8.O     // Catch:{ all -> 0x0082 }
            aruk r11 = r8.F     // Catch:{ all -> 0x0082 }
            defpackage.aruk.a((defpackage.aruk) r10, (defpackage.aruk) r11, (defpackage.aruk) r9)     // Catch:{ all -> 0x0082 }
            arug r9 = r8.k     // Catch:{ all -> 0x0082 }
            r9.a()     // Catch:{ all -> 0x0082 }
            r9 = 1114636288(0x42700000, float:60.0)
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0048
            r9 = 1058642330(0x3f19999a, float:0.6)
            float r12 = r12 * r9
            double r9 = (double) r12     // Catch:{ all -> 0x0082 }
            goto L_0x004a
        L_0x0048:
            r9 = 4638144666238189568(0x405e000000000000, double:120.0)
        L_0x004a:
            arug r11 = r8.k     // Catch:{ all -> 0x0082 }
            double r9 = r9 * r9
            r11.a((double) r9)     // Catch:{ all -> 0x0082 }
            boolean r9 = r8.f     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x0080
            boolean r9 = r8.c     // Catch:{ all -> 0x0082 }
            r10 = 1
            if (r9 != 0) goto L_0x007c
            boolean r9 = r8.h     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x007c
            arug r9 = r8.b     // Catch:{ all -> 0x0082 }
            aruk r11 = r8.p     // Catch:{ all -> 0x0082 }
            aruk r12 = r8.M     // Catch:{ all -> 0x0082 }
            r8.a((defpackage.arug) r9, (defpackage.aruk) r11, (int) r10, (defpackage.aruk) r12)     // Catch:{ all -> 0x0082 }
            aruk r9 = r8.M     // Catch:{ all -> 0x0082 }
            arug r11 = r8.g     // Catch:{ all -> 0x0082 }
            defpackage.arui.a(r9, r11)     // Catch:{ all -> 0x0082 }
            arug r9 = r8.g     // Catch:{ all -> 0x0082 }
            arug r11 = r8.b     // Catch:{ all -> 0x0082 }
            defpackage.arug.b(r9, r11, r11)     // Catch:{ all -> 0x0082 }
            r8.c()     // Catch:{ all -> 0x0082 }
            r8.c = r10     // Catch:{ all -> 0x0082 }
            monitor-exit(r8)
            return
        L_0x007c:
            r8.a(r10)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r8)
            return
        L_0x0082:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arty.a(float, float, float, float):void");
    }

    public final synchronized void a(long j2, float f2, float f3, float f4) {
        long j3 = j2;
        synchronized (this) {
            float abs = ((float) Math.abs(j3 - this.u)) * 1.0E-9f;
            if (this.u != 0 && abs > 0.0f) {
                if (abs > 0.04f) {
                    abs = this.y ? this.v : 0.01f;
                } else if (this.w) {
                    this.v = (this.v * 0.95f) + (0.050000012f * abs);
                    int i2 = this.x + 1;
                    this.x = i2;
                    if (((float) i2) > 10.0f) {
                        this.y = true;
                    }
                } else {
                    this.v = abs;
                    this.x = 1;
                    this.w = true;
                }
                float f5 = -abs;
                this.r.a((double) (f2 * f5), (double) (f3 * f5), (double) (f5 * f4));
                arui.a(this.r, this.g);
                arug arug = this.g;
                arug arug2 = this.b;
                arug.b(arug, arug2, arug2);
                c();
                this.z.a(this.j);
                double d2 = (double) (abs * abs);
                double[] dArr = this.z.a;
                double d3 = dArr[0];
                Double.isNaN(d2);
                dArr[0] = d3 * d2;
                double d4 = dArr[1];
                Double.isNaN(d2);
                dArr[1] = d4 * d2;
                double d5 = dArr[2];
                Double.isNaN(d2);
                dArr[2] = d5 * d2;
                double d6 = dArr[3];
                Double.isNaN(d2);
                dArr[3] = d6 * d2;
                double d7 = dArr[4];
                Double.isNaN(d2);
                dArr[4] = d7 * d2;
                double d8 = dArr[5];
                Double.isNaN(d2);
                dArr[5] = d8 * d2;
                double d9 = dArr[6];
                Double.isNaN(d2);
                dArr[6] = d9 * d2;
                double d10 = dArr[7];
                Double.isNaN(d2);
                dArr[7] = d10 * d2;
                double d11 = dArr[8];
                Double.isNaN(d2);
                dArr[8] = d11 * d2;
                double[] dArr2 = this.i.a;
                dArr2[0] = dArr2[0] + dArr[0];
                dArr2[1] = dArr2[1] + dArr[1];
                dArr2[2] = dArr2[2] + dArr[2];
                dArr2[3] = dArr2[3] + dArr[3];
                dArr2[4] = dArr2[4] + dArr[4];
                dArr2[5] = dArr2[5] + dArr[5];
                dArr2[6] = dArr2[6] + dArr[6];
                dArr2[7] = dArr2[7] + dArr[7];
                dArr2[8] = dArr2[8] + dArr[8];
            }
            this.u = j3;
        }
    }
}
