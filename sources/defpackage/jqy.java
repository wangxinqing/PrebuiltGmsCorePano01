package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqy implements View.OnClickListener {
    private final jra a;
    private final amri b;

    public jqy(jra jra, amri amri) {
        this.a = jra;
        this.b = amri;
    }

    public void onClick(View view) {
        jra jra = this.a;
        amri amri = this.b;
        if (amri.a() && ((Intent) amri.b()).resolveActivity(jra.a.getContext().getPackageManager()) != null) {
            jra.b.a(jth.RECENT_INTERACTION_LINK, jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            jra.a.getContext().startActivity((Intent) amri.b());
        }
    }
}
