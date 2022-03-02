package defpackage;

import android.content.DialogInterface;

/* renamed from: lpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lpv implements DialogInterface.OnClickListener {
    private final lpx a;

    public lpv(lpx lpx) {
        this.a = lpx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        lpx lpx = this.a;
        ((lpw) lpx.getActivity()).a(lpx.a, lpx.b[i]);
        dialogInterface.dismiss();
    }
}
