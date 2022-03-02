package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abim implements View.OnClickListener {
    private final abiq a;
    private final Intent b;

    public abim(abiq abiq, Intent intent) {
        this.a = abiq;
        this.b = intent;
    }

    public void onClick(View view) {
        abiq abiq = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(abiq.a.getPackageManager()) != null) {
            abiq.b.a(jth.SMART_PROFILE_LINKS_CARD_LINK, jth.SMART_PROFILE_ABOUT_CARD);
            abiq.a.startActivity(intent);
        }
    }
}
