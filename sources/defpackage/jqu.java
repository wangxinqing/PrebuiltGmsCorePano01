package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqu implements View.OnClickListener {
    private final jqv a;
    private final Intent b;

    public jqu(jqv jqv, Intent intent) {
        this.a = jqv;
        this.b = intent;
    }

    public void onClick(View view) {
        jqv jqv = this.a;
        Intent intent = this.b;
        if (intent != null && intent.resolveActivity(jqv.e.a.getContext().getPackageManager()) != null) {
            jqv.e.c.a(jth.GOOGLE_PLUS_POST_LINK, jth.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            jqv.e.a.getContext().startActivity(intent);
        }
    }
}
