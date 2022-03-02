package defpackage;

import android.view.View;

/* renamed from: loy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class loy implements View.OnClickListener {
    private final jzr a;
    private final lph b;

    public loy(lph lph, jzr jzr) {
        this.b = lph;
        this.a = jzr;
    }

    public void onClick(View view) {
        lph lph = this.b;
        jzr jzr = this.a;
        if (!((jzs) jzr).a.b()) {
            if (jzr.e()) {
                lph.a.k = null;
                lph.a.h.a(jzr);
            }
            lph.a.i.b(jzr);
        }
    }
}
