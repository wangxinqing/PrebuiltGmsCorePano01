package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqq implements View.OnClickListener {
    private final jqr a;
    private final Intent b;

    public jqq(jqr jqr, Intent intent) {
        this.a = jqr;
        this.b = intent;
    }

    public void onClick(View view) {
        jqr jqr = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jqr.b.getContext().getPackageManager()) != null) {
            jqr.a.a(jth.SEE_ALL_LINK, jth.SMART_PROFILE_PHOTOS_CARD);
            jqr.b.getContext().startActivity(intent);
        }
    }
}
