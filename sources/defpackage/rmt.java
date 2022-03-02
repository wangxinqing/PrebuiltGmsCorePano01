package defpackage;

import android.content.Context;
import com.google.android.gms.location.settings.LocationAccuracyChimeraActivity;

/* renamed from: rmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rmt implements Runnable {
    private final LocationAccuracyChimeraActivity a;

    public rmt(LocationAccuracyChimeraActivity locationAccuracyChimeraActivity) {
        this.a = locationAccuracyChimeraActivity;
    }

    public final void run() {
        LocationAccuracyChimeraActivity locationAccuracyChimeraActivity = this.a;
        locationAccuracyChimeraActivity.runOnUiThread(new rmu(locationAccuracyChimeraActivity, rns.a((Context) locationAccuracyChimeraActivity)));
    }
}
