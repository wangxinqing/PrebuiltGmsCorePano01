package defpackage;

import android.view.View;

/* renamed from: exg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exg implements ax {
    private final exj a;

    public exg(exj exj) {
        this.a = exj;
    }

    public final void a(Object obj) {
        exj exj = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View view = exj.f;
        int i = !booleanValue ? 8 : 0;
        view.setVisibility(i);
        exj.h.setVisibility(i);
    }
}
