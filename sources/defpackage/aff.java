package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: aff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aff implements zx {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private yh m;
    private int n = 0;
    private Drawable o;

    private final void d(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.a(charSequence);
        }
    }

    private final void u() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0) {
            drawable = this.g;
        } else {
            drawable = this.h;
            if (drawable == null) {
                drawable = this.g;
            }
        }
        this.a.a(drawable);
    }

    private final void v() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.i;
            if (drawable == null) {
                drawable = this.o;
            }
            toolbar.b(drawable);
            return;
        }
        this.a.b((Drawable) null);
    }

    private final void w() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.l)) {
            this.a.c(this.n);
        } else {
            this.a.c(this.l);
        }
    }

    public final ViewGroup a() {
        return this.a;
    }

    public final void a(Window.Callback callback) {
        this.e = callback;
    }

    public final Context b() {
        return this.a.getContext();
    }

    public final void c(int i2) {
        String str;
        if (i2 != 0) {
            str = b().getString(i2);
        } else {
            str = null;
        }
        this.l = str;
        w();
    }

    public final boolean c() {
        aez aez = this.a.u;
        return (aez == null || aez.b == null) ? false : true;
    }

    public final CharSequence e() {
        return this.a.p;
    }

    public final void f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r2 = this;
            android.support.v7.widget.Toolbar r0 = r2.a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            android.support.v7.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aff.h():boolean");
    }

    public final boolean i() {
        return this.a.a();
    }

    public final boolean j() {
        yh yhVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (yhVar = actionMenuView.c) == null) {
            return false;
        }
        return yhVar.n != null || yhVar.e();
    }

    public final boolean k() {
        return this.a.b();
    }

    public final boolean l() {
        return this.a.c();
    }

    public final void m() {
        this.f = true;
    }

    public final void n() {
        this.a.d();
    }

    public final int o() {
        return this.b;
    }

    public final int p() {
        return 0;
    }

    public final View q() {
        return this.c;
    }

    public final void r() {
    }

    public final void s() {
    }

    public final void t() {
        b(uj.b(b(), R.drawable.quantum_ic_arrow_back_black_24));
    }

    public aff(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.a = toolbar;
        this.d = toolbar.p;
        this.k = toolbar.q;
        this.j = this.d != null;
        this.i = toolbar.g();
        aev a2 = aev.a(toolbar.getContext(), (AttributeSet) null, uh.a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.o = a2.a(15);
        if (z) {
            CharSequence c2 = a2.c(27);
            if (!TextUtils.isEmpty(c2)) {
                b(c2);
            }
            CharSequence c3 = a2.c(25);
            if (!TextUtils.isEmpty(c3)) {
                c(c3);
            }
            Drawable a3 = a2.a(20);
            if (a3 != null) {
                this.h = a3;
                u();
            }
            Drawable a4 = a2.a(17);
            if (a4 != null) {
                a(a4);
            }
            if (this.i == null && (drawable = this.o) != null) {
                b(drawable);
            }
            b(a2.a(10, 0));
            int f2 = a2.f(9, 0);
            if (f2 != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(f2, this.a, false));
                b(this.b | 16);
            }
            int e2 = a2.e(13, 0);
            if (e2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = e2;
                this.a.setLayoutParams(layoutParams);
            }
            int c4 = a2.c(7, -1);
            int c5 = a2.c(3, -1);
            if (c4 >= 0 || c5 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(c4, 0);
                int max2 = Math.max(c5, 0);
                toolbar2.p();
                toolbar2.o.a(max, max2);
            }
            int f3 = a2.f(28, 0);
            if (f3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.a(toolbar3.getContext(), f3);
            }
            int f4 = a2.f(26, 0);
            if (f4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context = toolbar4.getContext();
                toolbar4.i = f4;
                TextView textView = toolbar4.b;
                if (textView != null) {
                    textView.setTextAppearance(context, f4);
                }
            }
            int f5 = a2.f(22, 0);
            if (f5 != 0) {
                this.a.a(f5);
            }
        } else {
            if (this.a.g() != null) {
                this.o = this.a.g();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        a2.a();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.f())) {
                c(this.n);
            }
        }
        this.l = this.a.f();
        this.a.a((View.OnClickListener) new afd(this));
    }

    public final qg a(int i2, long j2) {
        qg m2 = qb.m(this.a);
        m2.a(i2 == 0 ? 1.0f : 0.0f);
        m2.a(j2);
        m2.a((qh) new afe(this, i2));
        return m2;
    }

    public final void b(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    w();
                }
                v();
            }
            if ((i3 & 3) != 0) {
                u();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.a(this.d);
                    this.a.b(this.k);
                } else {
                    this.a.a((CharSequence) null);
                    this.a.b((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.c) != null) {
                if ((i2 & 16) == 0) {
                    this.a.removeView(view);
                } else {
                    this.a.addView(view);
                }
            }
        }
    }

    public final void d() {
        this.a.e();
    }

    public final void a(int i2) {
        a(uj.b(b(), i2));
    }

    public final void c(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 8) != 0) {
            this.a.b(charSequence);
        }
    }

    public final void d(int i2) {
        this.a.setVisibility(i2);
    }

    public final void a(Drawable drawable) {
        this.g = drawable;
        u();
    }

    public final void a(Menu menu, xg xgVar) {
        yh yhVar = this.m;
        if (yhVar == null) {
            yhVar = new yh(this.a.getContext());
            this.m = yhVar;
            yhVar.g = R.id.action_menu_presenter;
        }
        yhVar.e = xgVar;
        Toolbar toolbar = this.a;
        if (menu != null || toolbar.a != null) {
            toolbar.j();
            wt wtVar = toolbar.a.a;
            if (wtVar != menu) {
                if (wtVar != null) {
                    wtVar.b((xh) toolbar.t);
                    wtVar.b((xh) toolbar.u);
                }
                if (toolbar.u == null) {
                    toolbar.u = new aez(toolbar);
                }
                yhVar.h();
                if (menu != null) {
                    wt wtVar2 = (wt) menu;
                    wtVar2.a((xh) yhVar, toolbar.g);
                    wtVar2.a((xh) toolbar.u, toolbar.g);
                } else {
                    yhVar.a(toolbar.g, (wt) null);
                    toolbar.u.a(toolbar.g, (wt) null);
                    yhVar.a(true);
                    toolbar.u.a(true);
                }
                toolbar.a.a(toolbar.h);
                toolbar.a.a(yhVar);
                toolbar.t = yhVar;
            }
        }
    }

    public final void b(Drawable drawable) {
        this.i = drawable;
        v();
    }

    public final void b(CharSequence charSequence) {
        this.j = true;
        d(charSequence);
    }

    public final void a(View view) {
        View view2 = this.c;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public final void a(CharSequence charSequence) {
        if (!this.j) {
            d(charSequence);
        }
    }

    public final void a(boolean z) {
        Toolbar toolbar = this.a;
        toolbar.x = z;
        toolbar.requestLayout();
    }
}
