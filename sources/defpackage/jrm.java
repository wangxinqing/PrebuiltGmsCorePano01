package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrm implements View.OnClickListener {
    private final jrq a;
    private final amri b;

    public jrm(jrq jrq, amri amri) {
        this.a = jrq;
        this.b = amri;
    }

    public void onClick(View view) {
        jrq jrq = this.a;
        amri amri = this.b;
        if (amri.a() && ((Intent) amri.b()).resolveActivity(jrq.a.getContext().getPackageManager()) != null) {
            jrq.a.getContext().startActivity((Intent) amri.b());
        }
    }
}
