package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqc implements View.OnClickListener {
    private final jqf a;
    private final Intent b;

    public jqc(jqf jqf, Intent intent) {
        this.a = jqf;
        this.b = intent;
    }

    public void onClick(View view) {
        jqf jqf = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jqf.f.getPackageManager()) != null) {
            jqf.a.a(jth.CONTACT_DETAILS_CARD_CALL_PHONE_LINK, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
            jqf.f.startActivity(intent);
        }
    }
}
