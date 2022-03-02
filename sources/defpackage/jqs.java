package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqs implements View.OnClickListener {
    private final jqw a;
    private final Intent b;

    public jqs(jqw jqw, Intent intent) {
        this.a = jqw;
        this.b = intent;
    }

    public void onClick(View view) {
        jqw jqw = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jqw.a.getContext().getPackageManager()) != null) {
            jqw.c.a(jth.SEE_ALL_LINK, jth.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            jqw.a.getContext().startActivity(intent);
        }
    }
}
