package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.chimera.DialogFragment;

/* renamed from: adgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgz extends DialogFragment {
    public DialogInterface.OnCancelListener a = null;

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("ProgressDialogMessage");
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        if (!TextUtils.isEmpty(string)) {
            progressDialog.setMessage(string);
        }
        progressDialog.setIndeterminate(true);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }
}
