package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abji implements View.OnClickListener {
    private final abjm a;
    private final Intent b;

    public abji(abjm abjm, Intent intent) {
        this.a = abjm;
        this.b = intent;
    }

    public void onClick(View view) {
        abjm abjm = this.a;
        Intent intent = this.b;
        if (intent != null && intent.resolveActivity(abjm.a.getPackageManager()) != null) {
            abjm.b.a(jth.RECENT_INTERACTION_LINK, jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            abjm.a.startActivity(intent);
        }
    }
}
