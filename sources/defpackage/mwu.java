package defpackage;

import android.widget.CompoundButton;

/* renamed from: mwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mwu implements CompoundButton.OnCheckedChangeListener {
    private final mxc a;

    public mwu(mxc mxc) {
        this.a = mxc;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        mxc mxc = this.a;
        if (mxc.getActivity() instanceof mwa) {
            ((mwa) mxc.getActivity()).o();
        }
    }
}
