package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import android.location.Location;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationDataListenerOld$1 extends nla {
    final /* synthetic */ ajde a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationDataListenerOld$1(ajde ajde, String str) {
        super(str);
        this.a = ajde;
    }

    public final void a(Context context, Intent intent) {
        int i = ajde.a;
        intent.getAction();
        Location location = (Location) intent.getParcelableExtra("com.google.android.location.LOCATION");
        if (location != null && !rev.j(location)) {
            this.a.a(location);
        }
    }
}
