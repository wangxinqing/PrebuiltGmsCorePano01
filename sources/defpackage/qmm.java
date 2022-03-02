package defpackage;

import android.view.View;

/* renamed from: qmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmm implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ qmp b;

    public qmm(qmp qmp, boolean z) {
        this.b = qmp;
        this.a = z;
    }

    public void onClick(View view) {
        this.b.i = true;
        qmp qmp = this.b;
        iby iby = qmp.c;
        String str = qmp.a;
        icc icc = iby.j;
        iva.a((Object) icc);
        qge qge = new qge(icc, str);
        icc.a((idf) qge);
        acwa a2 = iux.a(qge);
        a2.a((acvv) new qml(this));
        a2.a((acvs) new qmk(this));
        if (this.a) {
            this.b.f.a("OptInFragment.noThanks");
        } else {
            this.b.f.a("OptInFragment.notNow");
        }
    }
}
