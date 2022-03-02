package defpackage;

import android.text.TextUtils;
import android.view.View;

/* renamed from: qmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmj implements View.OnClickListener {
    final /* synthetic */ qmp a;

    public qmj(qmp qmp) {
        this.a = qmp;
    }

    public void onClick(View view) {
        this.a.i = true;
        qmp qmp = this.a;
        if (!qmp.d.l()) {
            qmp.f.a("OptInFragment.optIn");
            iby iby = qmp.c;
            String str = qmp.a;
            icc icc = iby.j;
            iva.b(!TextUtils.isEmpty(str));
            qgh qgh = new qgh(icc, str);
            icc.a((idf) qgh);
            acwa a2 = iux.a(qgh);
            a2.a((acvv) new qmo(qmp));
            a2.a((acvs) new qmn(qmp));
        }
    }
}
