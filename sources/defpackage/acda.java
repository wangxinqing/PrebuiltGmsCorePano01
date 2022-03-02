package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: acda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acda implements DialogInterface.OnClickListener {
    final /* synthetic */ TargetChimeraActivity a;

    public acda(TargetChimeraActivity targetChimeraActivity) {
        this.a = targetChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            TargetChimeraActivity.a.b("User quit setup", new Object[0]);
            this.a.e();
        }
    }
}
