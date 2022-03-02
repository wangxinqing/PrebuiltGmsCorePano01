package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: xiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xiw extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(getActivity(), 2132018396));
        progressDialog.setMessage(getString(R.string.people_avatar_progress_message));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnKeyListener(new xiv());
        return progressDialog;
    }
}
