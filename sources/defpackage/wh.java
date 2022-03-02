package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: wh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class wh {
    final Context a;
    public ou b;
    public ou c;

    public wh(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof mi)) {
            return menuItem;
        }
        mi miVar = (mi) menuItem;
        if (this.b == null) {
            this.b = new ou();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        xc xcVar = new xc(this.a, miVar);
        this.b.put(miVar, xcVar);
        return xcVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof mj)) {
            return subMenu;
        }
        mj mjVar = (mj) subMenu;
        if (this.c == null) {
            this.c = new ou();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(mjVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        xq xqVar = new xq(this.a, mjVar);
        this.c.put(mjVar, xqVar);
        return xqVar;
    }
}
