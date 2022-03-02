package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: dil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dil extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.common_asm_google_account_title).setMessage(R.string.accountsettings_not_available).setNeutralButton(17039370, dik.a).setCancelable(true).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
