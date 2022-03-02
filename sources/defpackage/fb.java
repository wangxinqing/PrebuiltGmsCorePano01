package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;

/* renamed from: fb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fb {
    private static int h = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    int a;
    public final fa b;
    public ey[] c;
    public boolean[] d;
    public int e;
    public int f;
    public final ez g;
    private int i;
    private int j;
    private int k;
    private fd[] l;
    private int m;
    private ey[] n;

    public fb() {
        this.a = 0;
        this.b = new fa();
        this.i = 32;
        this.j = 32;
        this.c = null;
        this.d = new boolean[32];
        this.e = 1;
        this.f = 0;
        this.k = 32;
        this.l = new fd[h];
        this.m = 0;
        this.n = new ey[32];
        this.c = new ey[32];
        f();
        this.g = new ez();
    }

    public static ey a(fb fbVar, fd fdVar, fd fdVar2, int i2, float f2, fd fdVar3, fd fdVar4, int i3, boolean z) {
        ey b2 = fbVar.b();
        b2.a(fdVar, fdVar2, i2, f2, fdVar3, fdVar4, i3);
        if (z) {
            fd d2 = fbVar.d();
            fd d3 = fbVar.d();
            d2.c = 4;
            d3.c = 4;
            b2.a(d2, d3);
        }
        return b2;
    }

    public static final int b(Object obj) {
        fd fdVar = ((ff) obj).f;
        if (fdVar != null) {
            return (int) (fdVar.d + 0.5f);
        }
        return 0;
    }

    private final void e() {
        int i2 = this.i;
        int i3 = i2 + i2;
        this.i = i3;
        this.c = (ey[]) Arrays.copyOf(this.c, i3);
        ez ezVar = this.g;
        ezVar.a = (fd[]) Arrays.copyOf(ezVar.a, this.i);
        int i4 = this.i;
        this.d = new boolean[i4];
        this.j = i4;
        this.k = i4;
        this.b.a.clear();
    }

    private final void f() {
        int i2 = 0;
        while (true) {
            ey[] eyVarArr = this.c;
            if (i2 < eyVarArr.length) {
                ey eyVar = eyVarArr[i2];
                if (eyVar != null) {
                    this.g.b.a(eyVar);
                }
                this.c[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public final fd c() {
        if (this.e + 1 >= this.j) {
            e();
        }
        fd a2 = a(3);
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        a2.a = i2;
        this.g.a[i2] = a2;
        return a2;
    }

    public final fd d() {
        if (this.e + 1 >= this.j) {
            e();
        }
        fd a2 = a(4);
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        a2.a = i2;
        this.g.a[i2] = a2;
        return a2;
    }

    public final ey b() {
        ey eyVar = (ey) this.g.b.a();
        if (eyVar == null) {
            return new ey(this.g);
        }
        eyVar.a = null;
        ex exVar = eyVar.d;
        exVar.f = -1;
        exVar.g = -1;
        exVar.h = false;
        exVar.a = 0;
        eyVar.b = 0.0f;
        eyVar.e = false;
        return eyVar;
    }

    public static ey a(fb fbVar, fd fdVar, fd fdVar2, int i2, boolean z) {
        ey b2 = fbVar.b();
        b2.a(fdVar, fdVar2, i2);
        if (z) {
            fbVar.a(b2, 1);
        }
        return b2;
    }

    public final void b(fd fdVar, fd fdVar2, int i2, int i3) {
        ey b2 = b();
        fd c2 = c();
        c2.c = i3;
        b2.b(fdVar, fdVar2, c2, i2);
        a(b2);
    }

    public final void c(fd fdVar, fd fdVar2, int i2, int i3) {
        ey b2 = b();
        b2.a(fdVar, fdVar2, i2);
        fd d2 = d();
        fd d3 = d();
        d2.c = i3;
        d3.c = i3;
        b2.a(d2, d3);
        a(b2);
    }

    private final fd a(int i2) {
        fd fdVar = (fd) this.g.c.a();
        if (fdVar == null) {
            fdVar = new fd(i2);
        } else {
            fdVar.a();
            fdVar.h = i2;
        }
        int i3 = this.m;
        int i4 = h;
        if (i3 >= i4) {
            int i5 = i4 + i4;
            h = i5;
            this.l = (fd[]) Arrays.copyOf(this.l, i5);
        }
        fd[] fdVarArr = this.l;
        int i6 = this.m;
        this.m = i6 + 1;
        fdVarArr[i6] = fdVar;
        return fdVar;
    }

    public final fd a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            e();
        }
        ff ffVar = (ff) obj;
        fd fdVar = ffVar.f;
        if (fdVar == null) {
            ffVar.d();
            fdVar = ffVar.f;
        }
        int i2 = fdVar.a;
        if (i2 != -1) {
            if (i2 > this.a || this.g.a[i2] == null) {
                if (i2 != -1) {
                    fdVar.a();
                }
            }
            return fdVar;
        }
        int i3 = this.a + 1;
        this.a = i3;
        this.e++;
        fdVar.a = i3;
        fdVar.h = 1;
        this.g.a[i3] = fdVar;
        return fdVar;
    }

    public final void a() {
        ez ezVar;
        int i2 = 0;
        while (true) {
            ezVar = this.g;
            fd[] fdVarArr = ezVar.a;
            if (i2 >= fdVarArr.length) {
                break;
            }
            fd fdVar = fdVarArr[i2];
            if (fdVar != null) {
                fdVar.a();
            }
            i2++;
        }
        fc fcVar = ezVar.c;
        fd[] fdVarArr2 = this.l;
        int i3 = this.m;
        int length = fdVarArr2.length;
        if (i3 > length) {
            i3 = length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            fd fdVar2 = fdVarArr2[i4];
            int i5 = fcVar.b;
            Object[] objArr = fcVar.a;
            if (i5 < 256) {
                objArr[i5] = fdVar2;
                fcVar.b = i5 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.g.a, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i6 = 0; i6 < this.f; i6++) {
            this.c[i6].c = false;
        }
        f();
        this.f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ey r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0190
            int r0 = r12.f
            r1 = 1
            int r0 = r0 + r1
            int r2 = r12.k
            if (r0 >= r2) goto L_0x0012
            int r0 = r12.e
            int r0 = r0 + r1
            int r2 = r12.j
            if (r0 >= r2) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r12.e()
        L_0x0015:
            boolean r0 = r13.e
            r2 = 0
            if (r0 == 0) goto L_0x001c
            goto L_0x013b
        L_0x001c:
            int r0 = r12.f
            r3 = -1
            if (r0 <= 0) goto L_0x0094
            ex r0 = r13.d
            ey[] r4 = r12.c
            int r5 = r0.f
            r6 = 0
        L_0x0028:
            if (r5 != r3) goto L_0x002b
            goto L_0x008b
        L_0x002b:
            int r7 = r0.a
            if (r6 >= r7) goto L_0x008b
            ez r7 = r0.b
            fd[] r7 = r7.a
            int[] r8 = r0.c
            r8 = r8[r5]
            r7 = r7[r8]
            int r8 = r7.b
            if (r8 == r3) goto L_0x0084
            float[] r6 = r0.e
            r5 = r6[r5]
            r0.a((defpackage.fd) r7)
            int r6 = r7.b
            r6 = r4[r6]
            boolean r7 = r6.e
            if (r7 != 0) goto L_0x0072
            ex r7 = r6.d
            int r8 = r7.f
            r9 = 0
        L_0x0051:
            if (r8 != r3) goto L_0x0054
            goto L_0x0072
        L_0x0054:
            int r10 = r7.a
            if (r9 >= r10) goto L_0x0072
            ez r10 = r0.b
            fd[] r10 = r10.a
            int[] r11 = r7.c
            r11 = r11[r8]
            r10 = r10[r11]
            float[] r11 = r7.e
            r11 = r11[r8]
            float r11 = r11 * r5
            r0.b(r10, r11)
            int[] r10 = r7.d
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L_0x0051
        L_0x0072:
            float r7 = r13.b
            float r8 = r6.b
            float r8 = r8 * r5
            float r7 = r7 + r8
            r13.b = r7
            fd r5 = r6.a
            r5.a(r13)
            int r5 = r0.f
            r6 = 0
            goto L_0x0028
        L_0x0084:
            int[] r7 = r0.d
            r5 = r7[r5]
            int r6 = r6 + 1
            goto L_0x0028
        L_0x008b:
            ex r0 = r13.d
            int r0 = r0.a
            if (r0 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r13.e = r1
        L_0x0094:
            float r0 = r13.b
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b8
            float r0 = -r0
            r13.b = r0
            ex r0 = r13.d
            int r5 = r0.f
            r6 = 0
        L_0x00a3:
            if (r5 != r3) goto L_0x00a6
        L_0x00a5:
            goto L_0x00b8
        L_0x00a6:
            int r7 = r0.a
            if (r6 >= r7) goto L_0x00a5
            float[] r7 = r0.e
            r8 = r7[r5]
            float r8 = -r8
            r7[r5] = r8
            int[] r7 = r0.d
            r5 = r7[r5]
            int r6 = r6 + 1
            goto L_0x00a3
        L_0x00b8:
            ex r0 = r13.d
            int r5 = r0.f
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x00bf:
            if (r5 == r3) goto L_0x0119
            int r9 = r0.a
            if (r8 >= r9) goto L_0x0119
            float[] r9 = r0.e
            r10 = r9[r5]
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x00d9
            r11 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00d8
            r9[r5] = r4
            r10 = 0
            goto L_0x00e5
        L_0x00d8:
            goto L_0x00e5
        L_0x00d9:
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x00e4
            r9[r5] = r4
            r10 = 0
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0111
            ez r9 = r0.b
            fd[] r9 = r9.a
            int[] r11 = r0.c
            r11 = r11[r5]
            r9 = r9[r11]
            int r11 = r9.h
            if (r11 == r1) goto L_0x0107
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x00fc
            goto L_0x0112
        L_0x00fc:
            if (r7 == 0) goto L_0x0104
            int r10 = r9.c
            int r11 = r7.c
            if (r10 >= r11) goto L_0x0112
        L_0x0104:
            r7 = r9
            goto L_0x0112
        L_0x0107:
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x010d
            r6 = r9
            goto L_0x011d
        L_0x010d:
            if (r6 != 0) goto L_0x0111
            r6 = r9
            goto L_0x0112
        L_0x0111:
        L_0x0112:
            int[] r9 = r0.d
            r5 = r9[r5]
            int r8 = r8 + 1
            goto L_0x00bf
        L_0x0119:
            if (r6 == 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r6 = r7
        L_0x011d:
            if (r6 != 0) goto L_0x0120
            goto L_0x0123
        L_0x0120:
            r13.a((defpackage.fd) r6)
        L_0x0123:
            ex r0 = r13.d
            int r0 = r0.a
            if (r0 == 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r13.e = r1
        L_0x012c:
            fd r0 = r13.a
            if (r0 == 0) goto L_0x018f
            int r0 = r0.h
            if (r0 == r1) goto L_0x013b
            float r0 = r13.b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            goto L_0x018f
        L_0x013b:
            ey[] r0 = r12.c
            int r3 = r12.f
            r0 = r0[r3]
            if (r0 == 0) goto L_0x014a
            ez r3 = r12.g
            fc r3 = r3.b
            r3.a(r0)
        L_0x014a:
            boolean r0 = r13.e
            if (r0 == 0) goto L_0x014f
            goto L_0x0152
        L_0x014f:
            r13.a()
        L_0x0152:
            ey[] r0 = r12.c
            int r3 = r12.f
            r0[r3] = r13
            fd r0 = r13.a
            r0.b = r3
            int r3 = r3 + r1
            r12.f = r3
            int r0 = r0.g
            if (r0 <= 0) goto L_0x018e
        L_0x0163:
            ey[] r1 = r12.n
            int r3 = r1.length
            if (r3 >= r0) goto L_0x016e
            int r3 = r3 + r3
            ey[] r1 = new defpackage.ey[r3]
            r12.n = r1
            goto L_0x0163
        L_0x016e:
            r3 = 0
        L_0x016f:
            if (r3 >= r0) goto L_0x017c
            fd r4 = r13.a
            ey[] r4 = r4.f
            r4 = r4[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x016f
        L_0x017c:
        L_0x017d:
            if (r2 >= r0) goto L_0x018e
            r3 = r1[r2]
            if (r3 == r13) goto L_0x018b
            ex r4 = r3.d
            r4.a((defpackage.ey) r3, (defpackage.ey) r13)
            r3.a()
        L_0x018b:
            int r2 = r2 + 1
            goto L_0x017d
        L_0x018e:
            return
        L_0x018f:
            return
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb.a(ey):void");
    }

    public final void a(ey eyVar, int i2) {
        eyVar.d.a(d(), (float) i2);
    }

    public final void a(fa faVar) {
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f) {
                i2 = 0;
                break;
            }
            ey eyVar = this.c[i3];
            if (eyVar.a.h != 1 && eyVar.b < 0.0f) {
                boolean z = false;
                while (!z) {
                    float f2 = Float.MAX_VALUE;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    for (int i7 = 0; i7 < this.f; i7++) {
                        ey eyVar2 = this.c[i7];
                        if (eyVar2.a.h != 1 && eyVar2.b < 0.0f) {
                            for (int i8 = 1; i8 < this.e; i8++) {
                                fd fdVar = this.g.a[i8];
                                float b2 = eyVar2.d.b(fdVar);
                                if (b2 > 0.0f) {
                                    for (int i9 = 0; i9 < 6; i9++) {
                                        float f3 = fdVar.e[i9] / b2;
                                        if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                            f2 = f3;
                                            i4 = i7;
                                            i5 = i8;
                                            i6 = i9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i4 != -1) {
                        ey eyVar3 = this.c[i4];
                        eyVar3.a.b = -1;
                        eyVar3.a(this.g.a[i5]);
                        eyVar3.a.b = i4;
                        for (int i10 = 0; i10 < this.f; i10++) {
                            this.c[i10].a(eyVar3);
                        }
                        faVar.a(this);
                    } else {
                        fa faVar2 = faVar;
                        z = true;
                    }
                }
                i2 = 0;
            } else {
                fa faVar3 = faVar;
                i3++;
            }
        }
        while (i2 < this.f) {
            ey eyVar4 = this.c[i2];
            if (eyVar4.a.h == 1 || eyVar4.b >= 0.0f) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void a(fd fdVar, int i2) {
        int i3 = fdVar.b;
        if (i3 != -1) {
            ey eyVar = this.c[i3];
            if (!eyVar.e) {
                ey b2 = b();
                b2.a(fdVar, i2);
                a(b2);
                return;
            }
            eyVar.b = (float) i2;
            return;
        }
        ey b3 = b();
        b3.a = fdVar;
        float f2 = (float) i2;
        fdVar.d = f2;
        b3.b = f2;
        b3.e = true;
        a(b3);
    }

    public final void a(fd fdVar, fd fdVar2, int i2, float f2, fd fdVar3, fd fdVar4, int i3) {
        ey b2 = b();
        b2.a(fdVar, fdVar2, i2, f2, fdVar3, fdVar4, i3);
        fd d2 = d();
        fd d3 = d();
        d2.c = 4;
        d3.c = 4;
        b2.a(d2, d3);
        a(b2);
    }

    public final void a(fd fdVar, fd fdVar2, int i2, int i3) {
        ey b2 = b();
        fd c2 = c();
        c2.c = i3;
        b2.a(fdVar, fdVar2, c2, i2);
        a(b2);
    }
}
