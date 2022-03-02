package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: ajfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajfu implements acvv {
    private final ajfw a;

    public ajfu(ajfw ajfw) {
        this.a = ajfw;
    }

    public final void a(Object obj) {
        ajfw ajfw = this.a;
        ajfw.a((Location) obj);
        if (ajfw.c == null) {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.c(100);
            locationRequest.c(0);
            locationRequest.b(0);
            locationRequest.b(1);
            locationRequest.d(0);
            locationRequest.a(ayab.j());
            LocationRequestInternal a2 = LocationRequestInternal.a("ealert", locationRequest);
            a2.h = "com.google.android.gms.location";
            a2.a();
            ajfw.b = ajfw.a("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
            ajfw.e.a(a2, ajfw.b);
        }
    }
}
