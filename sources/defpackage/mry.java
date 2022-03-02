package defpackage;

import android.view.View;

/* renamed from: mry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mry implements View.OnClickListener {
    private final msl a;

    public mry(msl msl) {
        this.a = msl;
    }

    public void onClick(View view) {
        this.a.getActivity().onBackPressed();
    }
}
