package defpackage;

import android.view.MenuItem;

/* renamed from: xb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xb implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ xc a;
    private final MenuItem.OnMenuItemClickListener b;

    public xb(xc xcVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = xcVar;
        this.b = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
