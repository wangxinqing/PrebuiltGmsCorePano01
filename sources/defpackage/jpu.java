package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jpu implements View.OnClickListener {
    private final jpz a;
    private final Intent b;

    public jpu(jpz jpz, Intent intent) {
        this.a = jpz;
        this.b = intent;
    }

    public void onClick(View view) {
        jpz jpz = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jpz.c.getContext().getPackageManager()) != null) {
            jpz.b.a(jth.SMART_PROFILE_LINKS_CARD_LINK, jth.SMART_PROFILE_ABOUT_CARD);
            jpz.c.getContext().startActivity(intent);
        }
    }
}
