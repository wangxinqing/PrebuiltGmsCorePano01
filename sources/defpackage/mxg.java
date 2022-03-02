package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: mxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxg extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog;
        int i;
        Activity activity = getActivity();
        if (ofy.b()) {
            if (!ofy.b(activity, R.attr.gf_isInDarkMode)) {
                i = R.style.gf_LightProgressDialogStyle;
            } else {
                i = R.style.gf_DarkProgressDialogStyle;
            }
            progressDialog = new ProgressDialog(activity, i);
        } else {
            progressDialog = new ProgressDialog(activity);
        }
        progressDialog.setMessage(getString(R.string.common_sending));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }
}
