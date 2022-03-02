package defpackage;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager$SavedState;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.chimera.FragmentTransaction;
import java.util.List;

/* renamed from: abk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abk extends act implements adg {
    private abi a;
    private boolean b;
    private boolean c;
    private final abh d;
    private int e;
    private int[] f;
    public int i;
    abz j;
    boolean k;
    public boolean l;
    int m;
    int n;
    LinearLayoutManager$SavedState o;
    final abg p;

    public abk() {
        this(1);
    }

    private final void B() {
        if (this.i == 1 || !i()) {
            this.k = false;
        } else {
            this.k = true;
        }
    }

    private final View C() {
        return h(this.k ? r() - 1 : 0);
    }

    private final View D() {
        return h(!this.k ? r() - 1 : 0);
    }

    private final View E() {
        return f(0, r());
    }

    private final View F() {
        return f(r() - 1, -1);
    }

    private final int a(int i2, adb adb, adi adi, boolean z) {
        int a2;
        int a3 = this.j.a() - i2;
        if (a3 <= 0) {
            return 0;
        }
        int i3 = -c(-a3, adb, adi);
        int i4 = i2 + i3;
        if (!z || (a2 = this.j.a() - i4) <= 0) {
            return i3;
        }
        this.j.a(a2);
        return a2 + i3;
    }

    private final int b(int i2, adb adb, adi adi, boolean z) {
        int c2;
        int c3 = i2 - this.j.c();
        if (c3 <= 0) {
            return 0;
        }
        int i3 = -c(c3, adb, adi);
        int i4 = i2 + i3;
        if (!z || (c2 = i4 - this.j.c()) <= 0) {
            return i3;
        }
        this.j.a(-c2);
        return i3 - c2;
    }

    private final View d(adb adb, adi adi) {
        return a(adb, adi, 0, r(), adi.a());
    }

    private final View e(adb adb, adi adi) {
        return a(adb, adi, r() - 1, -1, adi.a());
    }

    private final int h(adi adi) {
        int i2 = 0;
        if (r() == 0) {
            return 0;
        }
        j();
        abz abz = this.j;
        View b2 = b(!this.c);
        View a2 = a(!this.c);
        boolean z = this.c;
        boolean z2 = this.k;
        if (!(r() == 0 || adi.a() == 0 || b2 == null || a2 == null)) {
            i2 = z2 ? Math.max(0, (adi.a() - Math.max(act.j(b2), act.j(a2))) - 1) : Math.max(0, Math.min(act.j(b2), act.j(a2)));
            if (z) {
                return Math.round((((float) i2) * (((float) Math.abs(abz.c(a2) - abz.d(b2))) / ((float) (Math.abs(act.j(b2) - act.j(a2)) + 1)))) + ((float) (abz.c() - abz.d(b2))));
            }
        }
        return i2;
    }

    private final int i(adi adi) {
        if (r() == 0) {
            return 0;
        }
        j();
        abz abz = this.j;
        View b2 = b(!this.c);
        View a2 = a(!this.c);
        boolean z = this.c;
        if (r() == 0 || adi.a() == 0 || b2 == null || a2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(act.j(b2) - act.j(a2)) + 1;
        }
        return Math.min(abz.d(), abz.c(a2) - abz.d(b2));
    }

    private final int j(adi adi) {
        if (r() == 0) {
            return 0;
        }
        j();
        abz abz = this.j;
        View b2 = b(!this.c);
        View a2 = a(!this.c);
        boolean z = this.c;
        if (r() == 0 || adi.a() == 0 || b2 == null || a2 == null) {
            return 0;
        }
        if (z) {
            return (int) ((((float) (abz.c(a2) - abz.d(b2))) / ((float) (Math.abs(act.j(b2) - act.j(a2)) + 1))) * ((float) adi.a()));
        }
        return adi.a();
    }

    public void a(adb adb, adi adi, abg abg, int i2) {
    }

    public boolean b() {
        return this.o == null && this.b == this.l;
    }

    /* access modifiers changed from: package-private */
    public final int c(int i2, adb adb, adi adi) {
        int i3;
        if (!(r() == 0 || i2 == 0)) {
            j();
            this.a.a = true;
            if (i2 > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int abs = Math.abs(i2);
            a(i3, abs, true, adi);
            abi abi = this.a;
            int a2 = abi.g + a(adb, abi, adi, false);
            if (a2 >= 0) {
                if (abs > a2) {
                    i2 = i3 * a2;
                }
                this.j.a(-i2);
                this.a.k = i2;
                return i2;
            }
        }
        return 0;
    }

    public final boolean e() {
        return true;
    }

    public final int f(adi adi) {
        return j(adi);
    }

    public final int g(adi adi) {
        return j(adi);
    }

    public final boolean g() {
        return this.i == 0;
    }

    public final boolean h() {
        return this.i == 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.j.f() == 0 && this.j.b() == 0;
    }

    public final boolean l() {
        if (!(this.B == 1073741824 || this.A == 1073741824)) {
            int r = r();
            for (int i2 = 0; i2 < r; i2++) {
                ViewGroup.LayoutParams layoutParams = h(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int m() {
        View a2 = a(0, r(), false);
        if (a2 != null) {
            return act.j(a2);
        }
        return -1;
    }

    public final int n() {
        View a2 = a(r() - 1, -1, false);
        if (a2 != null) {
            return act.j(a2);
        }
        return -1;
    }

    public abk(int i2) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.c = true;
        this.m = -1;
        this.n = Integer.MIN_VALUE;
        this.o = null;
        this.p = new abg();
        this.d = new abh();
        this.e = 2;
        this.f = new int[2];
        i2 = i2 != 0 ? 1 : i2;
        a((String) null);
        if (i2 != this.i || this.j == null) {
            abz a2 = abz.a(this, i2);
            this.j = a2;
            this.p.a = a2;
            this.i = i2;
            o();
        }
        a((String) null);
    }

    public final int d(adi adi) {
        return i(adi);
    }

    /* access modifiers changed from: package-private */
    public final int e(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.i == 1) ? 1 : Integer.MIN_VALUE : this.i == 0 ? 1 : Integer.MIN_VALUE : this.i == 1 ? -1 : Integer.MIN_VALUE : this.i == 0 ? -1 : Integer.MIN_VALUE : (this.i == 1 || !i()) ? 1 : -1 : (this.i == 1 || !i()) ? -1 : 1;
    }

    public final Parcelable f() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.o;
        if (linearLayoutManager$SavedState != null) {
            return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState);
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (r() > 0) {
            j();
            boolean z = this.b ^ this.k;
            linearLayoutManager$SavedState2.c = z;
            if (z) {
                View D = D();
                linearLayoutManager$SavedState2.b = this.j.a() - this.j.c(D);
                linearLayoutManager$SavedState2.a = act.j(D);
            } else {
                View C = C();
                linearLayoutManager$SavedState2.a = act.j(C);
                linearLayoutManager$SavedState2.b = this.j.d(C) - this.j.c();
            }
        } else {
            linearLayoutManager$SavedState2.b();
        }
        return linearLayoutManager$SavedState2;
    }

    public final void d(int i2) {
        this.m = i2;
        this.n = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.o;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.b();
        }
        o();
    }

    public final int e(adi adi) {
        return i(adi);
    }

    private final void a(int i2, int i3) {
        this.a.c = this.j.a() - i3;
        abi abi = this.a;
        abi.e = !this.k ? 1 : -1;
        abi.d = i2;
        abi.f = 1;
        abi.b = i3;
        abi.g = Integer.MIN_VALUE;
    }

    private final void b(abg abg) {
        j(abg.b, abg.c);
    }

    public final int c(adi adi) {
        return h(adi);
    }

    public final void e(int i2, int i3) {
        this.m = i2;
        this.n = i3;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.o;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.b();
        }
        o();
    }

    private final void a(int i2, int i3, boolean z, adi adi) {
        int i4;
        int i5;
        this.a.m = k();
        this.a.f = i2;
        int[] iArr = this.f;
        iArr[0] = 0;
        int i6 = 1;
        iArr[1] = 0;
        a(adi, iArr);
        int max = Math.max(0, this.f[0]);
        int max2 = Math.max(0, this.f[1]);
        abi abi = this.a;
        if (i2 == 1) {
            i4 = max2;
        } else {
            i4 = max;
        }
        abi.h = i4;
        if (i2 != 1) {
            max = max2;
        }
        abi.i = max;
        if (i2 != 1) {
            View C = C();
            this.a.h += this.j.c();
            abi abi2 = this.a;
            if (!this.k) {
                i6 = -1;
            }
            abi2.e = i6;
            int j2 = act.j(C);
            abi abi3 = this.a;
            abi2.d = j2 + abi3.e;
            abi3.b = this.j.d(C);
            i5 = (-this.j.d(C)) + this.j.c();
        } else {
            abi.h = i4 + this.j.e();
            View D = D();
            abi abi4 = this.a;
            if (this.k) {
                i6 = -1;
            }
            abi4.e = i6;
            int j3 = act.j(D);
            abi abi5 = this.a;
            abi4.d = j3 + abi5.e;
            abi5.b = this.j.c(D);
            i5 = this.j.c(D) - this.j.a();
        }
        abi abi6 = this.a;
        abi6.c = i3;
        if (z) {
            abi6.c = i3 - i5;
        }
        abi6.g = i5;
    }

    public int b(int i2, adb adb, adi adi) {
        if (this.i != 0) {
            return c(i2, adb, adi);
        }
        return 0;
    }

    public final PointF c(int i2) {
        if (r() == 0) {
            return null;
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < act.j(h(0))) {
            z = true;
        }
        if (z != this.k) {
            i3 = -1;
        }
        if (this.i == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    public final int b(adi adi) {
        return h(adi);
    }

    /* access modifiers changed from: package-private */
    public final View f(int i2, int i3) {
        int i4;
        int i5;
        j();
        if (i3 <= i2 && i3 >= i2) {
            return h(i2);
        }
        int d2 = this.j.d(h(i2));
        int c2 = this.j.c();
        if (d2 < c2) {
            i4 = 16388;
        } else {
            i4 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (d2 < c2) {
            i5 = 16644;
        } else {
            i5 = 4161;
        }
        if (this.i == 0) {
            return this.s.a(i2, i3, i5, i4);
        }
        return this.t.a(i2, i3, i5, i4);
    }

    /* access modifiers changed from: protected */
    public final boolean i() {
        return q() == 1;
    }

    private final void j(int i2, int i3) {
        this.a.c = i3 - this.j.c();
        abi abi = this.a;
        abi.d = i2;
        abi.e = !this.k ? -1 : 1;
        abi.f = -1;
        abi.b = i3;
        abi.g = Integer.MIN_VALUE;
    }

    public final View b(int i2) {
        int r = r();
        if (r == 0) {
            return null;
        }
        int j2 = i2 - act.j(h(0));
        if (j2 >= 0 && j2 < r) {
            View h = h(j2);
            if (act.j(h) == i2) {
                return h;
            }
        }
        return super.b(i2);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (this.a == null) {
            this.a = new abi();
        }
    }

    public void c(adb adb, adi adi) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        View b2;
        int i6;
        View view;
        int i7;
        boolean z2;
        boolean z3;
        int i8 = -1;
        if (!(this.o == null && this.m == -1) && adi.a() == 0) {
            c(adb);
            return;
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.o;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.a()) {
            this.m = this.o.a;
        }
        j();
        this.a.a = false;
        B();
        View x = x();
        abg abg = this.p;
        if (!abg.e || this.m != -1 || this.o != null) {
            abg.a();
            abg abg2 = this.p;
            abg2.d = this.k ^ this.l;
            if (!adi.g && (i7 = this.m) != -1) {
                if (i7 >= 0 && i7 < adi.a()) {
                    abg2.b = this.m;
                    LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = this.o;
                    if (linearLayoutManager$SavedState2 == null || !linearLayoutManager$SavedState2.a()) {
                        if (this.n != Integer.MIN_VALUE) {
                            boolean z4 = this.k;
                            abg2.d = z4;
                            if (z4) {
                                abg2.c = this.j.a() - this.n;
                            } else {
                                abg2.c = this.j.c() + this.n;
                            }
                        } else {
                            View b3 = b(this.m);
                            if (b3 == null) {
                                if (r() > 0) {
                                    if (this.m >= act.j(h(0))) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2 == this.k) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    abg2.d = z3;
                                }
                                abg2.b();
                            } else if (this.j.a(b3) > this.j.d()) {
                                abg2.b();
                            } else if (this.j.d(b3) - this.j.c() < 0) {
                                abg2.c = this.j.c();
                                abg2.d = false;
                            } else if (this.j.a() - this.j.c(b3) < 0) {
                                abg2.c = this.j.a();
                                abg2.d = true;
                            } else {
                                abg2.c = abg2.d ? this.j.c(b3) + this.j.h() : this.j.d(b3);
                            }
                        }
                        this.p.e = true;
                    } else {
                        boolean z5 = this.o.c;
                        abg2.d = z5;
                        if (z5) {
                            abg2.c = this.j.a() - this.o.b;
                        } else {
                            abg2.c = this.j.c() + this.o.b;
                        }
                        this.p.e = true;
                    }
                } else {
                    this.m = -1;
                    this.n = Integer.MIN_VALUE;
                }
            }
            if (r() != 0) {
                View x2 = x();
                if (x2 != null) {
                    acu acu = (acu) x2.getLayoutParams();
                    if (!acu.a() && acu.c() >= 0 && acu.c() < adi.a()) {
                        abg2.a(x2, act.j(x2));
                        this.p.e = true;
                    }
                }
                if (this.b == this.l) {
                    if (abg2.d) {
                        if (this.k) {
                            view = d(adb, adi);
                        } else {
                            view = e(adb, adi);
                        }
                    } else if (this.k) {
                        view = e(adb, adi);
                    } else {
                        view = d(adb, adi);
                    }
                    if (view != null) {
                        abg2.b(view, act.j(view));
                        if (!adi.g && b()) {
                            int d2 = this.j.d(view);
                            int c2 = this.j.c(view);
                            int c3 = this.j.c();
                            int a2 = this.j.a();
                            if ((d2 >= a2 && c2 > a2) || (c2 <= c3 && d2 < c3)) {
                                if (abg2.d) {
                                    c3 = a2;
                                }
                                abg2.c = c3;
                            }
                        }
                        this.p.e = true;
                    }
                }
            }
            abg2.b();
            abg2.b = this.l ? adi.a() - 1 : 0;
            this.p.e = true;
        } else if (x != null && (this.j.d(x) >= this.j.a() || this.j.c(x) <= this.j.c())) {
            this.p.a(x, act.j(x));
        }
        abi abi = this.a;
        if (abi.k >= 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        abi.f = i2;
        int[] iArr = this.f;
        iArr[0] = 0;
        iArr[1] = 0;
        a(adi, iArr);
        int max = Math.max(0, this.f[0]) + this.j.c();
        int max2 = Math.max(0, this.f[1]) + this.j.e();
        if (!(!adi.g || (i5 = this.m) == -1 || this.n == Integer.MIN_VALUE || (b2 = b(i5)) == null)) {
            if (!this.k) {
                i6 = this.n - (this.j.d(b2) - this.j.c());
            } else {
                i6 = (this.j.a() - this.j.c(b2)) - this.n;
            }
            if (i6 <= 0) {
                max2 -= i6;
            } else {
                max += i6;
            }
        }
        abg abg3 = this.p;
        if (abg3.d) {
            if (this.k) {
                i8 = 1;
            }
        } else if (!this.k) {
            i8 = 1;
        }
        a(adb, adi, abg3, i8);
        a(adb);
        this.a.m = k();
        abi abi2 = this.a;
        abi2.j = adi.g;
        abi2.i = 0;
        abg abg4 = this.p;
        if (abg4.d) {
            b(abg4);
            abi abi3 = this.a;
            abi3.h = max;
            a(adb, abi3, adi, false);
            abi abi4 = this.a;
            i4 = abi4.b;
            int i9 = abi4.d;
            int i10 = abi4.c;
            if (i10 > 0) {
                max2 += i10;
            }
            a(this.p);
            abi abi5 = this.a;
            abi5.h = max2;
            abi5.d += abi5.e;
            a(adb, abi5, adi, false);
            abi abi6 = this.a;
            i3 = abi6.b;
            int i11 = abi6.c;
            if (i11 > 0) {
                j(i9, i4);
                abi abi7 = this.a;
                abi7.h = i11;
                a(adb, abi7, adi, false);
                i4 = this.a.b;
            }
        } else {
            a(abg4);
            abi abi8 = this.a;
            abi8.h = max2;
            a(adb, abi8, adi, false);
            abi abi9 = this.a;
            i3 = abi9.b;
            int i12 = abi9.d;
            int i13 = abi9.c;
            if (i13 > 0) {
                max += i13;
            }
            b(this.p);
            abi abi10 = this.a;
            abi10.h = max;
            abi10.d += abi10.e;
            a(adb, abi10, adi, false);
            abi abi11 = this.a;
            i4 = abi11.b;
            int i14 = abi11.c;
            if (i14 > 0) {
                a(i12, i3);
                abi abi12 = this.a;
                abi12.h = i14;
                a(adb, abi12, adi, false);
                i3 = this.a.b;
            }
        }
        if (r() > 0) {
            if (this.k ^ this.l) {
                int a3 = a(i3, adb, adi, true);
                int i15 = i4 + a3;
                int b4 = b(i15, adb, adi, false);
                i4 = i15 + b4;
                i3 = i3 + a3 + b4;
            } else {
                int b5 = b(i4, adb, adi, true);
                int i16 = i3 + b5;
                int a4 = a(i16, adb, adi, false);
                i4 = i4 + b5 + a4;
                i3 = i16 + a4;
            }
        }
        if (adi.k && r() != 0 && !adi.g && b()) {
            List list = adb.d;
            int size = list.size();
            int j2 = act.j(h(0));
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                adl adl = (adl) list.get(i19);
                if (!adl.n()) {
                    if (adl.c() >= j2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z != this.k) {
                        i17 += this.j.a(adl.a);
                    } else {
                        i18 += this.j.a(adl.a);
                    }
                }
            }
            this.a.l = list;
            if (i17 > 0) {
                j(act.j(C()), i4);
                abi abi13 = this.a;
                abi13.h = i17;
                abi13.c = 0;
                abi13.a();
                a(adb, this.a, adi, false);
            }
            if (i18 > 0) {
                a(act.j(D()), i3);
                abi abi14 = this.a;
                abi14.h = i18;
                abi14.c = 0;
                abi14.a();
                a(adb, this.a, adi, false);
            }
            this.a.l = null;
        }
        if (adi.g) {
            this.p.a();
        } else {
            abz abz = this.j;
            abz.b = abz.d();
        }
        this.b = this.l;
    }

    /* access modifiers changed from: package-private */
    public final View b(boolean z) {
        if (this.k) {
            return a(r() - 1, -1, z);
        }
        return a(0, r(), z);
    }

    private final void a(abg abg) {
        a(abg.b, abg.c);
    }

    private final void a(adb adb, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 > i2) {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                a(i4, adb);
            }
            return;
        }
        while (i2 > i3) {
            a(i2, adb);
            i2--;
        }
    }

    private final void a(adb adb, abi abi) {
        if (abi.a && !abi.m) {
            int i2 = abi.g;
            int i3 = abi.i;
            if (abi.f == -1) {
                int r = r();
                if (i2 >= 0) {
                    int b2 = (this.j.b() - i2) + i3;
                    if (!this.k) {
                        int i4 = r - 1;
                        for (int i5 = i4; i5 >= 0; i5--) {
                            View h = h(i5);
                            if (this.j.d(h) < b2 || this.j.f(h) < b2) {
                                a(adb, i4, i5);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i6 = 0; i6 < r; i6++) {
                        View h2 = h(i6);
                        if (this.j.d(h2) < b2 || this.j.f(h2) < b2) {
                            a(adb, 0, i6);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i7 = i2 - i3;
                int r2 = r();
                if (this.k) {
                    int i8 = r2 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View h3 = h(i9);
                        if (this.j.c(h3) > i7 || this.j.e(h3) > i7) {
                            a(adb, i8, i9);
                            return;
                        }
                    }
                    return;
                }
                for (int i10 = 0; i10 < r2; i10++) {
                    View h4 = h(i10);
                    if (this.j.c(h4) > i7 || this.j.e(h4) > i7) {
                        a(adb, 0, i10);
                        return;
                    }
                }
            }
        }
    }

    public int a(int i2, adb adb, adi adi) {
        if (this.i != 1) {
            return c(i2, adb, adi);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int a(adb adb, abi abi, adi adi, boolean z) {
        int i2 = abi.c;
        int i3 = abi.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                abi.g = i3 + i2;
            }
            a(adb, abi);
        }
        int i4 = abi.c + abi.h;
        abh abh = this.d;
        while (true) {
            if ((!abi.m && i4 <= 0) || !abi.a(adi)) {
                break;
            }
            abh.a = 0;
            abh.b = false;
            abh.c = false;
            abh.d = false;
            a(adb, adi, abi, abh);
            if (abh.b) {
                break;
            }
            int i5 = abi.b;
            int i6 = abh.a;
            abi.b = i5 + (abi.f * i6);
            if (!abh.c || abi.l != null || !adi.g) {
                abi.c -= i6;
                i4 -= i6;
            }
            int i7 = abi.g;
            if (i7 != Integer.MIN_VALUE) {
                int i8 = i7 + i6;
                abi.g = i8;
                int i9 = abi.c;
                if (i9 < 0) {
                    abi.g = i8 + i9;
                }
                a(adb, abi);
            }
            if (z && abh.d) {
                break;
            }
        }
        return i2 - abi.c;
    }

    public acu a() {
        return new acu(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public final View a(int i2, int i3, boolean z) {
        int i4;
        j();
        if (!z) {
            i4 = 320;
        } else {
            i4 = 24579;
        }
        if (this.i == 0) {
            return this.s.a(i2, i3, i4, 320);
        }
        return this.t.a(i2, i3, i4, 320);
    }

    public View a(adb adb, adi adi, int i2, int i3, int i4) {
        int i5;
        j();
        int c2 = this.j.c();
        int a2 = this.j.a();
        if (i3 > i2) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View h = h(i2);
            int j2 = act.j(h);
            int d2 = this.j.d(h);
            int c3 = this.j.c(h);
            if (j2 >= 0 && j2 < i4) {
                if (!((acu) h.getLayoutParams()).a()) {
                    if ((d2 < a2 || c3 <= a2) && (c3 > c2 || d2 >= c2)) {
                        return h;
                    }
                    if (view == null) {
                        view = h;
                    }
                } else if (view2 == null) {
                    view2 = h;
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    public View a(View view, int i2, adb adb, adi adi) {
        int e2;
        View view2;
        View view3;
        B();
        if (r() == 0 || (e2 = e(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        j();
        a(e2, (int) (((float) this.j.d()) * 0.33333334f), false, adi);
        abi abi = this.a;
        abi.g = Integer.MIN_VALUE;
        abi.a = false;
        a(adb, abi, adi, true);
        if (e2 != -1) {
            if (this.k) {
                view2 = E();
            } else {
                view2 = F();
            }
        } else if (this.k) {
            view2 = F();
        } else {
            view2 = E();
        }
        if (e2 != -1) {
            view3 = D();
        } else {
            view3 = C();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 != null) {
            return view3;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View a(boolean z) {
        if (!this.k) {
            return a(r() - 1, -1, z);
        }
        return a(0, r(), z);
    }

    public final void a(int i2, int i3, adi adi, aax aax) {
        int i4;
        if (this.i != 0) {
            i2 = i3;
        }
        if (r() != 0 && i2 != 0) {
            j();
            if (i2 > 0) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            a(i4, Math.abs(i2), true, adi);
            a(adi, this.a, aax);
        }
    }

    public final void a(int i2, aax aax) {
        boolean z;
        int i3;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.o;
        int i4 = -1;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.a()) {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = this.o;
            z = linearLayoutManager$SavedState2.c;
            i3 = linearLayoutManager$SavedState2.a;
        } else {
            B();
            z = this.k;
            i3 = this.m;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        }
        if (!z) {
            i4 = 1;
        }
        for (int i5 = 0; i5 < this.e && i3 >= 0 && i3 < i2; i5++) {
            aax.a(i3, 0);
            i3 += i4;
        }
    }

    public void a(adb adb, adi adi, abi abi, abh abh) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View a2 = abi.a(adb);
        if (a2 != null) {
            acu acu = (acu) a2.getLayoutParams();
            if (abi.l == null) {
                boolean z3 = this.k;
                if (abi.f != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z3 != z2) {
                    b(a2, 0);
                } else {
                    b(a2);
                }
            } else {
                boolean z4 = this.k;
                if (abi.f != -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z4 != z) {
                    a(a2, 0);
                } else {
                    a(a2);
                }
            }
            k(a2);
            abh.a = this.j.a(a2);
            if (this.i == 1) {
                if (i()) {
                    i5 = this.C - u();
                    i4 = i5 - this.j.b(a2);
                } else {
                    i4 = s();
                    i5 = this.j.b(a2) + i4;
                }
                if (abi.f == -1) {
                    i2 = abi.b;
                    i3 = i2 - abh.a;
                } else {
                    i3 = abi.b;
                    i2 = abh.a + i3;
                }
            } else {
                int t = t();
                int b2 = this.j.b(a2) + t;
                if (abi.f == -1) {
                    int i6 = abi.b;
                    int i7 = i6 - abh.a;
                    int i8 = t;
                    i5 = i6;
                    i2 = b2;
                    i4 = i7;
                    i3 = i8;
                } else {
                    int i9 = abi.b;
                    int i10 = abh.a + i9;
                    int i11 = b2;
                    i4 = i9;
                    i2 = i11;
                    int i12 = i10;
                    i3 = t;
                    i5 = i12;
                }
            }
            act.a(a2, i4, i3, i5, i2);
            if (acu.a() || acu.b()) {
                abh.c = true;
            }
            abh.d = a2.hasFocusable();
            return;
        }
        abh.b = true;
    }

    public void a(adi adi) {
        this.o = null;
        this.m = -1;
        this.n = Integer.MIN_VALUE;
        this.p.a();
    }

    public void a(adi adi, abi abi, aax aax) {
        int i2 = abi.d;
        if (i2 >= 0 && i2 < adi.a()) {
            aax.a(i2, Math.max(0, abi.g));
        }
    }

    /* access modifiers changed from: protected */
    public void a(adi adi, int[] iArr) {
        int i2;
        int i3;
        if (adi.a != -1) {
            i2 = this.j.d();
        } else {
            i2 = 0;
        }
        int i4 = this.a.f;
        if (i4 == -1) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        if (i4 != -1) {
            i2 = 0;
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState = (LinearLayoutManager$SavedState) parcelable;
            this.o = linearLayoutManager$SavedState;
            if (this.m != -1) {
                linearLayoutManager$SavedState.b();
            }
            o();
        }
    }

    public void a(RecyclerView recyclerView, int i2) {
        adh adh = new adh(recyclerView.getContext());
        adh.a = i2;
        a(adh);
    }

    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (r() > 0) {
            accessibilityEvent.setFromIndex(m());
            accessibilityEvent.setToIndex(n());
        }
    }

    public final void a(String str) {
        if (this.o == null) {
            super.a(str);
        }
    }
}
