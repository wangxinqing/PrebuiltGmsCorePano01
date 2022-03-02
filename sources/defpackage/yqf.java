package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.plus.audience.CircleCreationChimeraActivity;

/* renamed from: yqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqf extends znd {
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        CircleCreationChimeraActivity circleCreationChimeraActivity = (CircleCreationChimeraActivity) getActivity();
        getArguments();
        if (circleCreationChimeraActivity != null) {
            circleCreationChimeraActivity.finish();
        }
    }
}
