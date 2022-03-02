package defpackage;

import android.view.View;

/* renamed from: dyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dyw implements View.OnClickListener {
    final /* synthetic */ dyx a;

    public dyw(dyx dyx) {
        this.a = dyx;
    }

    public void onClick(View view) {
        dxx dxx = (dxx) this.a.f;
        dxx.a(true);
        dzw dzw = dxx.s;
        dzw.a.scrollToPosition(dxx.t.g());
    }
}
