package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: xq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xq extends xk implements SubMenu {
    private final mj d;

    public xq(Context context, mj mjVar) {
        super(context, mjVar);
        this.d = mjVar;
    }

    public final void clearHeader() {
        this.d.clearHeader();
    }

    public final MenuItem getItem() {
        return a(this.d.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.d.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.d.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.d.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.d.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.d.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }
}
