package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: adh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adh {
    public int a;
    public RecyclerView b;
    public act c;
    public boolean d;
    public boolean e;
    public View f;
    public boolean g;
    protected final LinearInterpolator h;
    protected final DecelerateInterpolator i;
    protected PointF j;
    protected int k;
    protected int l;
    private final adf m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public adh() {
        this.a = -1;
        this.m = new adf();
    }

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            return i5 - i3;
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 >= 0) {
            return 0;
        }
        return i8;
    }

    private static int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 > 0) {
            return i4;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int c(int i2) {
        double d2 = (double) d(i2);
        Double.isNaN(d2);
        return (int) Math.ceil(d2 / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.l = 0;
        this.k = 0;
        this.j = null;
    }

    /* access modifiers changed from: protected */
    public int d(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil((double) (abs * this.p));
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public final int b() {
        return this.b.mLayout.r();
    }

    public adh(Context context) {
        this.a = -1;
        this.m = new adf();
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.o = false;
        this.k = 0;
        this.l = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public final int a(View view) {
        return this.b.getChildLayoutPosition(view);
    }

    public final View b(int i2) {
        return this.b.mLayout.b(i2);
    }

    public PointF a(int i2) {
        act act = this.c;
        if (act instanceof adg) {
            return ((adg) act).c(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + adg.class.getCanonicalName());
        return null;
    }

    public final void a() {
        if (this.e) {
            this.e = false;
            c();
            this.b.mState.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            act act = this.c;
            if (act.u == this) {
                act.u = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        PointF a2;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            a();
        }
        if (!(!this.d || this.f != null || this.c == null || (a2 = a(this.a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
            recyclerView.scrollStep((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
        }
        this.d = false;
        View view = this.f;
        if (view != null) {
            if (a(view) == this.a) {
                View view2 = this.f;
                adi adi = recyclerView.mState;
                a(view2, this.m);
                this.m.a(recyclerView);
                a();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            adi adi2 = recyclerView.mState;
            adf adf = this.m;
            if (b() == 0) {
                a();
            } else {
                this.k = b(this.k, i2);
                int b2 = b(this.l, i3);
                this.l = b2;
                if (this.k == 0 && b2 == 0) {
                    PointF a3 = a(this.a);
                    if (a3 == null || (a3.x == 0.0f && a3.y == 0.0f)) {
                        adf.a = this.a;
                        a();
                    } else {
                        float sqrt = (float) Math.sqrt((double) ((a3.x * a3.x) + (a3.y * a3.y)));
                        a3.x /= sqrt;
                        a3.y /= sqrt;
                        this.j = a3;
                        this.k = (int) (a3.x * 10000.0f);
                        this.l = (int) (a3.y * 10000.0f);
                        adf.a((int) (((float) this.k) * 1.2f), (int) (((float) this.l) * 1.2f), (int) (((float) d(10000)) * 1.2f), this.h);
                    }
                }
            }
            adf adf2 = this.m;
            int i4 = adf2.a;
            adf2.a(recyclerView);
            if (i4 >= 0 && this.e) {
                this.d = true;
                recyclerView.mViewFlinger.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view, adf adf) {
        int i2;
        PointF pointF = this.j;
        int i3 = 1;
        int i4 = 0;
        int i5 = (pointF == null || pointF.x == 0.0f) ? 0 : this.j.x > 0.0f ? 1 : -1;
        act act = this.c;
        if (act == null || !act.g()) {
            i2 = 0;
        } else {
            acu acu = (acu) view.getLayoutParams();
            i2 = a(act.d(view) - acu.leftMargin, act.f(view) + acu.rightMargin, act.s(), act.C - act.u(), i5);
        }
        PointF pointF2 = this.j;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i3 = 0;
        } else if (this.j.y <= 0.0f) {
            i3 = -1;
        }
        act act2 = this.c;
        if (act2 != null && act2.h()) {
            acu acu2 = (acu) view.getLayoutParams();
            i4 = a(act2.e(view) - acu2.topMargin, act2.g(view) + acu2.bottomMargin, act2.t(), act2.D - act2.v(), i3);
        }
        int c2 = c((int) Math.sqrt((double) ((i2 * i2) + (i4 * i4))));
        if (c2 > 0) {
            adf.a(-i2, -i4, c2, this.i);
        }
    }
}
