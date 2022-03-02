package defpackage;

import android.view.View;

/* renamed from: xsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsr implements View.OnClickListener {
    private final xst a;

    public xsr(xst xst) {
        this.a = xst;
    }

    public void onClick(View view) {
        xst xst = this.a;
        xuj xuj = new xuj();
        xuj.setTargetFragment(xst, 0);
        xuj.show(xst.getFragmentManager(), "globalSync");
    }
}
