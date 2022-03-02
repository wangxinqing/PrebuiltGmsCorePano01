package defpackage;

import android.view.View;

/* renamed from: mqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mqh implements View.OnClickListener {
    final /* synthetic */ mql a;

    public mqh(mql mql) {
        this.a = mql;
    }

    public void onClick(View view) {
        mql mql = this.a;
        acwd acwd = new acwd();
        new mqj(mql, acwd).start();
        acwd.a.a((acvz) new mqg(this));
        this.a.c.n();
    }
}
