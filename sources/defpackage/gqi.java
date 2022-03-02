package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity;

/* renamed from: gqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqi implements DialogInterface.OnClickListener {
    final /* synthetic */ ConfirmAccountDeletionChimeraActivity a;

    public gqi(ConfirmAccountDeletionChimeraActivity confirmAccountDeletionChimeraActivity) {
        this.a = confirmAccountDeletionChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.a.a(0, (Intent) null);
    }
}
