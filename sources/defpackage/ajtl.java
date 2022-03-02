package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: ajtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajtl extends sc {
    final /* synthetic */ BottomSheetBehavior a;

    public ajtl(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public final int a() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.j ? bottomSheetBehavior.p : bottomSheetBehavior.h;
    }

    public final boolean b(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.m;
        if (i2 == 1 || bottomSheetBehavior.t) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.s == i) {
            WeakReference weakReference = bottomSheetBehavior.r;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = this.a.q;
        return weakReference2 != null && weakReference2.get() == view;
    }

    public final int c(View view, int i) {
        return view.getLeft();
    }

    public final int d(View view, int i) {
        int i2;
        int c = this.a.c();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (!bottomSheetBehavior.j) {
            i2 = bottomSheetBehavior.h;
        } else {
            i2 = bottomSheetBehavior.p;
        }
        return mk.a(i, c, i2);
    }

    public final void a(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.l) {
                bottomSheetBehavior.d(1);
            }
        }
    }

    public final void a(View view, float f, float f2) {
        int i;
        int i2;
        int i3 = 4;
        if (f2 >= 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.j && bottomSheetBehavior.a(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior2 = this.a;
                    if (top <= (bottomSheetBehavior2.p + bottomSheetBehavior2.c()) / 2) {
                        BottomSheetBehavior bottomSheetBehavior3 = this.a;
                        if (bottomSheetBehavior3.a) {
                            i = bottomSheetBehavior3.e;
                        } else if (Math.abs(view.getTop() - this.a.d) < Math.abs(view.getTop() - this.a.f)) {
                            i = this.a.d;
                        } else {
                            i = this.a.f;
                            i3 = 6;
                        }
                        i3 = 3;
                    }
                }
                i = this.a.p;
                i3 = 5;
            } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                BottomSheetBehavior bottomSheetBehavior4 = this.a;
                if (!bottomSheetBehavior4.a) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.a.f) < Math.abs(top2 - this.a.h)) {
                        i = this.a.f;
                        i3 = 6;
                    } else {
                        bottomSheetBehavior4 = this.a;
                    }
                }
                i = bottomSheetBehavior4.h;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior5 = this.a;
                if (!bottomSheetBehavior5.a) {
                    int i4 = bottomSheetBehavior5.f;
                    if (top3 >= i4) {
                        if (Math.abs(top3 - i4) < Math.abs(top3 - this.a.h)) {
                            i = this.a.f;
                            i3 = 6;
                        } else {
                            i = this.a.h;
                        }
                    } else if (top3 < Math.abs(top3 - bottomSheetBehavior5.h)) {
                        i = this.a.d;
                        i3 = 3;
                    } else {
                        i = this.a.f;
                        i3 = 6;
                    }
                } else if (Math.abs(top3 - bottomSheetBehavior5.e) < Math.abs(top3 - this.a.h)) {
                    i = this.a.e;
                    i3 = 3;
                } else {
                    i = this.a.h;
                }
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior6 = this.a;
            if (!bottomSheetBehavior6.a) {
                int top4 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior7 = this.a;
                int i5 = bottomSheetBehavior7.f;
                if (top4 <= i5) {
                    i2 = bottomSheetBehavior7.d;
                } else {
                    i = i5;
                    i3 = 6;
                }
            } else {
                i2 = bottomSheetBehavior6.e;
            }
            i3 = 3;
        }
        this.a.a(view, i3, i, true);
    }

    public final void a(View view, int i, int i2) {
        this.a.e(i2);
    }
}
