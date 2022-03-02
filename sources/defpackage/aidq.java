package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: aidq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aidq implements Runnable {
    private final aiei a;
    private final Intent b;

    public aidq(aiei aiei, Intent intent) {
        this.a = aiei;
        this.b = intent;
    }

    public final void run() {
        char c;
        aiei aiei = this.a;
        aiei.r.c(this.b);
        List d = aiei.r.d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) d.get(i);
            LocationRequest locationRequest = (LocationRequest) bundle.getParcelable("lr");
            PendingIntent a2 = aiei.a(bundle);
            Context context = aiei.f;
            String targetPackage = a2.getTargetPackage();
            boolean z = true;
            if (jni.b(context).a("android.permission.ACCESS_FINE_LOCATION", targetPackage) != 0) {
                c = jni.b(context).a("android.permission.ACCESS_COARSE_LOCATION", targetPackage) == 0 ? (char) 1 : 0;
            } else {
                c = 2;
            }
            if (locationRequest == null || a2 == null || c == 0) {
                Log.e("GCoreFlp", "Incomplete LocationRequest found in SystemMemoryCache.");
            } else {
                LocationRequestInternal a3 = LocationRequestInternal.a((String) null, locationRequest);
                if (c != 2) {
                    z = false;
                }
                aiei.a(a3, a2, z);
            }
        }
    }
}
