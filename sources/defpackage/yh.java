package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuPresenter$SavedState;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: yh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yh extends wg {
    public yd h;
    public Drawable i;
    public boolean j;
    public int k;
    ye l;
    public ya m;
    yb n;
    final yf o = new yf(this);
    int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private final SparseBooleanArray v = new SparseBooleanArray();
    private wf w;

    public yh(Context context) {
        super(context);
    }

    public final void a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean c() {
        wt wtVar;
        if (!this.q || e() || (wtVar = this.c) == null || this.f == null || this.n != null || wtVar.i().isEmpty()) {
            return false;
        }
        this.n = new yb(this, new ye(this, this.b, this.c, this.h));
        ((View) this.f).post(this.n);
        super.a((xp) null);
        return true;
    }

    public final boolean d() {
        xj xjVar;
        yb ybVar = this.n;
        if (ybVar == null || (xjVar = this.f) == null) {
            ye yeVar = this.l;
            if (yeVar == null) {
                return false;
            }
            yeVar.c();
            return true;
        }
        ((View) xjVar).removeCallbacks(ybVar);
        this.n = null;
        return true;
    }

    public final boolean e() {
        ye yeVar = this.l;
        return yeVar != null && yeVar.e();
    }

    public final Parcelable f() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.a = this.p;
        return actionMenuPresenter$SavedState;
    }

    public final void g() {
        d();
        j();
    }

    public final void h() {
        this.u = true;
    }

    public final void i() {
        this.q = true;
        this.r = true;
    }

    public final void j() {
        ya yaVar = this.m;
        if (yaVar != null) {
            yaVar.c();
        }
    }

    public final View a(ww wwVar, View view, ViewGroup viewGroup) {
        xi xiVar;
        View actionView = wwVar.getActionView();
        int i2 = 0;
        if (actionView == null || wwVar.i()) {
            if (view instanceof xi) {
                xiVar = (xi) view;
            } else {
                xiVar = (xi) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            xiVar.a(wwVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) xiVar;
            actionMenuItemView.c = (ActionMenuView) this.f;
            if (this.w == null) {
                this.w = new wf(this);
            }
            actionMenuItemView.d = this.w;
            actionView = (View) xiVar;
        }
        if (wwVar.o) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof yk)) {
            actionView.setLayoutParams(ActionMenuView.b(layoutParams));
        }
        return actionView;
    }

    public final void a(Context context, wt wtVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = wtVar;
        Resources resources = context.getResources();
        vp a = vp.a(context);
        if (!this.r) {
            int i2 = Build.VERSION.SDK_INT;
            this.q = true;
        }
        this.s = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.k = a.a();
        int i3 = this.s;
        if (!this.q) {
            this.h = null;
        } else {
            if (this.h == null) {
                yd ydVar = new yd(this, this.a);
                this.h = ydVar;
                if (this.j) {
                    ydVar.setImageDrawable(this.i);
                    this.i = null;
                    this.j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i3 -= this.h.getMeasuredWidth();
        }
        this.t = i3;
        float f = resources.getDisplayMetrics().density;
    }

    public final void a(Parcelable parcelable) {
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i2 = ((ActionMenuPresenter$SavedState) parcelable).a) > 0 && (findItem = this.c.findItem(i2)) != null) {
            a((xp) findItem.getSubMenu());
        }
    }

    public final void a(wt wtVar, boolean z) {
        g();
        xg xgVar = this.e;
        if (xgVar != null) {
            xgVar.a(wtVar, z);
        }
    }

    public final void a(boolean z) {
        xj xjVar;
        int size;
        int i2;
        ww wwVar;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            wt wtVar = this.c;
            if (wtVar != null) {
                wtVar.h();
                ArrayList g = this.c.g();
                int size2 = g.size();
                i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    ww wwVar2 = (ww) g.get(i3);
                    if (wwVar2.f()) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof xi) {
                            wwVar = ((xi) childAt).a();
                        } else {
                            wwVar = null;
                        }
                        View a = a(wwVar2, childAt, viewGroup);
                        if (wwVar2 != wwVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f).addView(a, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.h) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f).requestLayout();
        wt wtVar2 = this.c;
        if (wtVar2 != null) {
            wtVar2.h();
            ArrayList arrayList2 = wtVar2.d;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ww wwVar3 = (ww) arrayList2.get(i4);
            }
        }
        wt wtVar3 = this.c;
        if (wtVar3 != null) {
            arrayList = wtVar3.i();
        }
        if (this.q && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : !((ww) arrayList.get(0)).o)) {
            if (this.h == null) {
                this.h = new yd(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.h.getParent();
            if (viewGroup3 != this.f) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.h);
                }
                yd ydVar = this.h;
                yk d = ActionMenuView.d();
                d.a = true;
                ((ActionMenuView) this.f).addView(ydVar, d);
            }
        } else {
            yd ydVar2 = this.h;
            if (ydVar2 != null && ydVar2.getParent() == (xjVar = this.f)) {
                ((ViewGroup) xjVar).removeView(this.h);
            }
        }
        ((ActionMenuView) this.f).b = this.q;
    }

    public final boolean a() {
        int i2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        wt wtVar = this.c;
        View view = null;
        if (wtVar != null) {
            arrayList = wtVar.g();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i3 = this.k;
        int i4 = this.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            z = true;
            if (i5 >= i2) {
                break;
            }
            ww wwVar = (ww) arrayList.get(i5);
            if (wwVar.h()) {
                i6++;
            } else if (wwVar.g()) {
                i7++;
            } else {
                z4 = true;
            }
            if (this.u && wwVar.o) {
                i3 = 0;
            }
            i5++;
        }
        if (this.q && (z4 || i7 + i6 > i3)) {
            i3--;
        }
        int i8 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.v;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i2) {
            ww wwVar2 = (ww) arrayList.get(i9);
            if (wwVar2.h()) {
                View a = a(wwVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i11 = wwVar2.b;
                if (i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                }
                wwVar2.d(z);
            } else if (wwVar2.g()) {
                int i12 = wwVar2.b;
                boolean z5 = sparseBooleanArray.get(i12);
                boolean z6 = (i8 > 0 || z5) ? i4 > 0 : false;
                if (z6) {
                    View a2 = a(wwVar2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    if (i4 + i10 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z3;
                } else {
                    z2 = z6;
                }
                if (z2 && i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                } else if (z5) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        ww wwVar3 = (ww) arrayList.get(i13);
                        if (wwVar3.b == i12) {
                            if (wwVar3.f()) {
                                i8++;
                            }
                            wwVar3.d(false);
                        }
                    }
                }
                if (z2) {
                    i8--;
                }
                wwVar2.d(z2);
            } else {
                wwVar2.d(false);
            }
            i9++;
            view = null;
            z = true;
        }
        return true;
    }

    public final boolean a(xp xpVar) {
        boolean z = false;
        if (!xpVar.hasVisibleItems()) {
            return false;
        }
        xp xpVar2 = xpVar;
        while (true) {
            wt wtVar = xpVar2.k;
            if (wtVar == this.c) {
                break;
            }
            xpVar2 = wtVar;
        }
        ww wwVar = xpVar2.l;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof xi) && ((xi) childAt).a() == wwVar) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        this.p = xpVar.l.a;
        int size = xpVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = xpVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        ya yaVar = new ya(this, this.b, xpVar, view);
        this.m = yaVar;
        yaVar.a(z);
        if (this.m.b()) {
            super.a(xpVar);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
}
