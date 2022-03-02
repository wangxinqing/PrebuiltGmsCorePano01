package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* renamed from: akat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akat {
    static final Handler a = new Handler(Looper.getMainLooper(), new akaf());
    public static final String b = akat.class.getSimpleName();
    private static final int[] n = {R.attr.snackbarStyle};
    public final ViewGroup c;
    public final Context d;
    public final akas e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public final SnackbarContentLayout l;
    public final akaj m = new akaj(this);
    private final Runnable o = new akag(this);
    private Rect p;
    private final AccessibilityManager q;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    protected akat(ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout != null) {
            this.c = viewGroup;
            this.l = snackbarContentLayout;
            Context context = viewGroup.getContext();
            this.d = context;
            ajya.a(context);
            LayoutInflater from = LayoutInflater.from(this.d);
            TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(n);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            akas akas = (akas) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, this.c, false);
            this.e = akas;
            float f2 = akas.b;
            if (f2 != 1.0f) {
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                snackbarContentLayout2.b.setTextColor(ajuo.a(ajyl.a(view, (int) R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f2));
            }
            this.e.addView(view);
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            qb.f(this.e, 1);
            qb.b((View) this.e, 1);
            qb.b((View) this.e, true);
            qb.a((View) this.e, (pq) new akah(this));
            qb.a((View) this.e, (oz) new akai(this));
            this.q = (AccessibilityManager) this.d.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public final ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ajrr.a);
        ofFloat.addUpdateListener(new ajzz(this));
        return ofFloat;
    }

    public int b() {
        throw null;
    }

    public final void c() {
        akba a2 = akba.a();
        int b2 = b();
        akaj akaj = this.m;
        synchronized (a2.a) {
            if (a2.c(akaj)) {
                akaz akaz = a2.c;
                akaz.b = b2;
                a2.b.removeCallbacksAndMessages(akaz);
                a2.a(a2.c);
                return;
            }
            if (!a2.d(akaj)) {
                a2.d = new akaz(b2, akaj);
            } else {
                a2.d.b = b2;
            }
            akaz akaz2 = a2.c;
            if (akaz2 != null) {
                if (a2.a(akaz2, 4)) {
                    return;
                }
            }
            a2.c = null;
            a2.b();
        }
    }

    public final void d() {
        a(3);
    }

    public final boolean e() {
        boolean c2;
        akba a2 = akba.a();
        akaj akaj = this.m;
        synchronized (a2.a) {
            c2 = a2.c(akaj);
        }
        return c2;
    }

    public final void f() {
        if (!i()) {
            this.e.setVisibility(0);
            h();
            return;
        }
        this.e.post(new akao(this));
    }

    public final int g() {
        int height = this.e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        akba a2 = akba.a();
        akaj akaj = this.m;
        synchronized (a2.a) {
            if (a2.c(akaj)) {
                a2.a(a2.c);
            }
        }
        List list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((akap) this.k.get(size)).b(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        akba a2 = akba.a();
        akaj akaj = this.m;
        synchronized (a2.a) {
            if (a2.c(akaj)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.b();
                }
            }
        }
        List list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((akap) this.k.get(size)).a(this);
            }
        }
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }

    public final void a() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.p) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + this.g;
            marginLayoutParams.leftMargin = this.p.left + this.h;
            marginLayoutParams.rightMargin = this.p.right + this.i;
            this.e.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && this.j > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.e.getLayoutParams();
                if ((layoutParams2 instanceof ahm) && (((ahm) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    this.e.removeCallbacks(this.o);
                    this.e.post(this.o);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        akba a2 = akba.a();
        akaj akaj = this.m;
        synchronized (a2.a) {
            if (a2.c(akaj)) {
                a2.a(a2.c, i2);
            } else if (a2.d(akaj)) {
                a2.a(a2.d, i2);
            }
        }
    }
}
