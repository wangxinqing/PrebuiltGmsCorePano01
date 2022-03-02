package defpackage;

import android.view.View;

/* renamed from: jqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqa implements View.OnClickListener {
    private final jqf a;

    public jqa(jqf jqf) {
        this.a = jqf;
    }

    public void onClick(View view) {
        jqf jqf = this.a;
        if (!jqf.g) {
            jqf.a.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
            jqf.g = true;
            jqf.e.b();
            jqf.b.a();
            jqf.c.a();
            jqf.d.a();
            return;
        }
        jqf.a.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
        jqf.a();
    }
}
