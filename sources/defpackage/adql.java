package defpackage;

import android.view.View;

/* renamed from: adql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adql implements View.OnClickListener {
    final /* synthetic */ adqn a;

    public adql(adqn adqn) {
        this.a = adqn;
    }

    public void onClick(View view) {
        adqn.a.b("Network settings button pressed.", new Object[0]);
        adqm adqm = this.a.b;
        if (adqm != null) {
            adqm.d();
        }
    }
}
