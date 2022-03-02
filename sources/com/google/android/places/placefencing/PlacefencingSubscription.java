package com.google.android.places.placefencing;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.Subscription;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlacefencingSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new akug();
    public final PlacefencingRequest a;
    public final PlacesParams b;
    public final PendingIntent c;

    public PlacefencingSubscription(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
        this.a = placefencingRequest;
        this.b = placesParams;
        this.c = pendingIntent;
    }

    public static PlacefencingSubscription a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
        return new PlacefencingSubscription(placefencingRequest, placesParams, pendingIntent);
    }

    public final boolean a(Subscription subscription) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacefencingSubscription) {
            PlacefencingSubscription placefencingSubscription = (PlacefencingSubscription) obj;
            return this.a.a.equals(placefencingSubscription.a.a) && this.b.b.equals(placefencingSubscription.b.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.a, this.b.b});
    }

    public final akhu a(Context context, akit akit, akhm akhm) {
        return new akue(akhm, jhg.i(context, this.b.b), this.c.getTargetPackage(), new akuf(this, context, akit), this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }

    public final Status a(int i) {
        int f = (int) azcf.f();
        if (i < f) {
            return ris.h(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", new Object[]{Integer.valueOf(i), this.b.b, Integer.valueOf(f)});
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return ris.b(9000, format);
    }

    public final String a() {
        return this.b.b;
    }
}
