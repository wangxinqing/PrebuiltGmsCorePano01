package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: xo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xo extends xd implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, xh {
    final abv a;
    final ViewTreeObserver.OnGlobalLayoutListener b = new xm(this);
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final wt f;
    private final wq h;
    private final boolean i;
    private final int j;
    private final int k;
    private final View.OnAttachStateChangeListener l = new xn(this);
    private PopupWindow.OnDismissListener m;
    private View n;
    private xg o;
    private boolean p;
    private boolean q;
    private int r;
    private int s = 0;
    private boolean t;

    public xo(Context context, wt wtVar, View view, int i2, boolean z) {
        this.e = context;
        this.f = wtVar;
        this.i = z;
        this.h = new wq(wtVar, LayoutInflater.from(context), this.i, R.layout.abc_popup_menu_item_layout);
        this.k = i2;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new abv(this.e, this.k);
        wtVar.a((xh) this, context);
    }

    public final void a(int i2) {
        this.s = i2;
    }

    public final void a(Parcelable parcelable) {
    }

    public final void a(View view) {
        this.n = view;
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    public final void a(wt wtVar) {
    }

    public final void a(xg xgVar) {
        this.o = xgVar;
    }

    public final boolean a() {
        return false;
    }

    public final void b(int i2) {
        this.a.g = i2;
    }

    public final void b(boolean z) {
        this.h.b = z;
    }

    public final void c(int i2) {
        this.a.a(i2);
    }

    public final void c(boolean z) {
        this.t = z;
    }

    public final void d() {
        if (e()) {
            this.a.d();
        }
    }

    public final boolean e() {
        return !this.p && this.a.e();
    }

    public final Parcelable f() {
        return null;
    }

    public final ListView g() {
        return this.a.e;
    }

    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    public final void ar() {
        View view;
        if (e()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.a((PopupWindow.OnDismissListener) this);
        abv abv = this.a;
        abv.m = this;
        abv.l();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        abv abv2 = this.a;
        abv2.l = view2;
        abv2.j = this.s;
        if (!this.q) {
            this.r = a(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.d(this.r);
        this.a.k();
        this.a.a(this.g);
        this.a.ar();
        aan aan = this.a.e;
        aan.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, aan, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            aan.addHeaderView(frameLayout, (Object) null, false);
        }
        this.a.a((ListAdapter) this.h);
        this.a.ar();
    }

    public final void a(wt wtVar, boolean z) {
        if (wtVar == this.f) {
            d();
            xg xgVar = this.o;
            if (xgVar != null) {
                xgVar.a(wtVar, z);
            }
        }
    }

    public final void a(boolean z) {
        this.q = false;
        wq wqVar = this.h;
        if (wqVar != null) {
            wqVar.notifyDataSetChanged();
        }
    }

    public final boolean a(xp xpVar) {
        if (xpVar.hasVisibleItems()) {
            xf xfVar = new xf(this.e, xpVar, this.c, this.i, this.k);
            xfVar.a(this.o);
            xfVar.a(xd.b((wt) xpVar));
            xfVar.c = this.m;
            this.m = null;
            this.f.a(false);
            abv abv = this.a;
            int i2 = abv.g;
            int c2 = abv.c();
            if ((Gravity.getAbsoluteGravity(this.s, qb.h(this.n)) & 7) == 5) {
                i2 += this.n.getWidth();
            }
            if (!xfVar.e()) {
                if (xfVar.a != null) {
                    xfVar.a(i2, c2, true, true);
                }
            }
            xg xgVar = this.o;
            if (xgVar != null) {
                xgVar.a(xpVar);
            }
            return true;
        }
        return false;
    }
}
