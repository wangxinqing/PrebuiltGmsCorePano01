package defpackage;

import android.view.MenuItem;

/* renamed from: wk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wk implements Runnable {
    final /* synthetic */ wm a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ wt c;
    final /* synthetic */ wl d;

    public wk(wl wlVar, wm wmVar, MenuItem menuItem, wt wtVar) {
        this.d = wlVar;
        this.a = wmVar;
        this.b = menuItem;
        this.c = wtVar;
    }

    public final void run() {
        wm wmVar = this.a;
        if (wmVar != null) {
            this.d.a.f = true;
            wmVar.b.a(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, 4);
        }
    }
}
