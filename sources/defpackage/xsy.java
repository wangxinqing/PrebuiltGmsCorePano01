package defpackage;

import android.view.View;
import com.google.android.gms.common.Feature;

/* renamed from: xsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsy implements View.OnClickListener {
    private final xtl a;

    public xsy(xtl xtl) {
        this.a = xtl;
    }

    public void onClick(View view) {
        xtl xtl = this.a;
        if (xtl.c.isChecked()) {
            if (ayqr.c()) {
                new xsx(xtl.getActivity()).a(xtl.a.name, false, 8);
            }
            xtq xtq = xtl.b.f;
            qci qci = new qci();
            wsu wsu = xtq.a;
            iha b = ihb.b();
            b.a = new wtd();
            b.b = new Feature[]{wku.b};
            acwa b2 = ((iby) wsu).b(b.a());
            qci.getClass();
            b2.a((acvp) new xtn(qci));
            qci.a(xtl, new xti(xtl));
            return;
        }
        xtl.a(2);
    }
}
