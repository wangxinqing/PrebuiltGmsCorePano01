package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jro implements View.OnClickListener {
    private final jrq a;
    private final amri b;

    public jro(jrq jrq, amri amri) {
        this.a = jrq;
        this.b = amri;
    }

    public void onClick(View view) {
        jrq jrq = this.a;
        amri amri = this.b;
        if (amri.a() && ((Intent) amri.b()).resolveActivity(jrq.a.getContext().getPackageManager()) != null) {
            jrq.c.a(jth.SMART_PROFILE_CURRENT_LOCATION_CARD_MAP_LINK, jth.SMART_PROFILE_CURRENT_LOCATION_CARD);
            jrq.a.getContext().startActivity((Intent) amri.b());
        }
    }
}
