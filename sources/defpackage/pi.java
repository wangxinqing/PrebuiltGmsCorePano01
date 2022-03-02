package defpackage;

import android.view.MenuItem;

/* renamed from: pi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pi implements MenuItem.OnActionExpandListener {
    final /* synthetic */ pj a;

    public pi(pj pjVar) {
        this.a = pjVar;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.a();
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.b();
    }
}
