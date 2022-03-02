package com.google.android.location.places;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.places.Subscription;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class NearbyAlertSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new aizi();
    public static final UserLocationNearbyAlertRequest a = UserLocationNearbyAlertRequest.a(0, UserLocationNearbyAlertFilter.a(Collections.singleton(1001)), -1, false, 0, 110);
    public final UserLocationNearbyAlertRequest b;
    public final PlacesParams c;
    public final PendingIntent d;
    public final PendingIntent e;

    public NearbyAlertSubscription(UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        iva.a((Object) userLocationNearbyAlertRequest);
        this.b = userLocationNearbyAlertRequest;
        this.c = placesParams;
        this.d = pendingIntent;
        this.e = pendingIntent2;
    }

    public final akhu a(Context context, akit akit, akhm akhm) {
        boolean z;
        String str = this.c.b;
        int i = jhg.i(context, str);
        aizh aizh = new aizh(this, context, akit);
        if (this.b.d) {
            PendingIntent pendingIntent = this.e;
            int i2 = Build.VERSION.SDK_INT;
            if (hya.a(context).b(pendingIntent.getCreatorPackage())) {
                z = true;
                return new akpd(akhm.a, i, str, aizh, this.b, z);
            }
        }
        z = false;
        return new akpd(akhm.a, i, str, aizh, this.b, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyAlertSubscription) {
            return this.e.equals(((NearbyAlertSubscription) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("nearbyAlertRequest", this.b);
        a2.a("params", this.c);
        a2.a("callbackIntent", this.d);
        a2.a("keyIntent", this.e);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c, i, false);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.a(parcel, 6, this.e, i, false);
        ivx.b(parcel, a2);
    }

    public final Status a(int i) {
        int B = (int) azbk.a.a().B();
        if (i < B) {
            return ris.h(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", new Object[]{Integer.valueOf(i), this.c.b, Integer.valueOf(B)});
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return ris.b(9000, format);
    }

    public final String a() {
        int i = Build.VERSION.SDK_INT;
        return this.e.getCreatorPackage();
    }

    public final boolean a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof NearbyAlertSubscription) {
            NearbyAlertSubscription nearbyAlertSubscription = (NearbyAlertSubscription) subscription;
            return ius.a(this.e, nearbyAlertSubscription.e) && ius.a(this.b, nearbyAlertSubscription.b) && ius.a(this.c, nearbyAlertSubscription.c);
        }
    }
}
