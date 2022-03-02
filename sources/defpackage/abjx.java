package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: abjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjx implements View.OnClickListener {
    private final abjy a;
    private final Intent b;
    private final Context c;

    public abjx(abjy abjy, Intent intent, Context context) {
        this.a = abjy;
        this.b = intent;
        this.c = context;
    }

    public void onClick(View view) {
        abjy abjy = this.a;
        Intent intent = this.b;
        Context context = this.c;
        if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
            abjy.a.a(jth.SMART_PROFILE_CURRENT_LOCATION_CARD_MAP_LINK, jth.SMART_PROFILE_CURRENT_LOCATION_CARD);
            context.startActivity(intent);
        }
    }
}
