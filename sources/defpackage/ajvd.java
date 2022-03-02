package defpackage;

import android.view.View;

/* renamed from: ajvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvd implements View.OnClickListener {
    final /* synthetic */ ajvt a;
    final /* synthetic */ ajvf b;

    public ajvd(ajvf ajvf, ajvt ajvt) {
        this.b = ajvf;
        this.a = ajvt;
    }

    public void onClick(View view) {
        int m = this.b.j().m() + 1;
        if (m < this.b.f.getAdapter().a()) {
            this.b.a(this.a.f(m));
        }
    }
}
