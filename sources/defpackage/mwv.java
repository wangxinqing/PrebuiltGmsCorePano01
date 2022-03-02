package defpackage;

import android.view.View;

/* renamed from: mwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mwv implements View.OnClickListener {
    private final mxc a;

    public mwv(mxc mxc) {
        this.a = mxc;
    }

    public void onClick(View view) {
        mxc mxc = this.a;
        if (mxc.getActivity() instanceof mwa) {
            ((mwa) mxc.getActivity()).h();
        }
    }
}
