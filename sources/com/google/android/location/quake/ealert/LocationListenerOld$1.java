package com.google.android.location.quake.ealert;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationListenerOld$1 extends nla {
    final /* synthetic */ ajfy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationListenerOld$1(ajfy ajfy, String str) {
        super(str);
        this.a = ajfy;
    }

    public final void a(Context context, Intent intent) {
        Location a2;
        int i = ajfy.d;
        intent.getAction();
        if (LocationResult.a(intent) && (a2 = LocationResult.b(intent).a()) != null && !rev.j(a2)) {
            this.a.a(a2);
        }
    }
}
