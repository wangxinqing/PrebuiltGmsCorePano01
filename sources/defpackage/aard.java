package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: aard  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aard extends DialogFragment {
    public aapx a = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        aarc aarc;
        Activity activity = getActivity();
        if (activity instanceof aarc) {
            aarc = (aarc) activity;
        } else {
            aarc = null;
        }
        return new AlertDialog.Builder(activity).setMessage(R.string.verify_apps_disable_confirmation_dialog).setPositiveButton(R.string.common_ok, new aarb(this, aarc)).setNegativeButton(R.string.common_cancel, new aara(this)).create();
    }
}
