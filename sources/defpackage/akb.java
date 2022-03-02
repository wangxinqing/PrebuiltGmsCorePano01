package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.GridLayoutManager$SavedState;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;

/* renamed from: akb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akb extends act {
    static final int[] M = new int[2];
    private static final Rect O = new Rect();
    int E;
    public int F;
    public int G;
    public int H;
    public int I = 8388659;
    int J;
    ajt K;
    public final alj L = new alj();
    private abz N = abz.a((act) this);
    private int P = 0;
    private int Q;
    private int R;
    private int[] S;
    private int T;
    private int U = 1;
    private final ake V = new ake();
    private int W;
    private final int[] X = new int[2];
    private ajr Y;
    private final Runnable Z = new aju(this);
    final float a = 1.0f;
    private final ajv aa = new ajv(this);
    final int b = 10;
    final ajp c;
    int d = 0;
    adi e;
    int f;
    int g;
    final SparseIntArray h = new SparseIntArray();
    int[] i;
    adb j;
    int k = 221696;
    public ArrayList l = null;
    int m = -1;
    ajx n;
    ajz o;
    final int p;

    public akb(ajp ajp) {
        this.c = ajp;
        this.p = -1;
        if (this.x) {
            this.x = false;
            this.y = 0;
            RecyclerView recyclerView = this.r;
            if (recyclerView != null) {
                recyclerView.mRecycler.b();
            }
        }
    }

    private final void H() {
        this.j = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
    }

    private final int I() {
        int i2 = (this.k & 524288) == 0 ? this.J - 1 : 0;
        return j(i2) + n(i2);
    }

    private final void J() {
        int i2 = this.k & -1025;
        int i3 = 0;
        if (b(false)) {
            i3 = 1024;
        }
        int i4 = i2 | i3;
        this.k = i4;
        if ((i4 & 1024) != 0) {
            K();
        }
    }

    private final void K() {
        qb.a((View) this.c, this.Z);
    }

    private final void L() {
        int i2;
        int i3 = this.k;
        if ((65600 & i3) == 65536) {
            ajt ajt = this.K;
            int i4 = this.m;
            if ((i3 & 262144) == 0) {
                i2 = this.W;
            } else {
                i2 = 0;
            }
            while (true) {
                int i5 = ajt.f;
                if (i5 < ajt.e || i5 <= i4) {
                    break;
                }
                if (ajt.b) {
                    if (ajt.i.b(i5) > i2) {
                        break;
                    }
                } else if (ajt.i.b(i5) < i2) {
                    break;
                }
                ajt.i.a(ajt.f);
                ajt.f--;
            }
            ajt.c();
        }
    }

    private final void M() {
        int i2;
        int i3 = this.k;
        if ((65600 & i3) == 65536) {
            ajt ajt = this.K;
            int i4 = this.m;
            if ((i3 & 262144) != 0) {
                i2 = this.W;
            } else {
                i2 = 0;
            }
            while (true) {
                int i5 = ajt.f;
                int i6 = ajt.e;
                if (i5 < i6 || i6 >= i4) {
                    break;
                }
                int c2 = ajt.i.c(i6);
                if (!ajt.b) {
                    if (ajt.i.b(ajt.e) + c2 > i2) {
                        break;
                    }
                } else if (ajt.i.b(ajt.e) - c2 < i2) {
                    break;
                }
                ajt.i.a(ajt.e);
                ajt.e++;
            }
            ajt.c();
        }
    }

    private final void N() {
        int i2;
        ajt ajt = this.K;
        if ((this.k & 262144) == 0) {
            i2 = this.W + this.g;
        } else {
            i2 = -this.g;
        }
        ajt.a(i2, false);
    }

    private final void O() {
        int i2;
        ajt ajt = this.K;
        if ((this.k & 262144) != 0) {
            i2 = this.W + this.g;
        } else {
            i2 = -this.g;
        }
        ajt.g(i2);
    }

    private final void P() {
        ali ali = this.L.e;
        int i2 = ali.g - this.E;
        int I2 = I() + i2;
        ali.a(i2, I2, i2, I2);
    }

    private final void Q() {
        this.K = null;
        this.S = null;
        this.k &= -1025;
    }

    static final void a(View view, View view2) {
        akg akg;
        if (view != null && view2 != null && (akg = ((ajy) view.getLayoutParams()).l) != null) {
            int length = akg.a.length;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.R
            r2 = 0
            if (r1 != 0) goto L_0x0191
            int[] r1 = r0.S
            if (r1 == 0) goto L_0x0191
            ajt r1 = r0.K
            if (r1 == 0) goto L_0x0018
            int r4 = r1.e
            int r5 = r1.f
            oe[] r1 = r1.a((int) r4, (int) r5)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = -1
        L_0x001d:
            int r8 = r0.J
            if (r5 >= r8) goto L_0x0190
            if (r1 == 0) goto L_0x0026
            r8 = r1[r5]
            goto L_0x0027
        L_0x0026:
            r8 = 0
        L_0x0027:
            if (r8 == 0) goto L_0x002e
            int r9 = r8.b()
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            r10 = 0
            r11 = -1
        L_0x0031:
            if (r10 >= r9) goto L_0x0066
            int r12 = r8.b(r10)
            int r13 = r10 + 1
            int r13 = r8.b(r13)
        L_0x003d:
            if (r12 <= r13) goto L_0x0042
            int r10 = r10 + 2
            goto L_0x0031
        L_0x0042:
            int r14 = r0.f
            int r14 = r12 - r14
            android.view.View r14 = r0.b((int) r14)
            if (r14 != 0) goto L_0x004d
            goto L_0x0063
        L_0x004d:
            if (r21 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r0.o((android.view.View) r14)
        L_0x0053:
            int r15 = r0.d
            if (r15 != 0) goto L_0x005c
            int r14 = q((android.view.View) r14)
            goto L_0x0060
        L_0x005c:
            int r14 = r(r14)
        L_0x0060:
            if (r14 <= r11) goto L_0x0063
            r11 = r14
        L_0x0063:
            int r12 = r12 + 1
            goto L_0x003d
        L_0x0066:
            adi r8 = r0.e
            int r8 = r8.a()
            ajp r9 = r0.c
            boolean r9 = r9.hasFixedSize()
            if (r9 == 0) goto L_0x0075
            goto L_0x007e
        L_0x0075:
            if (r21 != 0) goto L_0x0078
        L_0x0077:
            goto L_0x007e
        L_0x0078:
            if (r11 < 0) goto L_0x007b
            goto L_0x0077
        L_0x007b:
            if (r8 > 0) goto L_0x0083
            goto L_0x0077
        L_0x007e:
            r16 = r1
            r2 = 1
            goto L_0x017a
        L_0x0083:
            if (r7 >= 0) goto L_0x016f
            int r9 = r0.m
            if (r9 >= 0) goto L_0x008b
            r9 = 0
            goto L_0x008f
        L_0x008b:
            if (r9 < r8) goto L_0x008f
            int r9 = r8 + -1
        L_0x008f:
            int r12 = r20.r()
            if (r12 <= 0) goto L_0x00d5
            ajp r12 = r0.c
            android.view.View r13 = r0.h((int) r2)
            adl r12 = r12.getChildViewHolder(r13)
            int r12 = r12.c()
            ajp r13 = r0.c
            int r14 = r20.r()
            int r14 = r14 + r4
            android.view.View r14 = r0.h((int) r14)
            adl r13 = r13.getChildViewHolder(r14)
            int r13 = r13.c()
            if (r9 >= r12) goto L_0x00b9
            goto L_0x00d5
        L_0x00b9:
            if (r9 > r13) goto L_0x00d5
            int r14 = r9 - r12
            int r9 = r13 - r9
            if (r14 <= r9) goto L_0x00c4
            int r9 = r13 + 1
            goto L_0x00c6
        L_0x00c4:
            int r9 = r12 + -1
        L_0x00c6:
            if (r9 >= 0) goto L_0x00cf
            int r14 = r8 + -1
            if (r13 >= r14) goto L_0x00cf
            int r9 = r13 + 1
            goto L_0x00d5
        L_0x00cf:
            if (r9 < r8) goto L_0x00d5
            if (r12 <= 0) goto L_0x00d5
            int r9 = r12 + -1
        L_0x00d5:
            if (r9 >= 0) goto L_0x00de
            r16 = r1
            r17 = r11
            r2 = 1
            goto L_0x0174
        L_0x00de:
            if (r9 >= r8) goto L_0x016f
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int[] r12 = r0.X
            adb r13 = r0.j
            android.view.View r9 = r13.b((int) r9)
            if (r9 == 0) goto L_0x0158
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            ajy r13 = (defpackage.ajy) r13
            android.graphics.Rect r14 = O
            r0.b((android.view.View) r9, (android.graphics.Rect) r14)
            int r14 = r13.leftMargin
            int r15 = r13.rightMargin
            android.graphics.Rect r3 = O
            int r3 = r3.left
            android.graphics.Rect r4 = O
            int r4 = r4.right
            int r10 = r13.topMargin
            int r2 = r13.bottomMargin
            r16 = r1
            android.graphics.Rect r1 = O
            int r1 = r1.top
            r17 = r11
            android.graphics.Rect r11 = O
            int r11 = r11.bottom
            int r18 = r20.s()
            int r19 = r20.u()
            int r18 = r18 + r19
            int r14 = r14 + r15
            int r14 = r14 + r3
            int r14 = r14 + r4
            int r3 = r18 + r14
            int r4 = r13.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r7, r3, r4)
            int r4 = r20.t()
            int r7 = r20.v()
            int r4 = r4 + r7
            int r10 = r10 + r2
            int r10 = r10 + r1
            int r10 = r10 + r11
            int r4 = r4 + r10
            int r1 = r13.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r4, r1)
            r9.measure(r3, r1)
            int r1 = r(r9)
            r2 = 0
            r12[r2] = r1
            int r1 = q((android.view.View) r9)
            r2 = 1
            r12[r2] = r1
            adb r1 = r0.j
            r1.a((android.view.View) r9)
            goto L_0x015c
        L_0x0158:
            r16 = r1
            r17 = r11
        L_0x015c:
            int r1 = r0.d
            if (r1 == 0) goto L_0x0168
            int[] r1 = r0.X
            r2 = 0
            r1 = r1[r2]
            r7 = r1
            r2 = 1
            goto L_0x0174
        L_0x0168:
            int[] r1 = r0.X
            r2 = 1
            r1 = r1[r2]
            r7 = r1
            goto L_0x0174
        L_0x016f:
            r16 = r1
            r17 = r11
            r2 = 1
        L_0x0174:
            if (r7 < 0) goto L_0x0178
            r11 = r7
            goto L_0x017a
        L_0x0178:
            r11 = r17
        L_0x017a:
            if (r11 < 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r11 = 0
        L_0x017e:
            int[] r1 = r0.S
            r3 = r1[r5]
            if (r3 != r11) goto L_0x0185
            goto L_0x0188
        L_0x0185:
            r1[r5] = r11
            r6 = 1
        L_0x0188:
            int r5 = r5 + 1
            r1 = r16
            r2 = 0
            r4 = -1
            goto L_0x001d
        L_0x0190:
            return r6
        L_0x0191:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.b(boolean):boolean");
    }

    private final void d(adb adb, adi adi) {
        if (!(this.j == null && this.e == null)) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.j = adb;
        this.e = adi;
        this.f = 0;
        this.g = 0;
    }

    private final int m(int i2) {
        return t(h(i2));
    }

    private final int n(int i2) {
        int i3 = this.R;
        if (i3 != 0) {
            return i3;
        }
        int[] iArr = this.S;
        if (iArr != null) {
            return iArr[i2];
        }
        return 0;
    }

    private final int o(int i2) {
        boolean z;
        int i3;
        int i4;
        int i5 = this.k;
        boolean z2 = true;
        if ((i5 & 64) == 0 && (i5 & 3) != 1) {
            if (i2 > 0) {
                if (!this.L.d.c() && i2 > (i4 = this.L.d.c)) {
                    i2 = i4;
                }
            } else if (i2 < 0 && !this.L.d.b() && i2 < (i3 = this.L.d.d)) {
                i2 = i3;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i6 = -i2;
        int r = r();
        if (this.d != 1) {
            for (int i7 = 0; i7 < r; i7++) {
                h(i7).offsetLeftAndRight(i6);
            }
        } else {
            for (int i8 = 0; i8 < r; i8++) {
                h(i8).offsetTopAndBottom(i6);
            }
        }
        if ((this.k & 3) != 1) {
            int r2 = r();
            if ((this.k & 262144) != 0 ? i2 <= 0 : i2 >= 0) {
                N();
            } else {
                O();
            }
            if (r() > r2) {
                z = true;
            } else {
                z = false;
            }
            int r3 = r();
            if ((262144 & this.k) != 0 ? i2 <= 0 : i2 >= 0) {
                M();
            } else {
                L();
            }
            if (r() >= r3) {
                z2 = false;
            }
            if (z || z2) {
                J();
            }
            this.c.invalidate();
            C();
            return i2;
        }
        C();
        return i2;
    }

    private final int p(int i2) {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int i4 = -i2;
        int r = r();
        if (this.d != 0) {
            while (i3 < r) {
                h(i3).offsetLeftAndRight(i4);
                i3++;
            }
        } else {
            while (i3 < r) {
                h(i3).offsetTopAndBottom(i4);
                i3++;
            }
        }
        this.E += i2;
        P();
        this.c.invalidate();
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int q(int r10) {
        /*
            r9 = this;
            int r0 = r9.d
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 1
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 17
            if (r0 == 0) goto L_0x002d
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L_0x0025
            if (r10 == r3) goto L_0x0024
            if (r10 == r2) goto L_0x001c
            if (r10 == r1) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            return r4
        L_0x001c:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0023
            r4 = 2
            goto L_0x0049
        L_0x0023:
            return r6
        L_0x0024:
            return r5
        L_0x0025:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 == 0) goto L_0x002c
            r4 = 3
            goto L_0x0049
        L_0x002c:
            return r7
        L_0x002d:
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L_0x0044
            if (r10 == r3) goto L_0x0043
            if (r10 == r2) goto L_0x003b
            if (r10 == r1) goto L_0x003a
        L_0x0037:
            r4 = 17
            goto L_0x0049
        L_0x003a:
            return r6
        L_0x003b:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0042
            r4 = 0
            goto L_0x0049
        L_0x0042:
            return r4
        L_0x0043:
            return r7
        L_0x0044:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 == 0) goto L_0x004a
        L_0x0049:
            return r4
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.q(int):int");
    }

    static final int r(View view) {
        ajy ajy = (ajy) view.getLayoutParams();
        return act.i(view) + ajy.leftMargin + ajy.rightMargin;
    }

    private final int s(View view) {
        return this.d != 0 ? v(view) : u(view);
    }

    private static final int t(View view) {
        ajy ajy;
        if (view == null || (ajy = (ajy) view.getLayoutParams()) == null || ajy.a()) {
            return -1;
        }
        return ajy.d();
    }

    private static final int u(View view) {
        ajy ajy = (ajy) view.getLayoutParams();
        return view.getLeft() + ajy.a + ajy.i;
    }

    private static final int v(View view) {
        ajy ajy = (ajy) view.getLayoutParams();
        return view.getTop() + ajy.b + ajy.j;
    }

    /* access modifiers changed from: package-private */
    public final void B() {
        int i2 = 0;
        if (r() > 0) {
            i2 = this.K.e - ((ajy) h(0).getLayoutParams()).c();
        }
        this.f = i2;
    }

    /* access modifiers changed from: package-private */
    public final void C() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length;
        if (this.e.a() != 0) {
            if ((this.k & 262144) == 0) {
                i5 = this.K.f;
                i2 = this.K.e;
                i3 = this.e.a() - 1;
                i4 = 0;
            } else {
                ajt ajt = this.K;
                int i8 = ajt.e;
                i2 = ajt.f;
                i3 = 0;
                int i9 = i8;
                i4 = this.e.a() - 1;
                i5 = i9;
            }
            if (i5 >= 0 && i2 >= 0) {
                if (i5 == i3 || !this.L.d.c() || i2 == i4 || !this.L.d.b()) {
                    int i10 = Integer.MAX_VALUE;
                    if (i5 == i3) {
                        i10 = this.K.b(true, M);
                        View b2 = b(M[1]);
                        i6 = s(b2);
                        int[] iArr = ((ajy) b2.getLayoutParams()).k;
                        if (iArr != null && (length = iArr.length) > 0) {
                            i6 += iArr[length - 1] - iArr[0];
                        }
                    } else {
                        i6 = Integer.MAX_VALUE;
                    }
                    int i11 = Integer.MIN_VALUE;
                    if (i2 == i4) {
                        i11 = this.K.a(false, M);
                        i7 = s(b(M[1]));
                    } else {
                        i7 = Integer.MIN_VALUE;
                    }
                    this.L.d.a(i11, i10, i7, i6);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        ajx ajx = this.n;
        if (ajx != null) {
            ajx.n = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        int y = y();
        return y == 0 || this.c.findViewHolderForAdapterPosition(y + -1) != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean F() {
        return y() == 0 || this.c.findViewHolderForAdapterPosition(0) != null;
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                akj akj = (akj) this.l.get(size);
            }
        }
    }

    public final int a(adb adb, adi adi) {
        ajt ajt;
        if (this.d != 0 || (ajt = this.K) == null) {
            return -1;
        }
        return ajt.d;
    }

    public final void a(adi adi) {
    }

    public final boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    public final int b(adb adb, adi adi) {
        ajt ajt;
        if (this.d != 1 || (ajt = this.K) == null) {
            return -1;
        }
        return ajt.d;
    }

    public final void b(int i2, int i3) {
        ajt ajt;
        int i4;
        int i5 = this.m;
        if (i5 != -1 && (ajt = this.K) != null && ajt.e >= 0 && (i4 = this.P) != Integer.MIN_VALUE && i2 <= i5 + i4) {
            this.P = i4 + i3;
        }
    }

    public final boolean b() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00db A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View c(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.k
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00dd
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r9 != r2) goto L_0x0012
            goto L_0x001b
        L_0x0012:
            if (r9 == r3) goto L_0x001b
            ajp r4 = r7.c
            android.view.View r0 = r0.findNextFocus(r4, r8, r9)
            goto L_0x0054
        L_0x001b:
            boolean r4 = r7.h()
            if (r4 == 0) goto L_0x002f
            if (r9 != r2) goto L_0x0026
            r4 = 130(0x82, float:1.82E-43)
            goto L_0x0028
        L_0x0026:
            r4 = 33
        L_0x0028:
            ajp r5 = r7.c
            android.view.View r4 = r0.findNextFocus(r5, r8, r4)
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            boolean r5 = r7.g()
            if (r5 == 0) goto L_0x0053
            int r4 = r7.q()
            if (r4 != r3) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            if (r9 != r2) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r4 = r4 ^ r5
            if (r4 != 0) goto L_0x004a
            r4 = 17
            goto L_0x004c
        L_0x004a:
            r4 = 66
        L_0x004c:
            ajp r5 = r7.c
            android.view.View r0 = r0.findNextFocus(r5, r8, r4)
            goto L_0x0054
        L_0x0053:
            r0 = r4
        L_0x0054:
            if (r0 != 0) goto L_0x00dc
            ajp r4 = r7.c
            int r4 = r4.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r4 != r5) goto L_0x006b
            ajp r0 = r7.c
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r8 = r0.focusSearch(r8, r9)
            return r8
        L_0x006b:
            int r4 = r7.q((int) r9)
            ajp r5 = r7.c
            int r5 = r5.getScrollState()
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r4 == r3) goto L_0x00ad
            if (r4 == 0) goto L_0x0093
            r1 = 3
            if (r4 == r1) goto L_0x008a
            if (r4 == r2) goto L_0x0081
            goto L_0x00c7
        L_0x0081:
            if (r5 != 0) goto L_0x00c6
            int r1 = r7.k
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x00c7
            goto L_0x00c6
        L_0x008a:
            if (r5 != 0) goto L_0x00c6
            int r1 = r7.k
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x00c7
            goto L_0x00c6
        L_0x0093:
            if (r5 != 0) goto L_0x009c
            int r2 = r7.k
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r0 = r8
        L_0x009e:
            int r2 = r7.k
            r2 = r2 & r6
            if (r2 == 0) goto L_0x00c7
            boolean r2 = r7.F()
            if (r2 != 0) goto L_0x00c7
            r7.a((boolean) r1)
            goto L_0x00c6
        L_0x00ad:
            if (r5 != 0) goto L_0x00b6
            int r1 = r7.k
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r0 = r8
        L_0x00b8:
            int r1 = r7.k
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c7
            boolean r1 = r7.E()
            if (r1 != 0) goto L_0x00c7
            r7.a((boolean) r3)
        L_0x00c6:
            r0 = r8
        L_0x00c7:
            if (r0 != 0) goto L_0x00db
            ajp r0 = r7.c
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r9 = r0.focusSearch(r8, r9)
            if (r9 != 0) goto L_0x00da
            if (r8 != 0) goto L_0x00d9
            ajp r8 = r7.c
        L_0x00d9:
            return r8
        L_0x00da:
            return r9
        L_0x00db:
            return r0
        L_0x00dc:
            return r0
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.c(android.view.View, int):android.view.View");
    }

    public final void c() {
        this.P = 0;
    }

    public final void c(int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.m;
        if (i6 != -1 && (i4 = this.P) != Integer.MIN_VALUE) {
            int i7 = i6 + i4;
            if (i2 <= i7 && i7 < i2 + 1) {
                i5 = i4 + (i3 - i2);
            } else if (i2 < i7 && i3 > i7 - 1) {
                i5 = i4 - 1;
            } else if (i2 > i7 && i3 < i7) {
                i5 = i4 + 1;
            } else {
                return;
            }
            this.P = i5;
        }
    }

    public final void d(int i2, int i3) {
        ajt ajt;
        int i4;
        int i5;
        int i6 = this.m;
        if (i6 != -1 && (ajt = this.K) != null && ajt.e >= 0 && (i4 = this.P) != Integer.MIN_VALUE && i2 <= (i5 = i6 + i4)) {
            if (i2 + i3 > i5) {
                this.m = i6 + i4 + (i2 - i5);
                this.P = Integer.MIN_VALUE;
                return;
            }
            this.P = i4 - i3;
        }
    }

    public final int e(View view) {
        return super.e(view) + ((ajy) view.getLayoutParams()).b;
    }

    public final int f(View view) {
        return super.f(view) - ((ajy) view.getLayoutParams()).g;
    }

    public final int g(View view) {
        return super.g(view) - ((ajy) view.getLayoutParams()).h;
    }

    public final boolean g() {
        return this.d == 0 || this.J > 1;
    }

    public final boolean h() {
        return this.d == 1 || this.J > 1;
    }

    /* access modifiers changed from: protected */
    public final View i(int i2) {
        Object obj;
        ajr ajr;
        ajq a2;
        View b2 = this.j.b(i2);
        ajy ajy = (ajy) b2.getLayoutParams();
        adl childViewHolder = this.c.getChildViewHolder(b2);
        if (childViewHolder instanceof ajq) {
            obj = ((ajq) childViewHolder).a();
        } else {
            obj = null;
        }
        if (!(obj != null || (ajr = this.Y) == null || (a2 = ajr.a()) == null)) {
            obj = a2.a();
        }
        ajy.l = (akg) obj;
        return b2;
    }

    /* access modifiers changed from: protected */
    public final boolean i() {
        return this.K != null;
    }

    /* access modifiers changed from: package-private */
    public final int j(int i2) {
        int i3 = 0;
        if ((this.k & 524288) != 0) {
            for (int i4 = this.J - 1; i4 > i2; i4--) {
                i3 += n(i4) + this.H;
            }
            return i3;
        }
        int i5 = 0;
        while (i3 < i2) {
            i5 += n(i3) + this.H;
            i3++;
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        View view;
        if (j()) {
            int i2 = this.m;
            if (i2 != -1) {
                view = b(i2);
            } else {
                view = null;
            }
            if (view != null) {
                a((RecyclerView) this.c, this.c.getChildViewHolder(view), this.m);
            } else {
                a((RecyclerView) this.c, (adl) null, -1);
            }
            if ((this.k & 3) != 1 && !this.c.isLayoutRequested()) {
                int r = r();
                int i3 = 0;
                while (i3 < r) {
                    if (!h(i3).isLayoutRequested()) {
                        i3++;
                    } else {
                        K();
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int l(View view) {
        return this.N.d(view);
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        return (this.k & 64) != 0;
    }

    static final int q(View view) {
        ajy ajy = (ajy) view.getLayoutParams();
        return act.h(view) + ajy.topMargin + ajy.bottomMargin;
    }

    public final int d(View view) {
        return super.d(view) + ((ajy) view.getLayoutParams()).a;
    }

    public final void e(int i2) {
        if (i2 >= 0 || i2 == -2) {
            this.Q = i2;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i2);
    }

    public final Parcelable f() {
        GridLayoutManager$SavedState gridLayoutManager$SavedState = new GridLayoutManager$SavedState();
        gridLayoutManager$SavedState.a = this.m;
        int r = r();
        for (int i2 = 0; i2 < r; i2++) {
            t(h(i2));
        }
        gridLayoutManager$SavedState.b = null;
        return gridLayoutManager$SavedState;
    }

    public final void l(int i2) {
        b(i2, false);
    }

    /* access modifiers changed from: package-private */
    public final int m(View view) {
        return this.N.c(view);
    }

    /* access modifiers changed from: package-private */
    public final int n(View view) {
        a(view, O);
        return this.d != 0 ? O.height() : O.width();
    }

    private final void a(View view, View view2, boolean z) {
        a(view, view2, z, 0, 0);
    }

    public final void d(int i2) {
        b(i2, false);
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        ArrayList arrayList = this.l;
        return arrayList != null && arrayList.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        View view;
        if (j()) {
            int i2 = this.m;
            if (i2 != -1) {
                view = b(i2);
            } else {
                view = null;
            }
            if (view != null) {
                this.c.getChildViewHolder(view);
                G();
                return;
            }
            G();
        }
    }

    private final void a(View view, View view2, boolean z, int i2, int i3) {
        int i4;
        if ((this.k & 64) == 0) {
            int t = t(view);
            a(view, view2);
            if (t != this.m) {
                this.m = t;
                this.P = 0;
                if ((this.k & 3) != 1) {
                    k();
                }
                if (this.c.b()) {
                    this.c.invalidate();
                }
            }
            if (view != null) {
                if (!view.hasFocus() && this.c.hasFocus()) {
                    view.requestFocus();
                }
                if ((this.k & 131072) != 0 || !z) {
                    if (a(view, view2, M) || i2 != 0 || i3 != 0) {
                        int[] iArr = M;
                        int i5 = iArr[0] + i2;
                        int i6 = iArr[1] + i3;
                        if ((this.k & 3) == 1) {
                            o(i5);
                            p(i6);
                            return;
                        }
                        int i7 = this.d;
                        if (i7 == 0) {
                            i4 = i6;
                        } else {
                            i4 = i5;
                        }
                        if (i7 != 0) {
                            i5 = i6;
                        }
                        if (!z) {
                            this.c.scrollBy(i5, i4);
                            m();
                            return;
                        }
                        this.c.smoothScrollBy(i5, i4);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean p(View view) {
        return view.getVisibility() == 0 && (!w() || view.hasFocusable());
    }

    /* access modifiers changed from: package-private */
    public final boolean k(int i2) {
        adl findViewHolderForAdapterPosition = this.c.findViewHolderForAdapterPosition(i2);
        if (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.a.getLeft() < 0 || findViewHolderForAdapterPosition.a.getRight() > this.c.getWidth() || findViewHolderForAdapterPosition.a.getTop() < 0 || findViewHolderForAdapterPosition.a.getBottom() > this.c.getHeight()) {
            return false;
        }
        return true;
    }

    public final void c(int i2) {
        if (i2 >= 0) {
            this.U = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int a(int i2, adb adb, adi adi) {
        int i3;
        if ((this.k & 512) == 0 || !i()) {
            return 0;
        }
        d(adb, adi);
        this.k = (this.k & -4) | 2;
        if (this.d == 0) {
            i3 = o(i2);
        } else {
            i3 = p(i2);
        }
        H();
        this.k &= -4;
        return i3;
    }

    public final void c(adb adb) {
        for (int r = r() - 1; r >= 0; r--) {
            a(r, adb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0286, code lost:
        r0 = r6.K.f;
        r4 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028d, code lost:
        if (r4 < r13) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028f, code lost:
        a(h(r4), r6.j);
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029b, code lost:
        r6.K.b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a5, code lost:
        if ((r6.k & 65536) != 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ad, code lost:
        if (r6.K.b() == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b3, code lost:
        if (r6.K.f < r0) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b6, code lost:
        N();
        r1 = r6.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bb, code lost:
        if (r1 < 0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bd, code lost:
        if (r1 > r0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bf, code lost:
        r0 = r6.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c5, code lost:
        if (r0.f >= r6.m) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c7, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fb, code lost:
        if (((r1 & 262144) != 0) != r2.b) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ce, code lost:
        if (r20 != false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x056b, code lost:
        if ((r0 & 8) != 0) goto L_0x0579;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03a5 A[LOOP:6: B:157:0x03a5->B:160:0x03b1, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05dc A[LOOP:7: B:161:0x03b4->B:292:0x05dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x042e A[EDGE_INSN: B:312:0x042e->B:194:0x042e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.adb r23, defpackage.adi r24) {
        /*
            r22 = this;
            r6 = r22
            r7 = r24
            int r0 = r6.J
            if (r0 == 0) goto L_0x05f0
            int r0 = r24.a()
            if (r0 < 0) goto L_0x05f0
            int r0 = r6.k
            r0 = r0 & 64
            if (r0 != 0) goto L_0x0015
            goto L_0x0022
        L_0x0015:
            int r0 = r22.r()
            if (r0 <= 0) goto L_0x0022
            int r0 = r6.k
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.k = r0
            return
        L_0x0022:
            int r0 = r6.k
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x05e9
            r0 = r0 & -4
            r8 = 1
            r0 = r0 | r8
            r6.k = r0
            r22.d((defpackage.adb) r23, (defpackage.adi) r24)
            boolean r0 = r7.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            if (r0 == 0) goto L_0x00d2
            r22.B()
            int r0 = r22.r()
            ajt r3 = r6.K
            if (r3 != 0) goto L_0x0045
            goto L_0x00c8
        L_0x0045:
            if (r0 <= 0) goto L_0x00c8
            ajp r3 = r6.c
            android.view.View r4 = r6.h((int) r9)
            adl r3 = r3.getChildViewHolder(r4)
            int r3 = r3.d
            ajp r4 = r6.c
            int r5 = r0 + -1
            android.view.View r5 = r6.h((int) r5)
            adl r4 = r4.getChildViewHolder(r5)
            int r4 = r4.d
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0064:
            if (r9 >= r0) goto L_0x00bd
            android.view.View r5 = r6.h((int) r9)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            ajy r7 = (defpackage.ajy) r7
            ajp r8 = r6.c
            int r8 = r8.getChildAdapterPosition(r5)
            boolean r10 = r7.b()
            if (r10 != 0) goto L_0x00aa
            boolean r10 = r7.a()
            if (r10 != 0) goto L_0x00aa
            boolean r10 = r5.isLayoutRequested()
            if (r10 != 0) goto L_0x00aa
            boolean r10 = r5.hasFocus()
            if (r10 != 0) goto L_0x0096
            int r10 = r6.m
            int r11 = r7.d()
            if (r10 == r11) goto L_0x00aa
        L_0x0096:
            boolean r10 = r5.hasFocus()
            if (r10 == 0) goto L_0x00a5
            int r10 = r6.m
            int r7 = r7.d()
            if (r10 == r7) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            if (r8 < r3) goto L_0x00aa
            if (r8 > r4) goto L_0x00aa
            goto L_0x00ba
        L_0x00aa:
            int r7 = r6.l((android.view.View) r5)
            int r1 = java.lang.Math.min(r1, r7)
            int r5 = r6.m((android.view.View) r5)
            int r2 = java.lang.Math.max(r2, r5)
        L_0x00ba:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x00bd:
            if (r2 <= r1) goto L_0x00c2
            int r2 = r2 - r1
            r6.g = r2
        L_0x00c2:
            r22.N()
            r22.O()
        L_0x00c8:
            int r0 = r6.k
            r0 = r0 & -4
            r6.k = r0
            r22.H()
            return
        L_0x00d2:
            boolean r0 = r7.k
            if (r0 == 0) goto L_0x0103
            android.util.SparseIntArray r0 = r6.h
            r0.clear()
            int r0 = r22.r()
            r3 = 0
        L_0x00e0:
            if (r3 < r0) goto L_0x00e3
            goto L_0x0103
        L_0x00e3:
            ajp r4 = r6.c
            android.view.View r5 = r6.h((int) r3)
            adl r4 = r4.getChildViewHolder(r5)
            int r4 = r4.d
            if (r4 < 0) goto L_0x0100
            ajt r5 = r6.K
            ajs r5 = r5.d(r4)
            if (r5 == 0) goto L_0x0100
            android.util.SparseIntArray r10 = r6.h
            int r5 = r5.a
            r10.put(r4, r5)
        L_0x0100:
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x0103:
            boolean r0 = r22.p()
            r10 = r0 ^ 1
            int r3 = r6.m
            r11 = -1
            if (r3 != r11) goto L_0x010f
            goto L_0x0116
        L_0x010f:
            int r4 = r6.P
            if (r4 == r2) goto L_0x0116
            int r3 = r3 + r4
            r6.m = r3
        L_0x0116:
            r6.P = r9
            android.view.View r12 = r6.b((int) r3)
            int r13 = r6.m
            ajp r3 = r6.c
            boolean r14 = r3.hasFocus()
            ajt r3 = r6.K
            if (r3 == 0) goto L_0x012b
            int r4 = r3.e
            goto L_0x012c
        L_0x012b:
            r4 = -1
        L_0x012c:
            if (r3 == 0) goto L_0x0131
            int r3 = r3.f
            goto L_0x0132
        L_0x0131:
            r3 = -1
        L_0x0132:
            int r5 = r6.d
            if (r5 != 0) goto L_0x0140
            int r5 = r7.o
            int r15 = r7.p
            r21 = r15
            r15 = r5
            r5 = r21
            goto L_0x0149
        L_0x0140:
            int r15 = r7.o
            int r5 = r7.p
            r21 = r15
            r15 = r5
            r5 = r21
        L_0x0149:
            adi r1 = r6.e
            int r1 = r1.a()
            if (r1 == 0) goto L_0x0160
            int r2 = r6.m
            if (r2 < r1) goto L_0x0159
            int r1 = r1 + r11
            r6.m = r1
            goto L_0x0162
        L_0x0159:
            if (r2 != r11) goto L_0x0162
            if (r1 <= 0) goto L_0x0162
            r6.m = r9
            goto L_0x0162
        L_0x0160:
            r6.m = r11
        L_0x0162:
            adi r1 = r6.e
            boolean r1 = r1.f
            r17 = 262144(0x40000, float:3.67342E-40)
            if (r1 == 0) goto L_0x0173
            r19 = r12
            r18 = r13
            r20 = r14
            r14 = r5
            goto L_0x02e1
        L_0x0173:
            ajt r1 = r6.K
            if (r1 == 0) goto L_0x02da
            int r2 = r1.e
            if (r2 < 0) goto L_0x02da
            int r2 = r6.k
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x02da
            int r1 = r1.d
            int r2 = r6.J
            if (r1 != r2) goto L_0x02da
            alj r0 = r6.L
            ali r1 = r0.c
            int r2 = r6.C
            r1.f = r2
            ali r0 = r0.b
            int r2 = r6.D
            r0.f = r2
            int r0 = r22.s()
            int r2 = r22.u()
            r1.a(r0, r2)
            alj r0 = r6.L
            ali r0 = r0.b
            int r1 = r22.t()
            int r2 = r22.v()
            r0.a(r1, r2)
            alj r0 = r6.L
            ali r0 = r0.d
            int r0 = r0.f
            r6.W = r0
            r22.P()
            ajt r0 = r6.K
            int r1 = r6.G
            r0.c = r1
            int r1 = r6.k
            r1 = r1 | 4
            r6.k = r1
            int r1 = r6.m
            r0.h = r1
            int r4 = r22.r()
            ajt r0 = r6.K
            int r0 = r0.e
            int r1 = r6.k
            r1 = r1 & -9
            r6.k = r1
            r3 = r0
            r2 = 0
        L_0x01da:
            if (r2 >= r4) goto L_0x02cb
            android.view.View r0 = r6.h((int) r2)
            int r1 = t(r0)
            if (r3 == r1) goto L_0x01f2
            r7 = r3
            r9 = r4
            r19 = r12
            r18 = r13
            r20 = r14
            r13 = r2
            r14 = r5
            goto L_0x0286
        L_0x01f2:
            ajt r1 = r6.K
            ajs r1 = r1.d(r3)
            if (r1 == 0) goto L_0x027c
            int r9 = r1.a
            int r9 = r6.j(r9)
            alj r8 = r6.L
            ali r8 = r8.e
            int r8 = r8.g
            int r9 = r9 + r8
            int r8 = r6.E
            int r8 = r9 - r8
            int r9 = r6.l((android.view.View) r0)
            int r11 = r6.n((android.view.View) r0)
            android.view.ViewGroup$LayoutParams r16 = r0.getLayoutParams()
            r23 = r4
            r4 = r16
            ajy r4 = (defpackage.ajy) r4
            adl r4 = r4.c
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x0239
            int r4 = r6.k
            r4 = r4 | 8
            r6.k = r4
            adb r4 = r6.j
            r6.a((android.view.View) r0, (defpackage.adb) r4)
            android.view.View r0 = r6.i(r3)
            r6.b((android.view.View) r0, (int) r2)
            r4 = r0
            goto L_0x023a
        L_0x0239:
            r4 = r0
        L_0x023a:
            r6.o((android.view.View) r4)
            int r0 = r6.d
            if (r0 != 0) goto L_0x0248
            int r0 = r(r4)
            int r16 = r9 + r0
            goto L_0x024e
        L_0x0248:
            int r0 = q((android.view.View) r4)
            int r16 = r9 + r0
        L_0x024e:
            int r1 = r1.a
            r19 = r12
            r12 = r0
            r0 = r22
            r18 = r13
            r13 = r2
            r2 = r4
            r4 = r3
            r3 = r9
            r9 = r23
            r7 = r4
            r4 = r16
            r20 = r14
            r14 = r5
            r5 = r8
            r0.a((int) r1, (android.view.View) r2, (int) r3, (int) r4, (int) r5)
            if (r11 != r12) goto L_0x0286
            int r2 = r13 + 1
            int r3 = r7 + 1
            r7 = r24
            r4 = r9
            r5 = r14
            r13 = r18
            r12 = r19
            r14 = r20
            r8 = 1
            r9 = 0
            r11 = -1
            goto L_0x01da
        L_0x027c:
            r7 = r3
            r9 = r4
            r19 = r12
            r18 = r13
            r20 = r14
            r13 = r2
            r14 = r5
        L_0x0286:
            ajt r0 = r6.K
            int r0 = r0.f
            r1 = -1
            int r4 = r9 + -1
        L_0x028d:
            if (r4 < r13) goto L_0x029b
            android.view.View r1 = r6.h((int) r4)
            adb r2 = r6.j
            r6.a((android.view.View) r1, (defpackage.adb) r2)
            int r4 = r4 + -1
            goto L_0x028d
        L_0x029b:
            ajt r1 = r6.K
            r1.b(r7)
            int r1 = r6.k
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x02b6
        L_0x02a7:
            ajt r1 = r6.K
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x02d2
            ajt r1 = r6.K
            int r1 = r1.f
            if (r1 < r0) goto L_0x02a7
            goto L_0x02d2
        L_0x02b6:
            r22.N()
            int r1 = r6.m
            if (r1 < 0) goto L_0x02d2
            if (r1 > r0) goto L_0x02d2
        L_0x02bf:
            ajt r0 = r6.K
            int r1 = r0.f
            int r2 = r6.m
            if (r1 >= r2) goto L_0x02d2
            r0.b()
            goto L_0x02bf
        L_0x02cb:
            r19 = r12
            r18 = r13
            r20 = r14
            r14 = r5
        L_0x02d2:
            r22.C()
            r22.P()
            goto L_0x03b4
        L_0x02da:
            r19 = r12
            r18 = r13
            r20 = r14
            r14 = r5
        L_0x02e1:
            int r1 = r6.k
            r1 = r1 & -257(0xfffffffffffffeff, float:NaN)
            r6.k = r1
            ajt r2 = r6.K
            if (r2 == 0) goto L_0x02fd
            int r5 = r6.J
            int r7 = r2.d
            if (r5 == r7) goto L_0x02f2
            goto L_0x02fd
        L_0x02f2:
            r1 = r1 & r17
            if (r1 != 0) goto L_0x02f8
            r1 = 0
            goto L_0x02f9
        L_0x02f8:
            r1 = 1
        L_0x02f9:
            boolean r2 = r2.b
            if (r1 == r2) goto L_0x0321
        L_0x02fd:
            int r1 = r6.J
            r2 = 1
            if (r1 == r2) goto L_0x030b
            ale r2 = new ale
            r2.<init>()
            r2.a(r1)
            goto L_0x0310
        L_0x030b:
            alc r2 = new alc
            r2.<init>()
        L_0x0310:
            r6.K = r2
            ajv r1 = r6.aa
            r2.i = r1
            int r1 = r6.k
            r1 = r1 & r17
            if (r1 == 0) goto L_0x031e
            r1 = 1
            goto L_0x031f
        L_0x031e:
            r1 = 0
        L_0x031f:
            r2.b = r1
        L_0x0321:
            alj r1 = r6.L
            ali r1 = r1.d
            r1.a()
            alj r1 = r6.L
            ali r2 = r1.c
            int r5 = r6.C
            r2.f = r5
            ali r1 = r1.b
            int r5 = r6.D
            r1.f = r5
            int r1 = r22.s()
            int r5 = r22.u()
            r2.a(r1, r5)
            alj r1 = r6.L
            ali r1 = r1.b
            int r2 = r22.t()
            int r5 = r22.v()
            r1.a(r2, r5)
            alj r1 = r6.L
            ali r1 = r1.d
            int r1 = r1.f
            r6.W = r1
            r1 = 0
            r6.E = r1
            r22.P()
            ajt r1 = r6.K
            int r2 = r6.G
            r1.c = r2
            adb r1 = r6.j
            r6.a((defpackage.adb) r1)
            ajt r1 = r6.K
            r1.a()
            alj r1 = r6.L
            ali r1 = r1.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.b = r2
            r1.d = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.a = r2
            r1.c = r2
            int r1 = r6.k
            r1 = r1 & -21
            if (r0 != 0) goto L_0x0388
            r2 = 16
            goto L_0x0389
        L_0x0388:
            r2 = 0
        L_0x0389:
            r0 = r1 | r2
            r6.k = r0
            if (r10 != 0) goto L_0x0390
            goto L_0x039d
        L_0x0390:
            if (r4 >= 0) goto L_0x0393
        L_0x0392:
            goto L_0x039a
        L_0x0393:
            int r0 = r6.m
            if (r0 > r3) goto L_0x0392
            if (r0 < r4) goto L_0x0392
            goto L_0x039d
        L_0x039a:
            int r4 = r6.m
            r3 = r4
        L_0x039d:
            ajt r0 = r6.K
            r0.h = r4
            r0 = -1
            if (r3 != r0) goto L_0x03a5
            goto L_0x03b4
        L_0x03a5:
            ajt r0 = r6.K
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x03b4
            android.view.View r0 = r6.b((int) r3)
            if (r0 != 0) goto L_0x03b4
            goto L_0x03a5
        L_0x03b4:
            r22.C()
            ajt r0 = r6.K
            int r1 = r0.e
            int r0 = r0.f
            int r2 = -r15
            int r3 = -r14
            int r4 = r6.m
            android.view.View r4 = r6.b((int) r4)
            if (r4 == 0) goto L_0x03cc
            if (r10 == 0) goto L_0x03cc
            r6.a((android.view.View) r4, (int) r2, (int) r3)
        L_0x03cc:
            if (r4 != 0) goto L_0x03d1
            if (r20 == 0) goto L_0x03dd
            goto L_0x041e
        L_0x03d1:
            if (r20 == 0) goto L_0x03dd
            boolean r2 = r4.hasFocus()
            if (r2 != 0) goto L_0x041e
            r4.requestFocus()
            goto L_0x041e
        L_0x03dd:
            ajp r5 = r6.c
            boolean r5 = r5.hasFocus()
            if (r5 != 0) goto L_0x041e
            if (r4 != 0) goto L_0x03e8
            goto L_0x03f4
        L_0x03e8:
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L_0x03f4
            ajp r5 = r6.c
            r5.focusableViewAvailable(r4)
            goto L_0x0411
        L_0x03f4:
            int r5 = r22.r()
            r7 = 0
        L_0x03f9:
            if (r7 >= r5) goto L_0x0411
            android.view.View r4 = r6.h((int) r7)
            if (r4 != 0) goto L_0x0402
            goto L_0x040e
        L_0x0402:
            boolean r8 = r4.hasFocusable()
            if (r8 == 0) goto L_0x040e
            ajp r5 = r6.c
            r5.focusableViewAvailable(r4)
            goto L_0x0411
        L_0x040e:
            int r7 = r7 + 1
            goto L_0x03f9
        L_0x0411:
            if (r10 == 0) goto L_0x041e
            if (r4 == 0) goto L_0x041e
            boolean r5 = r4.hasFocus()
            if (r5 == 0) goto L_0x041e
            r6.a((android.view.View) r4, (int) r2, (int) r3)
        L_0x041e:
            r22.N()
            r22.O()
            ajt r2 = r6.K
            int r3 = r2.e
            if (r3 != r1) goto L_0x05dc
            int r1 = r2.f
            if (r1 != r0) goto L_0x05dc
            r22.M()
            r22.L()
            r0 = r24
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x0544
            adb r0 = r6.j
            java.util.List r0 = r0.d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0446
            goto L_0x0544
        L_0x0446:
            int[] r2 = r6.i
            if (r2 == 0) goto L_0x0450
            int r3 = r2.length
            if (r1 > r3) goto L_0x0450
            r2 = 0
            r3 = 0
            goto L_0x045e
        L_0x0450:
            if (r2 == 0) goto L_0x0454
            int r2 = r2.length
            goto L_0x0456
        L_0x0454:
            r2 = 16
        L_0x0456:
            if (r2 < r1) goto L_0x0540
            int[] r2 = new int[r2]
            r6.i = r2
            r2 = 0
            r3 = 0
        L_0x045e:
            if (r2 >= r1) goto L_0x0476
            java.lang.Object r4 = r0.get(r2)
            adl r4 = (defpackage.adl) r4
            int r4 = r4.e()
            if (r4 < 0) goto L_0x0473
            int r5 = r3 + 1
            int[] r7 = r6.i
            r7[r3] = r4
            r3 = r5
        L_0x0473:
            int r2 = r2 + 1
            goto L_0x045e
        L_0x0476:
            if (r3 <= 0) goto L_0x053a
            int[] r0 = r6.i
            r1 = 0
            java.util.Arrays.sort(r0, r1, r3)
            ajt r0 = r6.K
            int[] r2 = r6.i
            android.util.SparseIntArray r4 = r6.h
            int r5 = r0.f
            if (r5 < 0) goto L_0x048d
            int r7 = java.util.Arrays.binarySearch(r2, r1, r3, r5)
            goto L_0x048e
        L_0x048d:
            r7 = 0
        L_0x048e:
            if (r7 >= 0) goto L_0x04e8
            int r1 = -r7
            r7 = -1
            int r1 = r1 + r7
            boolean r7 = r0.b
            if (r7 != 0) goto L_0x04a8
            ajv r7 = r0.i
            int r7 = r7.b(r5)
            ajv r8 = r0.i
            int r5 = r8.c(r5)
            int r7 = r7 + r5
            int r5 = r0.c
            int r7 = r7 + r5
            goto L_0x04b8
        L_0x04a8:
            ajv r7 = r0.i
            int r7 = r7.b(r5)
            ajv r8 = r0.i
            int r5 = r8.c(r5)
            int r7 = r7 - r5
            int r5 = r0.c
            int r7 = r7 - r5
        L_0x04b8:
        L_0x04b9:
            if (r1 >= r3) goto L_0x04e8
            r5 = r2[r1]
            int r8 = r4.get(r5)
            if (r8 < 0) goto L_0x04c4
            goto L_0x04c5
        L_0x04c4:
            r8 = 0
        L_0x04c5:
            ajv r9 = r0.i
            java.lang.Object[] r10 = r0.a
            r11 = 1
            int r5 = r9.a((int) r5, (boolean) r11, (java.lang.Object[]) r10, (boolean) r11)
            ajv r9 = r0.i
            java.lang.Object[] r10 = r0.a
            r11 = 0
            r10 = r10[r11]
            r9.a((java.lang.Object) r10, (int) r5, (int) r8, (int) r7)
            boolean r8 = r0.b
            if (r8 == 0) goto L_0x04e1
            int r7 = r7 - r5
            int r5 = r0.c
            int r7 = r7 - r5
            goto L_0x04e5
        L_0x04e1:
            int r7 = r7 + r5
            int r5 = r0.c
            int r7 = r7 + r5
        L_0x04e5:
            int r1 = r1 + 1
            goto L_0x04b9
        L_0x04e8:
            int r1 = r0.e
            if (r1 < 0) goto L_0x04f2
            r5 = 0
            int r3 = java.util.Arrays.binarySearch(r2, r5, r3, r1)
            goto L_0x04f3
        L_0x04f2:
            r3 = 0
        L_0x04f3:
            if (r3 >= 0) goto L_0x053a
            int r3 = -r3
            int r3 = r3 + -2
            boolean r5 = r0.b
            if (r5 != 0) goto L_0x0503
            ajv r5 = r0.i
            int r1 = r5.b(r1)
            goto L_0x0509
        L_0x0503:
            ajv r5 = r0.i
            int r1 = r5.b(r1)
        L_0x0509:
        L_0x050a:
            if (r3 < 0) goto L_0x053a
            r5 = r2[r3]
            int r7 = r4.get(r5)
            if (r7 < 0) goto L_0x0515
            goto L_0x0516
        L_0x0515:
            r7 = 0
        L_0x0516:
            ajv r8 = r0.i
            java.lang.Object[] r9 = r0.a
            r10 = 1
            r11 = 0
            int r5 = r8.a((int) r5, (boolean) r11, (java.lang.Object[]) r9, (boolean) r10)
            boolean r8 = r0.b
            if (r8 != 0) goto L_0x0529
            int r8 = r0.c
            int r1 = r1 - r8
            int r1 = r1 - r5
            goto L_0x052d
        L_0x0529:
            int r8 = r0.c
            int r1 = r1 + r8
            int r1 = r1 + r5
        L_0x052d:
            ajv r8 = r0.i
            java.lang.Object[] r9 = r0.a
            r10 = 0
            r9 = r9[r10]
            r8.a((java.lang.Object) r9, (int) r5, (int) r7, (int) r1)
            int r3 = r3 + -1
            goto L_0x050a
        L_0x053a:
            android.util.SparseIntArray r0 = r6.h
            r0.clear()
            goto L_0x0544
        L_0x0540:
            r7 = -1
            int r2 = r2 + r2
            goto L_0x0456
        L_0x0544:
            int r0 = r6.k
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x054f
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r6.k = r0
            goto L_0x0552
        L_0x054f:
            r22.J()
        L_0x0552:
            int r0 = r6.k
            r1 = r0 & 4
            if (r1 != 0) goto L_0x0559
            goto L_0x056e
        L_0x0559:
            int r0 = r6.m
            r1 = r18
            if (r0 != r1) goto L_0x0579
            android.view.View r0 = r6.b((int) r0)
            r2 = r19
            if (r0 != r2) goto L_0x0579
            int r0 = r6.k
            r1 = r0 & 8
            if (r1 == 0) goto L_0x056e
            goto L_0x0579
        L_0x056e:
            r0 = r0 & 20
            r3 = 16
            if (r0 == r3) goto L_0x0575
            goto L_0x057c
        L_0x0575:
            r22.k()
            goto L_0x057c
        L_0x0579:
            r22.k()
        L_0x057c:
            r22.m()
            int r0 = r6.k
            r1 = r0 & 64
            if (r1 != 0) goto L_0x0586
            goto L_0x05d2
        L_0x0586:
            int r1 = r6.d
            r4 = 1
            if (r1 != r4) goto L_0x05a1
            int r0 = r6.D
            int r0 = -r0
            int r1 = r22.r()
            if (r1 <= 0) goto L_0x05cf
            r1 = 0
            android.view.View r1 = r6.h((int) r1)
            int r1 = r1.getTop()
            if (r1 >= 0) goto L_0x05cf
            int r0 = r0 + r1
            goto L_0x05cf
        L_0x05a1:
            r0 = r0 & r17
            if (r0 != 0) goto L_0x05bb
            int r0 = r6.C
            int r0 = -r0
            int r1 = r22.r()
            if (r1 <= 0) goto L_0x05cf
            r1 = 0
            android.view.View r1 = r6.h((int) r1)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x05cf
            int r0 = r0 + r1
            goto L_0x05cf
        L_0x05bb:
            int r0 = r6.C
            int r1 = r22.r()
            if (r1 <= 0) goto L_0x05cf
            r5 = 0
            android.view.View r1 = r6.h((int) r5)
            int r1 = r1.getRight()
            if (r1 <= r0) goto L_0x05cf
            r0 = r1
        L_0x05cf:
            r6.o((int) r0)
        L_0x05d2:
            int r0 = r6.k
            r0 = r0 & -4
            r6.k = r0
            r22.H()
            return
        L_0x05dc:
            r0 = r24
            r1 = r18
            r2 = r19
            r3 = 16
            r4 = 1
            r5 = 0
            r7 = -1
            goto L_0x03b4
        L_0x05e9:
            r22.Q()
            r22.c((defpackage.adb) r23)
            return
        L_0x05f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.c(adb, adi):void");
    }

    /* access modifiers changed from: package-private */
    public final void o(View view) {
        int i2;
        int i3;
        ajy ajy = (ajy) view.getLayoutParams();
        b(view, O);
        int i4 = ajy.leftMargin + ajy.rightMargin + O.left + O.right;
        int i5 = ajy.topMargin + ajy.bottomMargin + O.top + O.bottom;
        int makeMeasureSpec = this.Q == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.R, JGCastService.FLAG_PRIVATE_DISPLAY);
        if (this.d == 0) {
            i2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i4, ajy.width);
            i3 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i5, ajy.height);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i5, ajy.height);
            i2 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i4, ajy.width);
            i3 = childMeasureSpec;
        }
        view.measure(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final int a(boolean z, int i2) {
        int i3;
        int i4;
        ajt ajt = this.K;
        if (ajt == null) {
            return i2;
        }
        int i5 = this.m;
        if (i5 != -1) {
            i3 = ajt.c(i5);
        } else {
            i3 = -1;
        }
        int r = r();
        View view = null;
        for (int i6 = 0; i6 < r && i2 != 0; i6++) {
            if (i2 <= 0) {
                i4 = (r - 1) - i6;
            } else {
                i4 = i6;
            }
            View h2 = h(i4);
            if (p(h2)) {
                int m2 = m(i4);
                int c2 = this.K.c(m2);
                if (i3 == -1) {
                    i5 = m2;
                    view = h2;
                    i3 = c2;
                } else if (c2 == i3 && ((i2 > 0 && m2 > i5) || (i2 < 0 && m2 < i5))) {
                    i2 = i2 <= 0 ? i2 + 1 : i2 - 1;
                    i5 = m2;
                    view = h2;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (w()) {
                    this.k |= 32;
                    view.requestFocus();
                    this.k &= -33;
                }
                this.m = i5;
            } else {
                a(view, true);
            }
        }
        return i2;
    }

    public final acu a() {
        return new ajy();
    }

    public final int b(int i2, adb adb, adi adi) {
        int i3;
        if ((this.k & 512) == 0 || !i()) {
            return 0;
        }
        this.k = (this.k & -4) | 2;
        d(adb, adi);
        if (this.d == 1) {
            i3 = o(i2);
        } else {
            i3 = p(i2);
        }
        H();
        this.k &= -4;
        return i3;
    }

    public final acu a(Context context, AttributeSet attributeSet) {
        return new ajy(context, attributeSet);
    }

    public final acu a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ajy) {
            return new ajy((ajy) layoutParams);
        }
        if (layoutParams instanceof acu) {
            return new ajy((acu) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ajy((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ajy(layoutParams);
    }

    public final void a(int i2) {
        ali ali;
        if (i2 != 0) {
            i2 = 1;
        }
        this.d = i2;
        this.N = abz.a(this, i2);
        alj alj = this.L;
        alj.a = i2;
        if (i2 == 0) {
            alj.d = alj.c;
            ali = alj.b;
        } else {
            alj.d = alj.b;
            ali = alj.c;
        }
        alj.e = ali;
        this.V.a = i2;
        this.k |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public final void a(int i2, int i3, adi adi, aax aax) {
        try {
            d((adb) null, adi);
            if (this.d != 0) {
                i2 = i3;
            }
            if (r() != 0) {
                if (i2 != 0) {
                    this.K.a(i2 >= 0 ? this.W : 0, i2, aax);
                }
            }
        } finally {
            H();
        }
    }

    public final void b(int i2, boolean z) {
        if (this.m != i2 && i2 != -1) {
            a(i2, z);
        }
    }

    public final void a(int i2, aax aax) {
        int i3 = this.c.c;
        if (i2 != 0 && i3 != 0) {
            int max = Math.max(0, Math.min(this.m - ((i3 - 1) >> 1), i2 - i3));
            int i4 = max;
            while (i4 < i2 && i4 < max + i3) {
                aax.a(i4, 0);
                i4++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4 A[LOOP:0: B:45:0x00d1->B:47:0x00d4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0 A[EDGE_INSN: B:57:0x00e0->B:48:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, android.view.View r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            int r0 = r8.d
            if (r0 != 0) goto L_0x0009
            int r0 = q((android.view.View) r10)
            goto L_0x000d
        L_0x0009:
            int r0 = r(r10)
        L_0x000d:
            int r1 = r8.R
            if (r1 > 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            int r0 = java.lang.Math.min(r0, r1)
        L_0x0016:
            int r1 = r8.I
            r2 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r8.k
            r4 = 786432(0xc0000, float:1.102026E-39)
            r3 = r3 & r4
            r4 = 1
            if (r3 == 0) goto L_0x002b
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r3
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r4)
            goto L_0x002d
        L_0x002b:
            r1 = r1 & 7
        L_0x002d:
            int r3 = r8.d
            if (r3 != 0) goto L_0x0036
            r5 = 48
            if (r2 != r5) goto L_0x0036
            goto L_0x0065
        L_0x0036:
            if (r3 != r4) goto L_0x003c
            r5 = 3
            if (r1 != r5) goto L_0x003c
            goto L_0x0065
        L_0x003c:
            if (r3 != 0) goto L_0x0043
            r5 = 80
            if (r2 != r5) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            if (r3 != r4) goto L_0x0050
            r5 = 5
            if (r1 == r5) goto L_0x0049
            goto L_0x0050
        L_0x0049:
            int r9 = r8.n((int) r9)
            int r9 = r9 - r0
            int r13 = r13 + r9
            goto L_0x0065
        L_0x0050:
            if (r3 != 0) goto L_0x0057
            r5 = 16
            if (r2 != r5) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            if (r3 == r4) goto L_0x005a
        L_0x0059:
            goto L_0x0065
        L_0x005a:
            if (r1 == r4) goto L_0x005d
            goto L_0x0059
        L_0x005d:
            int r9 = r8.n((int) r9)
            int r9 = r9 - r0
            int r9 = r9 / 2
            int r13 = r13 + r9
        L_0x0065:
            int r9 = r8.d
            if (r9 == 0) goto L_0x0071
            int r0 = r0 + r13
            r6 = r13
            r13 = r11
            r11 = r6
            r7 = r0
            r0 = r12
            r12 = r7
            goto L_0x0072
        L_0x0071:
            int r0 = r0 + r13
        L_0x0072:
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            ajy r9 = (defpackage.ajy) r9
            defpackage.act.a((android.view.View) r10, (int) r11, (int) r13, (int) r12, (int) r0)
            android.graphics.Rect r1 = O
            android.support.v7.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r10, r1)
            android.graphics.Rect r1 = O
            int r1 = r1.left
            android.graphics.Rect r2 = O
            int r2 = r2.top
            android.graphics.Rect r3 = O
            int r3 = r3.right
            android.graphics.Rect r5 = O
            int r5 = r5.bottom
            int r11 = r11 - r1
            r9.a = r11
            int r13 = r13 - r2
            r9.b = r13
            int r3 = r3 - r12
            r9.g = r3
            int r5 = r5 - r0
            r9.h = r5
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            ajy r9 = (defpackage.ajy) r9
            akg r11 = r9.l
            if (r11 != 0) goto L_0x00bb
            ake r11 = r8.V
            akd r11 = r11.c
            int r11 = r11.a(r10)
            r9.i = r11
            ake r11 = r8.V
            akd r11 = r11.b
            int r10 = r11.a(r10)
            r9.j = r10
            return
        L_0x00bb:
            int r12 = r8.d
            akf[] r11 = r11.a
            int[] r13 = r9.k
            r0 = 0
            if (r13 == 0) goto L_0x00cb
            int r13 = r13.length
            int r1 = r11.length
            if (r13 == r4) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r13 = 0
            goto L_0x00d1
        L_0x00cb:
            int r13 = r11.length
            int[] r13 = new int[r4]
            r9.k = r13
            r13 = 0
        L_0x00d1:
            int r1 = r11.length
            if (r13 > 0) goto L_0x00e0
            int[] r13 = r9.k
            r1 = r11[r0]
            int r1 = defpackage.akh.a(r10, r1, r12)
            r13[r0] = r1
            r13 = 1
            goto L_0x00d1
        L_0x00e0:
            if (r12 == 0) goto L_0x00e9
            int[] r11 = r9.k
            r11 = r11[r0]
            r9.j = r11
            goto L_0x00ef
        L_0x00e9:
            int[] r11 = r9.k
            r11 = r11[r0]
            r9.i = r11
        L_0x00ef:
            int r11 = r8.d
            if (r11 != 0) goto L_0x00fe
            ake r11 = r8.V
            akd r11 = r11.b
            int r10 = r11.a(r10)
            r9.j = r10
            return
        L_0x00fe:
            ake r11 = r8.V
            akd r11 = r11.c
            int r10 = r11.a(r10)
            r9.i = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.a(int, android.view.View, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        View b2 = b(i2);
        boolean z2 = !p();
        if (z2 && !this.c.isLayoutRequested() && b2 != null && t(b2) == i2) {
            this.k |= 32;
            a(b2, z);
            this.k &= -33;
            return;
        }
        int i3 = this.k;
        if ((i3 & 512) == 0 || (i3 & 64) != 0) {
            this.m = i2;
            this.P = Integer.MIN_VALUE;
        } else if (!z || this.c.isLayoutRequested()) {
            if (!z2) {
                D();
                this.c.stopScroll();
            }
            if (!this.c.isLayoutRequested() && b2 != null && t(b2) == i2) {
                this.k |= 32;
                a(b2, z);
                this.k &= -33;
                return;
            }
            this.m = i2;
            this.P = Integer.MIN_VALUE;
            this.k |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            o();
        } else {
            this.m = i2;
            this.P = Integer.MIN_VALUE;
            if (i()) {
                ajw ajw = new ajw(this);
                ajw.a = i2;
                a((adh) ajw);
                int i4 = ajw.a;
                if (i4 != this.m) {
                    this.m = i4;
                    return;
                }
                return;
            }
            Log.w("GridLayoutManager:" + this.c.getId(), "setSelectionSmooth should not be called before first layout pass");
        }
    }

    public final void a(acg acg, acg acg2) {
        if (acg != null) {
            Q();
            this.m = -1;
            this.P = 0;
        }
        if (acg2 instanceof ajr) {
            this.Y = (ajr) acg2;
        } else {
            this.Y = null;
        }
    }

    public final void a(adb adb, adi adi, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        d(adb, adi);
        if (this.d == 0) {
            i7 = View.MeasureSpec.getSize(i2);
            i6 = View.MeasureSpec.getSize(i3);
            i5 = View.MeasureSpec.getMode(i3);
            i4 = t() + v();
        } else {
            i6 = View.MeasureSpec.getSize(i2);
            i7 = View.MeasureSpec.getSize(i3);
            i5 = View.MeasureSpec.getMode(i2);
            i4 = s() + u();
        }
        this.T = i6;
        int i9 = this.Q;
        int i10 = 1;
        if (i9 == -2) {
            int i11 = this.U;
            if (i11 == 0) {
                i11 = 1;
            }
            this.J = i11;
            this.R = 0;
            int[] iArr = this.S;
            if (iArr == null || iArr.length != i11) {
                this.S = new int[i11];
            }
            if (this.e.g) {
                B();
            }
            b(true);
            if (i5 == Integer.MIN_VALUE) {
                i6 = Math.min(I() + i4, this.T);
            } else if (i5 == 0) {
                i6 = I() + i4;
            } else if (i5 == 1073741824) {
                i6 = this.T;
            } else {
                throw new IllegalStateException("wrong spec");
            }
        } else {
            if (i5 != Integer.MIN_VALUE) {
                if (i5 == 0) {
                    if (i9 == 0) {
                        i9 = i6 - i4;
                    }
                    this.R = i9;
                    int i12 = this.U;
                    if (i12 != 0) {
                        i10 = i12;
                    }
                    this.J = i10;
                    i6 = (i9 * i10) + (this.H * (i10 - 1)) + i4;
                } else if (i5 != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
            }
            int i13 = this.U;
            if (i13 == 0 && i9 == 0) {
                this.J = 1;
                i9 = i6 - i4;
                this.R = i9;
            } else if (i13 == 0) {
                this.R = i9;
                int i14 = this.H;
                i10 = (i6 + i14) / (i14 + i9);
                this.J = i10;
            } else {
                this.J = i13;
                if (i9 == 0) {
                    i9 = ((i6 - i4) - (this.H * (i13 - 1))) / i13;
                }
                this.R = i9;
                i10 = i13;
            }
            if (i5 == Integer.MIN_VALUE && (i8 = (i9 * i10) + (this.H * (i10 - 1)) + i4) < i6) {
                i6 = i8;
            }
        }
        if (this.d == 0) {
            i(i7, i6);
        } else {
            i(i6, i7);
        }
        H();
    }

    public final void a(adb adb, adi adi, View view, qs qsVar) {
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.K != null && (layoutParams instanceof ajy)) {
            int d2 = ((ajy) layoutParams).d();
            if (d2 >= 0) {
                i2 = this.K.c(d2);
            } else {
                i2 = -1;
            }
            if (i2 >= 0) {
                int i3 = d2 / this.K.d;
                if (this.d == 0) {
                    qsVar.b((Object) qr.a(i2, 1, i3, 1, false));
                } else {
                    qsVar.b((Object) qr.a(i3, 1, i2, 1, false));
                }
            }
        }
    }

    public final void a(adb adb, adi adi, qs qsVar) {
        d(adb, adi);
        int a2 = adi.a();
        int i2 = this.k & 262144;
        if (a2 > 1 && !k(0)) {
            if (Build.VERSION.SDK_INT < 23) {
                qsVar.a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
            } else if (this.d != 0) {
                qsVar.a(qp.g);
            } else {
                qsVar.a(i2 == 0 ? qp.h : qp.j);
            }
            qsVar.e(true);
        }
        if (a2 > 1 && !k(a2 - 1)) {
            if (Build.VERSION.SDK_INT < 23) {
                qsVar.a((int) FragmentTransaction.TRANSIT_ENTER_MASK);
            } else if (this.d != 0) {
                qsVar.a(qp.i);
            } else {
                qsVar.a(i2 == 0 ? qp.j : qp.h);
            }
            qsVar.e(true);
        }
        qsVar.a((Object) qq.a(a(adb, adi), b(adb, adi), 0));
        H();
    }

    public final void a(adh adh) {
        D();
        super.a(adh);
        if (adh.e && (adh instanceof ajx)) {
            ajx ajx = (ajx) adh;
            this.n = ajx;
            if (ajx instanceof ajz) {
                this.o = (ajz) ajx;
            } else {
                this.o = null;
            }
        } else {
            this.n = null;
            this.o = null;
        }
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof GridLayoutManager$SavedState) {
            this.m = ((GridLayoutManager$SavedState) parcelable).a;
            this.P = 0;
            this.k |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            o();
        }
    }

    public final void a(RecyclerView recyclerView, int i2) {
        b(i2, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView, adl adl, int i2) {
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((akj) this.l.get(size)).a(recyclerView, adl, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, int i3) {
        a(view, view != null ? view.findFocus() : null, false, i2, i3);
    }

    public final void a(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        ajy ajy = (ajy) view.getLayoutParams();
        rect.left += ajy.a;
        rect.top += ajy.b;
        rect.right -= ajy.g;
        rect.bottom -= ajy.h;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, boolean z) {
        a(view, view != null ? view.findFocus() : null, z);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i2;
        if (!z) {
            if (F()) {
                return;
            }
        } else if (E()) {
            return;
        }
        ajz ajz = this.o;
        int i3 = -1;
        boolean z2 = true;
        if (ajz != null) {
            if (!z) {
                int i4 = ajz.p;
                if (i4 > (-ajz.q.b)) {
                    i2 = i4 - 1;
                } else {
                    return;
                }
            } else {
                int i5 = ajz.p;
                if (i5 < ajz.q.b) {
                    i2 = i5 + 1;
                } else {
                    return;
                }
            }
            ajz.p = i2;
            return;
        }
        if (z) {
            i3 = 1;
        }
        if (this.J <= 1) {
            z2 = false;
        }
        ajz ajz2 = new ajz(this, i3, z2);
        this.P = 0;
        a((adh) ajz2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r5 != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r5 != 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r7 = com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.adb r5, defpackage.adi r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.k
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L_0x006b
            r4.d((defpackage.adb) r5, (defpackage.adi) r6)
            int r5 = r4.k
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r6 < r0) goto L_0x0051
            int r6 = r4.d
            if (r6 != 0) goto L_0x003a
            qp r6 = defpackage.qp.h
            int r6 = r6.a()
            if (r7 == r6) goto L_0x0032
            qp r6 = defpackage.qp.j
            int r6 = r6.a()
            if (r7 == r6) goto L_0x002f
            goto L_0x0052
        L_0x002f:
            if (r5 == 0) goto L_0x0034
            goto L_0x0037
        L_0x0032:
            if (r5 == 0) goto L_0x0037
        L_0x0034:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L_0x0052
        L_0x0037:
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0052
        L_0x003a:
            qp r5 = defpackage.qp.g
            int r5 = r5.a()
            if (r7 == r5) goto L_0x004e
            qp r5 = defpackage.qp.i
            int r5 = r5.a()
            if (r7 == r5) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L_0x0052
        L_0x004e:
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            r5 = 0
            if (r7 == r3) goto L_0x0060
            if (r7 == r2) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            r4.a((boolean) r5)
            r6 = -1
            r4.a((boolean) r5, (int) r6)
            goto L_0x0067
        L_0x0060:
            r4.a((boolean) r1)
            r4.a((boolean) r5, (int) r1)
        L_0x0067:
            r4.H()
            return r1
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.a(adb, adi, int):boolean");
    }

    public final boolean a(RecyclerView recyclerView, View view, View view2) {
        if ((this.k & 32768) == 0 && t(view) != -1 && (this.k & 35) == 0) {
            a(view, view2, true);
        }
        return true;
    }

    public final boolean a(RecyclerView recyclerView, ArrayList arrayList, int i2, int i3) {
        int i4;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        View c2;
        ArrayList arrayList2 = arrayList;
        int i10 = i2;
        int i11 = i3;
        if ((this.k & 32768) == 0) {
            if (!recyclerView.hasFocus()) {
                int size = arrayList.size();
                View b2 = b(this.m);
                if (b2 != null) {
                    b2.addFocusables(arrayList2, i10, i11);
                }
                if (arrayList.size() == size && recyclerView.isFocusable()) {
                    arrayList2.add(recyclerView);
                }
            } else {
                RecyclerView recyclerView2 = recyclerView;
                if (this.o == null) {
                    int q = q(i10);
                    View findFocus = recyclerView.findFocus();
                    ajp ajp = this.c;
                    if (ajp == null) {
                        i4 = -1;
                    } else {
                        if (findFocus != ajp && (c2 = c(findFocus)) != null) {
                            int r = r();
                            i4 = 0;
                            while (true) {
                                if (i4 < r) {
                                    if (h(i4) == c2) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    break;
                                }
                            }
                        }
                        i4 = -1;
                    }
                    int m2 = m(i4);
                    if (m2 != -1) {
                        view = b(m2);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.addFocusables(arrayList2, i10, i11);
                    }
                    if (this.K == null || r() == 0) {
                        return true;
                    }
                    if ((q == 3 || q == 2) && this.K.d <= 1) {
                        return true;
                    }
                    ajt ajt = this.K;
                    if (ajt == null) {
                        i5 = -1;
                    } else {
                        i5 = view != null ? ajt.d(m2).a : -1;
                    }
                    int size2 = arrayList.size();
                    if (q == 1) {
                        i6 = 1;
                    } else {
                        i6 = q != 3 ? -1 : 1;
                    }
                    if (i6 > 0) {
                        i7 = r() - 1;
                    } else {
                        i7 = 0;
                    }
                    if (i4 != -1) {
                        i8 = i4 + i6;
                    } else {
                        i8 = i6 <= 0 ? -1 + r() : 0;
                    }
                    while (true) {
                        if (i6 > 0) {
                            if (i8 > i7) {
                                break;
                            }
                        } else if (i8 < i7) {
                            break;
                        }
                        View h2 = h(i8);
                        if (h2.getVisibility() == 0 && h2.hasFocusable()) {
                            if (view != null) {
                                int m3 = m(i8);
                                ajs d2 = this.K.d(m3);
                                if (d2 != null) {
                                    if (q != 1) {
                                        if (q != 0) {
                                            if (q != 3) {
                                                if (q == 2 && (i9 = d2.a) != i5) {
                                                    if (i9 > i5) {
                                                        break;
                                                    }
                                                    h2.addFocusables(arrayList2, i10, i11);
                                                }
                                            } else {
                                                int i12 = d2.a;
                                                if (i12 != i5) {
                                                    if (i12 < i5) {
                                                        break;
                                                    }
                                                    h2.addFocusables(arrayList2, i10, i11);
                                                }
                                            }
                                        } else if (d2.a == i5 && m3 < m2) {
                                            h2.addFocusables(arrayList2, i10, i11);
                                            if (arrayList.size() > size2) {
                                                break;
                                            }
                                        }
                                    } else if (d2.a == i5 && m3 > m2) {
                                        h2.addFocusables(arrayList2, i10, i11);
                                        if (arrayList.size() > size2) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                h2.addFocusables(arrayList2, i10, i11);
                                if (arrayList.size() > size2) {
                                    break;
                                }
                            }
                        }
                        i8 += i6;
                    }
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(View view, View view2, int[] iArr) {
        int a2 = this.L.d.a(s(view));
        if (view2 != null) {
            a(view, view2);
        }
        int a3 = this.L.e.a(this.d != 0 ? u(view) : v(view));
        if (a2 == 0 && a3 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = a2;
        iArr[1] = a3;
        return true;
    }
}
