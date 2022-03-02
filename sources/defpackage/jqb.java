package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqb implements View.OnClickListener {
    private final jqf a;
    private final Intent b;

    public jqb(jqf jqf, Intent intent) {
        this.a = jqf;
        this.b = intent;
    }

    public void onClick(View view) {
        jqf jqf = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jqf.f.getPackageManager()) != null) {
            jqf.a.a(jth.SMART_PROFILE_CONTACT_DETAILS_CARD_EMAIL_LINK, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
            jqf.f.startActivity(intent);
        }
    }
}
