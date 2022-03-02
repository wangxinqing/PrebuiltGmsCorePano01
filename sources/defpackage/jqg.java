package defpackage;

import android.view.View;

/* renamed from: jqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqg implements View.OnClickListener {
    private final jqm a;

    public jqg(jqm jqm) {
        this.a = jqm;
    }

    public void onClick(View view) {
        jqm jqm = this.a;
        if (!jqm.a) {
            jqm.c.a(jth.SEE_MORE_BUTTON, jth.GENERIC_CARD);
            jqm.a = true;
            jqm.b.b();
            jqm.d.a();
            return;
        }
        jqm.c.a(jth.SEE_LESS_BUTTON, jth.GENERIC_CARD);
        jqm.a();
    }
}
