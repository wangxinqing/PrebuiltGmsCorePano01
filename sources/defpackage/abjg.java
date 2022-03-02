package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: abjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjg implements View.OnClickListener {
    private final abjh a;
    private final Intent b;
    private final Context c;

    public abjg(abjh abjh, Intent intent, Context context) {
        this.a = abjh;
        this.b = intent;
        this.c = context;
    }

    public void onClick(View view) {
        abjh abjh = this.a;
        Intent intent = this.b;
        Context context = this.c;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            abjh.a.a(jth.SEE_ALL_LINK, jth.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            context.startActivity(intent);
        }
    }
}
