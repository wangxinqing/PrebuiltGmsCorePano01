package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrn implements View.OnClickListener {
    private final jrq a;
    private final Intent b;

    public jrn(jrq jrq, Intent intent) {
        this.a = jrq;
        this.b = intent;
    }

    public void onClick(View view) {
        jrq jrq = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jrq.a.getContext().getPackageManager()) != null) {
            jrq.c.a(jth.SMART_PROFILE_CURRENT_LOCATION_CARD_NAVIGATION_LINK, jth.SMART_PROFILE_CURRENT_LOCATION_CARD);
            jrq.a.getContext().startActivity(intent);
        }
    }
}
