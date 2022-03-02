package com.google.android.gms.ads.settings.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class i extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        h hVar;
        g gVar;
        if (getActivity() instanceof h) {
            hVar = (h) getActivity();
        } else {
            hVar = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setTitle(R.string.ads_prefs_toggle_interest_based_ads_dialog_title).setMessage(Html.fromHtml(getString(R.string.ads_prefs_toggle_interest_based_ads_dialog_msg)));
        if (hVar != null) {
            gVar = new g(hVar);
        } else {
            gVar = null;
        }
        return message.setPositiveButton(17039370, gVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
