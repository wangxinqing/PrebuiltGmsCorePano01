package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: acdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdb implements DialogInterface.OnClickListener {
    final /* synthetic */ TargetChimeraActivity a;

    public acdb(TargetChimeraActivity targetChimeraActivity) {
        this.a = targetChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TargetChimeraActivity targetChimeraActivity = this.a;
        targetChimeraActivity.i = false;
        if (i == -1) {
            TargetChimeraActivity.a.b("Try again requested", new Object[0]);
            this.a.e();
            return;
        }
        targetChimeraActivity.f();
    }
}
