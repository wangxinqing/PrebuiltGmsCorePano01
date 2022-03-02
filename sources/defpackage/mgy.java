package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;

/* renamed from: mgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mgy implements DialogInterface.OnClickListener {
    private final SendInvitationsChimeraActivity a;

    public mgy(SendInvitationsChimeraActivity sendInvitationsChimeraActivity) {
        this.a = sendInvitationsChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.a;
        sendInvitationsChimeraActivity.h.a(4, 9, "sendinv");
        ith ith = mfv.a;
        sendInvitationsChimeraActivity.setResult(4, new Intent().putExtra("accountName", sendInvitationsChimeraActivity.b).putExtra("errorCode", -8));
        sendInvitationsChimeraActivity.finish();
    }
}
