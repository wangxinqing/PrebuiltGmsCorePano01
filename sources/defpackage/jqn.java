package defpackage;

import android.view.View;

/* renamed from: jqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqn implements View.OnClickListener {
    private final jqo a;

    public jqn(jqo jqo) {
        this.a = jqo;
    }

    public void onClick(View view) {
        jqo jqo = this.a;
        if (!jqo.a) {
            jqo.e.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_ORGANIZATIONS_CARD);
            jqo.a = true;
            jqo.d.b();
            jqo.b.a();
            jqo.c.a();
            return;
        }
        jqo.e.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_ORGANIZATIONS_CARD);
        jqo.a();
    }
}
