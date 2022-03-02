package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abiu implements View.OnClickListener {
    private final abiv a;
    private final Intent b;
    private final jth c;

    public abiu(abiv abiv, Intent intent, jth jth) {
        this.a = abiv;
        this.b = intent;
        this.c = jth;
    }

    public void onClick(View view) {
        abiv abiv = this.a;
        Intent intent = this.b;
        jth jth = this.c;
        if (intent.resolveActivity(abiv.a.getPackageManager()) != null) {
            abiv.c.a(jth, jth.SMART_PROFILE_CONTACT_DETAILS_CARD);
            abiv.a.startActivity(intent);
        }
    }
}
