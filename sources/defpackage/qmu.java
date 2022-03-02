package defpackage;

import android.view.View;

/* renamed from: qmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmu implements View.OnClickListener {
    final /* synthetic */ qmv a;

    public qmu(qmv qmv) {
        this.a = qmv;
    }

    public void onClick(View view) {
        this.a.startActivity(qfb.a);
        this.a.f.a("RestoreSupervisorSuccessFragment.Settings");
        this.a.f.m();
    }
}
