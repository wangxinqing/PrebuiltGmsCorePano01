package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import java.util.Arrays;

/* renamed from: abd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abd extends abk {
    boolean a = false;
    public int b = -1;
    int[] c;
    View[] d;
    final SparseIntArray e = new SparseIntArray();
    final SparseIntArray f = new SparseIntArray();
    public abc g = new aba();
    final Rect h = new Rect();

    public abd(int i) {
        super(1);
        a(i);
    }

    private final void B() {
        int i;
        if (this.i == 1) {
            i = (this.C - u()) - s();
        } else {
            i = (this.D - v()) - t();
        }
        i(i);
    }

    private final void C() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    private final void a(View view, int i, int i2, boolean z) {
        acu acu = (acu) view.getLayoutParams();
        if (!z) {
            if (!a(view, i, i2, acu)) {
                return;
            }
        } else if (this.w && act.b(view.getMeasuredWidth(), i, acu.width) && act.b(view.getMeasuredHeight(), i2, acu.height)) {
            return;
        }
        view.measure(i, i2);
    }

    private final int b(adb adb, adi adi, int i) {
        if (!adi.g) {
            return this.g.c(i, this.b);
        }
        int a2 = adb.a(i);
        if (a2 != -1) {
            return this.g.c(a2, this.b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private final int c(adb adb, adi adi, int i) {
        if (!adi.g) {
            return this.g.b(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = adb.a(i);
        if (a2 != -1) {
            return this.g.b(a2, this.b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private final int d(adb adb, adi adi, int i) {
        if (!adi.g) {
            return this.g.a(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = adb.a(i);
        if (a2 != -1) {
            return this.g.a(a2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private final void i(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    public final boolean b() {
        return this.o == null && !this.a;
    }

    public final int b(int i, adb adb, adi adi) {
        B();
        C();
        return super.b(i, adb, adi);
    }

    public abd(int i, byte[] bArr) {
        a(i);
    }

    private final void a(View view, int i, boolean z) {
        int i2;
        int i3;
        abb abb = (abb) view.getLayoutParams();
        Rect rect = abb.d;
        int i4 = rect.top + rect.bottom + abb.topMargin + abb.bottomMargin;
        int i5 = rect.left + rect.right + abb.leftMargin + abb.rightMargin;
        int a2 = a(abb.a, abb.b);
        if (this.i == 1) {
            i2 = act.a(a2, i, i5, abb.width, false);
            i3 = act.a(this.j.d(), this.B, i4, abb.height, true);
        } else {
            int a3 = act.a(a2, i, i4, abb.height, false);
            int a4 = act.a(this.j.d(), this.A, i5, abb.width, true);
            i3 = a3;
            i2 = a4;
        }
        a(view, i2, i3, z);
    }

    public final int b(adb adb, adi adi) {
        if (this.i == 1) {
            return this.b;
        }
        if (adi.a() > 0) {
            return b(adb, adi, adi.a() - 1) + 1;
        }
        return 0;
    }

    public final void c() {
        this.g.a();
        this.g.b();
    }

    public final void d() {
        this.g.a();
        this.g.b();
    }

    public final void b(int i, int i2) {
        this.g.a();
        this.g.b();
    }

    public final void c(int i, int i2) {
        this.g.a();
        this.g.b();
    }

    public final void d(int i, int i2) {
        this.g.a();
        this.g.b();
    }

    public final void c(adb adb, adi adi) {
        if (adi.g) {
            int r = r();
            for (int i = 0; i < r; i++) {
                abb abb = (abb) h(i).getLayoutParams();
                int c2 = abb.c();
                this.e.put(c2, abb.b);
                this.f.put(c2, abb.a);
            }
        }
        super.c(adb, adi);
        this.e.clear();
        this.f.clear();
    }

    /* access modifiers changed from: package-private */
    public final int a(int i, int i2) {
        if (this.i == 1 && i()) {
            int[] iArr = this.c;
            int i3 = this.b - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.c;
        return iArr2[i2 + i] - iArr2[i];
    }

    public final int a(int i, adb adb, adi adi) {
        B();
        C();
        return super.a(i, adb, adi);
    }

    public final int a(adb adb, adi adi) {
        if (this.i == 0) {
            return this.b;
        }
        if (adi.a() > 0) {
            return b(adb, adi, adi.a() - 1) + 1;
        }
        return 0;
    }

    public final acu a() {
        if (this.i == 0) {
            return new abb(-2, -1);
        }
        return new abb(-1, -2);
    }

    public final acu a(Context context, AttributeSet attributeSet) {
        return new abb(context, attributeSet);
    }

    public final acu a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new abb((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new abb(layoutParams);
    }

    public final View a(adb adb, adi adi, int i, int i2, int i3) {
        int i4;
        j();
        int c2 = this.j.c();
        int a2 = this.j.a();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View h2 = h(i);
            int j = act.j(h2);
            if (j >= 0 && j < i3 && c(adb, adi, j) == 0) {
                if (!((acu) h2.getLayoutParams()).a()) {
                    if (this.j.d(h2) < a2 && this.j.c(h2) >= c2) {
                        return h2;
                    }
                    if (view == null) {
                        view = h2;
                    }
                } else if (view2 == null) {
                    view2 = h2;
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        if (r13 != (r2 > r8)) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ee, code lost:
        if (r13 != (r2 > r15)) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.View r23, int r24, defpackage.adb r25, defpackage.adi r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.c((android.view.View) r23)
            r4 = 0
            if (r3 == 0) goto L_0x0134
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            abb r5 = (defpackage.abb) r5
            int r6 = r5.a
            int r5 = r5.b
            int r5 = r5 + r6
            android.view.View r7 = super.a((android.view.View) r23, (int) r24, (defpackage.adb) r25, (defpackage.adi) r26)
            if (r7 == 0) goto L_0x0134
            r7 = r24
            int r7 = r0.e((int) r7)
            r8 = 1
            if (r7 == r8) goto L_0x0029
            r7 = 0
            goto L_0x002a
        L_0x0029:
            r7 = 1
        L_0x002a:
            boolean r10 = r0.k
            r11 = -1
            if (r7 == r10) goto L_0x0037
            int r7 = r22.r()
            int r7 = r7 + r11
            r10 = -1
            r12 = -1
            goto L_0x003e
        L_0x0037:
            int r7 = r22.r()
            r10 = r7
            r7 = 0
            r12 = 1
        L_0x003e:
            int r13 = r0.i
            if (r13 != r8) goto L_0x004a
            boolean r13 = r22.i()
            if (r13 == 0) goto L_0x004a
            r13 = 1
            goto L_0x004b
        L_0x004a:
            r13 = 0
        L_0x004b:
            int r14 = r0.b((defpackage.adb) r1, (defpackage.adi) r2, (int) r7)
            r11 = r7
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r7 = r4
        L_0x0057:
            if (r11 == r10) goto L_0x012e
            r17 = r10
            int r10 = r0.b((defpackage.adb) r1, (defpackage.adi) r2, (int) r11)
            android.view.View r1 = r0.h((int) r11)
            if (r1 == r3) goto L_0x012b
            boolean r18 = r1.hasFocusable()
            if (r18 != 0) goto L_0x006c
            goto L_0x007c
        L_0x006c:
            if (r10 == r14) goto L_0x007c
            if (r4 != 0) goto L_0x0078
            r18 = r3
            r19 = r7
            r21 = r14
            goto L_0x00f1
        L_0x0078:
            r19 = r7
            goto L_0x0130
        L_0x007c:
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            abb r10 = (defpackage.abb) r10
            int r2 = r10.a
            r18 = r3
            int r3 = r10.b
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            if (r2 != r6) goto L_0x0095
            if (r3 != r5) goto L_0x0095
            return r1
        L_0x0095:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            if (r4 == 0) goto L_0x00f4
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            if (r7 != 0) goto L_0x00ac
            r19 = r7
            r21 = r14
            goto L_0x00f8
        L_0x00ac:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r14
            int r14 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00e2
            r19 = r7
            if (r4 == 0) goto L_0x00c3
            goto L_0x00f1
        L_0x00c3:
            afo r7 = r0.s
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L_0x00d4
            afo r7 = r0.t
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L_0x00d4
            goto L_0x00f1
        L_0x00d4:
            if (r14 <= r12) goto L_0x00d7
            goto L_0x00f8
        L_0x00d7:
            if (r14 == r12) goto L_0x00da
            goto L_0x00e8
        L_0x00da:
            if (r2 > r8) goto L_0x00de
            r7 = 0
            goto L_0x00df
        L_0x00de:
            r7 = 1
        L_0x00df:
            if (r13 == r7) goto L_0x00f8
            goto L_0x00e8
        L_0x00e2:
            r19 = r7
            if (r14 > r9) goto L_0x00f8
            if (r14 == r9) goto L_0x00e9
        L_0x00e8:
            goto L_0x00f1
        L_0x00e9:
            if (r2 > r15) goto L_0x00ed
            r7 = 0
            goto L_0x00ee
        L_0x00ed:
            r7 = 1
        L_0x00ee:
            if (r13 == r7) goto L_0x00f8
            goto L_0x00e8
        L_0x00f1:
            r7 = r19
            goto L_0x011d
        L_0x00f4:
            r19 = r7
            r21 = r14
        L_0x00f8:
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x010f
            int r4 = r10.a
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r15 = r4
            r7 = r19
            r4 = r1
            goto L_0x011d
        L_0x010f:
            int r7 = r10.a
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r7 = r1
        L_0x011d:
            int r11 = r11 + r16
            r1 = r25
            r2 = r26
            r10 = r17
            r3 = r18
            r14 = r21
            goto L_0x0057
        L_0x012b:
            r19 = r7
            goto L_0x0130
        L_0x012e:
            r19 = r7
        L_0x0130:
            if (r4 == 0) goto L_0x0133
            return r4
        L_0x0133:
            return r19
        L_0x0134:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abd.a(android.view.View, int, adb, adi):android.view.View");
    }

    public final void a(int i) {
        if (i != this.b) {
            this.a = true;
            if (i > 0) {
                this.b = i;
                this.g.a();
                o();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public final void a(adb adb, adi adi, abg abg, int i) {
        B();
        if (adi.a() > 0 && !adi.g) {
            int c2 = c(adb, adi, abg.b);
            if (i == 1) {
                while (c2 > 0) {
                    int i2 = abg.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    abg.b = i3;
                    c2 = c(adb, adi, i3);
                }
            } else {
                int a2 = adi.a() - 1;
                int i4 = abg.b;
                while (i4 < a2) {
                    int i5 = i4 + 1;
                    int c3 = c(adb, adi, i5);
                    if (c3 <= c2) {
                        break;
                    }
                    i4 = i5;
                    c2 = c3;
                }
                abg.b = i4;
            }
        }
        C();
    }

    public final void a(adb adb, adi adi, abi abi, abh abh) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        View a2;
        adb adb2 = adb;
        adi adi2 = adi;
        abi abi2 = abi;
        abh abh2 = abh;
        int g2 = this.j.g();
        if (r() > 0) {
            i = this.c[this.b];
        } else {
            i = 0;
        }
        if (g2 != 1073741824) {
            B();
        }
        int i12 = abi2.e;
        int i13 = this.b;
        if (i12 != 1) {
            i13 = c(adb2, adi2, abi2.d) + d(adb2, adi2, abi2.d);
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.b && abi2.a(adi2) && i13 > 0) {
            int i14 = abi2.d;
            int d2 = d(adb2, adi2, i14);
            if (d2 <= this.b) {
                i13 -= d2;
                if (i13 < 0 || (a2 = abi2.a(adb2)) == null) {
                    break;
                }
                this.d[i2] = a2;
                i2++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + d2 + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
        }
        if (i2 != 0) {
            if (i12 != 1) {
                i5 = i2 - 1;
                i4 = -1;
                i3 = -1;
            } else {
                i4 = i2;
                i5 = 0;
                i3 = 1;
            }
            int i15 = 0;
            while (i5 != i4) {
                View view = this.d[i5];
                abb abb = (abb) view.getLayoutParams();
                int d3 = d(adb2, adi2, act.j(view));
                abb.b = d3;
                abb.a = i15;
                i15 += d3;
                i5 += i3;
            }
            float f2 = 0.0f;
            int i16 = 0;
            for (int i17 = 0; i17 < i2; i17++) {
                View view2 = this.d[i17];
                if (abi2.l == null) {
                    z = false;
                    if (i12 != 1) {
                        b(view2, 0);
                    } else {
                        b(view2);
                    }
                } else if (i12 != 1) {
                    z = false;
                    a(view2, 0);
                } else {
                    z = false;
                    a(view2);
                }
                b(view2, this.h);
                a(view2, g2, z);
                int a3 = this.j.a(view2);
                if (a3 > i16) {
                    i16 = a3;
                }
                float b2 = ((float) this.j.b(view2)) / ((float) ((abb) view2.getLayoutParams()).b);
                if (b2 > f2) {
                    f2 = b2;
                }
            }
            if (g2 != 1073741824) {
                i(Math.max(Math.round(f2 * ((float) this.b)), i));
                i16 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    View view3 = this.d[i18];
                    a(view3, (int) JGCastService.FLAG_PRIVATE_DISPLAY, true);
                    int a4 = this.j.a(view3);
                    if (a4 > i16) {
                        i16 = a4;
                    }
                }
            }
            for (int i19 = 0; i19 < i2; i19++) {
                View view4 = this.d[i19];
                if (this.j.a(view4) != i16) {
                    abb abb2 = (abb) view4.getLayoutParams();
                    Rect rect = abb2.d;
                    int i20 = rect.top + rect.bottom + abb2.topMargin + abb2.bottomMargin;
                    int i21 = rect.left + rect.right + abb2.leftMargin + abb2.rightMargin;
                    int a5 = a(abb2.a, abb2.b);
                    if (this.i == 1) {
                        i11 = act.a(a5, (int) JGCastService.FLAG_PRIVATE_DISPLAY, i21, abb2.width, false);
                        i10 = View.MeasureSpec.makeMeasureSpec(i16 - i20, JGCastService.FLAG_PRIVATE_DISPLAY);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, JGCastService.FLAG_PRIVATE_DISPLAY);
                        i10 = act.a(a5, (int) JGCastService.FLAG_PRIVATE_DISPLAY, i20, abb2.height, false);
                        i11 = makeMeasureSpec;
                    }
                    a(view4, i11, i10, true);
                }
            }
            abh2.a = i16;
            if (this.i == 1) {
                if (abi2.f == -1) {
                    int i22 = abi2.b;
                    i9 = i22 - i16;
                    i8 = i22;
                    i7 = 0;
                    i6 = 0;
                } else {
                    int i23 = abi2.b;
                    i8 = i23 + i16;
                    i9 = i23;
                    i7 = 0;
                    i6 = 0;
                }
            } else if (abi2.f == -1) {
                i6 = abi2.b;
                i7 = i6 - i16;
                i9 = 0;
                i8 = 0;
            } else {
                int i24 = abi2.b;
                i7 = i24;
                i8 = 0;
                i6 = i24 + i16;
                i9 = 0;
            }
            for (int i25 = 0; i25 < i2; i25++) {
                View view5 = this.d[i25];
                abb abb3 = (abb) view5.getLayoutParams();
                if (this.i != 1) {
                    i9 = t() + this.c[abb3.a];
                    i8 = this.j.b(view5) + i9;
                } else if (i()) {
                    int s = s() + this.c[this.b - abb3.a];
                    i6 = s;
                    i7 = s - this.j.b(view5);
                } else {
                    i7 = s() + this.c[abb3.a];
                    i6 = this.j.b(view5) + i7;
                }
                act.a(view5, i7, i9, i6, i8);
                if (abb3.a() || abb3.b()) {
                    abh2.c = true;
                }
                abh2.d = view5.hasFocusable() | abh2.d;
            }
            Arrays.fill(this.d, (Object) null);
            return;
        }
        abh2.b = true;
    }

    public final void a(adb adb, adi adi, View view, qs qsVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof abb)) {
            super.a(view, qsVar);
            return;
        }
        abb abb = (abb) layoutParams;
        int b2 = b(adb, adi, abb.c());
        if (this.i == 0) {
            qsVar.b((Object) qr.a(abb.a, abb.b, b2, 1, false));
        } else {
            qsVar.b((Object) qr.a(b2, 1, abb.a, abb.b, false));
        }
    }

    public final void a(adi adi) {
        super.a(adi);
        this.a = false;
    }

    public final void a(adi adi, abi abi, aax aax) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && abi.a(adi) && i > 0; i2++) {
            int i3 = abi.d;
            aax.a(i3, Math.max(0, abi.g));
            i -= this.g.a(i3);
            abi.d += abi.e;
        }
    }

    public final void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.c == null) {
            super.a(rect, i, i2);
        }
        int s = s() + u();
        int t = t() + v();
        if (this.i == 1) {
            i4 = act.a(i2, rect.height() + t, A());
            int[] iArr = this.c;
            i3 = act.a(i, iArr[iArr.length - 1] + s, z());
        } else {
            i3 = act.a(i, rect.width() + s, z());
            int[] iArr2 = this.c;
            i4 = act.a(i2, iArr2[iArr2.length - 1] + t, A());
        }
        i(i3, i4);
    }

    public final boolean a(acu acu) {
        return acu instanceof abb;
    }
}
