package defpackage;

import android.view.View;

/* renamed from: msm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msm implements View.OnClickListener {
    private final mta a;

    public msm(mta mta) {
        this.a = mta;
    }

    public void onClick(View view) {
        this.a.getActivity().onBackPressed();
    }
}
