package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: zkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zkn extends DialogFragment implements DialogInterface.OnClickListener {
    private String a;
    private String b;
    private zkm c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof zkm) {
            this.c = (zkm) activity;
            return;
        }
        throw new IllegalStateException("AcceptActionChimeraDialogFragment has to be hosted by an Activity that implements AcceptActionListener.");
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zkm zkm = this.c;
        if (zkm != null) {
            zkm.b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getString("title");
        this.b = arguments.getString("message");
        setCancelable(false);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019132)).setTitle(this.a).setMessage(this.b).setPositiveButton(17039370, this).create();
    }
}
