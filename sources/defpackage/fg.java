package defpackage;

import java.util.ArrayList;

/* renamed from: fg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class fg {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public int a = -1;
    public float aa;
    fg ab;
    fg ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    final ff i = new ff(this, 2);
    final ff j = new ff(this, 3);
    final ff k = new ff(this, 4);
    final ff l = new ff(this, 5);
    final ff m = new ff(this, 6);
    final ff n = new ff(this, 8);
    final ff o = new ff(this, 9);
    final ff p = new ff(this, 7);
    protected final ArrayList q;
    public fg r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public fg() {
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(this.i);
        this.q.add(this.j);
        this.q.add(this.k);
        this.q.add(this.l);
        this.q.add(this.n);
        this.q.add(this.o);
        this.q.add(this.m);
    }

    private final void a(fb fbVar, boolean z2, boolean z3, ff ffVar, ff ffVar2, int i2, int i3, int i4, int i5, float f2, boolean z4, boolean z5, int i6, int i7, int i8) {
        fb fbVar2 = fbVar;
        ff ffVar3 = ffVar;
        ff ffVar4 = ffVar2;
        int i9 = i2;
        int i10 = i3;
        int i11 = i5;
        int i12 = i7;
        int i13 = i8;
        fd a2 = fbVar2.a((Object) ffVar3);
        fd a3 = fbVar2.a((Object) ffVar4);
        fd a4 = fbVar2.a((Object) ffVar3.b);
        fd a5 = fbVar2.a((Object) ffVar4.b);
        int a6 = ffVar.a();
        int a7 = ffVar2.a();
        int i14 = this.K;
        boolean z6 = i14 != 8;
        int i15 = i14 != 8 ? i4 : 0;
        boolean z7 = (!z6) | z3;
        if (a4 == null && a5 == null) {
            ey b2 = fbVar.b();
            b2.a(a2, i9);
            fbVar2.a(b2);
            if (z4) {
                return;
            }
            if (z2) {
                fbVar2.a(fb.a(fbVar2, a3, a2, i11, true));
            } else if (!z7) {
                ey b3 = fbVar.b();
                b3.a(a3, i10);
                fbVar2.a(b3);
            } else {
                fbVar2.a(fb.a(fbVar2, a3, a2, i15, false));
            }
        } else if (a4 != null && a5 == null) {
            ey b4 = fbVar.b();
            b4.a(a2, a4, a6);
            fbVar2.a(b4);
            if (z2) {
                fbVar2.a(fb.a(fbVar2, a3, a2, i11, true));
            } else if (z4) {
            } else {
                if (!z7) {
                    ey b5 = fbVar.b();
                    b5.a(a3, i10);
                    fbVar2.a(b5);
                    return;
                }
                ey b6 = fbVar.b();
                b6.a(a3, a2, i15);
                fbVar2.a(b6);
            }
        } else if (a4 == null) {
            ey b7 = fbVar.b();
            b7.a(a3, a5, -a7);
            fbVar2.a(b7);
            if (z2) {
                fbVar2.a(fb.a(fbVar2, a3, a2, i11, true));
            } else if (z4) {
            } else {
                if (!z7) {
                    ey b8 = fbVar.b();
                    b8.a(a2, i9);
                    fbVar2.a(b8);
                    return;
                }
                ey b9 = fbVar.b();
                b9.a(a3, a2, i15);
                fbVar2.a(b9);
            }
        } else if (z7) {
            if (!z2) {
                ey b10 = fbVar.b();
                b10.a(a3, a2, i15);
                fbVar2.a(b10);
            } else {
                fbVar2.a(fb.a(fbVar2, a3, a2, i11, true));
            }
            int i16 = ffVar3.h;
            ff ffVar5 = ffVar2;
            if (i16 == ffVar5.h) {
                if (a4 == a5) {
                    fbVar2.a(fb.a(fbVar, a2, a4, 0, 0.5f, a5, a3, 0, true));
                } else if (!z5) {
                    int i17 = ffVar3.i;
                    fd c2 = fbVar.c();
                    ey b11 = fbVar.b();
                    b11.a(a2, a4, c2, a6);
                    if (i17 != 2) {
                        fbVar2.a(b11, (int) (-b11.d.b(c2)));
                    }
                    fbVar2.a(b11);
                    int i18 = ffVar5.i;
                    fd c3 = fbVar.c();
                    ey b12 = fbVar.b();
                    b12.b(a3, a5, c3, -a7);
                    if (i18 != 2) {
                        fbVar2.a(b12, (int) (-b12.d.b(c3)));
                    }
                    fbVar2.a(b12);
                    fbVar2.a(fb.a(fbVar, a2, a4, a6, f2, a5, a3, a7, false));
                }
            } else if (i16 != 2) {
                fd c4 = fbVar.c();
                ey b13 = fbVar.b();
                b13.a(a2, a4, c4, a6);
                fbVar2.a(b13);
                ey b14 = fbVar.b();
                b14.a(a3, a5, -a7);
                fbVar2.a(b14);
            } else {
                ey b15 = fbVar.b();
                b15.a(a2, a4, a6);
                fbVar2.a(b15);
                fd c5 = fbVar.c();
                ey b16 = fbVar.b();
                b16.b(a3, a5, c5, -a7);
                fbVar2.a(b16);
            }
        } else if (z4) {
            fbVar2.a(a2, a4, a6, 3);
            fbVar2.b(a3, a5, -a7, 3);
            fbVar2.a(fb.a(fbVar, a2, a4, a6, f2, a5, a3, a7, true));
        } else if (z5) {
        } else {
            if (i6 == 1) {
                if (i12 <= i15) {
                    i12 = i15;
                }
                if (i13 > 0) {
                    if (i13 >= i12) {
                        fbVar2.b(a3, a2, i13, 3);
                    } else {
                        i12 = i13;
                    }
                }
                fbVar2.c(a3, a2, i12, 3);
                fbVar2.a(a2, a4, a6, 2);
                fbVar2.b(a3, a5, -a7, 2);
                fbVar.a(a2, a4, a6, f2, a5, a3, a7);
            } else if (i12 == 0 && i13 == 0) {
                ey b17 = fbVar.b();
                b17.a(a2, a4, a6);
                fbVar2.a(b17);
                ey b18 = fbVar.b();
                b18.a(a3, a5, -a7);
                fbVar2.a(b18);
            } else {
                if (i13 > 0) {
                    fbVar2.b(a3, a2, i13, 3);
                }
                fbVar2.a(a2, a4, a6, 2);
                fbVar2.b(a3, a5, -a7, 2);
                fbVar.a(a2, a4, a6, f2, a5, a3, a7);
            }
        }
    }

    public final void a(int i2) {
        this.s = i2;
        int i3 = this.D;
        if (i2 < i3) {
            this.s = i3;
        }
    }

    public void a(int i2, int i3) {
        this.A = i2;
        this.B = i3;
    }

    public final void b(int i2) {
        this.t = i2;
        int i3 = this.E;
        if (i2 < i3) {
            this.t = i3;
        }
    }

    public final void b(int i2, int i3) {
        this.w = i2;
        int i4 = i3 - i2;
        this.s = i4;
        int i5 = this.D;
        if (i4 < i5) {
            this.s = i5;
        }
    }

    public final boolean b() {
        return this.r == null;
    }

    public final int c() {
        if (this.K != 8) {
            return this.s;
        }
        return 0;
    }

    public final void c(int i2) {
        if (i2 >= 0) {
            this.D = i2;
        } else {
            this.D = 0;
        }
    }

    public final void c(int i2, int i3) {
        this.x = i2;
        int i4 = i3 - i2;
        this.t = i4;
        int i5 = this.E;
        if (i4 < i5) {
            this.t = i5;
        }
    }

    public final int d() {
        int i2 = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                i2 = Math.max(this.e, i2);
            } else {
                i2 = this.e;
                if (i2 > 0) {
                    this.s = i2;
                } else {
                    i2 = 0;
                }
            }
            int i3 = this.f;
            if (i3 > 0 && i3 < i2) {
                return i3;
            }
        }
        return i2;
    }

    public final void d(int i2) {
        if (i2 >= 0) {
            this.E = i2;
        } else {
            this.E = 0;
        }
    }

    public final int e() {
        int i2 = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                i2 = Math.max(this.g, i2);
            } else {
                i2 = this.g;
                if (i2 > 0) {
                    this.t = i2;
                } else {
                    i2 = 0;
                }
            }
            int i3 = this.h;
            if (i3 > 0 && i3 < i2) {
                return i3;
            }
        }
        return i2;
    }

    public ff e(int i2) {
        switch (i2 - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
                return this.p;
            case 7:
                return this.n;
            default:
                return this.o;
        }
    }

    public final int f() {
        if (this.K != 8) {
            return this.t;
        }
        return 0;
    }

    public final int g() {
        return this.af + this.A;
    }

    public final int h() {
        return this.ag + this.B;
    }

    public final int i() {
        return this.w + this.s;
    }

    public final int j() {
        return this.x + this.t;
    }

    public final boolean k() {
        return this.C > 0;
    }

    public void l() {
        int i2 = this.w;
        int i3 = this.x;
        int i4 = this.s;
        int i5 = this.t;
        this.af = i2;
        this.ag = i3;
        this.y = (i4 + i2) - i2;
        this.z = (i5 + i3) - i3;
    }

    public void m() {
        int i2;
        int i3;
        int b2 = fb.b(this.i);
        int b3 = fb.b(this.j);
        int b4 = fb.b(this.k) - b2;
        int b5 = fb.b(this.l) - b3;
        this.w = b2;
        this.x = b3;
        if (this.K != 8) {
            if (this.ad == 1 && b4 < (i3 = this.s)) {
                b4 = i3;
            }
            if (this.ae == 1 && b5 < (i2 = this.t)) {
                b5 = i2;
            }
            this.s = b4;
            this.t = b5;
            int i4 = this.E;
            if (b5 < i4) {
                this.t = i4;
            }
            int i5 = this.D;
            if (b4 < i5) {
                this.s = i5;
                return;
            }
            return;
        }
        this.s = 0;
        this.t = 0;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void f(int i2) {
        this.ad = i2;
        if (i2 == 2) {
            a(this.F);
        }
    }

    public final void g(int i2) {
        this.ae = i2;
        if (i2 == 2) {
            b(this.G);
        }
    }

    public void a() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void a(int i2, fg fgVar, int i3, int i4, int i5) {
        e(i2).a(fgVar.e(i3), i4, i5, 2, 0, true);
    }

    public void a(ez ezVar) {
        this.i.d();
        this.j.d();
        this.k.d();
        this.l.d();
        this.m.d();
        this.p.d();
        this.n.d();
        this.o.d();
    }

    public void a(fb fbVar) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        float f2;
        int i3;
        int i4;
        int i5;
        boolean z7;
        boolean z8;
        int i6;
        fd fdVar;
        fd fdVar2;
        fd fdVar3;
        int i7;
        fd fdVar4;
        fd fdVar5;
        int i8;
        boolean z9;
        int i9;
        fd fdVar6;
        fd fdVar7;
        fd fdVar8;
        int i10;
        fd fdVar9;
        fd fdVar10;
        fg fgVar;
        int i11;
        ff ffVar;
        int i12;
        boolean z10;
        int i13;
        ff ffVar2;
        ff ffVar3;
        ff ffVar4;
        ff ffVar5;
        ff ffVar6;
        ff ffVar7;
        boolean z11;
        boolean z12;
        fg fgVar2;
        fg fgVar3;
        fg fgVar4;
        fg fgVar5;
        fg fgVar6;
        fg fgVar7;
        ff ffVar8;
        ff ffVar9;
        ff ffVar10;
        ff ffVar11;
        fb fbVar2 = fbVar;
        fd a2 = fbVar2.a((Object) this.i);
        fd a3 = fbVar2.a((Object) this.k);
        fd a4 = fbVar2.a((Object) this.j);
        fd a5 = fbVar2.a((Object) this.l);
        fd a6 = fbVar2.a((Object) this.m);
        fg fgVar8 = this.r;
        if (fgVar8 != null) {
            ff ffVar12 = this.i;
            ff ffVar13 = ffVar12.b;
            if ((ffVar13 != null && ffVar13.b == ffVar12) || ((ffVar11 = ffVar10.b) != null && ffVar11.b == (ffVar10 = this.k))) {
                ((fh) fgVar8).a(this, 0);
                z11 = true;
            } else {
                z11 = false;
            }
            ff ffVar14 = this.j;
            ff ffVar15 = ffVar14.b;
            if ((ffVar15 != null && ffVar15.b == ffVar14) || ((ffVar9 = ffVar8.b) != null && ffVar9.b == (ffVar8 = this.l))) {
                ((fh) this.r).a(this, 1);
                z12 = true;
            } else {
                z12 = false;
            }
            fg fgVar9 = this.r;
            if (fgVar9.ad == 2 && !z11) {
                ff ffVar16 = this.i;
                ff ffVar17 = ffVar16.b;
                if (ffVar17 == null || (fgVar7 = ffVar17.a) != fgVar9) {
                    fd a7 = fbVar2.a((Object) fgVar9.i);
                    ey b2 = fbVar.b();
                    b2.a(a2, a7, fbVar.c(), 0);
                    fbVar2.a(b2);
                } else if (fgVar7 == fgVar9) {
                    ffVar16.i = 2;
                }
                ff ffVar18 = this.k;
                ff ffVar19 = ffVar18.b;
                if (ffVar19 == null || (fgVar5 = ffVar19.a) != (fgVar6 = this.r)) {
                    fd a8 = fbVar2.a((Object) this.r.k);
                    ey b3 = fbVar.b();
                    b3.a(a8, a3, fbVar.c(), 0);
                    fbVar2.a(b3);
                } else if (fgVar5 == fgVar6) {
                    ffVar18.i = 2;
                }
            }
            fg fgVar10 = this.r;
            if (fgVar10.ae == 2 && !z12) {
                ff ffVar20 = this.j;
                ff ffVar21 = ffVar20.b;
                if (ffVar21 == null || (fgVar4 = ffVar21.a) != fgVar10) {
                    fd a9 = fbVar2.a((Object) fgVar10.j);
                    ey b4 = fbVar.b();
                    b4.a(a4, a9, fbVar.c(), 0);
                    fbVar2.a(b4);
                } else if (fgVar4 == fgVar10) {
                    ffVar20.i = 2;
                }
                ff ffVar22 = this.l;
                ff ffVar23 = ffVar22.b;
                if (ffVar23 == null || (fgVar2 = ffVar23.a) != (fgVar3 = this.r)) {
                    fd a10 = fbVar2.a((Object) this.r.l);
                    ey b5 = fbVar.b();
                    b5.a(a10, a5, fbVar.c(), 0);
                    fbVar2.a(b5);
                } else if (fgVar2 == fgVar3) {
                    ffVar22.i = 2;
                }
            }
            z3 = z11;
            z2 = z12;
        } else {
            z3 = false;
            z2 = false;
        }
        int i14 = this.s;
        int i15 = this.D;
        if (i14 >= i15) {
            i2 = i14;
        } else {
            i2 = i15;
        }
        int i16 = this.t;
        int i17 = this.E;
        if (i16 >= i17) {
            i17 = i16;
        }
        int i18 = this.ad;
        if (i18 != 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i19 = this.ae;
        if (i19 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z4 && (ffVar6 = this.i) != null && (ffVar7 = this.k) != null && (ffVar6.b == null || ffVar7.b == null)) {
            z4 = true;
        }
        if (!z5 && (ffVar2 = this.j) != null && (ffVar3 = this.l) != null && (((ffVar4 = ffVar2.b) == null || ffVar3.b == null) && (this.C == 0 || ((ffVar5 = this.m) != null && (ffVar4 == null || ffVar5.b == null))))) {
            z5 = true;
        }
        int i20 = this.v;
        float f3 = this.u;
        fd fdVar11 = a2;
        if (f3 <= 0.0f) {
            i3 = i20;
            z6 = false;
            i5 = i17;
            z7 = z4;
            f2 = f3;
            i4 = i2;
        } else {
            int i21 = i2;
            if (this.K != 8) {
                if (i18 == 3 && i19 == 3) {
                    if (z4 && !z5) {
                        i5 = i17;
                        z7 = z4;
                        i3 = 0;
                    } else if (z4 || !z5) {
                        i3 = i20;
                        i5 = i17;
                        z7 = z4;
                    } else if (i20 == -1) {
                        float f4 = 1.0f / f3;
                        i5 = i17;
                        z7 = z4;
                        i4 = i21;
                        i3 = 1;
                        z6 = true;
                        f2 = f4;
                    } else {
                        i5 = i17;
                        z7 = z4;
                        i3 = 1;
                    }
                    f2 = f3;
                    i4 = i21;
                    z6 = true;
                } else if (i18 == 3) {
                    i5 = i17;
                    f2 = f3;
                    z7 = true;
                    i3 = 0;
                    z6 = false;
                    i4 = (int) (((float) i16) * f3);
                } else if (i19 == 3) {
                    if (i20 == -1) {
                        f3 = 1.0f / f3;
                    }
                    i12 = (int) (((float) i14) * f3);
                    z10 = z4;
                    i13 = 1;
                    z5 = true;
                    f2 = f3;
                    i4 = i21;
                    z6 = false;
                }
            }
            i13 = i20;
            i12 = i17;
            z10 = z4;
            f2 = f3;
            i4 = i21;
            z6 = false;
        }
        boolean z13 = !z6 ? false : i3 == 0 || i3 == -1;
        if (i18 != 2 || !(this instanceof fh)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (this.a == 2) {
            i7 = i5;
            fdVar3 = a6;
            fdVar2 = a5;
            fdVar = a4;
            fdVar4 = a3;
            i6 = i3;
            fdVar5 = fdVar11;
        } else {
            if (z13) {
                ff ffVar24 = this.i;
                if (ffVar24.b != null && this.k.b != null) {
                    fd a11 = fbVar2.a((Object) ffVar24);
                    fd a12 = fbVar2.a((Object) this.k);
                    fd a13 = fbVar2.a((Object) this.i.b);
                    fd a14 = fbVar2.a((Object) this.k.b);
                    fbVar2.a(a11, a13, this.i.a(), 3);
                    fbVar2.b(a12, a14, -this.k.a(), 3);
                    if (!z3) {
                        fbVar.a(a11, a13, this.i.a(), this.H, a14, a12, this.k.a());
                        i7 = i5;
                        fdVar3 = a6;
                        fdVar2 = a5;
                        fdVar = a4;
                        fdVar4 = a3;
                        i6 = i3;
                        fdVar5 = fdVar11;
                    } else {
                        i7 = i5;
                        fdVar3 = a6;
                        fdVar2 = a5;
                        fdVar = a4;
                        fdVar4 = a3;
                        i6 = i3;
                        fdVar5 = fdVar11;
                    }
                }
            }
            ff ffVar25 = this.i;
            ff ffVar26 = this.k;
            int i22 = this.w;
            i7 = i5;
            fdVar3 = a6;
            fdVar2 = a5;
            fdVar = a4;
            fdVar4 = a3;
            boolean z14 = z3;
            i6 = i3;
            fdVar5 = fdVar11;
            a(fbVar, z8, z7, ffVar25, ffVar26, i22, i22 + i4, i4, i15, this.H, z13, z14, this.c, this.e, this.f);
        }
        if (this.b != 2) {
            boolean z15 = this.ae == 2 && (this instanceof fh);
            if (!z6) {
                i8 = i6;
                z9 = false;
            } else {
                i8 = i6;
                z9 = i8 == 1 || i8 == -1;
            }
            int i23 = this.C;
            if (i23 > 0) {
                ff ffVar27 = this.l;
                fb fbVar3 = fbVar;
                fd fdVar12 = fdVar;
                fbVar3.c(fdVar3, fdVar12, i23, 5);
                ff ffVar28 = this.m;
                if (ffVar28.b != null) {
                    ffVar = ffVar28;
                    i11 = this.C;
                } else {
                    ffVar = ffVar27;
                    i11 = i7;
                }
                if (z9) {
                    ff ffVar29 = this.j;
                    if (ffVar29.b != null && this.l.b != null) {
                        fd a15 = fbVar3.a((Object) ffVar29);
                        fd a16 = fbVar3.a((Object) this.l);
                        fd a17 = fbVar3.a((Object) this.j.b);
                        fd a18 = fbVar3.a((Object) this.l.b);
                        fbVar3.a(a15, a17, this.j.a(), 3);
                        fbVar3.b(a16, a18, -this.l.a(), 3);
                        if (!z2) {
                            fbVar.a(a15, a17, this.j.a(), this.I, a18, a16, this.l.a());
                            fdVar6 = fdVar12;
                            i9 = i8;
                        } else {
                            fdVar6 = fdVar12;
                            i9 = i8;
                        }
                    }
                }
                ff ffVar30 = this.j;
                int i24 = this.x;
                i9 = i8;
                a(fbVar, z15, z5, ffVar30, ffVar, i24, i24 + i11, i11, this.E, this.I, z9, z2, this.d, this.g, this.h);
                fd fdVar13 = fdVar12;
                fbVar.c(fdVar2, fdVar13, i7, 5);
                fdVar6 = fdVar13;
            } else {
                fb fbVar4 = fbVar;
                i9 = i8;
                int i25 = i7;
                fd fdVar14 = fdVar2;
                fd fdVar15 = fdVar;
                if (!z9) {
                    fgVar = this;
                } else {
                    fgVar = this;
                    ff ffVar31 = fgVar.j;
                    if (ffVar31.b != null && fgVar.l.b != null) {
                        fd a19 = fbVar4.a((Object) ffVar31);
                        fd a20 = fbVar4.a((Object) fgVar.l);
                        fd a21 = fbVar4.a((Object) fgVar.j.b);
                        fd a22 = fbVar4.a((Object) fgVar.l.b);
                        fbVar4.a(a19, a21, fgVar.j.a(), 3);
                        fbVar4.b(a20, a22, -fgVar.l.a(), 3);
                        if (!z2) {
                            fbVar.a(a19, a21, fgVar.j.a(), fgVar.I, a22, a20, fgVar.l.a());
                            fdVar2 = fdVar14;
                            fdVar6 = fdVar15;
                        } else {
                            fdVar2 = fdVar14;
                            fdVar6 = fdVar15;
                        }
                    }
                }
                ff ffVar32 = fgVar.j;
                ff ffVar33 = fgVar.l;
                int i26 = fgVar.x;
                fdVar2 = fdVar14;
                fdVar6 = fdVar15;
                a(fbVar, z15, z5, ffVar32, ffVar33, i26, i26 + i25, i25, fgVar.E, fgVar.I, z9, z2, fgVar.d, fgVar.g, fgVar.h);
            }
            if (z6) {
                ey b6 = fbVar.b();
                int i27 = i9;
                if (i27 == 0) {
                    b6.a(fdVar4, fdVar5, fdVar2, fdVar6, f2);
                    fbVar.a(b6);
                    return;
                }
                fb fbVar5 = fbVar;
                if (i27 != 1) {
                    int i28 = this.e;
                    if (i28 <= 0) {
                        fdVar7 = fdVar5;
                        fdVar8 = fdVar4;
                        i10 = 3;
                    } else {
                        fdVar7 = fdVar5;
                        fdVar8 = fdVar4;
                        i10 = 3;
                        fbVar5.a(fdVar8, fdVar7, i28, 3);
                    }
                    int i29 = this.g;
                    if (i29 <= 0) {
                        fdVar9 = fdVar2;
                        fdVar10 = fdVar6;
                    } else {
                        fdVar9 = fdVar2;
                        fdVar10 = fdVar6;
                        fbVar5.a(fdVar9, fdVar10, i29, i10);
                    }
                    b6.a(fdVar8, fdVar7, fdVar9, fdVar10, f2);
                    fd d2 = fbVar.d();
                    fd d3 = fbVar.d();
                    d2.c = 4;
                    d3.c = 4;
                    b6.a(d2, d3);
                    fbVar5.a(b6);
                    return;
                }
                b6.a(fdVar2, fdVar6, fdVar4, fdVar5, f2);
                fbVar5.a(b6);
                return;
            }
            return;
        }
    }
}
