package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationRequest;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;

/* renamed from: ajqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ajqa extends ajpz {
    public ajqa(Context context) {
        super(context);
    }

    public void a(String str, long j, LocationListener locationListener, Looper looper, Collection collection, boolean z) {
        try {
            LocationRequest createFromDeprecatedProvider = LocationRequest.createFromDeprecatedProvider(str, j, 0.0f, false);
            createFromDeprecatedProvider.setWorkSource(isb.a(collection));
            createFromDeprecatedProvider.setHideFromAppOps(true);
            this.a.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
        } catch (Exception e) {
            Log.e("LocationManagerCompat", "Unable to assign LocationManager blame through WorkSource", e);
            super.a(str, j, locationListener, looper, collection, z);
        }
    }
}
