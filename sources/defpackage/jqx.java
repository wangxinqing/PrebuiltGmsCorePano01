package defpackage;

import android.view.View;

/* renamed from: jqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqx implements View.OnClickListener {
    private final jra a;

    public jqx(jra jra) {
        this.a = jra;
    }

    public void onClick(View view) {
        jra jra = this.a;
        if (!jra.e) {
            jra.b.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            jra.e = true;
            jra.d.b();
            jra.c.a();
            return;
        }
        jra.b.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
        jra.a();
    }
}
