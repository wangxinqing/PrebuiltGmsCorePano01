package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.location.settings.LocationOffWarningChimeraActivity;

/* renamed from: rnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rnd implements DialogInterface.OnCancelListener {
    private final LocationOffWarningChimeraActivity a;

    public rnd(LocationOffWarningChimeraActivity locationOffWarningChimeraActivity) {
        this.a = locationOffWarningChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        LocationOffWarningChimeraActivity locationOffWarningChimeraActivity = this.a;
        if (!locationOffWarningChimeraActivity.isFinishing()) {
            locationOffWarningChimeraActivity.finish();
        }
    }
}
