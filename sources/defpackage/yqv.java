package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.plus.audience.UpdateActionOnlyChimeraActivity;

/* renamed from: yqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqv extends znd {
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        UpdateActionOnlyChimeraActivity updateActionOnlyChimeraActivity = (UpdateActionOnlyChimeraActivity) getActivity();
        Bundle arguments = getArguments();
        if (updateActionOnlyChimeraActivity != null) {
            updateActionOnlyChimeraActivity.a(arguments.getInt("resultCode"), (Intent) null);
        }
    }
}
