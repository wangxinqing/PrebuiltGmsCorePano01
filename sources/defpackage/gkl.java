package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: gkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkl extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return hxj.a.a(getActivity(), getArguments().getInt("error_dialog_code"), 1001);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ((SourceChimeraActivity) getActivity()).h = false;
    }
}
