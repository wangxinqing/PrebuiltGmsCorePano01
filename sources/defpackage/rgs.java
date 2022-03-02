package defpackage;

import android.app.PendingIntent;
import android.util.Log;

/* renamed from: rgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rgs extends rgg {
    private idg a;

    public rgs(idg idg) {
        this.a = idg;
    }

    public final void a(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }

    public final void b(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    public final void a(int i, String[] strArr) {
        if (this.a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.a.a((Object) reu.b(reu.a(i)));
        this.a = null;
    }
}
