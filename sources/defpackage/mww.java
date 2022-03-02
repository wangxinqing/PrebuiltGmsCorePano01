package defpackage;

import android.view.View;

/* renamed from: mww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mww implements View.OnClickListener {
    private final mxc a;

    public mww(mxc mxc) {
        this.a = mxc;
    }

    public void onClick(View view) {
        mxc mxc = this.a;
        if (mxc.getActivity() instanceof mwa) {
            ((mwa) mxc.getActivity()).f();
        }
    }
}
