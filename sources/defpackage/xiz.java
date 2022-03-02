package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

/* renamed from: xiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xiz implements DialogInterface.OnClickListener {
    private final xjb a;

    public xiz(xjb xjb) {
        this.a = xjb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xjb xjb = this.a;
        ((AvatarChimeraActivity) xjb.getActivity()).e();
        xjb.dismiss();
    }
}
