package defpackage;

import android.view.View;

/* renamed from: qnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qnb implements View.OnClickListener {
    final /* synthetic */ qnd a;

    public qnb(qnd qnd) {
        this.a = qnd;
    }

    public void onClick(View view) {
        this.a.f.a("SetupFailureFragment.Retry");
        this.a.f.n();
    }
}
