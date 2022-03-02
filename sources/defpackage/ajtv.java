package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: ajtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajtv extends bjt {
    private final void a() {
        Dialog dialog = getDialog();
        if (dialog instanceof ajtu) {
            ((ajtu) dialog).a();
        }
    }

    public final void dismiss() {
        a();
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        a();
        super.dismissAllowingStateLoss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new ajtu(getContext(), getTheme());
    }
}
