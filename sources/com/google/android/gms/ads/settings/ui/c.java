package com.google.android.gms.ads.settings.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        b bVar;
        a aVar;
        if (getActivity() instanceof b) {
            bVar = (b) getActivity();
        } else {
            bVar = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setTitle(R.string.ads_prefs_reset_adid_dialog_title).setMessage(R.string.ads_prefs_reset_adid_dialog_msg);
        if (bVar != null) {
            aVar = new a(bVar);
        } else {
            aVar = null;
        }
        return message.setPositiveButton(17039370, aVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
