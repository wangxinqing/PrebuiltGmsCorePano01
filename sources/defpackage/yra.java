package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;

/* renamed from: yra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yra extends znd {
    public static yra a(String str, Intent intent) {
        Bundle b = znd.b(str);
        b.putInt("resultCode", 7);
        b.putParcelable("dataIntent", intent);
        yra yra = new yra();
        yra.setArguments(b);
        return yra;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        UpdateCirclesChimeraActivity updateCirclesChimeraActivity = (UpdateCirclesChimeraActivity) getActivity();
        Bundle arguments = getArguments();
        if (updateCirclesChimeraActivity != null) {
            updateCirclesChimeraActivity.setResult(arguments.getInt("resultCode"), (Intent) arguments.getParcelable("dataIntent"));
            updateCirclesChimeraActivity.a(arguments.getInt("resultCode"), (Intent) arguments.getParcelable("dataIntent"));
        }
    }
}
