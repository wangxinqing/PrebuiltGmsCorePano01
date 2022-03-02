package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjo implements View.OnClickListener {
    private final abjp a;
    private final avjq b;

    public abjo(abjp abjp, avjq avjq) {
        this.a = abjp;
        this.b = avjq;
    }

    public void onClick(View view) {
        abjp abjp = this.a;
        Intent a2 = abgn.a(abjp.c.getIntent(), this.b.b, abjp.b);
        abjp.d.a(jth.SMART_PROFILE_PEOPLE_IN_COMMON_CARD_PERSON_BUTTON, jth.SMART_PROFILE_PEOPLE_IN_COMMON_CARD);
        abjp.c.startActivityForResult(a2, 0);
    }
}
