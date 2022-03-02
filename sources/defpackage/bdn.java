package defpackage;

import android.view.View;

/* renamed from: bdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bdn implements View.OnClickListener {
    final /* synthetic */ bdm a;
    final /* synthetic */ bdp b;

    public bdn(bdp bdp, bdm bdm) {
        this.b = bdp;
        this.a = bdm;
    }

    public void onClick(View view) {
        bdi bdi = this.a.t;
        if (this.b.e != null && bdi != null && bdi.d()) {
            this.b.e.a.a(bdi);
        }
    }
}
