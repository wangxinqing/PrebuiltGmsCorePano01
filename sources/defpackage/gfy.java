package defpackage;

import android.view.View;

/* renamed from: gfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gfy implements View.OnClickListener {
    final /* synthetic */ ggc a;

    public gfy(ggc ggc) {
        this.a = ggc;
    }

    public void onClick(View view) {
        View view2 = this.a.g;
        if (view2 == null) {
            return;
        }
        if (view2.isEnabled()) {
            this.a.c();
        } else {
            this.a.f();
        }
    }
}
