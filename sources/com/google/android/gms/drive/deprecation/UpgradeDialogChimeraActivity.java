package com.google.android.gms.drive.deprecation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpgradeDialogChimeraActivity extends bjs implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
        } else if (!extras.getBoolean("showDialog")) {
            finish();
        }
    }

    public final Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        String string = bundle.getString("callingPackage");
        String string2 = bundle.getString("dialogTitle");
        String string3 = bundle.getString("dialogMessage");
        return new AlertDialog.Builder(this).setTitle(string2).setMessage(string3).setPositiveButton(getString(R.string.drive_deprecation_update_1p_dialog_positive_button_text), new krh(this, string)).setNegativeButton(getString(R.string.common_dismiss), new kri(this)).create();
    }

    public final void onPause() {
        removeDialog(1);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        showDialog(1, getIntent().getExtras());
    }
}
