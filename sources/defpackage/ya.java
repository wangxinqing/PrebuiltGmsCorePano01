package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: ya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ya extends xf {
    final /* synthetic */ yh d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ya(yh yhVar, Context context, xp xpVar, View view) {
        super(context, xpVar, view, false);
        this.d = yhVar;
        if (!xpVar.l.f()) {
            View view2 = yhVar.h;
            this.a = view2 == null ? (View) yhVar.f : view2;
        }
        a((xg) yhVar.o);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        yh yhVar = this.d;
        yhVar.m = null;
        yhVar.p = 0;
        super.d();
    }
}
