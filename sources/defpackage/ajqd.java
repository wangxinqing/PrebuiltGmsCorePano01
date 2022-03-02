package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationRequest;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;

/* renamed from: ajqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajqd extends ajqc {
    public ajqd(Context context) {
        super(context);
    }

    public final String a() {
        return this.a.getExtraLocationControllerPackage();
    }

    public final void a(String str) {
        this.a.setExtraLocationControllerPackage(str);
    }

    public final void a(String str, long j, LocationListener locationListener, Looper looper, Collection collection, boolean z) {
        LocationRequest createFromDeprecatedProvider = LocationRequest.createFromDeprecatedProvider(str, j, 0.0f, false);
        createFromDeprecatedProvider.setWorkSource(isb.a(collection));
        createFromDeprecatedProvider.setHideFromAppOps(true);
        createFromDeprecatedProvider.setLocationSettingsIgnored(z);
        if (ayap.c()) {
            try {
                this.a.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
            } catch (SecurityException e) {
                Log.wtf("LocationManagerCompat", "exception when requesting location updates", e);
            }
        } else {
            this.a.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
        }
    }

    public final void a(boolean z) {
        this.a.setExtraLocationControllerPackageEnabled(z);
    }
}
