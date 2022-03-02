package defpackage;

import android.view.MenuItem;

/* renamed from: xa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xa implements MenuItem.OnActionExpandListener {
    final /* synthetic */ xc a;
    private final MenuItem.OnActionExpandListener b;

    public xa(xc xcVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = xcVar;
        this.b = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
