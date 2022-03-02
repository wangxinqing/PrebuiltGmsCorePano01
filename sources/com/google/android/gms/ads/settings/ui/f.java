package com.google.android.gms.ads.settings.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class f extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        e eVar;
        d dVar;
        if (getActivity() instanceof e) {
            eVar = (e) getActivity();
        } else {
            eVar = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setTitle(R.string.debug_logging_enable_dialog_title).setMessage(Html.fromHtml(getString(R.string.debug_logging_enable_dialog_msg)));
        if (eVar != null) {
            dVar = new d(eVar);
        } else {
            dVar = null;
        }
        return message.setPositiveButton(17039370, dVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
