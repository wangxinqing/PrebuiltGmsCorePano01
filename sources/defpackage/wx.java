package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* renamed from: wx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class wx extends pa {
    final ActionProvider b;
    final /* synthetic */ xc c;

    public wx(xc xcVar, ActionProvider actionProvider) {
        this.c = xcVar;
        this.b = actionProvider;
    }

    public final View a() {
        return this.b.onCreateActionView();
    }

    public final boolean d() {
        return this.b.onPerformDefaultAction();
    }

    public final boolean e() {
        return this.b.hasSubMenu();
    }

    public final void a(SubMenu subMenu) {
        this.b.onPrepareSubMenu(this.c.a(subMenu));
    }
}
