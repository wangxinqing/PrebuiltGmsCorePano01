package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aids  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aids implements Runnable {
    private final aiei a;
    private final LocationRequestInternal b;
    private final PendingIntent c;
    private final boolean d;
    private final int e;
    private final String f;
    private final boolean g;

    public aids(aiei aiei, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, boolean z, int i, String str, boolean z2) {
        this.a = aiei;
        this.b = locationRequestInternal;
        this.c = pendingIntent;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = z2;
    }

    public final void run() {
        aiei aiei = this.a;
        LocationRequestInternal locationRequestInternal = this.b;
        PendingIntent pendingIntent = this.c;
        boolean z = this.d;
        int i = this.e;
        String str = this.f;
        boolean z2 = this.g;
        if (locationRequestInternal != null) {
            Context context = aiei.f;
            aidp aidp = new aidp(aiei, pendingIntent);
            int i2 = aidd.p;
            aiei.a((Object) pendingIntent, (aidd) new aidc(context, i, str, locationRequestInternal, z, z2, aidp, pendingIntent));
            if (!"com.google.android.gms".equals(str)) {
                aiei.r.a((Parcelable) aiei.a(locationRequestInternal.b, pendingIntent));
                return;
            }
            return;
        }
        Log.e("GCoreFlp", "Not request location updates because of incomplete request.");
    }
}
