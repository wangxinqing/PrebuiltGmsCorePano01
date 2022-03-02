package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: znf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class znf extends DialogFragment {
    public static znf a(CharSequence charSequence) {
        znf znf = new znf();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("message", charSequence);
        bundle.putBoolean("cancelable", false);
        znf.setArguments(bundle);
        return znf;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        Activity activity = getActivity();
        if (activity instanceof zne) {
            ((zne) activity).c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(getArguments().getBoolean("cancelable"));
    }

    public Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(getActivity(), 2132019132));
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getArguments().getCharSequence("message"));
        progressDialog.setCancelable(getArguments().getBoolean("cancelable"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    /* access modifiers changed from: protected */
    public final Dialog a(Bundle bundle) {
        return super.onCreateDialog(bundle);
    }
}
