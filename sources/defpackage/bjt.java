package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;

/* renamed from: bjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bjt extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new tp(getContext(), getTheme());
    }

    public final void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof tp) {
            tp tpVar = (tp) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            tpVar.c();
            return;
        }
        super.setupDialog(dialog, i);
    }
}
