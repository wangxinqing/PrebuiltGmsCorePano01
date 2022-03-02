package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.view.AppBarBehavior;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;

/* renamed from: dbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dbp {
    public final Context a;
    public final AppBarLayout b;
    public int c = Integer.MAX_VALUE;
    public ProductLockupView d;
    public View e;
    public View f;
    public TextView g;
    public TextView h;
    public TextView i;
    public Chip j;
    public Toolbar k;
    public View l;
    public dbo m;
    public boolean n;
    public ajsf o;
    public ajsf p;
    public View.OnClickListener q;
    public int r;
    public float s;
    public float t;
    public final int u;
    public int v;

    public dbp(Context context, AppBarLayout appBarLayout) {
        this.a = context;
        this.b = appBarLayout;
        ((AppBarBehavior) ((ahm) appBarLayout.getLayoutParams()).a).a = this;
        this.u = context.getResources().getDimensionPixelSize(R.dimen.as_collapsed_avatar_touch_view_size);
    }

    public static final void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i2) {
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    public final boolean a() {
        dbo dbo = this.m;
        return dbo != null && (dbo == dbo.COMPACT || this.m == dbo.EXPANDABLE_MINIMIZED);
    }

    public final boolean b() {
        dbo dbo = this.m;
        return dbo != null && dbo.e;
    }

    public final void c() {
        if (qud.h()) {
            this.d.b(2);
        }
        this.d.a(que.b(this.a, R.attr.asProductNameColor, R.color.google_grey700));
    }

    public final void d() {
        if (this.m != null) {
            this.k.b((Drawable) null);
            this.k.a((View.OnClickListener) null);
        }
    }

    public final void a(int i2) {
        ActionMenuView actionMenuView = (ActionMenuView) this.k.findViewById(R.id.custom_menu);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionMenuView.getLayoutParams();
        if (cyd.a(this.a)) {
            layoutParams.setMargins(i2, 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, i2, 0);
        }
        layoutParams.gravity = 0;
        actionMenuView.setLayoutParams(layoutParams);
    }

    public final void a(View.OnClickListener onClickListener, int i2, int i3) {
        if (this.m != null) {
            this.k.d(i2);
            this.k.c(i3);
            this.k.a(onClickListener);
        }
    }

    public final void a(View view) {
        if (this.b.findViewWithTag("toolbar_tag") != null) {
            AppBarLayout appBarLayout = this.b;
            appBarLayout.removeView(appBarLayout.findViewWithTag("toolbar_tag"));
        }
        view.setTag("toolbar_tag");
        this.b.addView(view, 0);
    }

    public final void a(String str) {
        int i2;
        Toolbar toolbar;
        ProductLockupView productLockupView = this.d;
        if (this.v == 1) {
            jix.g(this.a);
            i2 = 0;
        } else {
            i2 = 8;
        }
        productLockupView.setVisibility(i2);
        if (this.v == 2 && this.m == dbo.COMPACT) {
            this.i.setVisibility(0);
            this.i.setAlpha(1.0f);
            this.i.setText(str);
        }
        if (this.v == 3 && (toolbar = this.k) != null) {
            toolbar.a((CharSequence) str);
        }
    }
}
