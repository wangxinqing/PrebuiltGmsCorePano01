package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: xiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xiy implements DialogInterface.OnClickListener {
    private final xjb a;

    public xiy(xjb xjb) {
        this.a = xjb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xjb xjb = this.a;
        xjb.dismiss();
        xjb.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aywy.a.a().bI())));
        xjb.getActivity().setResult(-1);
        xjb.getActivity().finish();
    }
}
