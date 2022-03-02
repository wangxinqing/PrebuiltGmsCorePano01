package defpackage;

import android.view.View;

/* renamed from: jrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrg implements View.OnClickListener {
    private final jrk a;

    public jrg(jrk jrk) {
        this.a = jrk;
    }

    public void onClick(View view) {
        jrk jrk = this.a;
        jrk.f = jrk.c.getChildCount();
        jrk.a();
    }
}
