package com.google.android.location.geofencer.service;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationDetector$Receiver extends nla {
    final /* synthetic */ ainj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationDetector$Receiver(ainj ainj) {
        super("location");
        this.a = ainj;
    }

    public final void a(Context context, Intent intent) {
        LocationAvailability b;
        String action = intent.getAction();
        if (action.equals("com.google.android.location.intent.action.END_LOCATION_BURST")) {
            synchronized (this.a.c) {
                ainj ainj = this.a;
                if (ainj.i) {
                    ainj.a(false);
                    ainj ainj2 = this.a;
                    ainj2.a(60, false, ainj2.g, false);
                }
            }
        } else if (action.equals(asvl.a("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT"))) {
            try {
                Location location = (Location) intent.getParcelableExtra("com.google.android.location.LOCATION");
                if (location != null) {
                    ainj ainj3 = this.a;
                    boolean z = ainj3.a;
                    aikk aikk = ainj3.j;
                    if (aikk != null) {
                        aikk.a();
                        aucd aucd = aikk.n;
                        int i = ((aoak) aucd.b).c + 1;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aoak aoak = (aoak) aucd.b;
                        aoak aoak2 = aoak.h;
                        aoak.a |= 2;
                        aoak.c = i;
                    }
                    ainj3.b.a(location, (Map) null, false);
                }
                if (LocationAvailability.a(intent) && (b = LocationAvailability.b(intent)) != null) {
                    this.a.b.a(b);
                }
            } catch (RuntimeException e) {
                if (Log.isLoggable("LocationDetector", 6)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Malformed Parcelable in Intent: ");
                    sb.append(valueOf);
                    aikq.b("LocationDetector", sb.toString());
                }
            }
        }
    }
}
