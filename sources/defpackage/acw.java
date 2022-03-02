package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Scroller;

/* renamed from: acw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acw {
    public RecyclerView a;
    public Scroller b;
    public final acy c;
    private abz d;
    private abz e;

    public acw() {
    }

    private static int a(View view, abz abz) {
        return (abz.d(view) + (abz.a(view) / 2)) - (abz.c() + (abz.d() / 2));
    }

    public final abz b(act act) {
        abz abz = this.d;
        if (abz == null || abz.a != act) {
            this.d = abz.b(act);
        }
        return this.d;
    }

    public final abz c(act act) {
        abz abz = this.e;
        if (abz == null || abz.a != act) {
            this.e = abz.a(act);
        }
        return this.e;
    }

    private static View a(act act, abz abz) {
        int r = act.r();
        View view = null;
        if (r != 0) {
            int c2 = abz.c() + (abz.d() / 2);
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (i2 < r) {
                View h = act.h(i2);
                int abs = Math.abs((abz.d(h) + (abz.a(h) / 2)) - c2);
                int i3 = abs < i ? abs : i;
                if (abs < i) {
                    view = h;
                }
                i2++;
                i = i3;
            }
        }
        return view;
    }

    public acw(byte[] bArr) {
        this.c = new ael(this);
    }

    public final int a(act act, abz abz, int i, int i2) {
        int max;
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int r = act.r();
        float f = 1.0f;
        if (r != 0) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < r; i5++) {
                View h = act.h(i5);
                int j = act.j(h);
                if (j != -1) {
                    int i6 = j < i3 ? j : i3;
                    if (j < i3) {
                        view = h;
                    }
                    if (j > i4) {
                        view2 = h;
                        i4 = j;
                    }
                    i3 = i6;
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(abz.c(view), abz.c(view2)) - Math.min(abz.d(view), abz.d(view2))) == 0)) {
                f = ((float) max) / ((float) ((i4 - i3) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) <= Math.abs(iArr[1]) ? iArr[1] : iArr[0])) / f);
    }

    public final View a(act act) {
        if (act.h()) {
            return a(act, b(act));
        }
        if (act.g()) {
            return a(act, c(act));
        }
        return null;
    }

    public final void a() {
        act layoutManager;
        View a2;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (a2 = a(layoutManager)) != null) {
            int[] a3 = a(layoutManager, a2);
            int i = a3[0];
            if (i != 0 || a3[1] != 0) {
                this.a.smoothScrollBy(i, a3[1]);
            }
        }
    }

    public final int[] a(act act, View view) {
        int[] iArr = new int[2];
        if (act.g()) {
            iArr[0] = a(view, c(act));
        } else {
            iArr[0] = 0;
        }
        if (act.h()) {
            iArr[1] = a(view, b(act));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
