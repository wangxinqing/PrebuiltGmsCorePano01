package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqh implements View.OnClickListener {
    private final jqm a;
    private final amri b;

    public jqh(jqm jqm, amri amri) {
        this.a = jqm;
        this.b = amri;
    }

    public void onClick(View view) {
        jqm jqm = this.a;
        amri amri = this.b;
        if (((Intent) amri.b()).resolveActivity(jqm.e.getContext().getPackageManager()) != null) {
            jqm.c.a(jth.GENERIC_CARD_ENTRY, jth.GENERIC_CARD);
            jqm.e.getContext().startActivity((Intent) amri.b());
        }
    }
}
