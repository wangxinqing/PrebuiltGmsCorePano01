package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: wy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wy extends wx implements ActionProvider.VisibilityListener {
    private wv d;

    public wy(xc xcVar, ActionProvider actionProvider) {
        super(xcVar, actionProvider);
    }

    public final View a(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    public final boolean b() {
        return this.b.overridesItemVisibility();
    }

    public final boolean c() {
        return this.b.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        wv wvVar = this.d;
        if (wvVar != null) {
            wvVar.a.i.l();
        }
    }

    public final void a(wv wvVar) {
        this.d = wvVar;
        this.b.setVisibilityListener(this);
    }
}
