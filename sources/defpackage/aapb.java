package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: aapb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aapb extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        aapa aapa;
        aaoz aaoz;
        Activity activity = getActivity();
        amrl.a((Object) activity);
        if (activity instanceof aapa) {
            aapa = (aapa) activity;
        } else {
            aapa = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(activity).setTitle(R.string.mdm_account_title).setMessage(R.string.mdm_account_description);
        if (aapa != null) {
            aaoz = new aaoz(aapa);
        } else {
            aaoz = null;
        }
        return message.setPositiveButton(R.string.common_add, aaoz).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
    }
}
