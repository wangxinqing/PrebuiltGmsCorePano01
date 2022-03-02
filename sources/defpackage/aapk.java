package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: aapk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aapk extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        aapj aapj;
        aapi aapi;
        Activity activity = getActivity();
        amrl.a((Object) activity);
        if (activity instanceof aapj) {
            aapj = (aapj) activity;
        } else {
            aapj = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(activity).setMessage(R.string.mdm_location_description);
        if (aapj != null) {
            aapi = new aapi(aapj);
        } else {
            aapi = null;
        }
        return message.setPositiveButton(R.string.common_turn_on, aapi).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
    }
}
