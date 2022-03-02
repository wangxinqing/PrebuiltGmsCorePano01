package defpackage;

import android.view.View;

/* renamed from: ajve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajve implements View.OnClickListener {
    final /* synthetic */ ajvt a;
    final /* synthetic */ ajvf b;

    public ajve(ajvf ajvf, ajvt ajvt) {
        this.b = ajvf;
        this.a = ajvt;
    }

    public void onClick(View view) {
        int n = this.b.j().n() - 1;
        if (n >= 0) {
            this.b.a(this.a.f(n));
        }
    }
}
