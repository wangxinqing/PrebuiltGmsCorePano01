package defpackage;

import android.view.View;

/* renamed from: aaqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqj implements View.OnClickListener {
    final /* synthetic */ aaqm a;

    public aaqj(aaqm aaqm) {
        this.a = aaqm;
    }

    public void onClick(View view) {
        aaqm aaqm = this.a;
        aaqm.q = !aaqm.q;
        aaqm.h();
    }
}
