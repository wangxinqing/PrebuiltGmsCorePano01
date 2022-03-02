package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity;

/* renamed from: gqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqj implements DialogInterface.OnClickListener {
    final /* synthetic */ ConfirmAccountDeletionChimeraActivity a;

    public gqj(ConfirmAccountDeletionChimeraActivity confirmAccountDeletionChimeraActivity) {
        this.a = confirmAccountDeletionChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            this.a.startActivityForResult(new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL"), 0);
        } catch (ActivityNotFoundException e) {
            ConfirmAccountDeletionChimeraActivity.a.e("Cannot find the Activity for the challenge.", new Object[0]);
            this.a.a(0, (Intent) null);
        }
    }
}
