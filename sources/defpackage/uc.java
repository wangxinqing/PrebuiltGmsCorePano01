package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* renamed from: uc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uc extends qi {
    final /* synthetic */ ug a;

    public uc(ug ugVar) {
        this.a = ugVar;
    }

    public final void b() {
        View view;
        ug ugVar = this.a;
        if (ugVar.k && (view = ugVar.f) != null) {
            view.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        ug ugVar2 = this.a;
        ugVar2.n = null;
        vq vqVar = ugVar2.i;
        if (vqVar != null) {
            vqVar.a(ugVar2.h);
            ugVar2.h = null;
            ugVar2.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            qb.r(actionBarOverlayLayout);
        }
    }
}
