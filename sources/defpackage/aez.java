package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.R;

/* renamed from: aez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aez implements xh {
    wt a;
    public ww b;
    final /* synthetic */ Toolbar c;

    public aez(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final void a(Context context, wt wtVar) {
        ww wwVar;
        wt wtVar2 = this.a;
        if (!(wtVar2 == null || (wwVar = this.b) == null)) {
            wtVar2.b(wwVar);
        }
        this.a = wtVar;
    }

    public final void a(Parcelable parcelable) {
    }

    public final void a(wt wtVar, boolean z) {
    }

    public final void a(xg xgVar) {
        throw null;
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(xp xpVar) {
        return false;
    }

    public final int b() {
        return 0;
    }

    public final Parcelable f() {
        return null;
    }

    public final boolean b(ww wwVar) {
        Toolbar toolbar = this.c;
        if (toolbar.e == null) {
            toolbar.e = new yw(toolbar.getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            toolbar.e.setImageDrawable(toolbar.c);
            toolbar.e.setContentDescription(toolbar.d);
            afa q = Toolbar.q();
            q.a = (toolbar.j & 112) | 8388611;
            q.b = 2;
            toolbar.e.setLayoutParams(q);
            toolbar.e.setOnClickListener(new aey(toolbar));
        }
        ViewParent parent = this.c.e.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.e);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.e);
        }
        this.c.f = wwVar.getActionView();
        this.b = wwVar;
        ViewParent parent2 = this.c.f.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.f);
            }
            afa q2 = Toolbar.q();
            Toolbar toolbar5 = this.c;
            q2.a = 8388611 | (toolbar5.j & 112);
            q2.b = 2;
            toolbar5.f.setLayoutParams(q2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.f);
        }
        Toolbar toolbar7 = this.c;
        for (int childCount = toolbar7.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar7.getChildAt(childCount);
            if (!(((afa) childAt.getLayoutParams()).b == 2 || childAt == toolbar7.a)) {
                toolbar7.removeViewAt(childCount);
                toolbar7.r.add(childAt);
            }
        }
        this.c.requestLayout();
        wwVar.e(true);
        View view = this.c.f;
        if (view instanceof vs) {
            ((vs) view).a();
        }
        return true;
    }

    public final void a(boolean z) {
        if (this.b != null) {
            wt wtVar = this.a;
            if (wtVar != null) {
                int size = wtVar.size();
                int i = 0;
                while (i < size) {
                    if (this.a.getItem(i) != this.b) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            a(this.b);
        }
    }

    public final boolean a(ww wwVar) {
        View view = this.c.f;
        if (view instanceof vs) {
            ((vs) view).b();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.f);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.e);
        Toolbar toolbar3 = this.c;
        toolbar3.f = null;
        for (int size = toolbar3.r.size() - 1; size >= 0; size--) {
            toolbar3.addView((View) toolbar3.r.get(size));
        }
        toolbar3.r.clear();
        this.b = null;
        this.c.requestLayout();
        wwVar.e(false);
        return true;
    }
}
