package defpackage;

import android.view.MenuItem;
import com.google.android.gms.drive.ui.select.path.SearchPathElement;

/* renamed from: lpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lpo implements MenuItem.OnActionExpandListener {
    final /* synthetic */ lpq a;

    public lpo(lpq lpq) {
        this.a = lpq;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (!(this.a.h.b() instanceof SearchPathElement)) {
            return true;
        }
        lpq lpq = this.a;
        lpq.h.a(lpq.g);
        return true;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
