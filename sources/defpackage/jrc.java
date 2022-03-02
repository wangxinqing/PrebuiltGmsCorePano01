package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrc implements View.OnClickListener {
    private final jrd a;
    private final String b;

    public jrc(jrd jrd, String str) {
        this.a = jrd;
        this.b = str;
    }

    public void onClick(View view) {
        jrd jrd = this.a;
        Intent a2 = abgn.a(jrd.c.d.getIntent(), this.b, jrd.c.e);
        jrd.c.b.a(jth.SMART_PROFILE_PEOPLE_IN_COMMON_CARD_PERSON_BUTTON, jth.SMART_PROFILE_PEOPLE_IN_COMMON_CARD);
        jrd.c.d.startActivityForResult(a2, 0);
    }
}
