package defpackage;

import android.view.View;

/* renamed from: akza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akza implements View.OnClickListener {
    final /* synthetic */ akzj a;

    public akza(akzj akzj) {
        this.a = akzj;
    }

    public void onClick(View view) {
        akzj akzj = this.a;
        if (!akzj.u) {
            akzh akzh = akzj.t;
            if (akzh != null) {
                ((albv) akzh).i = null;
            }
            akzj.c(false);
        }
    }
}
