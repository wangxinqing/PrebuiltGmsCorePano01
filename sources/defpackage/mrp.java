package defpackage;

import android.view.View;

/* renamed from: mrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mrp implements View.OnClickListener {
    private final mrm a;

    public mrp(mrm mrm) {
        this.a = mrm;
    }

    public void onClick(View view) {
        mrm mrm = this.a;
        msl msl = new msl();
        mrm.getFragmentManager().beginTransaction().addToBackStack("devices_list").replace(16908290, msl, "fast_pair_account_settings").commit();
        arwt arwt = mrm.a;
        if (arwt != null) {
            arwt.a(msl);
        }
    }
}
