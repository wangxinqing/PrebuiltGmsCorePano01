package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: td  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class td extends qi {
    final /* synthetic */ te a;

    public td(te teVar) {
        this.a = teVar;
    }

    public final void b() {
        this.a.a.l.setVisibility(8);
        tn tnVar = this.a.a;
        PopupWindow popupWindow = tnVar.m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (tnVar.l.getParent() instanceof View) {
            qb.r((View) this.a.a.l.getParent());
        }
        this.a.a.l.removeAllViews();
        this.a.a.o.a((qh) null);
        tn tnVar2 = this.a.a;
        tnVar2.o = null;
        qb.r(tnVar2.q);
    }
}
