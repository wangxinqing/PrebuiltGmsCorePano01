package defpackage;

import android.app.PendingIntent;
import android.util.Log;

/* renamed from: rgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgt extends rgg {
    private idg a;

    public rgt(idg idg) {
        this.a = idg;
    }

    private final void a(int i) {
        if (this.a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.a.a((Object) reu.b(reu.a(i)));
        this.a = null;
    }

    public final void b(int i, String[] strArr) {
        a(i);
    }

    public final void a(int i, PendingIntent pendingIntent) {
        a(i);
    }

    public final void a(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }
}
