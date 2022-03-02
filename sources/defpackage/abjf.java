package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: abjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjf implements View.OnClickListener {
    private final abjh a;
    private final Intent b;
    private final Context c;

    public abjf(abjh abjh, Intent intent, Context context) {
        this.a = abjh;
        this.b = intent;
        this.c = context;
    }

    public void onClick(View view) {
        abjh abjh = this.a;
        Intent intent = this.b;
        Context context = this.c;
        if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
            abjh.a.a(jth.GOOGLE_PLUS_POST_LINK, jth.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            context.startActivity(intent);
        }
    }
}
